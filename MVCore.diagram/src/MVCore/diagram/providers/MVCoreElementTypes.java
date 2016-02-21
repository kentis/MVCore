package MVCore.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MVCoreElementTypes {

	/**
	 * @generated
	 */
	private MVCoreElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("MVCore.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller_2005 = getElementType("MVCore.diagram.Controller_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Domain_2006 = getElementType("MVCore.diagram.Domain_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_2007 = getElementType("MVCore.diagram.Package_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2008 = getElementType("MVCore.diagram.Node_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_3005 = getElementType("MVCore.diagram.Action_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3006 = getElementType("MVCore.diagram.Attribute_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MVCoreClass_3007 = getElementType("MVCore.diagram.MVCoreClass_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_3008 = getElementType("MVCore.diagram.Package_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reference_4002 = getElementType("MVCore.diagram.Reference_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000,
					MVCore.MVCorePackage.eINSTANCE.getPackage());

			elements.put(Controller_2005,
					MVCore.MVCorePackage.eINSTANCE.getController());

			elements.put(Domain_2006,
					MVCore.MVCorePackage.eINSTANCE.getDomain());

			elements.put(Package_2007,
					MVCore.MVCorePackage.eINSTANCE.getPackage());

			elements.put(Action_3005,
					MVCore.MVCorePackage.eINSTANCE.getAction());

			elements.put(Attribute_3006,
					MVCore.MVCorePackage.eINSTANCE.getAttribute());

			elements.put(MVCoreClass_3007,
					MVCore.MVCorePackage.eINSTANCE.getMVCoreClass());

			elements.put(Package_3008,
					MVCore.MVCorePackage.eINSTANCE.getPackage());

			elements.put(Reference_4002,
					MVCore.MVCorePackage.eINSTANCE.getReference());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Controller_2005);
			KNOWN_ELEMENT_TYPES.add(Domain_2006);
			KNOWN_ELEMENT_TYPES.add(Package_2007);
			KNOWN_ELEMENT_TYPES.add(Node_2008);
			KNOWN_ELEMENT_TYPES.add(Action_3005);
			KNOWN_ELEMENT_TYPES.add(Attribute_3006);
			KNOWN_ELEMENT_TYPES.add(MVCoreClass_3007);
			KNOWN_ELEMENT_TYPES.add(Package_3008);
			KNOWN_ELEMENT_TYPES.add(Reference_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return Package_1000;
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return Controller_2005;
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return Domain_2006;
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return Package_2007;
		case MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID:
			return Node_2008;
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_3005;
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3006;
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return MVCoreClass_3007;
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return Package_3008;
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return Reference_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return MVCore.diagram.providers.MVCoreElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return MVCore.diagram.providers.MVCoreElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return MVCore.diagram.providers.MVCoreElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
