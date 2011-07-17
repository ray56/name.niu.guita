package name.niu.guitar.dialogs;

import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UISystemVariablePool;
import name.niu.guitar.uisut.UisutFactory;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.ui.services.properties.extended.IPropertyAction;
import org.eclipse.gmf.runtime.common.ui.services.properties.extended.MultiButtonCellEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;



public class SystemVariableEditDialog extends Dialog {
	
	protected TableViewer viewer;
	
	final protected TransactionalEditingDomain editingDomain ;
	
	final protected UISystemVariablePool  variablePool  ;

	private Table table = null ;

	private Button deleteButton;
	

	public SystemVariableEditDialog(
			Shell parentShell, 
			TransactionalEditingDomain editingDomain,
			UISystemVariablePool  variablePool) 
	{
		super(parentShell);
		assert( editingDomain != null);
		assert( variablePool != null);
		this.editingDomain = editingDomain ;
		this.variablePool = variablePool ;
	}
	
	  protected AdapterFactory getAdapterFactory() {
		    return ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		  }
	  
	@Override
	protected Control createDialogArea(Composite parent) {
		
        Composite composite = (Composite) super.createDialogArea(parent);
        
        
        GridLayout compositeLayout = new GridLayout( 1, false);
        composite.setLayout( compositeLayout ) ;
        
        // set add and delete button
        Composite buttons = new Composite(composite, SWT.NONE); 
        buttons.setLayoutData(new GridData(GridData.FILL_HORIZONTAL)); 
        buttons.setLayout(new RowLayout()); 

		Button addButton = new Button(buttons, SWT.PUSH);
		addButton.setText("Add");
		addButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				editingDomain.getCommandStack().execute(
						new RecordingCommand(editingDomain) {
							@Override
							protected void doExecute() {
								UISystemVariable v = UisutFactory.eINSTANCE
										.createUISystemVariable();
								v.setName("defalutName");
								variablePool.getItsUISystemVariable()
										.add(v);
							}
				});

				// viewer.setInput( systemVariablePool ) ;
				viewer.refresh();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});	
		
		deleteButton = new Button(buttons, SWT.PUSH);
		deleteButton.setText("Del");
		deleteButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
			     IStructuredSelection selection = (IStructuredSelection) viewer.getSelection(); 
		            final Object m =  ((selection).getFirstElement()); 
		            if (m != null) { 
		                Table table = viewer.getTable(); 
		                int i = table.getSelectionIndex(); //none then -1 
		                table.setSelection(i + 1); 
		                viewer.remove(m);
		                editingDomain.getCommandStack().execute(
								new RecordingCommand(editingDomain) {
									@Override
									protected void doExecute() {
										variablePool.getItsUISystemVariable().remove(m); 
									}
						});
		                //
		            } 
				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			
		});

		// create table viewer
	    viewer = new TableViewer(composite, SWT.NONE);
	    
		table = viewer.getTable();
		table.setLayoutData( new GridData(500, 600));
		
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn objectColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText("Name");
		objectColumn.setResizable(true);

		TableColumn selfColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 100, true));
		selfColumn.setText("Description");
		selfColumn.setResizable(true);
	
		TableColumn xxxColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 40, true));
		xxxColumn.setText("Delete");
		xxxColumn.setResizable(true);
		xxxColumn.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection(); 
	            final Object m =  ((selection).getFirstElement()); 
	            if (m != null) { 
	                Table table = viewer.getTable(); 
	                int i = table.getSelectionIndex(); //none then -1 
	                table.setSelection(i + 1); 
	                viewer.remove(m);
	                editingDomain.getCommandStack().execute(
							new RecordingCommand(editingDomain) {
								@Override
								protected void doExecute() {
									variablePool.getItsUISystemVariable().remove(m); 
								}
					});
	            } 
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}			
		});
		

		viewer.setColumnProperties(new String [] {"a", "b","ccc"});
		viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory() ) );
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory() ));
		
		{
			CellEditor[] cellEditors  =   new  CellEditor[ 3 ];
			cellEditors[ 0 ]  =   new  TextCellEditor(viewer.getTable())
			{
				   protected void doSetValue(Object value) {
				        if(value == null)
				            return;
				        super.doSetValue(value);
				    }    
			};
			cellEditors[ 1 ]  =   new  TextCellEditor(viewer.getTable())
			{
				protected void doSetValue(Object value) {
					if (value == null)
						return;
					super.doSetValue(value);
				} 	
			};
			cellEditors[2] = new MultiButtonCellEditor(viewer.getTable()){
				@Override
				protected void initButtons() {	
			        IPropertyAction clearAction = new IPropertyAction() {
			            public Object execute(Control owner) {
			            	final int i = viewer.getTable().getSelectionIndex() ;
							editingDomain.getCommandStack().execute(
									new RecordingCommand(editingDomain) {
										@Override
										protected void doExecute() {
											variablePool.getItsUISystemVariable().remove(i);
										}
									});
							viewer.refresh();
			        		return "";                
			            }
			        };
			        addButton("delete", clearAction); 
				}
				
			};
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
					
					if( "ccc".equals(property)){
						return "        " ;
					}
					
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
									(TransactionalEditingDomain)editingDomain,
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
							final UISystemVariable v = (UISystemVariable)element ;
							final String des = (String)value ;
							editingDomain.getCommandStack().execute(
									new RecordingCommand(editingDomain) {
										@Override
										protected void doExecute() {
											((UISystemVariable)v).setDescription((String)des);
										}
									});
							
						} else if ( "ccc".equals(property)){
							
						} else {
							
						}
					}				
				}
				
			};
			viewer.setCellModifier(cellModifier);
		}
	    //createContextMenuFor(viewer);
	    //getEditorSite().setSelectionProvider(viewer);      
        
		viewer.setInput( variablePool );
		
		return composite;

	}


    	
	@Override
	protected void okPressed() {
		
		super.okPressed();
	}

	@Override
	public boolean close() {
		//contentProvider.dispose();
		return super.close();
	}

}
