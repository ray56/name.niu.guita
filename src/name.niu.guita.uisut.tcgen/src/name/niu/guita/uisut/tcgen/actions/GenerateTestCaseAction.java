package name.niu.guita.uisut.tcgen.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateTestCaseAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell() ;
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Select uisut File");
		fileDialog.setFilterExtensions(new String[] { "*.uisut" });
		fileDialog.setFilterNames(new String[] { "Uitf files(*.uisut)" });
		String source_uisut_file = fileDialog.open();
		System.out.println(source_uisut_file);
		String target_uitf_file = URI.createFileURI( source_uisut_file ).
				trimFileExtension().appendFileExtension("uitf").toFileString();
		GenerationTestCaseAlgorithm.gen_algorithm1(source_uisut_file, target_uitf_file) ;
		
		return null;
	}

}
