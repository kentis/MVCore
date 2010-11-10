package MVCore.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
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
	private static ImageRegistry imageRegistry;

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
	public static final IElementType Controller_2002 = getElementType("MVCore.diagram.Controller_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Domain_2003 = getElementType("MVCore.diagram.Domain_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_2004 = getElementType("MVCore.diagram.Package_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_3001 = getElementType("MVCore.diagram.Action_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3002 = getElementType("MVCore.diagram.Attribute_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MVCoreClass_3003 = getElementType("MVCore.diagram.MVCoreClass_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_3004 = getElementType("MVCore.diagram.Package_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reference_4001 = getElementType("MVCore.diagram.Reference_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MVCore.diagram.part.MVCoreDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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

			elements.put(Controller_2002,
					MVCore.MVCorePackage.eINSTANCE.getController());

			elements.put(Domain_2003,
					MVCore.MVCorePackage.eINSTANCE.getDomain());

			elements.put(Package_2004,
					MVCore.MVCorePackage.eINSTANCE.getPackage());

			elements.put(Action_3001,
					MVCore.MVCorePackage.eINSTANCE.getAction());

			elements.put(Attribute_3002,
					MVCore.MVCorePackage.eINSTANCE.getAttribute());

			elements.put(MVCoreClass_3003,
					MVCore.MVCorePackage.eINSTANCE.getMVCoreClass());

			elements.put(Package_3004,
					MVCore.MVCorePackage.eINSTANCE.getPackage());

			elements.put(Reference_4001,
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
			KNOWN_ELEMENT_TYPES.add(Controller_2002);
			KNOWN_ELEMENT_TYPES.add(Domain_2003);
			KNOWN_ELEMENT_TYPES.add(Package_2004);
			KNOWN_ELEMENT_TYPES.add(Action_3001);
			KNOWN_ELEMENT_TYPES.add(Attribute_3002);
			KNOWN_ELEMENT_TYPES.add(MVCoreClass_3003);
			KNOWN_ELEMENT_TYPES.add(Package_3004);
			KNOWN_ELEMENT_TYPES.add(Reference_4001);
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
			return Controller_2002;
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return Domain_2003;
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return Package_2004;
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_3001;
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3002;
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return MVCoreClass_3003;
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return Package_3004;
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return Reference_4001;
		}
		return null;
	}

}
