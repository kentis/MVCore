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
import org.eclipse.emf.ecore.EcorePackage;
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
	public static final IElementType EMVCPackage_1000 = getElementType("MVCore_diag.diagram.EMVCPackage_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EControllerClass_2001 = getElementType("MVCore_diag.diagram.EControllerClass_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EDomainClass_2003 = getElementType("MVCore_diag.diagram.EDomainClass_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EPackage_2004 = getElementType("MVCore_diag.diagram.EPackage_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EAction_3002 = getElementType("MVCore_diag.diagram.EAction_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EMVCAttribute_3005 = getElementType("MVCore_diag.diagram.EMVCAttribute_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EClass_3006 = getElementType("MVCore_diag.diagram.EClass_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EPackage_3007 = getElementType("MVCore_diag.diagram.EPackage_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EAnnotationReferences_4002 = getElementType("MVCore_diag.diagram.EAnnotationReferences_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EReference_4001 = getElementType("MVCore_diag.diagram.EReference_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EReference_4003 = getElementType("MVCore_diag.diagram.EReference_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EClassESuperTypes_4004 = getElementType("MVCore_diag.diagram.EClassESuperTypes_4004"); //$NON-NLS-1$

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

			elements.put(EMVCPackage_1000,
					MVCore.MVCorePackage.eINSTANCE.getEMVCPackage());

			elements.put(EControllerClass_2001,
					MVCore.MVCorePackage.eINSTANCE.getEControllerClass());

			elements.put(EDomainClass_2003,
					MVCore.MVCorePackage.eINSTANCE.getEDomainClass());

			elements.put(EPackage_2004, EcorePackage.eINSTANCE.getEPackage());

			elements.put(EAction_3002,
					MVCore.MVCorePackage.eINSTANCE.getEAction());

			elements.put(EMVCAttribute_3005,
					MVCore.MVCorePackage.eINSTANCE.getEMVCAttribute());

			elements.put(EClass_3006, EcorePackage.eINSTANCE.getEClass());

			elements.put(EPackage_3007, EcorePackage.eINSTANCE.getEPackage());

			elements.put(EAnnotationReferences_4002,
					EcorePackage.eINSTANCE.getEAnnotation_References());

			elements.put(EReference_4001,
					EcorePackage.eINSTANCE.getEReference());

			elements.put(EReference_4003,
					EcorePackage.eINSTANCE.getEReference());

			elements.put(EClassESuperTypes_4004,
					EcorePackage.eINSTANCE.getEClass_ESuperTypes());
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
			KNOWN_ELEMENT_TYPES.add(EMVCPackage_1000);
			KNOWN_ELEMENT_TYPES.add(EControllerClass_2001);
			KNOWN_ELEMENT_TYPES.add(EDomainClass_2003);
			KNOWN_ELEMENT_TYPES.add(EPackage_2004);
			KNOWN_ELEMENT_TYPES.add(EAction_3002);
			KNOWN_ELEMENT_TYPES.add(EMVCAttribute_3005);
			KNOWN_ELEMENT_TYPES.add(EClass_3006);
			KNOWN_ELEMENT_TYPES.add(EPackage_3007);
			KNOWN_ELEMENT_TYPES.add(EAnnotationReferences_4002);
			KNOWN_ELEMENT_TYPES.add(EReference_4001);
			KNOWN_ELEMENT_TYPES.add(EReference_4003);
			KNOWN_ELEMENT_TYPES.add(EClassESuperTypes_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			return EMVCPackage_1000;
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return EControllerClass_2001;
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return EDomainClass_2003;
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return EPackage_2004;
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return EAction_3002;
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return EMVCAttribute_3005;
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return EClass_3006;
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return EPackage_3007;
		case MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID:
			return EAnnotationReferences_4002;
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return EReference_4001;
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return EReference_4003;
		case MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID:
			return EClassESuperTypes_4004;
		}
		return null;
	}

}
