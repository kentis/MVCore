package org.friark.mvcore.generators;

import groovy.lang.GroovyShell;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.friark.mvcore.generators.grails.GrailsGeneratorFacade;
import org.osgi.framework.Bundle;

public class GeneratorFactory {

	public Generator getGenerator(String type){
		if("grails".equals(type)){
			return new GrailsGeneratorFacade();
		}
		throw new RuntimeException("unknown type: "+type);
	}

	
}
