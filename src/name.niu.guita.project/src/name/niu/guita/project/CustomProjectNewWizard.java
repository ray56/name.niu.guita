package name.niu.guita.project;

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

public class CustomProjectNewWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage page; 
	
	 @Override 
	 public void addPages() 
	 { 
	  // TODO Auto-generated method stub 
	  super.addPages(); 
	  page = new WizardNewProjectCreationPage("ACU Service Project"); 
	  page.setTitle("ACU Service Project"); 
	  page.setDescription("创建一个新项目，使用构件开发业务"); 
	  addPage(page); 
	 } 
	 
	
	public CustomProjectNewWizard() {

	}

	@Override 
	 public void init(IWorkbench workbench, IStructuredSelection selection) 
	 { 
	  // TODO Auto-generated method stub 
	    //this._workbench = workbench; 
	    //下面这个方法不知道作用 

		 
	    setNeedsProgressMonitor(true); 
	    setWindowTitle("New ACU Service Project"); 
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
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return true;
	}

}
