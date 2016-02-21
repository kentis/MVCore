package MVCore.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MVCoreModelingAssistantProviderOfPackage2EditPart extends
		MVCore.diagram.providers.MVCoreModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.MVCoreClass_3007);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_3008);
		return types;
	}

}
