package MVCore.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MVCoreModelingAssistantProviderOfPackageEditPart extends
		MVCore.diagram.providers.MVCoreModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Controller_2005);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Domain_2006);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_2007);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Node_2008);
		return types;
	}

}
