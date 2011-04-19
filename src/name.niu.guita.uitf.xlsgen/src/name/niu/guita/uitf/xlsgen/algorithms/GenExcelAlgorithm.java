package name.niu.guita.uitf.xlsgen.algorithms;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.TestCase;
import name.niu.guita.uitf.uitf.TestSuite;
import name.niu.guita.uitf.xlsgen.dataObject.TestCaseDescription;
import name.niu.guita.uitf.xlsgen.util.excelExporter.ExportExcel2;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenExcelAlgorithm {

	public static void GenScript(IFile source) {
		// open source resource to read
		TestSuite ts = null ;
		{
			ResourceSet src_resourceSet = new ResourceSetImpl() ;
			src_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
					put("uitf", new XMIResourceFactoryImpl()) ;
			URI src_uri = URI.createFileURI( source.getLocation().toString() ) ;
			Resource src_res = src_resourceSet.createResource(src_uri);			
			try {
				src_res.load(null);
				ts = (TestSuite) src_res.getContents().get(0) ;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ;
			}	
		}
		
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

		Integer i = 0 ;
		for( TestCase tc :ts.getItsTestCase()){
			i ++ ;
			System.out.println( tc.getId());
			TestCaseDescription tcDescription ;
			
			StringBuffer tc_statements_sb = new StringBuffer() ;
			StringBuffer tc_statements_exp = new StringBuffer() ;
			Integer ii = 0 ;
			for( Statement s : tc.getItsStatement() ){
				ii ++ ;
				if(ii == 1){
					tc_statements_sb
					.append( ( s.getDescription()==null )?"":s.getDescription() )
					.append("\n").append("\n");
				}
				else if((ii % 2) == 0){
					tc_statements_sb.append(ii / 2).append(". ")
					.append( ( s.getDescription()==null )?"":s.getDescription() )
					.append("\n");
				}
				else{
					tc_statements_exp.append(ii / 2).append(". ")
					.append( ( s.getDescription()==null )?"":s.getDescription() )
					.append("\n");
				}
				
			}
			tcDescription = new TestCaseDescription(
					i.toString(), tc.getId() , tc_statements_sb.toString() , tc_statements_exp.toString());
			eetc_dataset.add(tcDescription);
		}
		

		// get target file
		IFile target_file = null ;
		{
			String target = source.getFullPath().removeFileExtension().addFileExtension("xls").toFile().getName() ;		
			IContainer parent = source.getParent();
			if ( parent instanceof IProject ){
				IProject tempPrj = (IProject) parent ;
				target_file =  tempPrj.getFile(target) ;
			} else if( parent instanceof IFolder) {
				IFolder tempFolder = (IFolder) parent ;
				target_file = tempFolder.getFile(target);
			} else {
				return ;
			}		
		}		
		String target_file_path = target_file.getLocation().toString();
		
		// write target file		
		OutputStream eetc_out;		
		try {
			eetc_out = new FileOutputStream( target_file_path );
			eetc.exportExcel(eetc_title,eetc_header, eetc_columnWidth,eetc_dataset, eetc_out,"YYYY-MM-DD");
			eetc_out.close();
			JOptionPane.showMessageDialog(null, "Generate Test Case Document Successfully!");
			System.out.println("Generate Test Case Document Successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		
		
		// refresh project
		try {
			source.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

}
