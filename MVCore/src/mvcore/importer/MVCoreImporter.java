package mvcore.importer;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.importer.ecore.EcoreImporter;

public class MVCoreImporter extends EcoreImporter {
	@Override
	public String getID() {
		return "mvcore.importer";
	}
	
	@Override
	public Diagnostic checkEcoreModelFileName(String fileName, String packageName)
	  {
	    String message = null;

	    if (fileName == null || fileName.equals(""))
	    {
	      message = "The MVCore model file name cannot be empty";
	        
	    }
	    else if (!fileName.endsWith(".mvcore") )
	    {
	      message = "The Ecore model file name must end in '.mvcore'";
	    }
	    if (message == null)
	    {
	      return Diagnostic.OK_INSTANCE;
	    }
	    else
	    {
	      return new BasicDiagnostic(Diagnostic.ERROR, ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT, message, null);
	    }
	  }
}
