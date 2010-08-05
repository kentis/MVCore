package org.friark.mvcore.generators.grails;

import MVCore.EControllerClass;
import MVCore.EDomainClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.*;
import org.osgi.framework .Bundle;

import org.eclipse.emf.ecore.resource.Resource;
import org.friark.mvcore.generators.*;

import groovy.text.SimpleTemplateEngine;

class GrailsGenerator implements Generator{
	
	void generate(Resource resource, String projectName){
		IProject project = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)
		resource.getContents().each{
			handlePackage(it, "org", project);
		}
	}
	
	void handlePackage(EPackage pack, prefix, IProject project){
		def packageName = "${prefix}.${pack.name}"
		pack.eContents().each {
			switch( it ) {
				case EPackage:
					handlePackage(it, packageName, project);
					break;
				case EDomainClass:
					handleEDomainClass it, packageName, project
					break;
				case EControllerClass:
					handleEControllerClass it, packageName, project
					break;
			}
		}
	}
	
	void handleEControllerClass(EControllerClass klass, String packageName, project){
		println "ECOntorller"
	 	def defaultTemplate = getDefaultTemplate()
		 
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(defaultTemplate).make([klass: klass, packageName: packageName])
		 
		def klassContent = template.toString()
		writeKlassToFile(klassContent, klass, "controller", packageName, project)
		
		 
	}
	
	private String getDefaultTemplate(){
		Bundle bundle = Platform.getBundle("MVCore")
		Path path =  new Path("src/org/friark/mvcore/generators/grails/templates/EControllerTemplate.tmpl")
		URL fileURL = FileLocator.find(bundle, path, null);
		InputStream is = fileURL.openStream();
		return is.getText()
	}
	void handleEDomainClass(EDomainClass klass, String packageName, project){
		def klassContent = buildEDomainClass( klass, packageName)
		writeKlassToFile(klassContent, klass, "domain", packageName, project)
	}
	
	String buildEDomainClass(EDomainClass klass, String packageName){
		//println "EDomain class: ${klass.name}"
		//Create the GormBuilder
		StringWriter writer = new StringWriter()
		def builder = new GormBuilder(writer)
		def parent = klass.eSuperTypes.size() > 0 ? klass.eSuperTypes[0].name : null
		def documentation = ""
		
		//Build the class
		builder."${klass.name}"(parent: parent, packageName: packageName){
			klass.eContents().each {
				switch(it.getClass().name){
					case "org.eclipse.emf.ecore.impl.EAnnotationImpl":
						if(it.source == "http://opennoark.machina.no/searchable"){
							builder.annotation(annotation: it)
						}else {
							builder.annotation(key: it.details.key[0], value: it.details.value[0], details: it.details )
						}
						break
					case "org.eclipse.emf.ecore.impl.EGenericTypeImpl":
					//TODO: these will have to be handled at some point
						break
					default:
						def mul = findMultiplicity(it)
					//call the builder with the current attribute
						"${it.name}"(type: translateType(it.eType.name) ,multiplicity: mul, unique: it.isUnique())
						break
				}//end switch
			} //end klass.eContents
			
		} //end builder
		return writer.toString()
	}
	
	void writeKlassToFile(String klassContent, def klass, String type, String packageName, project){
		//Write the class to file
		
		
		def src = getSrc(project, type)
		
		def pkg = src
		if(!pkg.exists()) pkg.create false, false, null
		packageName.tokenize('.').each{
			if(pkg instanceof File){
				pkg = new File(pkg.getAbsolutePath() + File.separator + it)
			} else {
				pkg = pkg.getFolder(it)
			}
			if(!pkg.exists()) {
				if(pkg instanceof File) pkg.mkdir()
				else pkg.create false, false, null
			}
		}
		
		def f
		if( pkg instanceof File){
			f = new File( pkg.getAbsolutePath() + File.separator +  "${klass.name}${type == 'controller' ? 'Controller':''}.groovy")
			if(f.exists()) f.delete()
		} else {
			f = pkg.getFile("${klass.name}${type == 'controller' ? 'Controller':''}.groovy")
			if(f.exists()) f.delete true, null
		}
		
		
		//if(f.exists()) f.delete true, null
		ByteArrayInputStream is = new ByteArrayInputStream(klassContent.getBytes());
		if(f instanceof File){
			f.append is
		} else {
			f.create(is, true, null)
		}
	}
	
	/**
	 * Find the attributes multiplicity
	 * @param obj The attribute
	 * @return A String deswcribing its multiplicity. One of "1", "1-M", "0-M", "0-1".
	 */
	String findMultiplicity(def obj){
		def mul = "1"
		if(obj.isRequired()){
			if(obj.isMany()) {
				mul = "1-M"
			} else {
				mul = "1"
			}
		} else {
			if(obj.isMany()) {
				mul = "0-M"
			} else {
				mul = "0-1"
			}
		}
		return mul
	}
	
	/**
	 * Translates types from Ecore to Grom
	 * @param type the type String to tranlate
	 * @return the translated type
	 */
	def translateType(type) {
		if(type == "DateTime") return "Date"
		if(type == "EString") return "String"
		if(type == null || type == "null") return "String"
		return type
	}
	
	/**
	 * 
	 * @param project the project containing the model
	 * @return the output folder
	 */
	def getSrc(IProject project, String type){
		String dir = "";
		try {
			dir = project.getPersistentProperty(
					new QualifiedName(Platform.getBundle("MVCore").getSymbolicName(), "generateToDir")
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		def src
		if(dir != ""){
			if(type == "controller") dir += "/grails-app/controllers"
			if(type == "domain") dir += "/grails-app/domain"
			src = new File(dir)
			def getFile = {String file ->
				if(delegate.isDirectory()){
					return new File(delegate, file)
				}
				return null;
			}
			def create = {boolean a, boolean b, Object o ->
				if(!delegate.exists()){
					delegate.mkdirs()
				}
			}
			getFile.setDelegate src
			create.setDelegate src
			src.metaClass.getFile = getFile
			src.metaClass.create = create
		} else {
			src = project.getFolder("src")
		}
		return src;
	}
}