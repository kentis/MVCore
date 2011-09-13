package MVCore.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MVCoreParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eControllerClassNameInstanceTypeNameInstanceClassName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEControllerClassNameInstanceTypeNameInstanceClassName_5001Parser() {
		if (eControllerClassNameInstanceTypeNameInstanceClassName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EcorePackage.eINSTANCE.getENamedElement_Name(),
					EcorePackage.eINSTANCE.getEClassifier_InstanceTypeName(),
					EcorePackage.eINSTANCE.getEClassifier_InstanceClassName() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eControllerClassNameInstanceTypeNameInstanceClassName_5001Parser = parser;
		}
		return eControllerClassNameInstanceTypeNameInstanceClassName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser eDomainClassName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEDomainClassName_5002Parser() {
		if (eDomainClassName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eDomainClassName_5002Parser = parser;
		}
		return eDomainClassName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser ePackageName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEPackageName_5003Parser() {
		if (ePackageName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			ePackageName_5003Parser = parser;
		}
		return ePackageName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser eAction_3002Parser;

	/**
	 * @generated
	 */
	private IParser getEAction_3002Parser() {
		if (eAction_3002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			eAction_3002Parser = parser;
		}
		return eAction_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eMVCAttribute_3005Parser;

	/**
	 * @generated
	 */
	private IParser getEMVCAttribute_3005Parser() {
		if (eMVCAttribute_3005Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eMVCAttribute_3005Parser = parser;
		}
		return eMVCAttribute_3005Parser;
	}

	/**
	 * @generated
	 */
	private IParser eClass_3006Parser;

	/**
	 * @generated
	 */
	private IParser getEClass_3006Parser() {
		if (eClass_3006Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eClass_3006Parser = parser;
		}
		return eClass_3006Parser;
	}

	/**
	 * @generated
	 */
	private IParser ePackage_3007Parser;

	/**
	 * @generated
	 */
	private IParser getEPackage_3007Parser() {
		if (ePackage_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			ePackage_3007Parser = parser;
		}
		return ePackage_3007Parser;
	}

	/**
	 * @generated
	 */
	private IParser eReferenceName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEReferenceName_6001Parser() {
		if (eReferenceName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eReferenceName_6001Parser = parser;
		}
		return eReferenceName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser eReferenceLowerBoundUpperBound_6002Parser;

	/**
	 * @generated
	 */
	private IParser getEReferenceLowerBoundUpperBound_6002Parser() {
		if (eReferenceLowerBoundUpperBound_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EcorePackage.eINSTANCE.getETypedElement_LowerBound(),
					EcorePackage.eINSTANCE.getETypedElement_UpperBound() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}..{1,choice,-1#*|-1<{1}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1,choice,-1#*|-1<{1}}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			eReferenceLowerBoundUpperBound_6002Parser = parser;
		}
		return eReferenceLowerBoundUpperBound_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eReferenceName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getEReferenceName_6003Parser() {
		if (eReferenceName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			eReferenceName_6003Parser = parser;
		}
		return eReferenceName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser eReferenceLowerBoundUpperBound_6004Parser;

	/**
	 * @generated
	 */
	private IParser getEReferenceLowerBoundUpperBound_6004Parser() {
		if (eReferenceLowerBoundUpperBound_6004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EcorePackage.eINSTANCE.getETypedElement_LowerBound(),
					EcorePackage.eINSTANCE.getETypedElement_UpperBound() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}..{1,choice,-1#*|-1<{1}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1,choice,-1#*|-1<{1}}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			eReferenceLowerBoundUpperBound_6004Parser = parser;
		}
		return eReferenceLowerBoundUpperBound_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MVCore.diagram.edit.parts.EControllerClassNameInstanceTypeNameInsEditPart.VISUAL_ID:
			return getEControllerClassNameInstanceTypeNameInstanceClassName_5001Parser();
		case MVCore.diagram.edit.parts.EDomainClassNameEditPart.VISUAL_ID:
			return getEDomainClassName_5002Parser();
		case MVCore.diagram.edit.parts.EPackageNameEditPart.VISUAL_ID:
			return getEPackageName_5003Parser();
		case MVCore.diagram.edit.parts.EActionEditPart.VISUAL_ID:
			return getEAction_3002Parser();
		case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
			return getEMVCAttribute_3005Parser();
		case MVCore.diagram.edit.parts.EClassEditPart.VISUAL_ID:
			return getEClass_3006Parser();
		case MVCore.diagram.edit.parts.EPackage2EditPart.VISUAL_ID:
			return getEPackage_3007Parser();
		case MVCore.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getEReferenceName_6001Parser();
		case MVCore.diagram.edit.parts.EReferenceLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getEReferenceLowerBoundUpperBound_6002Parser();
		case MVCore.diagram.edit.parts.EReferenceNameEditPart.VISUAL_ID:
			return getEReferenceName_6003Parser();
		case MVCore.diagram.edit.parts.EReferenceLowerBoundUpperBound2EditPart.VISUAL_ID:
			return getEReferenceLowerBoundUpperBound_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MVCore.diagram.providers.MVCoreElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
