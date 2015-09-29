package org.friark.mvcore.generators;

import org.eclipse.emf.ecore.resource.Resource;

public interface Generator {
	/**
	 * Generates an instance of the mvcore model
	 * 
	 * @param resource the Resource object that contains the mvcore model
	 * @param projectName The name of the project that contains the mvcore model. This is used to find the project level configuration to where the generated files should be placed.
	 */
	public void generate(Resource resource, String projectName);
	
	/**
	 * Returns the name of the generator that is shown in the command menu.
	 * 
	 * @return the name of the generator that is shown in the command menu.
	 */
	public String getName();
	
	public void setTargetDir(String dir);
}
