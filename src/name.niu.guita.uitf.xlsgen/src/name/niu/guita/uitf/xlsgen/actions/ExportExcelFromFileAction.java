package name.niu.guita.uitf.xlsgen.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.TestCase;
import name.niu.guita.uitf.uitf.TestSuite;
import name.niu.guita.uitf.uitf.UitfFactory;
import name.niu.guita.uitf.uitf.impl.UitfPackageImpl;
import name.niu.guita.uitf.xlsgen.dataObject.TestCaseDescription;
import name.niu.guita.uitf.xlsgen.util.excelExporter.ExportExcel2;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExportExcelFromFileAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell() ;
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Select uitf File");
		fileDialog.setFilterExtensions(new String[] { "*.uitf" });
		fileDialog.setFilterNames(new String[] { "Uitf files(*.uitf)" });
		String selected = fileDialog.open();
		System.out.println(selected);
		
		
		
		UitfPackageImpl.init() ;
		
		ResourceSet resourceSet = new ResourceSetImpl() ;
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
		put("uift", new XMIResourceFactoryImpl()) ;
		URI uri = URI.createFileURI(selected) ;
		Resource res = resourceSet.createResource(uri);
		try {
			res.load(null);
			TestSuite ts =  (TestSuite)res.getContents().get(0) ;
			
			// generate excel from ts 
			ExportExcel2<TestCaseDescription> eetc = null ;
			try {
				eetc = new ExportExcel2<TestCaseDescription>();
			} catch (Exception e){
				e.printStackTrace() ;
			}
			String eetc_title = ts.getId() ;
			String[] eetc_header = { "No.", "Test Case Id", "Operations",
					"Excepted Result" };
			int[]eetc_columnWidth = {1000, 4000, 10000, 10000} ;
			List<TestCaseDescription> eetc_dataset = new ArrayList<TestCaseDescription>();

			for( TestCase next :ts.getItsTestCase()){
				System.out.println( next.getId());
				TestCaseDescription tcDescription ;
				
				StringBuffer sb = new StringBuffer() ;
				for( Statement s : next.getItsStatement() ){
					sb = sb.append( s.getDescription()).append("\n");
				}
				tcDescription = new TestCaseDescription(
						"1", ts.getId() , sb.toString() , "See Left");
				eetc_dataset.add(tcDescription);
			}
			OutputStream eetc_out;
			try {
				eetc_out = new FileOutputStream( uri.trimFileExtension().appendFileExtension("xls").toFileString());
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
	

}
