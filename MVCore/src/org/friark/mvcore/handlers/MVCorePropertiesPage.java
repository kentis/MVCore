package org.friark.mvcore.handlers;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

public class MVCorePropertiesPage extends PropertyPage {
	Text textField;

	@Override
	protected Control createContents(Composite parent) {
		Composite myComposite = new Composite(parent, SWT.NONE);
		GridLayout mylayout = new GridLayout();
		mylayout.marginHeight = 1;
		mylayout.marginWidth = 1;
		myComposite.setLayout(mylayout);
		Label mylabel = new Label(myComposite, SWT.NONE);
		mylabel.setLayoutData(new GridData());
		mylabel.setText("Generate to dir:");
		textField = new Text(myComposite, SWT.BORDER);
		textField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textField.setText(getGenerateToDir());

		return myComposite;

	}

	public String getGenerateToDir() {
		try {
			String dir = getProject().getPersistentProperty(
					new QualifiedName(Platform.getBundle("MVCore")
							.getSymbolicName(), "generateToDir"));
			return dir == null ? "" : dir;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "";
	}

	public void setGenerateToDir(String dir) {
		try {
			getProject().setPersistentProperty(
					new QualifiedName(Platform.getBundle("MVCore")
							.getSymbolicName(), "generateToDir"), dir);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private IProject getProject() {
		Object element = getElement();
		if (element instanceof IProjectNature) {
			return ((IProjectNature) element).getProject();
		} else if (element instanceof IProject) {
			return (IProject) element;
		}
		throw new RuntimeException("Unknown type for getElement(): "
				+ element.getClass().toString());
	}

	@Override
	public boolean performOk() {
		performApply();
		return super.performOk();
	}

	@Override
	protected void performApply() {
		setGenerateToDir(textField.getText());
	}

}
