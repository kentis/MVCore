package MVCore.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MVCoreNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MVCore.diagram.part.MVCoreDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MVCore.diagram.part.MVCoreDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorItem
				&& !isOwnView(((MVCore.diagram.navigator.MVCoreNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorGroup) {
			MVCore.diagram.navigator.MVCoreNavigatorGroup group = (MVCore.diagram.navigator.MVCoreNavigatorGroup) element;
			return MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorItem) {
			MVCore.diagram.navigator.MVCoreNavigatorItem navigatorItem = (MVCore.diagram.navigator.MVCoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?EAction", MVCore.diagram.providers.MVCoreElementTypes.EAction_3002); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?EMVCAttribute", MVCore.diagram.providers.MVCoreElementTypes.EMVCAttribute_3005); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/emf/2002/Ecore?EReference", MVCore.diagram.providers.MVCoreElementTypes.EReference_4001); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/emf/2002/Ecore?EPackage", MVCore.diagram.providers.MVCoreElementTypes.EPackage_3007); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/emf/2002/Ecore?EClass?eSuperTypes", MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.friark?EDomainClass", MVCore.diagram.providers.MVCoreElementTypes.EDomainClass_2003); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/emf/2002/Ecore?EReference", MVCore.diagram.providers.MVCoreElementTypes.EReference_4003); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/emf/2002/Ecore?EClass", MVCore.diagram.providers.MVCoreElementTypes.EClass_3006); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?org.friark?EMVCPackage", MVCore.diagram.providers.MVCoreElementTypes.EMVCPackage_1000); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/emf/2002/Ecore?EAnnotation?references", MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.friark?EControllerClass", MVCore.diagram.providers.MVCoreElementTypes.EControllerClass_2001); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/emf/2002/Ecore?EPackage", MVCore.diagram.providers.MVCoreElementTypes.EPackage_2004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MVCore.diagram.part.MVCoreDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& MVCore.diagram.providers.MVCoreElementTypes
						.isKnownElementType(elementType)) {
			image = MVCore.diagram.providers.MVCoreElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorGroup) {
			MVCore.diagram.navigator.MVCoreNavigatorGroup group = (MVCore.diagram.navigator.MVCoreNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MVCore.diagram.navigator.MVCoreNavigatorItem) {
			MVCore.diagram.navigator.MVCoreNavigatorItem navigatorItem = (MVCore.diagram.navigator.MVCoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getEAction_3002Text(view);
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getEMVCAttribute_3005Text(view);
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getEReference_4001Text(view);
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getEPackage_3007Text(view);
		case MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID:
			return getEClassESuperTypes_4004Text(view);
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getEDomainClass_2003Text(view);
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getEReference_4003Text(view);
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getEClass_3006Text(view);
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			return getEMVCPackage_1000Text(view);
		case MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID:
			return getEAnnotationReferences_4002Text(view);
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getEControllerClass_2001Text(view);
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getEPackage_2004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEAction_3002Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EAction_3002,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEMVCAttribute_3005Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EMVCAttribute_3005,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEReference_4001Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EReference_4001,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEPackage_3007Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EPackage_3007,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEClassESuperTypes_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEDomainClass_2003Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EDomainClass_2003,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EDomainClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEReference_4003Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EReference_4003,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEClass_3006Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EClass_3006,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEMVCPackage_1000Text(View view) {
		MVCore.EMVCPackage domainModelElement = (MVCore.EMVCPackage) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEAnnotationReferences_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEControllerClass_2001Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EControllerClass_2001,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EControllerClassNameInstanceTypeNameInsEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEPackage_2004Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.EPackage_2004,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.EPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
				.equals(MVCore.diagram.part.MVCoreVisualIDRegistry
						.getModelID(view));
	}

}
