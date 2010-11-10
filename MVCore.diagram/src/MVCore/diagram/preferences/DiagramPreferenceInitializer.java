package MVCore.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		MVCore.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		MVCore.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		MVCore.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		MVCore.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		MVCore.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
