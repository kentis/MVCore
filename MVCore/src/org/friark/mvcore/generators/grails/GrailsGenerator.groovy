package org.friark.mvcore.generators.grails;

import MVCore.Attribute;
import MVCore.Controller;
import MVCore.Domain;
import MVCore.Package;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.*;
import org.osgi.framework .Bundle;

import org.eclipse.emf.ecore.resource.Resource;
import org.friark.mvcore.generators.*;

import groovy.text.SimpleTemplateEngine;

class GrailsGenerator implements Generator{
	
	Class builderClass;
	String srcDir;
	
	public GrailsGenerator() {
		builderClass = GormBuilder.class;
	}
	
	public GrailsGenerator(Class builderClass ) {
		this.builderClass = builderClass
	}

	
	String getName(){
		""
	}
	
	void generate(Resource resource, String projectName){
		IProject project = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)
		resource.getContents().each{
			handlePackage(it, "", project);
		}
	}
	
	void handlePackage(Package pack, prefix, IProject project){
		def packageName = "${prefix}${prefix.size() > 0 ? '.' : ''}${pack.name}"
		pack.eContents().each {
			switch( it ) {
				case Package:
					handlePackage(it, packageName, project);
					break;
				case Domain:
					handleEDomainClass it, packageName, project
					break;
				case Controller:
					handleEControllerClass it, packageName, project
					break;
			}
		}
		
		generateResources(pack.eContents(), project);
	}
	
	
	void generateResources(contents, project){
	   println "Generaing resource"
	   def defaultTemplate = getResourcesTemplate()
		
	   def engine = new SimpleTemplateEngine()
	   def template = engine.createTemplate(defaultTemplate).make([contents: contents.findAll{it instanceof Domain}])
		
	   def klassContent = template.toString()
	   def src = getSrc(project, "conf_spring")
	   println src
	   def f = new File(src.getAbsolutePath() + File.separator + "resources.groovy")
	   f.write(klassContent)
	}
	
	void handleEControllerClass(Controller klass, String packageName, project){
		println "EContorller"
	 	def defaultTemplate = getDefaultTemplate()
		 
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(defaultTemplate).make([klass: klass, packageName: packageName])
		 
		def klassContent = template.toString()
		writeKlassToFile(klassContent, klass, "controller", packageName, project)
		 
	}
	
	private String getDefaultTemplate(){
		Bundle bundle = Platform.getBundle("MVCore")
		
		//Plugins behave a bit differently, depending on how they are run. Therfore, this little hack.
		Path path =  new Path("src/org/friark/mvcore/generators/grails/templates/EControllerTemplate.tmpl")
		URL fileURL = FileLocator.find(bundle, path, null);
		if(fileURL == null){
			path =  new Path("org/friark/mvcore/generators/grails/templates/EControllerTemplate.tmpl")
			fileURL = FileLocator.find(bundle, path, null);
		}
		
		println "fileURL: ${fileURL}"
		InputStream is = fileURL.openStream();
		return is.getText()
	}
	
	
	private String getResourcesTemplate(){
		Bundle bundle = Platform.getBundle("MVCore")
		
		//Plugins behave a bit differently, depending on how they are run. Therfore, this little hack.
		Path path =  new Path("src/org/friark/mvcore/generators/grails/templates/resources.tmpl")
		URL fileURL = FileLocator.find(bundle, path, null);
		if(fileURL == null){
			path =  new Path("org/friark/mvcore/generators/grails/templates/resources.tmpl")
			fileURL = FileLocator.find(bundle, path, null);
		}
		
		println "fileURL: ${fileURL}"
		InputStream is = fileURL.openStream();
		return is.getText()
	}
	
	void handleEDomainClass(Domain klass, String packageName, project){
		def klassContent = buildEDomainClass( klass, packageName)
		writeKlassToFile(klassContent, klass, "domain", packageName, project)
		
	}
	
	String buildEDomainClass(Domain klass, String packageName){
		println "EDomain class: ${klass.name}"
		//Create the GormBuilder
		StringWriter writer = new StringWriter()
		Object[] argList = new Object[1];
		argList[0] = writer
		def builder = builderClass.newInstance(argList);

		def parent = klass.getSuper() == null ? null : klass.getSuper().name
		def documentation = ""
		
		//Build the class
		builder."${klass.name}"(parent: parent, packageName: packageName, klass){
			println "eContents: ${klass.eContents()}"
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
					case "MVCore.impl.ConstraintImpl":
					case "MVCore.impl.DocumentationImpl":
					//TODO: these will have to be handled at some point
						break
					case "MVCore.impl.ReferenceImpl":
						def mul = findMultiplicity(it)
						"${it.name}"(type: translateType(it.target.name) ,multiplicity: mul, unique: it.isUnique(),it)
						break
					
						break
					default:
						def mul = findMultiplicity(it)
					//call the builder with the current attribute
						println it
						println it.name
						println it.type

						"${it.name}"(type: translateType(it.type.name) ,multiplicity: mul, unique: it.isUnique(),it)
						break
				}//end switch
			} //end klass.eContents
			
		} //end builder
		return writer.toString()
	}
	
	void writeKlassToFile(String klassContent, def klass, String type, String packageName, project){
		//Write the class to file
		
		println "writing"
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
			f = new File( pkg.getAbsolutePath() + File.separator +  "${klass.name}${type == 'controller' && !klass.name.endsWith('Controller') ? 'Controller':''}.groovy")
			if(f.exists()) f.delete()
		} else {
			f = pkg.getFile("${klass.name}${type == 'controller' ? 'Controller':''}.groovy")
			if(f.exists()) f.delete true, null
		}
		
		println "file: " + f.toString()
		//if(f.exists()) f.delete true, null
		ByteArrayInputStream is = new ByteArrayInputStream(klassContent.getBytes());
		if(f instanceof File){
			println "f is File"
			f.append is
		} else {
			println "f is not File"
			f.create(is, true, null)
		}
		println "file is generated"
	}
	
	/**
	 * Find the attributes multiplicity
	 * @param obj The attribute
	 * @return A String deswcribing its multiplicity. One of "1", "1-M", "0-M", "0-1".
	 */
	String findMultiplicity(def obj){
		if(obj instanceof Attribute){
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
		else {
			def mul = "1"
			if(obj.lowerBound > 0){
				if(obj.upperBound == -1) {
					mul = "1-M"
				} else {
					mul = "1"
				}
			} else {
				if(obj.upperBound == -1) {
					mul = "0-M"
				} else {
					mul = "0-1"
				}
			}
			return mul
		}
	}
	
	/**
	 * Translates types from Ecore to Grom
	 * @param type the type String to tranlate
	 * @return the translated type
	 */
	def translateType(type) {
		if(type == "DateTime") return "Date"
		if(type == "EString") return "String"
		if(type == "EByteArray") return "byte[]"
		if(type == "EDouble") return "double"
		if(type == "EDate") return "date"
		if(type == "EBoolean") return "boolean"
		if(type == null || type == "null") return "String"
		return type
	}
	
	void setTargetDir(String dir){
		srcDir = dir;
	}
	
	/**
	 * 
	 * @param project the project containing the model
	 * @return the output folder
	 */
	def getSrc(IProject project, String type){
		String dir = this.srcDir;
		
	 /*   try {
			dir = project.getPersistentProperty(
					new QualifiedName(Platform.getBundle("MVCore").getSymbolicName(), "generateToDir"));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		def src
		if(dir != ""){
			if(type == "controller") dir += "/grails-app/controllers"
			if(type == "domain") dir += "/grails-app/domain"
			if(type == "conf") dir += "/grails-app/conf"
			if(type == "conf_spring") dir += "/grails-app/conf/spring"
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