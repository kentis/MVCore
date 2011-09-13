package mvcore_rails_generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.friark.mvcore.generators.Generator;

public class RailsGenerator implements Generator {

	@Override
	public void generate(Resource resource, String projectName) {
		System.out.println("bla bla rails");
	}

	@Override
	public String getName() {
		
		return "Rails";
	}

}
