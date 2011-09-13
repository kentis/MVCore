package org.friark.mvcore.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


import MVCore.Action;
import MVCore.Controller;
import MVCore.Domain;
import MVCore.MVCoreClass;
import MVCore.Package;
import MVCore.impl.MVCoreFactoryImpl;


//import MVCore.presentation.MVCoreEditor;

public class AddCrudHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("AddCrudHandler");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Controller eController = (Controller) ((TreeSelection) window.getSelectionService().getSelection()).getFirstElement();
	
		//MessageDialog.openInformation(
	//			window.getShell(),
		//		"MVCore Plug-in",
			//	"HI");
		try{
		IEditorPart editor =  HandlerUtil.getActiveEditor(event);
		System.out.println("editor: "+editor);
		URI resourceURI = EditUIUtil.getURI(editor.getEditorInput());
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource res = resourceSet.createResource(resourceURI);
		res.load(Collections.emptyMap());
		
			PopupDialog diag = new PopupDialog(window.getShell(), window.getShell().getStyle(), 
							true, false, false, false, 
							"titleText", "infoText");
			
			diag.open();
			Shell shell = diag.getShell();
			System.out.println("shell: "+shell);
			shell.setLayout(new FillLayout(SWT.VERTICAL));
			shell.setSize(400, 800);
			
			Combo combo = new Combo (shell, SWT.DROP_DOWN);
			
			combo.setItems(getDomainClassNames(res));
			
			

		    
		    Button grails = new Button (shell, SWT.RADIO);
			grails.setText ("Grails");
			grails.setSelection(true);
		    Button rails = new Button (shell, SWT.RADIO);
			rails.setText ("rails");
			Button http = new Button (shell, SWT.RADIO);
			http.setText ("http");
			

			final Button b = new Button(shell, SWT.PUSH | SWT.BORDER);
		    b.setText("OK");

		    
		    b.addSelectionListener(new CrudSelectionAdapter(window, res, eController, editor));
		    diag.getShell().redraw();
			/*MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"OK then...");
	*/
		    
		}catch(Throwable t){
			t.printStackTrace();
			StringWriter sw = new StringWriter();
			t.printStackTrace(new PrintWriter(sw));
			MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"Generation failed: "+t.getMessage());
			return null;
		}
		/*MessageDialog.openInformation(
					window.getShell(),
					"MVCore Plug-in",
					"All done :)");
	*/
		
		return null;
	}

	private String[] getDomainClassNames(Resource res){
		List<String> retvals = new ArrayList<String>();
		
		for(EObject obj :res.getContents()){
			getDomainClassNamesFromPackage(retvals, (Package) obj);
		}
		
		return retvals.toArray(new String[0]);
	}
	
	private void getDomainClassNamesFromPackage(List<String> retvals, Package pack){
		for(EObject obj :pack.getMembers()){
			if(obj instanceof Package){
				getDomainClassNamesFromPackage(retvals, (Package)obj);
			} else if(obj instanceof Domain){
				retvals.add(((Domain)obj).getName());
			}
		}
	}
	
	
	private Domain[] getDomainClasss(Resource res){
		List<Domain> retvals = new ArrayList<Domain>();
		
		for(EObject obj :res.getContents()){
			getDomainClasssFromPackage(retvals, (Package) obj);
		}
		
		return retvals.toArray(new Domain[0]);
	}
	
	private void getDomainClasssFromPackage(List<Domain> retvals, Package pack){
		for(MVCoreClass obj :pack.getMembers()){
			if(obj instanceof Package){
				getDomainClasssFromPackage(retvals, (Package)obj);
			} else if(obj instanceof Domain){
				retvals.add((Domain)obj);
			}
		}
	}
	
	
	
	public List<Action> getGrailsCrudActions(Domain domain){
		List<Action> actions = new ArrayList<Action>();
		addActionToList(actions, "index", domain);
		addActionToList(actions, "list", domain);
		addActionToList(actions, "show", domain);
		addActionToList(actions, "delete", domain);
		addActionToList(actions, "edit", domain);
		addActionToList(actions, "update", domain);
		addActionToList(actions, "create", domain);
		addActionToList(actions, "save", domain);
		return actions;
	}
	
	private void addActionToList(List<Action> actions, String name, Domain domain){
		Action action = MVCoreFactoryImpl.eINSTANCE.createAction();
		action.setName(name);
		action.setOperatesOn(domain);
		actions.add(action);
	}
	
	class CrudSelectionAdapter extends SelectionAdapter {
		public IWorkbenchWindow window;
		public Resource res;
		public Controller eController;
		public IEditorPart editor;
		public CrudSelectionAdapter(IWorkbenchWindow window, Resource res, Controller eController, IEditorPart editor){
			super();
			this.window = window;
			this.res = res;
			this.eController = eController;
			this.editor = editor;
		}
	      public void widgetSelected(SelectionEvent e) {
		    	System.out.println(e.getSource());
		    	System.out.println(e.getSource().getClass().toString());
		    	Button source = (Button) e.getSource();
		    	for(Control c : source.getShell().getChildren()){
		    		System.out.println(c.getClass().toString());
		    	}
		    	int dcIdx = ((Combo)source.getShell().getChildren()[1]).getSelectionIndex();
		    	String domainClass = ((Combo)source.getShell().getChildren()[1]).getItem(dcIdx);
		        System.out.println("Hi There! "+domainClass);
		        if(!((Button)source.getShell().getChildren()[2]).getSelection()){
		        	MessageDialog.openInformation(
							window.getShell(),
							"MVCore Plug-in",
							"Only grails style currently supported");
		        	return;
		        }
		        for(Action action : getGrailsCrudActions(getDomainClass(domainClass))){
		        	eController.getActions().add(action);
		        }
		        editor.doSave(null);
		        
				MessageDialog.openInformation(
				window.getShell(),
				"MVCore Plug-in",
				"All done :)");
		        
		      }
	      
	      private Domain getDomainClass(String name){
	    	  for(Domain domain : getDomainClasss(res)){
	    		  if(domain.getName().equals(name)) return domain;
	    	  }
	    	  return null;
	      }
		    };
		    
		    
}
