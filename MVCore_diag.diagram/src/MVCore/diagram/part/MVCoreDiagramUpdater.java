package MVCore.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

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
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			return getEMVCPackage_1000SemanticChildren(view);
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getEControllerClass_2001SemanticChildren(view);
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getEDomainClass_2003SemanticChildren(view);
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getEPackage_2004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getEMVCPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.EMVCPackage modelElement = (MVCore.EMVCPackage) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEClassifiers().iterator(); it
				.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getESubpackages().iterator(); it
				.hasNext();) {
			EPackage childElement = (EPackage) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID) {
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
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getEControllerClass_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.EControllerClass modelElement = (MVCore.EControllerClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEOperations().iterator(); it
				.hasNext();) {
			EOperation childElement = (EOperation) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID) {
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
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getEDomainClass_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MVCore.EDomainClass modelElement = (MVCore.EDomainClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEAllAttributes().iterator(); it
				.hasNext();) {
			EAttribute childElement = (EAttribute) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID) {
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
	public static List<MVCore.diagram.part.MVCoreNodeDescriptor> getEPackage_2004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EPackage modelElement = (EPackage) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEClassifiers().iterator(); it
				.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID) {
				result.add(new MVCore.diagram.part.MVCoreNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getESubpackages().iterator(); it
				.hasNext();) {
			EPackage childElement = (EPackage) it.next();
			int visualID = MVCore.diagram.part.MVCoreVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID) {
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
		case MVCore.diagram.edit.parts.EMVCPackageEditPart.VISUAL_ID:
			return getEMVCPackage_1000ContainedLinks(view);
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getEControllerClass_2001ContainedLinks(view);
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getEDomainClass_2003ContainedLinks(view);
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getEPackage_2004ContainedLinks(view);
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getEAction_3002ContainedLinks(view);
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getEMVCAttribute_3005ContainedLinks(view);
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getEClass_3006ContainedLinks(view);
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getEPackage_3007ContainedLinks(view);
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getEReference_4001ContainedLinks(view);
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getEReference_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingLinks(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getEControllerClass_2001IncomingLinks(view);
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getEDomainClass_2003IncomingLinks(view);
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getEPackage_2004IncomingLinks(view);
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getEAction_3002IncomingLinks(view);
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getEMVCAttribute_3005IncomingLinks(view);
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getEClass_3006IncomingLinks(view);
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getEPackage_3007IncomingLinks(view);
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getEReference_4001IncomingLinks(view);
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getEReference_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (MVCore.diagram.part.MVCoreVisualIDRegistry.getVisualID(view)) {
		case MVCore.diagram.edit.parts.EControllerClassEditPart.VISUAL_ID:
			return getEControllerClass_2001OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EDomainClassEditPart.VISUAL_ID:
			return getEDomainClass_2003OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EPackageEditPart.VISUAL_ID:
			return getEPackage_2004OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getEAction_3002OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getEMVCAttribute_3005OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getEClass_3006OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getEPackage_3007OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getEReference_4001OutgoingLinks(view);
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getEReference_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEMVCPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEControllerClass_2001ContainedLinks(
			View view) {
		MVCore.EControllerClass modelElement = (MVCore.EControllerClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEDomainClass_2003ContainedLinks(
			View view) {
		MVCore.EDomainClass modelElement = (MVCore.EDomainClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEAction_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEMVCAttribute_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEClass_3006ContainedLinks(
			View view) {
		EClass modelElement = (EClass) view.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEControllerClass_2001IncomingLinks(
			View view) {
		MVCore.EControllerClass modelElement = (MVCore.EControllerClass) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EClass_ESuperTypes_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEDomainClass_2003IncomingLinks(
			View view) {
		MVCore.EDomainClass modelElement = (MVCore.EDomainClass) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EClass_ESuperTypes_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_2004IncomingLinks(
			View view) {
		EPackage modelElement = (EPackage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEAction_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEMVCAttribute_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEClass_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4001IncomingLinks(
			View view) {
		EReference modelElement = (EReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4003IncomingLinks(
			View view) {
		EReference modelElement = (EReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEControllerClass_2001OutgoingLinks(
			View view) {
		MVCore.EControllerClass modelElement = (MVCore.EControllerClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEDomainClass_2003OutgoingLinks(
			View view) {
		MVCore.EDomainClass modelElement = (MVCore.EDomainClass) view
				.getElement();
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEAction_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEMVCAttribute_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEClass_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEPackage_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MVCore.diagram.part.MVCoreLinkDescriptor> getEReference_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getContainedTypeModelFacetLinks_EReference_4001(
			EClass container) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		for (Iterator<?> links = container.getEStructuralFeatures().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EReference) {
				continue;
			}
			EReference link = (EReference) linkObject;
			if (MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EClassifier dst = link.getEType();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
					container,
					dst,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.EReference_4001,
					MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getContainedTypeModelFacetLinks_EReference_4003(
			EClass container) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		for (Iterator<?> links = container.getEStructuralFeatures().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EReference) {
				continue;
			}
			EReference link = (EReference) linkObject;
			if (MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EClassifier dst = link.getEType();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
					container,
					dst,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.EReference_4003,
					MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingFeatureModelFacetLinks_EAnnotation_References_4002(
			EObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EcorePackage.eINSTANCE
					.getEAnnotation_References()) {
				result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
						setting.getEObject(),
						target,
						MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002,
						MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingTypeModelFacetLinks_EReference_4001(
			EClassifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EcorePackage.eINSTANCE
					.getETypedElement_EType()
					|| false == setting.getEObject() instanceof EReference) {
				continue;
			}
			EReference link = (EReference) setting.getEObject();
			if (MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof EClass) {
				continue;
			}
			EClass container = (EClass) link.eContainer();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
					container,
					target,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.EReference_4001,
					MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingTypeModelFacetLinks_EReference_4003(
			EClassifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EcorePackage.eINSTANCE
					.getETypedElement_EType()
					|| false == setting.getEObject() instanceof EReference) {
				continue;
			}
			EReference link = (EReference) setting.getEObject();
			if (MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID != MVCore.diagram.part.MVCoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof EClass) {
				continue;
			}
			EClass container = (EClass) link.eContainer();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
					container,
					target,
					link,
					MVCore.diagram.providers.MVCoreElementTypes.EReference_4003,
					MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getIncomingFeatureModelFacetLinks_EClass_ESuperTypes_4004(
			EClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EcorePackage.eINSTANCE
					.getEClass_ESuperTypes()) {
				result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
						setting.getEObject(),
						target,
						MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004,
						MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MVCore.diagram.part.MVCoreLinkDescriptor> getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(
			EClass source) {
		LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor> result = new LinkedList<MVCore.diagram.part.MVCoreLinkDescriptor>();
		for (Iterator<?> destinations = source.getESuperTypes().iterator(); destinations
				.hasNext();) {
			EClass destination = (EClass) destinations.next();
			result.add(new MVCore.diagram.part.MVCoreLinkDescriptor(
					source,
					destination,
					MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004,
					MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID));
		}
		return result;
	}

}
