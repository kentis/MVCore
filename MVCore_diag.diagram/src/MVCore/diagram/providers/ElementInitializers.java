package MVCore.diagram.providers;

import org.eclipse.emf.ecore.EReference;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_EReference_4001(EReference instance) {
		try {
			instance.setContainment(false);
		} catch (RuntimeException e) {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_EReference_4003(EReference instance) {
		try {
			instance.setContainment(true);
		} catch (RuntimeException e) {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MVCore.diagram.part.MVCoreDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
