package MVCore.diagram.providers;

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
