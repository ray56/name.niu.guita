package name.niu.guitar.uisut.presentation;

import name.niu.guitar.uisut.diagram.part.UisutDiagramActionBarContributor;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IActionBars2;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;


/**
 * A special implementation of a <code>MultiPageEditorActionBarContributor</code> to switch between
 * action bar contributions for tree-based editor pages and diagram editor pages.
 * @see MultiPageEditorActionBarContributor  
 */
public class UISUTMultipageActionBarContributor extends
		MultiPageEditorActionBarContributor {

	private IActionBars2 myActionBars2;

	private SubActionBarsExt myTreeSubActionBars;

	private SubActionBarsExt myDiagramSubActionBars;

	private SubActionBarsExt myActiveEditorActionBars;

	private IEditorPart myActiveEditor;
	
	private IPropertyListener myEditorPropertyChangeListener = new IPropertyListener() {

		public void propertyChanged(Object source, int propId) {
			if (myActiveEditorActionBars != null) {
				if (myActiveEditorActionBars.getContributor() instanceof UisutActionBarContributor) {
					((UisutActionBarContributor) myActiveEditorActionBars.getContributor()).update();
				}
			}
		}
	};

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#init(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void init(IActionBars bars) {
		super.init(bars);
		assert bars instanceof IActionBars2;
		myActionBars2 = (IActionBars2) bars;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorActionBarContributor#setActiveEditor(org.eclipse.ui.IEditorPart)
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		if (myActiveEditor != null) {
			myActiveEditor.removePropertyListener(myEditorPropertyChangeListener);
		}
		super.setActiveEditor(part);
		myActiveEditor = part;
		if (myActiveEditor instanceof IEditingDomainProvider) {
			myActiveEditor.addPropertyListener(myEditorPropertyChangeListener);	
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorActionBarContributor#setActivePage(org.eclipse.ui.IEditorPart)
	 */
	@Override
	public void setActivePage(IEditorPart activeEditor) {
		if (activeEditor instanceof UisutDiagramEditor) {
			setActiveActionBars(getDiagramSubActionBars(), activeEditor);
		} else {
			setActiveActionBars(getTreeSubActionBars(), activeEditor);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		if (myDiagramSubActionBars != null) {
			myDiagramSubActionBars.dispose();
			myDiagramSubActionBars = null;
		}
		if (myTreeSubActionBars != null) {
			myTreeSubActionBars.dispose();
			myTreeSubActionBars = null;
		}
	}

	/**
	 * Switches the active action bars.
	 */
	private void setActiveActionBars(SubActionBarsExt actionBars,
			IEditorPart activeEditor) {
		if (myActiveEditorActionBars != null
				&& myActiveEditorActionBars != actionBars) {
			myActiveEditorActionBars.deactivate();
		}
		myActiveEditorActionBars = actionBars;
		if (myActiveEditorActionBars != null) {
			myActiveEditorActionBars.setEditorPart(activeEditor);
			myActiveEditorActionBars.activate();
		}
	}

	/**
	 * @return the sub cool bar manager for the tree-based editors.
	 */
	public SubActionBarsExt getTreeSubActionBars() {
		if (myTreeSubActionBars == null) {
			myTreeSubActionBars = new SubActionBarsExt(getPage(),
					myActionBars2, new UisutActionBarContributor(),
					"name.niu.guita.uisut.presentation.TreeActionContributor");
		}
		return myTreeSubActionBars;
	}

	/**
	 * @return the sub cool bar manager for the diagram editor.
	 */
	public SubActionBarsExt getDiagramSubActionBars() {
		if (myDiagramSubActionBars == null) {
			myDiagramSubActionBars = new SubActionBarsExt(getPage(),
					myActionBars2,
					new UisutDiagramActionBarContributor(),
					"name.niu.guita.uisut.presentation.DiagramActionContributor");
		}
		return myDiagramSubActionBars;
	}

}
