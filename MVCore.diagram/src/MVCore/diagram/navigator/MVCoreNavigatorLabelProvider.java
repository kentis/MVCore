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
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.friark?Controller", MVCore.diagram.providers.MVCoreElementTypes.Controller_2002); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?org.friark?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_1000); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.friark?Domain", MVCore.diagram.providers.MVCoreElementTypes.Domain_2003); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?MVCoreClass", MVCore.diagram.providers.MVCoreElementTypes.MVCoreClass_3003); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.friark?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_2004); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?org.friark?Reference", MVCore.diagram.providers.MVCoreElementTypes.Reference_4001); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?Attribute", MVCore.diagram.providers.MVCoreElementTypes.Attribute_3002); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?Action", MVCore.diagram.providers.MVCoreElementTypes.Action_3001); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?org.friark?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_3004); //$NON-NLS-1$
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
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2002Text(view);
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2003Text(view);
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3003Text(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2004Text(view);
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getReference_4001Text(view);
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3002Text(view);
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3001Text(view);
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPackage_3004Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Package_3004,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_2003Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Domain_2003,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.DomainNameEditPart.VISUAL_ID));
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
	private String getController_2002Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Controller_2002,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID));
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
	private String getAction_3001Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Action_3001,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReference_4001Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Reference_4001,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart.VISUAL_ID));
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
	private String getPackage_1000Text(View view) {
		MVCore.Package domainModelElement = (MVCore.Package) view.getElement();
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
	private String getAttribute_3002Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Attribute_3002,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
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
	private String getPackage_2004Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Package_2004,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.PackageNameEditPart.VISUAL_ID));
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
	private String getMVCoreClass_3003Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.MVCoreClass_3003,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3003); //$NON-NLS-1$
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
		return MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(MVCore.diagram.part.MVCoreVisualIDRegistry
						.getModelID(view));
	}

}
