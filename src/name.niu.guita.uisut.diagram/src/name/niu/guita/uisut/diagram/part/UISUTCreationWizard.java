package name.niu.guita.uisut.diagram.part;

import java.lang.reflect.InvocationTargetException;

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
		setWindowTitle(Messages.UISUTCreationWizardTitle);
		setDefaultPageImageDescriptor(UISUTDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewuisutWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new UISUTCreationWizardPage(
				"DiagramModelFile", getSelection(), "uisut_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.UISUTCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.UISUTCreationWizard_DiagramModelFilePageDescription);
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
				diagram = UISUTDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), diagramModelFilePage
								.getURI().trimFileExtension()
								.appendFileExtension("uisut"), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						UISUTDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.UISUTCreationWizardOpenEditorError,
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
						Messages.UISUTCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				UISUTDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
