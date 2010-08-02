package mvcore.importer;

import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterDetailPage;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterPackagePage;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterWizard;

public class MVCoreImporterWizard extends ModelImporterWizard{

	@Override
	protected ModelConverter createModelConverter() {
		System.out.println("creating MVCoreImporter");
		return new MVCoreImporter();
	}

	@Override
	public void addPages() {
	    ModelImporterDetailPage detailPage = new ModelImporterDetailPage(getModelImporter(), "MVCoreModel");
	    detailPage.setTitle("Import MVCore Model");
	    detailPage.setDescription("Import MVCore Model");
	    addPage(detailPage);

	    ModelImporterPackagePage packagePage = new ModelImporterPackagePage(getModelImporter(), "MVCore Packages");
	    packagePage.setShowReferencedGenModels(true);
	    addPage(packagePage);
	}
}
