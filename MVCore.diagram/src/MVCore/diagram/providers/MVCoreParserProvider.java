package MVCore.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
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
	private IParser controllerName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5004Parser() {
		if (controllerName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			controllerName_5004Parser = parser;
		}
		return controllerName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getDomainName_5005Parser() {
		if (domainName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			domainName_5005Parser = parser;
		}
		return domainName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5006Parser() {
		if (packageName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getPackage_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getPackage_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			packageName_5006Parser = parser;
		}
		return packageName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser action_3005Parser;

	/**
	 * @generated
	 */
	private IParser getAction_3005Parser() {
		if (action_3005Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getAction_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getAction_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			action_3005Parser = parser;
		}
		return action_3005Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_3006Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_3006Parser() {
		if (attribute_3006Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getAttribute_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getAttribute_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			attribute_3006Parser = parser;
		}
		return attribute_3006Parser;
	}

	/**
	 * @generated
	 */
	private IParser mVCoreClass_3007Parser;

	/**
	 * @generated
	 */
	private IParser getMVCoreClass_3007Parser() {
		if (mVCoreClass_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getMVCoreClass_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			mVCoreClass_3007Parser = parser;
		}
		return mVCoreClass_3007Parser;
	}

	/**
	 * @generated
	 */
	private IParser package_3008Parser;

	/**
	 * @generated
	 */
	private IParser getPackage_3008Parser() {
		if (package_3008Parser == null) {
			EAttribute[] features = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getPackage_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MVCore.MVCorePackage.eINSTANCE
					.getPackage_Name() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			package_3008Parser = parser;
		}
		return package_3008Parser;
	}

	/**
	 * @generated
	 */
	private IParser referenceLowerBoundUpperBound_6002Parser;

	/**
	 * @generated
	 */
	private IParser getReferenceLowerBoundUpperBound_6002Parser() {
		if (referenceLowerBoundUpperBound_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MVCore.MVCorePackage.eINSTANCE.getReference_LowerBound(),
					MVCore.MVCorePackage.eINSTANCE.getReference_UpperBound() };
			EAttribute[] editableFeatures = new EAttribute[] {
					MVCore.MVCorePackage.eINSTANCE.getReference_LowerBound(),
					MVCore.MVCorePackage.eINSTANCE.getReference_UpperBound() };
			MVCore.diagram.parsers.MessageFormatParser parser = new MVCore.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			parser.setViewPattern("{0}..{1,choice,-1#*|-1<{1}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			referenceLowerBoundUpperBound_6002Parser = parser;
		}
		return referenceLowerBoundUpperBound_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MVCore.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5004Parser();
		case MVCore.diagram.edit.parts.DomainNameEditPart.VISUAL_ID:
			return getDomainName_5005Parser();
		case MVCore.diagram.edit.parts.PackageNameEditPart.VISUAL_ID:
			return getPackageName_5006Parser();
		case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3005Parser();
		case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3006Parser();
		case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
			return getMVCoreClass_3007Parser();
		case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
			return getPackage_3008Parser();
		case MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getReferenceLowerBoundUpperBound_6002Parser();
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
