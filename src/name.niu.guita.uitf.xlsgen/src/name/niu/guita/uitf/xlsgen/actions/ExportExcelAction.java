package name.niu.guita.uitf.xlsgen.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uitf.xlsgen.dataObject.TestCaseDescription;
import name.niu.guita.uitf.xlsgen.util.excelExporter.ExportExcel2;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Diagram;

public class ExportExcelAction extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// get selected tc File or tc EObject to generate excel 
		ISelection sel = HandlerUtil.getCurrentSelectionChecked(event);
		IWorkbenchPart part =  HandlerUtil.getActivePartChecked(event);
		IEditorPart editorpart = HandlerUtil.getActiveEditorChecked(event);
		System.out.print( sel.getClass().getName() ) ;
		System.out.print( part.getClass().getName() ) ;
		System.out.print( editorpart.getClass().getName() ) ;
		IEditorInput editorinput = editorpart.getEditorInput();
		System.out.print( editorinput.exists() ) ;
		System.out.print( editorinput.getName() ) ;
		System.out.print( editorinput.toString() ) ;
		
		if( sel instanceof IStructuredSelection ){
			Object f = ((IStructuredSelection) sel).getFirstElement() ;
			if ( f instanceof EditPart){
				EditPart ep = (EditPart) f ;
				EObject eo = (EObject )ep.getModel();
				if ( eo instanceof Diagram ) {
					System.out.print ( eo.eResource().getURI().toString());
					System.out.print ( ((Diagram)eo).getElement().eResource().getURI().toString() );
				}
				System.out.print ( eo.eResource().getURI() ) ;
			}			
		}

		// Use Exproter Excel to generate
		ExportExcel2<TestCaseDescription> eetc = null ;
		try {
			eetc = new ExportExcel2<TestCaseDescription>();
		} catch (Exception e){
			e.printStackTrace() ;
		}
		String eetc_title = "TestSuite1" ;
		String[] eetc_header = { "No.", "Test Case Id", "Operations",
				"Excepted Result" };
		int[]eetc_columnWidth = {1000, 4000, 10000, 10000} ;
		List<TestCaseDescription> eetc_dataset = new ArrayList<TestCaseDescription>();
		eetc_dataset.add(new TestCaseDescription("1", "Case_001",
				"[Precondition]\n1.系统在A界面下\n[Steps]\n1.点击Button1\n",
				"[Excepted]\n1.到达画面B"));
		eetc_dataset.add(new TestCaseDescription("2", "Case_002",
				"[Precondition]\n1.系统在B界面下\n[Steps]\n1.点击Button2\n",
				"[Excepted]\n1.到达画面C"));
		eetc_dataset.add(new TestCaseDescription("3", "Case_003",
				"[Precondition]\n1.系统在C界面下\n[Steps]\n1.点击Button3\n",
				"[Excepted]\n1.到达画面A\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

		OutputStream eetc_out;
		try {
			eetc_out = new FileOutputStream("C:\\tc.xls");
			eetc.exportExcel(eetc_title,eetc_header, eetc_columnWidth,eetc_dataset, eetc_out,"YYYY-MM-DD");
			eetc_out.close();
			JOptionPane.showMessageDialog(null, "导出成功!");
			System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

}
