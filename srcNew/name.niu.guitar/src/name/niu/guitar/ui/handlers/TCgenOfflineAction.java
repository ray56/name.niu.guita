package name.niu.guitar.ui.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

import name.niu.guitar.ui.wizards.TestCaseGenWizard;
import name.niu.guitar.uisut.*;
import name.niu.guitar.uisut.tcgen.*;
import name.niu.guitar.uitf.scriptgen.*;
import name.niu.guitar.uitf.xlsgen.*;


public class TCgenOfflineAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// set uisutFilePath
		String uisutFilePath = getCurrentInputString(event);
		
		// set stm
		UIStatemachine stm = getInputStm(uisutFilePath);

		// set maxLoop
		TestCaseGenWizard wizard = new TestCaseGenWizard();
		Shell shell = HandlerUtil.getActiveShell(event);
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		int wizardResult = wizardDialog.open() ;
		if ( wizardResult == Window.CANCEL ) {
			return null ;
		}
		final int maxLoop = wizard.getMaxLoopCount();
		final int maxStep = wizard.getMaxStepCount();
		
		// set start and end
		AbstractUIState astStart = null;
		AbstractUIState astEnd = null;
		
		// add addSubscriber
		TestCaseGen tcgen = new TestCaseGen();
		ScriptGen sptgen = new ScriptGen();
		XlsGen xlsgen = new XlsGen();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		
		// generate TestCase
		tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);
		
		return null;
	}

	static public UIStatemachine getInputStm(String uisutFilePath) {
		UIStatemachine stm = null;
		{
			ResourceSet uisutResourceSet = new ResourceSetImpl();
			uisutResourceSet.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put("uisut", new XMIResourceFactoryImpl());
			URI uisutURI = URI.createFileURI(uisutFilePath);
			Resource uisutResource = uisutResourceSet.createResource(uisutURI);
			try {
				uisutResource.load(null);
				stm = (UIStatemachine) uisutResource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return stm;
	}

	static public String getCurrentInputString(ExecutionEvent event)
			throws ExecutionException {
		String uisutFilePath = null ;
		{
			String uisutDiaFilePath = "";
			IEditorInput input = HandlerUtil.getActiveEditorChecked(event)
					.getEditorInput();
			if (input instanceof FileEditorInput) {
				uisutDiaFilePath = ((FileEditorInput) input).getPath().toString();
			} else if (input instanceof URIEditorInput) {
				uisutDiaFilePath = ((URIEditorInput) input).getURI()
						.toFileString();
			}
			uisutFilePath = uisutDiaFilePath;
		}
		return uisutFilePath;
	}
	
}
