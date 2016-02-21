package MVCore.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

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
	private static final String DEBUG_KEY = "MVCore.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID.equals(view
					.getType())) {
				return MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID;
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
		if (MVCore.MVCorePackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MVCore.Package) domainElement)) {
			return MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID;
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
		if (!MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getController().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID;
			}
			if (MVCore.MVCorePackage.eINSTANCE.getDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID;
			}
			if (MVCore.MVCorePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			if (MVCore.MVCorePackage.eINSTANCE.getMVCoreClass().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID;
			}
			if (MVCore.MVCorePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID;
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
		if (!MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MVCore.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.DomainNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			if (MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MVCore.MVCorePackage.eINSTANCE.getReference().isSuperTypeOf(
				domainElement.eClass())) {
			return MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MVCore.Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return false;
		case MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID:
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return MVCore.diagram.part.MVCoreVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
