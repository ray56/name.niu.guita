package name.niu.guita.uisut.tcgen.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;


import javax.swing.JOptionPane;

import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.tcgen.config.Configuration;
import name.niu.guita.uisut.tcgen.ui.TestCaseGenWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateTestCaseAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection sel = HandlerUtil.getCurrentSelectionChecked(event);
		if ( sel instanceof IFile ) 
		{
			IFile f = (IFile) sel;
			System.out.println( f.getFullPath() );
		} 
		else if ( sel instanceof IStructuredSelection ) 
		{
			Iterator elements = ((IStructuredSelection) sel).iterator();
			while ( elements.hasNext())
			{
				Object ele = elements.next();
				if (ele instanceof IAdaptable ) 
				{	IAdaptable adaptable = (IAdaptable) ele;
					IFile f = (IFile) adaptable.getAdapter(IFile.class);
					if ( f.getFileExtension().toLowerCase(Locale.ENGLISH).equals( "uisut" ) ) 
					{	String source_uisut_file = f.getLocation().toString();
						String target_uitf_file = source_uisut_file
								.substring(0, source_uisut_file.length()-"uisut".length() ) 
								+ "uitf";
						
						TestCaseGenWizard wizard = new TestCaseGenWizard();
						wizard.setSource( source_uisut_file );
						wizard.setTarget( target_uitf_file );
						WizardDialog wizardDialog = new WizardDialog(HandlerUtil
								.getActiveShell(event), wizard);
						wizardDialog.open();
												
						try {
							f.getParent().refreshLocal(0, null);
						}
						catch (CoreException e) {
							e.printStackTrace();
						}
					} 
					else 
					{	JOptionPane.showMessageDialog(null, "Select *.UISUT file");
						
					}
				}
			}
				
			
		}
		return null;
	}

}
