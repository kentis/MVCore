package org.friark.mvcore.handlers;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Collections;

import javax.annotation.Resources;

import org.codehaus.groovy.tools.shell.Shell;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import org.friark.mvcore.generators.*;
import org.friark.mvcore.generators.grails.*;
import org.osgi.framework.Bundle;


//import MVCore.presentation.MVCoreEditor;

public class GenerateHandler2 extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("dilldall");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"MVCore Plug-in",
				"HI");
		
		
		try{
			IEditorPart editor =  HandlerUtil.getActiveEditor(event);
			System.out.println("editor: "+editor);
			URI resourceURI = EditUIUtil.getURI(editor.getEditorInput());
			ResourceSet resourceSet = new ResourceSetImpl();
			
			Resource res = resourceSet.createResource(resourceURI);
			res.load(Collections.emptyMap());
			String projectName = resourceURI.toString().substring(19, resourceURI.toString().indexOf('/', 19));
			System.out.println("res.contents: "+res.getContents());
			System.out.println("res.contents size: "+res.getContents().size());
			
			for(EObject obj :res.getContents()){
				System.out.println("obj: "+obj);
				for(EObject obj2: obj.eContents()){
					System.out.println("obj2: "+obj2);
				}
			}
			
			Generator generator = new GrailsGeneratorFacade();
			generator.generate(res, projectName);
		 	
		}catch(Throwable t){
			t.printStackTrace();
			StringWriter sw = new StringWriter();
			t.printStackTrace(new PrintWriter(sw));
			MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"Generation failed: "+t.getMessage()+"\n\n" +
					sw.toString());
			return null;
		}
		MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"All done :)");
			return null;
	}

	/*private String getDefaultTemplate() throws IOException{
		Bundle bundle = Platform.getBundle("MVCore");
		
		//Plugins behave a bit differently, depending on how they are run. Therfore, this little hack.
		Path path =  new Path("src/org/friark/mvcore/generators/grails/templates/EControllerTemplate.tmpl");
		URL fileURL = FileLocator.find(bundle, path, null);
		if(fileURL == null){
			path =  new Path("org/friark/mvcore/generators/grails/GrailsGenerator.groovy");
			fileURL = FileLocator.find(bundle, path, null);
		}

		
		InputStream is = fileURL.openStream();
		return slurp(is);
	}
	
	public static String slurp (InputStream in) throws IOException {
	    StringBuffer out = new StringBuffer();
	    byte[] b = new byte[4096];
	    for (int n; (n = in.read(b)) != -1;) {
	        out.append(new String(b, 0, n));
	    }
	    return out.toString();
	}
	*/
}
