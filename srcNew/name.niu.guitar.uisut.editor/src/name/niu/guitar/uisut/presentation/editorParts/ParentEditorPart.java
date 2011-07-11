package name.niu.guitar.uisut.presentation.editorParts;

import java.util.Collections;

import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class ParentEditorPart extends UISUTBaseEditorPart 
{
	  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
	
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}
	
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}
	
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}
	
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	protected TreeViewer viewer;
	  
	  public ParentEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {
		  viewer = new TreeViewer(parent, SWT.MULTI);
		  viewer.setAutoExpandLevel(30);
		  viewer.setContentProvider(new ReverseAdapterFactoryContentProvider(getAdapterFactory()));
		  viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		  createContextMenuFor(viewer);
		  getEditorSite().setSelectionProvider(viewer);
	  }

	  @Override
	  public void setFocus() {
	    viewer.getTree().setFocus();
	  }

	  @Override
	  public void setInput(Object input) {
	    viewer.setInput(input);
	  }
}