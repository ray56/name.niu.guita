package name.niu.guitar.ui.handlers;

import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.services.ISourceProviderService;

import name.niu.guitar.scriptengine.ScriptEngine;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDoneSubscriber;
import name.niu.guitar.ui.sourceProviders.CommandState;
import name.niu.guitar.uisut.*;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;
import name.niu.guitar.uisut.tcgen.*;
import name.niu.guitar.uitf.scriptgen.ScriptGen;
import name.niu.guitar.uitf.xlsgen.XlsGen;

public class TCgenOnlineAction extends AbstractHandler {
	
	

	private String genAndExe = CommandState.GEN_AND_EXE_IN_IDLE ;
	// sync variable for access genAndExe
	private Object genAndExeSync = new String[0] ;
	// semaphore for user click
	private Semaphore click = new Semaphore(1) ;
	
	
	private CommandState commandStateService = null ;
	
	public void ChangeGenAndExe(String cur) {
		synchronized (genAndExeSync) {
			if (cur != null && !cur.equals(genAndExe)) {
				genAndExe = cur;
				// Set Button				
				commandStateService.toogleGenAndExeStatus(genAndExe);
			}
		}
	}

	private Object Start( ExecutionEvent event) throws ExecutionException 
	{
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING) ;
		assert(false);
		final IEditorInput editorInput = HandlerUtil.getActiveEditorChecked(event).getEditorInput();
		// set uisutFilePath
		String uisutFilePath = TCgenOfflineAction.getCurrentInputString(event);
		
		// set stm
		final UIStatemachine stm = TCgenOfflineAction.getInputStm(uisutFilePath);

		// get diagramEditor
		UisutDiagramEditor diagramEditor = null ;
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor("a.uisut");
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IEditorPart editorPart = page.openEditor(editorInput, desc.getId());
			assert ( editorPart instanceof UisutDiagramEditor ) ;
			diagramEditor = (UisutDiagramEditor) editorPart ;
		} catch (PartInitException e1) {
			e1.printStackTrace();
		}
		
		// set maxLoop
		int maxLoop = 2;
		
		// set maxStep
		int maxStep = 20;
		
		// set start and end
		AbstractUIState astStart = null;
		AbstractUIState astEnd = null;
		
		// add addSubscriber
		TestCaseGen 	tcgen 	= new TestCaseGen();
		
		ScriptGen 		sptgen 	= new ScriptGen();		
		XlsGen 			xlsgen 	= new XlsGen();
		ScriptEngine	scriptEngine = new ScriptEngine();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		tcgen.addSubscriber(scriptEngine);
		
		scriptEngine.addSubscriber( new ITargetScriptExeDoneSubscriber() {

			@Override
			public void OnTargetStatementDone(String[] executedUUID) {
				
				for ( String uuid : executedUUID ) {
					EObject o = stm.eResource().getEObject( uuid ) ;
					if ( o instanceof AbstractUIState ){
						// set color
						((AbstractUIState)o).setHighlight("bold_red");
					}else if ( o instanceof UITransition ) {
						// set color
						((UITransition)o).setHighlight("bold_red");
					}else {
						assert(false):"model changed?";
					}
					
					// change state
					ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPED ) ;
					
					// wait for button clicked
					try {
						click.acquire() ;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}										
				}
			}
			
		});
		
		// generate TestCase
		tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);
		
		return null;
	}

	private Object Continue( ExecutionEvent event) throws ExecutionException 
	{
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING );
		assert(false);
		// generate a click
		click.release() ;
		return null ;
	}
	
	private Object Stop( ExecutionEvent event) throws ExecutionException 
	{
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE) ;
		return null ;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		if ( commandStateService == null ) {
			ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
					.getActiveWorkbenchWindow(event).getService(
							ISourceProviderService.class);
			commandStateService = (CommandState) sourceProviderService
					.getSourceProvider(CommandState.GEN_AND_EXE_STATUS);
		}

		String subCmd = event.getParameter("name.niu.guitar.ui.commands.GenOnline.subCmd") ;
		if ( subCmd.equals("START")){
			
			MessageDialog.openInformation(
					HandlerUtil.getActiveShell(event),
					"Guitar",
					"Already Started");
			
			return Start( event ) ;
		} else if (subCmd.equals("CONTINUE")){
			return Continue( event ) ;
		} else if (subCmd.equals("STOP")) {
			return Stop( event ) ;
		} else {
			assert(false);
		}		
		return null ;
	}
}
