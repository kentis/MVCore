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
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://mvcore.org/mvcore?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_1000); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mvcore.org/mvcore?Controller", MVCore.diagram.providers.MVCoreElementTypes.Controller_2005); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mvcore.org/mvcore?Domain", MVCore.diagram.providers.MVCoreElementTypes.Domain_2006); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mvcore.org/mvcore?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_2007); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?org.eclipse.draw2d.RoundedRectangle", MVCore.diagram.providers.MVCoreElementTypes.Node_2008); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://mvcore.org/mvcore?Action", MVCore.diagram.providers.MVCoreElementTypes.Action_3005); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://mvcore.org/mvcore?Attribute", MVCore.diagram.providers.MVCoreElementTypes.Attribute_3006); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://mvcore.org/mvcore?MVCoreClass", MVCore.diagram.providers.MVCoreElementTypes.MVCoreClass_3007); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://mvcore.org/mvcore?Package", MVCore.diagram.providers.MVCoreElementTypes.Package_3008); //$NON-NLS-1$
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mvcore.org/mvcore?Reference", MVCore.diagram.providers.MVCoreElementTypes.Reference_4002); //$NON-NLS-1$
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
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2005Text(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2006Text(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2007Text(view);
		case MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID:
			return getNode_2008Text(view);
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3005Text(view);
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3006Text(view);
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3007Text(view);
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3008Text(view);
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getReference_4002Text(view);
		}
		return getUnknownElementText(view);
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
	private String getController_2005Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Controller_2005,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_2006Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Domain_2006,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.DomainNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_2007Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Package_2007,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.PackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_3005Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Action_3005,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID));
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
	private String getAttribute_3006Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Attribute_3006,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
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
	private String getMVCoreClass_3007Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.MVCoreClass_3007,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID));
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
	private String getPackage_3008Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Package_3008,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReference_4002Text(View view) {
		IParser parser = MVCore.diagram.providers.MVCoreParserProvider
				.getParser(
						MVCore.diagram.providers.MVCoreElementTypes.Reference_4002,
						view.getElement() != null ? view.getElement() : view,
						MVCore.diagram.part.MVCoreVisualIDRegistry
								.getType(MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
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
