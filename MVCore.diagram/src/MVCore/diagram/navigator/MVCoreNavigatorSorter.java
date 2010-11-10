package MVCore.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MVCoreNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorItem) {
			MVCore.diagram.navigator.MVCoreNavigatorItem item = (MVCore.diagram.navigator.MVCoreNavigatorItem) element;
			return MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
