package name.niu.guita.uisut.validation.actions;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart;
import name.niu.guita.uisut.diagram.part.UISUTDiagramEditor;
import name.niu.guita.uisut.validation.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.dialogs.ListDialog;

public class BatchValidationDelegate 
	implements IEditorActionDelegate, IActionDelegate2 {

	protected Collection<EObject> selectedEObjects = null;
	protected Collection<EditPart> selectedEditParts = null;
	protected UISUTDiagramEditor editor;
	protected Shell shell = null;
	private final String title = "Batch Validation";
	@Override
	public void run(IAction action) {
		//ValidationDelegateClientSelector.running = true;
		
		IBatchValidator validator = ModelValidationService.getInstance()
			.newValidator(EvaluationMode.BATCH);
		// include live constraints, also, in batch validation
		validator.setOption(IBatchValidator.OPTION_INCLUDE_LIVE_CONSTRAINTS, true);
		// track the validated resources for accurate problem-marker updates
		validator.setOption(IBatchValidator.OPTION_TRACK_RESOURCES, true);
		
		final IStatus status = validator.validate(selectedEObjects);
		
		if (status.isOK()) {
			MessageDialog.openInformation(shell, title,
				"validation passed");
		} else {
			ListDialog dialog = new ListDialog(shell);
			dialog.setInput(status);
			dialog.setTitle(title);
			dialog.setContentProvider(new IStructuredContentProvider() {
				public void dispose() {
					// nothing to dispose
				}

				public Object[] getElements(Object inputElement) {
					if (status != null && status.isMultiStatus() && status == inputElement) {
						return status.getChildren();
					} else if (status != null && status == inputElement) {
						return new Object[] {status};
					}
					return new Object[0];
				}

				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
					// Do nothing.
				}
			});
			dialog.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof IStatus) {
						return ((IStatus)element).getMessage();
					}
					return null;
				}
			});
			dialog.setBlockOnOpen(true);
			dialog.setMessage("Validation failed in the following areas (click OK to select problem elements in the editor):");
			
			if (Window.OK == dialog.open()) {
				Set<EObject> errorSelections = new HashSet<EObject>();
				if (!status.isMultiStatus()) {
					IConstraintStatus cstatus = (IConstraintStatus)status;
					errorSelections.add(cstatus.getTarget());
				} else {
					IStatus[] children = status.getChildren();
					for (IStatus element : children) {
						IConstraintStatus cstatus = (IConstraintStatus)element;
						errorSelections.add(cstatus.getTarget());
					}
				}
				// editor.setSelectionToViewer(errorSelections);
			}
		}
		
		//ValidationDelegateClientSelector.running = false;
		
		// Create problem markers on the resources with validation failures/warnings.
		try {
			MarkerUtil.updateMarkers(status);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selectedEObjects = null;
		this.selectedEditParts = null ;
		try {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				this.selectedEditParts = structuredSelection.toList();
			}
		} catch (Exception e) {
			// Exceptions are not expected
			// MessageDialog.openInformation(shell, title, MESSAGE_EXCEPTION);
			// throw new RuntimeException(e);
			e.printStackTrace() ;
		} finally {
			action.setEnabled((null != selectedEditParts));
		}
		
		this.selectedEObjects = new ArrayList<EObject>() ;
		for(Object next:selectedEditParts){
			if ( next instanceof UIStateEditPart ){
				UIStateEditPart ep = ((UIStateEditPart)next);
				Shape sh =(Shape) ep.getModel() ;
				EObject eo = sh.getElement() ;
				this.selectedEObjects.add(eo) ;
			}
		}
		
		for (Object next : selectedEObjects) {
			if (!(next instanceof EObject)) {
				action.setEnabled(false);
			}
		}
	}

	@Override
	public void init(IAction action) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void runWithEvent(IAction action, Event event) {
		run(action);
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = (UISUTDiagramEditor) targetEditor;
		if ( targetEditor != null ) {
			this.shell = targetEditor.getSite().getShell();
		}
	}

}
