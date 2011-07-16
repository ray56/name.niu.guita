package name.niu.guitar.ui.handlers;

import name.niu.guitar.dialogs.SystemVariableEditDialog;
import name.niu.guitar.ui.wizards.TestCaseGenWizard;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
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
			UIStatemachine stm = (UIStatemachine) diagramEP.getDiagram().getElement();
			SystemVariableEditDialog dialog = new SystemVariableEditDialog
				(shell,diagramEP.getEditingDomain(), stm.getItsUISystemVariablePool());
			int result = dialog.open();
		}
		return null;
	}


}
