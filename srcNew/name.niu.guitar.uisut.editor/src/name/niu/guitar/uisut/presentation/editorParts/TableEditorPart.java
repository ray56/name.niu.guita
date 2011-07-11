package name.niu.guitar.uisut.presentation.editorParts;

import name.niu.guitar.uisut.UIElement;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UisutFactory;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IEditorInput;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

public class TableEditorPart extends UISUTBaseEditorPart 
{
	  protected TableViewer viewer;
	  
	  public TableEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {
	    viewer = new TableViewer(parent, SWT.NONE);
	    
		Table table = viewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn objectColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText(getString("_UI_ObjectColumn_label"));
		objectColumn.setResizable(true);

		TableColumn selfColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 100, true));
		selfColumn.setText(getString("_UI_SelfColumn_label"));
		selfColumn.setResizable(true);
		
		TableColumn xxxColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 100, true));
		xxxColumn.setText("xxx");
		xxxColumn.setResizable(true);

		viewer.setColumnProperties(new String [] {"a", "b","ccc"});
		viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));

		{
			CellEditor[] cellEditors  =   new  CellEditor[ 2 ];
			cellEditors[ 0 ]  =   new  TextCellEditor(viewer.getTable())
			{
				   protected void doSetValue(Object value) {
				        if(value == null)
				            return;
				        super.doSetValue(value);
				    }    
			};
			cellEditors[ 1 ]  =   new  TextCellEditor(viewer.getTable());
			viewer.setCellEditors(cellEditors) ;			
		}
		{
			ICellModifier cellModifier = new ICellModifier() {

				@Override
				public boolean canModify(Object element, String property) {
					return true;
				}

				@Override
				public Object getValue(Object element, String property) {
					// get index fro property
					int index = 0 ;
					for( ; index < viewer.getColumnProperties().length ; index ++ )
					{
						if ( viewer.getColumnProperties()[index].equals(property) ) break ;
					}
					if ( index >= viewer.getColumnProperties().length ) index = -1 ;
					
					// get string
					ITableItemLabelProvider p = (ITableItemLabelProvider)
						getAdapterFactory().adapt(element, ITableItemLabelProvider.class) ;
					
					return p.getColumnText(element, index) ;
				}

				@Override
				public void modify(Object element, String property, Object value) {
					if (element instanceof Item) {
				         element = ((Item) element).getData();
				     }				
					
					if( element instanceof UISystemVariable )
					{						
						if( "a".equals(property)){
							
							
							//DirectEditRequest directRequest = new DirectEditRequest();
							SetRequest req = new SetRequest(
									(TransactionalEditingDomain)TableEditorPart.this.getEditingDomain(),
									(UISystemVariable)element, 
									UisutFactory.eINSTANCE.getUisutPackage().getUIElement_Name(),
									value);
							SetValueCommand cmd = new SetValueCommand( req ) ;
							//DiagramEditDomain domain = (DiagramEditDomain)TableEditorPart.this.getEditingDomain();
							//DiagramCommandStack stack = domain.getDiagramCommandStack();
							try {
								OperationHistoryFactory.getOperationHistory().execute(cmd,null,null);
							} catch (ExecutionException e) {								
								e.printStackTrace();
							}
							//stack.execute( new ICommandProxy (cmd) );

						} else if ( "b".equals(property) ) {
							((UISystemVariable)element).setDescription((String)value);
						} else {							
						}
					}				
				}
				
			};
			viewer.setCellModifier(cellModifier);
		}
		
		
	    createContextMenuFor(viewer);
	    getEditorSite().setSelectionProvider(viewer);
	  }

	  @Override
	  public void setFocus() {
	    viewer.getTable().setFocus();
	  }

	  @Override
	  public void setInput(Object input) {
		  
		IEditorInput editorInput = this.getEditorInput() ;
		
		EObject eo = this.getEditingDomain().getResourceSet().getResources().get(0).getContents().get(0) ;
		if (eo instanceof UIStatemachine ) {
			viewer.setInput( eo ) ;
			return ;
		}
		
		if( input instanceof Resource ) {
			Resource res = (Resource) input ;
			EObject eo1 = res.getContents().get(0) ;
			if (eo1 instanceof UIStatemachine ) {
				viewer.setInput( eo1 ) ;
				return ;
			}
		}
	    viewer.setInput(input);
	  }
}