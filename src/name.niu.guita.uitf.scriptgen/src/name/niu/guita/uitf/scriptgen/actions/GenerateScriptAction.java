package name.niu.guita.uitf.scriptgen.actions;

import java.util.Iterator;

import name.niu.guita.uitf.scriptgen.algorithms.GenScriptAlgorithm;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateScriptAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getCurrentSelectionChecked(event) ;
		if ( sel instanceof IFile ) {
			IFile f = (IFile) sel ;
			System.out.println( f.getFullPath() ) ;
		} else if ( sel instanceof IStructuredSelection ) {
			Iterator elements = ((IStructuredSelection) sel).iterator();
			while ( elements.hasNext()){
				Object ele = elements.next() ;
				if (ele instanceof IAdaptable ) {
					IAdaptable adaptable = (IAdaptable) ele ;
					IFile f = (IFile) adaptable.getAdapter(IFile.class);
					GenScriptAlgorithm.GenScript( f) ;
				}
			}
				
			
		}
		return null;
	}
	


}
