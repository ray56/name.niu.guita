package name.niu.guitar.uitf.xlsgen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.log.GuitarLog;
import name.niu.guitar.uitf.*;
import name.niu.guitar.uitf.xlsgen.excelExporter.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class XlsGen implements ITCDoneSubscriber{

	public void doGenXls(String uitfFilePath) {
		GuitarLog.getInstance().info("Gen Xls Start");
		// open source resource to read
		TestSuite ts = null;
		{
			ResourceSet src_resourceSet = new ResourceSetImpl();
			src_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uitf", new XMIResourceFactoryImpl());
			URI src_uri = URI.createFileURI(uitfFilePath);
			Resource src_res = src_resourceSet.createResource(src_uri);			
			try {
				src_res.load(null);
				ts = (TestSuite) src_res.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}	
		}
		
		// generate excel from ts 
		ExportExcel<TestCaseDescription> eetc = null;
		try {
			eetc = new ExportExcel<TestCaseDescription>();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String eetc_title = ts.getId();
		if(eetc_title ==  null || eetc_title.equals("")){
			eetc_title = "no_title";
		}
		String[] eetc_header = {"No.", "Test Case Id", "Operations", "Excepted Result"};
		int[]eetc_columnWidth = {1000, 4000, 10000, 10000};
		List<TestCaseDescription> eetc_dataset = new ArrayList<TestCaseDescription>();

		Integer i = 0;
		for(TestCase tc :ts.getItsTestCase()){
			i++;
			GuitarLog.getInstance().info( tc.getId());
			TestCaseDescription tcDescription;
			
			StringBuffer tc_statements_sb = new StringBuffer();
			StringBuffer tc_statements_exp = new StringBuffer();
			int ii = 0;
			int flag = 0;
			for(Statement s : tc.getItsStatement()){
				// find test case head
				if(s.getDescription() != null && s.getDescription().contains("test case head")){
					flag =1;
					ii = 1;
					continue;
				}
				// precondition
				if(flag == 0){
					tc_statements_sb.append((s.getDescription() == null)?"":s.getDescription()).append("\n");
				}
				else if((ii % 2) == 0){
					ii++;
					tc_statements_sb.append((s.getDescription() == null)?"":s.getDescription()).append("\n");
				}
				else{
					ii++;
					tc_statements_exp.append((s.getDescription() == null)?"":s.getDescription()).append("\n");
				}
			}
			tcDescription = new TestCaseDescription(i.toString(), tc.getId(), tc_statements_sb.toString(), tc_statements_exp.toString());
			eetc_dataset.add(tcDescription);
		}
		
		// write target file
		String target_file_path = uitfFilePath.substring(0, uitfFilePath.length() - ".uitf".length()).concat(".xls");
		OutputStream eetc_out;
		try {
			eetc_out = new FileOutputStream(target_file_path);
			eetc.exportExcel(eetc_title,eetc_header, eetc_columnWidth,eetc_dataset, eetc_out,"YYYY-MM-DD");
			eetc_out.close();
			//JOptionPane.showMessageDialog(null, "Generate Test Case Document Successfully!");
			GuitarLog.getInstance().info( "Generate Test Case Document Successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		GuitarLog.getInstance().info("Gen Script End");
	}
	
	@Override
	public void OnUtifFileDone(String uitfFilePath) {
		try{
			doGenXls(uitfFilePath);
		}catch( Exception e) {
			e.printStackTrace() ;
		}

		
	}

	@Override
	public void OnTestCaseDone(TestCase tc) {
		
	}

	@Override
	public void OnTCGStoped(ITCDonePublisher tcg, String reason) {
		// TODO Auto-generated method stub
		
	}

}
