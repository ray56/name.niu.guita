package name.niu.guitar.ui.wizards;


import java.lang.reflect.InvocationTargetException;

import name.niu.guitar.uisut.diagram.part.UisutDiagramEditorPlugin;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditorUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class UISUTCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected UISUTCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected UISUTCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New UISUT Diagram");
		setDefaultPageImageDescriptor(UisutDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewuisutWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new UISUTCreationWizardPage(
				"DiagramModelFile", getSelection(), "uisut"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle("Create UISUT Diagram");
		diagramModelFilePage
				.setDescription("Select file that will contain diagram model.");
		addPage(diagramModelFilePage);

		//		domainModelFilePage = new UISUTCreationWizardPage(
		//				"DomainModelFile", getSelection(), "uisut") { //$NON-NLS-1$ //$NON-NLS-2$
		//
		//			public void setVisible(boolean visible) {
		//				if (visible) {
		//					String fileName = diagramModelFilePage.getFileName();
		//					fileName = fileName.substring(0, fileName.length()
		//							- ".uisut_diagram".length()); //$NON-NLS-1$
		//					setFileName(UISUTDiagramEditorUtil.getUniqueFileName(
		//							getContainerFullPath(), fileName, "uisut")); //$NON-NLS-1$
		//				}
		//				super.setVisible(visible);
		//			}
		//		};
		//		domainModelFilePage
		//				.setTitle(Messages.UISUTCreationWizard_DomainModelFilePageTitle);
		//		domainModelFilePage
		//				.setDescription(Messages.UISUTCreationWizard_DomainModelFilePageDescription);
		//		addPage(domainModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = UisutDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						UisutDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								"Error opening diagram editor",
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						"Creation Problems", null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				UisutDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
