package org.friark.mvcore.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Hashtable;

import javax.annotation.Resources;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.friark.mvcore.generators.grails.*;
import org.friark.mvcore.handlers.AddCrudHandler.CrudSelectionAdapter;


//import MVCore.presentation.MVCoreEditor;

public class GenerateHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint("MVCore.MVCore_generator");
		IExtension[] extensions = ep.getExtensions();
		
		//System.out.println("dilldall");
		//if(true)return null;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		
		//Dialog:
		//Velge generator
		//Velge katalog
		//kjøre
		PopupDialog diag = new PopupDialog(window.getShell(), window.getShell().getStyle(), 
				true, false, false, false, 
				"Generate", null);
		
	    
		//diag.open();
		diag.create();
		Shell shell = diag.getShell();
		System.out.println("shell: "+shell);
		
		Combo comboDropDown = new Combo(diag.getShell(), SWT.DROP_DOWN | SWT.BORDER);
		Hashtable<String, Object> dropDownValues = new Hashtable<String, Object>();
		comboDropDown.add("grails");
		dropDownValues.put("grails", new GrailsGeneratorFacade());
		for(IExtension ext : extensions){
			System.out.println(ext.toString());
			for(IConfigurationElement ce :ext.getConfigurationElements()){
				try {
					//System.out.println(ce.createExecutableExtension("class"));
					comboDropDown.add(ce.getAttribute("name"));
					dropDownValues.put(ce.getAttribute("name"), ce.createExecutableExtension("class"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		comboDropDown.select(0);
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		shell.setSize(300, 100);
		final Button b = new Button(shell, SWT.PUSH | SWT.BORDER);
	    b.setText("OK");	
	    b.addSelectionListener(new GeneratorSelectionAdapter(event));
	    //b.addSelectionListener(new CrudSelectionAdapter(window, res, eController, editor));
	    //diag.getShell().pack();
	    diag.getShell().redraw();
	    diag.open();
	    return null;
	}
	
	
	public void runGenerator(ExecutionEvent event) throws ExecutionException{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		//Get dir
		String targetDir = new DirectoryDialog(window.getShell()).open();
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
			org.friark.mvcore.generators.Generator generator = new GrailsGeneratorFacade();
			generator.setTargetDir(targetDir);
			generator.generate(res, projectName);
		 	
		}catch(Throwable t){
			t.printStackTrace();
			StringWriter sw = new StringWriter();
			t.printStackTrace(new PrintWriter(sw));
			MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"Generation failed: "+t.getMessage());
			return;
		}
		MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"All done :)");

		return;
	}

	class GeneratorSelectionAdapter extends SelectionAdapter {
		ExecutionEvent event;
		public GeneratorSelectionAdapter(ExecutionEvent event){
			this.event = event;
		}
		
		public void widgetSelected(SelectionEvent e) {
			try {
				runGenerator(event);
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}
