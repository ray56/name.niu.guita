package name.niu.guitar.ui.handlers;

import java.util.Iterator;

import name.niu.guitar.dialogs.SystemVariableEditDialog;
import name.niu.guitar.ui.wizards.TestCaseGenWizard;
import name.niu.guitar.uisut.UIElement;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UISystemVariablePool;
import name.niu.guitar.uisut.UisutFactory;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class EditSystemVariableHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		IEditorPart ep = HandlerUtil.getActiveEditor(event);
		
		if ( ep != null && ep instanceof UisutDiagramEditor ) {
			UisutDiagramEditor diagramEP = (UisutDiagramEditor) ep ;
			final UIStatemachine stm = (UIStatemachine) diagramEP.getDiagram().getElement();
			if(stm.getItsUISystemVariablePool() == null ) {
				// create system variable pool
				diagramEP.getEditingDomain().getCommandStack().execute( new RecordingCommand(diagramEP.getEditingDomain()) {
					@Override
					protected void doExecute() {
						UISystemVariablePool p = UisutFactory.eINSTANCE.createUISystemVariablePool();
						stm.setItsUISystemVariablePool(p);
					}				
				});
			}
			SystemVariableEditDialog dialog = new SystemVariableEditDialog
				(shell,diagramEP.getEditingDomain(), stm.getItsUISystemVariablePool());
			int result = dialog.open();
		}
		return null;
	}


}
