package name.niu.guitar.uitf.scriptgen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.uitf.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class ScriptGen implements ITCDoneSubscriber {

	@Override
	public void OnUtifFileDone(String uitfFilePath) {

		// fill target string buffer with head
		StringBuffer target_sb = new StringBuffer();
		String headStr = 
			"#********************************************************\r\n" +
			"#*  Copyright     Infomation                             \r\n" +
			"#********************************************************\r\n\r\n\r\n";
		target_sb.append(headStr);
		
		// open source resource to read
		ResourceSet src_resourceSet = new ResourceSetImpl();
		src_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
				put("uitf", new XMIResourceFactoryImpl());
		URI src_uri = URI.createFileURI(uitfFilePath);
		Resource src_res = src_resourceSet.createResource(src_uri);
		
		TestSuite ts = null;
		try {
			src_res.load(null);
			ts = (TestSuite) src_res.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		// write test suite script to target_sb
		for(TestCase tc: ts.getItsTestCase()){
			// write test case script
			String tc_head = 
				"#********************************************************\r\n" +
				"#*  %TEST_CASE_ID%                                       \r\n" +
				"#********************************************************\r\n";
			target_sb.append(tc_head.replace("%TEST_CASE_ID%", tc.getId()));			
			for(Statement statement : tc.getItsStatement()){
				
				if(statement.getScriptStr() != null){
					StringTokenizer strtoktt = new StringTokenizer(statement.getScriptStr(),";");
					for(; strtoktt.hasMoreTokens(); ){
						target_sb.append( strtoktt.nextToken() + "\r\n");
					}
				}
			}
			
			// write file
			String txtFilePath = uitfFilePath.substring(0, uitfFilePath.length() - ".uitf".length() ).concat(".txt");
			OutputStream os;
			
			try {
				os = new FileOutputStream(txtFilePath);
				os.write(target_sb.toString().getBytes( "utf8"));
				os.close();				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void OnTestCaseDone(TestCase tc) {

	}

}
