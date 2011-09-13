package MVCore.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MVCoreVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MVCore_diag.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
					.equals(view.getType())) {
				return MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MVCore.diagram.part.MVCoreDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MVCore.MVCorePackage.eINSTANCE.getEMVCPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MVCore.EMVCPackage) domainElement)) {
			return MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = MVCore.diagram.part.MVCoreVisualIDRegistry
				.getModelID(containerView);
		if (!MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getEControllerClass()
					.isSuperTypeOf(domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID;
			}
			if (MVCore.MVCorePackage.eINSTANCE.getEDomainClass().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID;
			}
			if (EcorePackage.eINSTANCE.getEPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getEAction().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getEMVCAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			if (EcorePackage.eINSTANCE.getEClass().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID;
			}
			if (EcorePackage.eINSTANCE.getEPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MVCore.diagram.part.MVCoreVisualIDRegistry
				.getModelID(containerView);
		if (!MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MVCore.diagram.edit.parts.EMVCPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.EControllerClassNameInstanceTypeNameInsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.EDomainClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.EPackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EPackageClassesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EPackagePackagesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EReferenceLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.EReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.EReferenceLowerBoundUpperBound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EcorePackage.eINSTANCE.getEReference().isSuperTypeOf(
				domainElement.eClass())
				&& isEReference_4001((EReference) domainElement)) {
			return MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID;
		}
		if (EcorePackage.eINSTANCE.getEReference().isSuperTypeOf(
				domainElement.eClass())
				&& isEReference_4003((EReference) domainElement)) {
			return MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MVCore.EMVCPackage element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isEReference_4001(EReference domainElement) {
		Object result = MVCore.diagram.expressions.MVCoreOCLFactory
				.getExpression(0, EcorePackage.eINSTANCE.getEReference(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEReference_4003(EReference domainElement) {
		Object result = MVCore.diagram.expressions.MVCoreOCLFactory
				.getExpression(2, EcorePackage.eINSTANCE.getEReference(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
