/*
    This file is part of Friark.

    Friark is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Friark is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Friark.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.friark.mvcore.generators.grails

import groovy.util.BuilderSupport
import java.io.StringWriter

/**
 * A builder for Gorm classes
 * 
 * @author kent
 *
 */
class GormBuilder extends BuilderSupport {
	
	final int CLASS = 1
	final int ATTRS = 2
	
	int state = CLASS
	
	IndentPrinter out;
	StringWriter writer;
	def constraints = ""
	def hasMany = [:]	
	def mappings = ""
	def extras = ""
	def afterLoad = ""
	def transients = []
	def toString = ""
	public GormBuilder(Writer writer) {
		this.writer = writer 
		this.out =	new IndentPrinter(new PrintWriter(writer))
		def printlnMethod = this.out.&println
		this.out.metaClass.println = {String s ->
			printIndent()
			printlnMethod.call(s)
		}
	}
	
	protected void setParent(Object parent, Object child) {  
		if(parent)  
			parent[parent['name']] = child  
	}
		
	protected Object createNode(Object name) {  
		createNode name, null, null  
	}  
	
	protected Object createNode(Object name, Object value) {  
		createNode name, null, value  
	}  
	
	protected Object createNode(Object name, Map attrs) {  
		createNode name, attrs, null  
	}  
	
	protected Object createNode(Object name, Map attrs, Object value) {
		println "name: ${name}, attrs: ${attrs}, value: ${value}"
		switch(state){
			case CLASS:
			if(attrs && attrs['packageName']) out.println "package ${attrs['packageName']}"
			
			if(value.documentation.size() > 0){
				out.println"/**"
				value.documentation.each{
					out.print "${it.value}\n"
				}
				out.print "*/\n"
			}
			out.print "class ${name} "
			
			if(value.getSuper()){
				out.print  "extends ${value.getSuper().name}"
			}
			//if(attrs && attrs['parent']) out.print "extends ${attrs['parent']}"
			out.println "{"
			out.incrementIndent()
			
			if(value.searchable){
				extras += "static searchable = ${value.searchable}\n"
			}
			if(value.loggable){
				extras += "static loggable = ${value.loggable}\n"
			}
			
			value.constraints.each{
				println "TYPE: ${it.type.getClass()}   -- ${it.value}"
				if(it.type.value == 0 ) constraints += "${it.value}\n"
				if(it.type.value == 1) extras += "${it.value}\n"

			}
			state = ATTRS
			break
			case ATTRS:
			if(name == "annotation"){
				if(attrs['annotation']){
					switch(attrs['annotation'].source){
						case "http://opennoark.machina.no/searchable":
						
							def searchable = "static searchable ="
							attrs['annotation'].details.keySet().each{ skey ->
								if(skey == "except")
									searchable += " [except: ['${attrs['annotation'].details.get(skey).split(',').join('\',\'')}']]"
							}
							if(searchable == "static searchable =") searchable += " true"
							extras = "${extras}${searchable}\n"
							break
					}
				} else {
					if(attrs['key'] == "documentation"){
						writer.buffer.insert(0,"/**\n${attrs['value']}\n*/\n")
					}else if(attrs['key'] == "mapping"){
						
						mappings = "${mappings}${attrs['value']}\n"
					}else if(attrs['key'] == "attribute"){
						extras = "${extras}${attrs['value']}\n"
					}else if(attrs['key'] == "transient"){
						extras = "${extras}${attrs['value']}\n"
						transients << "\"${attrs['value'].tokenize()[1]}\""
					}else if(attrs['key'] == "constraint"){
						constraints += "${attrs['value']}\n"
					}else if(attrs['key'] == "afterLoad"){
						afterLoad += "${attrs['value']}\n"
					}else if(attrs['key'] == "toString"){
						toString = "String toString(){${attrs['value']}}"
					}
				}
			}else {
				
				if(attrs['multiplicity'] =~ /.*-M/){
					hasMany[name] = attrs['type']
				} else {
					out.println "${attrs['type']} ${name}"
				}
				switch(attrs['multiplicity']){
					case "1":
						constraints += "${name}(nullable: false)\n"
						break
					case "1-M":
						constraints += "${name}(minSize: 1)\n"
						break
					case "0-1":
					case "0-M":
						constraints += "${name}(nullable: true)\n"
						break
				}
				if(attrs['unique'] != null){
					constraints += "${name}(unique: ${attrs['unique']})\n"
				}
				if(value.metaClass.hasProperty(value, 'constraints')) value.constraints.each{
					constraints += "${name}(${it.value})\n"
				}
			}
			break
		}
		return attrs;
	}
	
	protected void nodeCompleted(Object parent, Object node) {
		if(!node || (!node['multiplicity']  && !node['key'] && !node['annotation'] )) {
			out.println "static constraints = {"
			out.incrementIndent()
			constraints.eachLine{
				out.println it
			}
			out.decrementIndent()
			out.println "}"
			
			out.println "static hasMany = ${hasMany.toString()}"
			
			out.println "static mapping = {"
			out.incrementIndent()
			
			mappings.eachLine{
				out.println it
			}
			out.decrementIndent()
			out.println "}"
			println "PRINTING extras: $extras"
			extras.eachLine { 
				out.println it
			}
			
			if(transients.size() > 0)
				out.println "static transients = ${transients}"
			
			if(afterLoad.length() > 0){
				out.println "def afterLoad = {"
				out.incrementIndent()
				afterLoad.eachLine { out.println it }
				out.decrementIndent()
				out.println "}"
			}
			
			if(toString.length() > 0) out.println toString
			
			out.decrementIndent()
			out.println "}"
		}
	}
}
