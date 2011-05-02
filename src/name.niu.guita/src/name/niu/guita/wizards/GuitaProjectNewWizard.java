package name.niu.guita.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class GuitaProjectNewWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage page; 
	
	 @Override 
	 public void addPages() 
	 { 
	  super.addPages(); 
	  page = new WizardNewProjectCreationPage("New Guita Project Page 1 Name"); 
	  page.setTitle("New Guita Project Page 1 Title"); 
	  page.setDescription("Input Project Name"); 
	  addPage(page); 
	 } 
	 
	
	public GuitaProjectNewWizard() {

	}

	@Override 
	 public void init(IWorkbench workbench, IStructuredSelection selection) 
	 { 		 
	    setNeedsProgressMonitor(true); 
	    setWindowTitle("New Guita Project"); 
	 } 

	@Override
	public boolean performFinish() {
		String projectName = page.getProjectName();

		IWorkspace ws = null;
		try {
			ws = ResourcesPlugin.getWorkspace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		IProject project = ws.getRoot().getProject(projectName);
		IProjectDescription descr = ws.newProjectDescription(projectName);
		try {
			project.create(descr, null);
			project.open(null) ;
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return true;
	}

}
