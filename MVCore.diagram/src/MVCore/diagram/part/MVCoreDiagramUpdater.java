package MVCore.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MVCoreDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getSemanticChildren(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2005SemanticChildren(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2006SemanticChildren(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.Package modelElement = (MVCore.Package) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMembers().iterator(); it
				.hasNext();) {
			MVCore.MVCoreClass childElement = (MVCore.MVCoreClass) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubPackages().iterator(); it
				.hasNext();) {
			MVCore.Package childElement = (MVCore.Package) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getController_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.Controller modelElement = (MVCore.Controller) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			MVCore.Action childElement = (MVCore.Action) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getDomain_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.Domain modelElement = (MVCore.Domain) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			MVCore.Attribute childElement = (MVCore.Attribute) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getPackage_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.Package modelElement = (MVCore.Package) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMembers().iterator(); it
				.hasNext();) {
			MVCore.MVCoreClass childElement = (MVCore.MVCoreClass) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubPackages().iterator(); it
				.hasNext();) {
			MVCore.Package childElement = (MVCore.Package) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getContainedLinks(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2005ContainedLinks(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2006ContainedLinks(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2007ContainedLinks(view);
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3005ContainedLinks(view);
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3006ContainedLinks(view);
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3007ContainedLinks(view);
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3008ContainedLinks(view);
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getReference_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingLinks(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2005IncomingLinks(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2006IncomingLinks(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2007IncomingLinks(view);
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3005IncomingLinks(view);
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3006IncomingLinks(view);
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3007IncomingLinks(view);
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3008IncomingLinks(view);
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getReference_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2005OutgoingLinks(view);
		case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_2006OutgoingLinks(view);
		case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_2007OutgoingLinks(view);
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3005OutgoingLinks(view);
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3006OutgoingLinks(view);
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3007OutgoingLinks(view);
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3008OutgoingLinks(view);
		case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
			return getReference_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getController_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getDomain_2006ContainedLinks(
			View view) {
		MVCore.Domain modelElement = (MVCore.Domain) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Reference_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAction_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAttribute_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getMVCoreClass_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getReference_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getController_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getDomain_2006IncomingLinks(
			View view) {
		MVCore.Domain modelElement = (MVCore.Domain) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAction_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAttribute_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getMVCoreClass_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getReference_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getController_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getDomain_2006OutgoingLinks(
			View view) {
		MVCore.Domain modelElement = (MVCore.Domain) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAction_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getAttribute_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getMVCoreClass_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getPackage_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getReference_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getContainedTypeModelFacetLinks_Reference_4002(
			MVCore.Domain container) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		for (Iterator<?> links = container.getReferences().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MVCore.Reference) {
				continue;
			}
			MVCore.Reference link = (MVCore.Reference) linkObject;
			if (MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MVCore.Domain dst = link.getTarget();
			MVCore.Domain src = link.getSrc();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(src, dst,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.Reference_4002,
					MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingTypeModelFacetLinks_Reference_4002(
			MVCore.Domain target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MVCore.MVCorePackage.eINSTANCE
					.getReference_Target()
					|| false == setting.getEObject() instanceof MVCore.Reference) {
				continue;
			}
			MVCore.Reference link = (MVCore.Reference) setting.getEObject();
			if (MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MVCore.Domain src = link.getSrc();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(src,
					target, link,
					MVCore.diagram.providers.MVCoreElementTypes.Reference_4002,
					MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getOutgoingTypeModelFacetLinks_Reference_4002(
			MVCore.Domain source) {
		MVCore.Domain container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MVCore.Domain) {
				container = (MVCore.Domain) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		for (Iterator<?> links = container.getReferences().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MVCore.Reference) {
				continue;
			}
			MVCore.Reference link = (MVCore.Reference) linkObject;
			if (MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MVCore.Domain dst = link.getTarget();
			MVCore.Domain src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(src, dst,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.Reference_4002,
					MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MVCore.diagram.part.MVCoreNodeDescriptor> getSemanticChildren(
				View view) {
			return MVCoreDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MVCore.diagram.part.MVCoreLinkDescriptor> getContainedLinks(
				View view) {
			return MVCoreDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingLinks(
				View view) {
			return MVCoreDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MVCore.diagram.part.MVCoreLinkDescriptor> getOutgoingLinks(
				View view) {
			return MVCoreDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
