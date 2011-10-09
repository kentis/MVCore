package org.friark.mvcore.generators.grails;


import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;

import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.tools.Compiler;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.friark.mvcore.Utils;
import org.friark.mvcore.generators.Generator;
import org.osgi.framework.Bundle;

public class GrailsGeneratorFacade implements Generator{


	
	@Override
	public void generate(Resource resource, String projectName) {
		try {
			Bundle bundle = Platform.getBundle("MVCore");

			// Plugins behave a bit differently, depending on how they are run.
			// Therfore, this little hack.
			Path genPath = new Path(
					"src/org/friark/mvcore/generators/grails/GrailsGenerator.groovy");
			URL generatorFileURL = FileLocator.find(bundle, genPath, null);
			Path builderPath = new Path(
					"src/org/friark/mvcore/generators/grails/GormBuilder.groovy");
			URL builderFileURL = FileLocator.find(bundle, builderPath, null);
			if (generatorFileURL == null) {
				genPath = new Path("org/friark/mvcore/generators/grails/GrailsGenerator.groovy");
				generatorFileURL = FileLocator.find(bundle, genPath, null);

				builderPath = new Path(
						"org/friark/mvcore/generators/grails/GormBuilder.groovy");
				builderFileURL = FileLocator.find(bundle, builderPath, null);
			}

			/*
			 * SequenceInputStream sis = new SequenceInputStream( new
			 * Enumeration<InputStream>() { URL[] urls = new URL[2]; int idx =
			 * 0;
			 * 
			 * @Override public boolean hasMoreElements() { // TODO
			 * Auto-generated method stub return false; }
			 * 
			 * @Override public InputStream nextElement() { // TODO
			 * Auto-generated method stub return null; } });
			 * /*ByteArrayInputStream bis = new ByteArrayInputStream(
			 * "new GrailsGenerator().generate(resource, projectName)"
			 * .getBytes());
			 * 
			 * GroovyShell s = new GroovyShell();
			 * 
			 * s.setVariable("resource", resource); s.setVariable("projectName",
			 * projectName); s.evaluate(new SequenceInputStream(new
			 * Enu(builderFileURL, generatorFileURL, bis)));
			 */
			GroovyClassLoader cl = new GroovyClassLoader(this.getClass()
					.getClassLoader());

			System.out.println(generatorFileURL.toString());
			System.out.println(Utils.slurp(generatorFileURL.openStream()));
			Class genClass = cl.parseClass(generatorFileURL.openStream());
			Class builderClass = cl.parseClass(builderFileURL.openStream());
			//this.builderClass = builderClass;
			Constructor contr = genClass.getConstructor(Class.class);
//			Generator gen = (Generator) genClass.newInstance();
			Generator gen = (Generator) contr.newInstance(new Object[] {builderClass});
			//gen.builderClass = builderClass;
			gen.generate(resource, projectName);
		} catch (CompilationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class Enu implements Enumeration<InputStream> {
		URL[] urls = new URL[2];
		int idx = 0;
		InputStream is;

		public Enu(URL u1, URL u2, InputStream is) {
			urls[0] = u1;
			urls[1] = u2;
			this.is = is;
		}

		@Override
		public boolean hasMoreElements() {
			// TODO Auto-generated method stub
			return idx <= urls.length;
		}

		@Override
		public InputStream nextElement() {
			// TODO Auto-generated method stub
			if (idx < urls.length) {

				URL url = urls[idx];
				idx++;

				try {
					return url.openStream();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			} else {
				return is;
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "GrailsGenerator";
	}
	
}
