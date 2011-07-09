package name.niu.guitar.uisut.diagram.part;

import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachineEditPart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * @generated
 */
public class UisutInitDiagramFileAction implements
		IWorkbenchWindowActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchWindow window;

	/**
	 * @generated
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	/**
	 * @generated
	 */
	public void dispose() {
		window = null;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return window.getShell();
	}

	/**
	 * @generated
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		Resource resource = UisutDiagramEditorUtil.openModel(getShell(),
				Messages.InitDiagramFile_OpenModelFileDialogTitle,
				editingDomain);
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		EObject diagramRoot = (EObject) resource.getContents().get(0);
		Wizard wizard = new UisutNewDiagramFileWizard(resource.getURI(),
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				UIStatemachineEditPart.MODEL_ID));
		UisutDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
