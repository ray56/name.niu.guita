package name.niu.guita.uitf.scriptgen.algorithms;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.net.MalformedURLException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guita.uitf.uitf.AssertInState;
import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.TestCase;
import name.niu.guita.uitf.uitf.TestSuite;
import name.niu.guita.uitf.uitf.TriggeredTransition;

public class GenScriptAlgorithm {
	public static void GenScript( IFile source){
		
		// fill target_sb wieh head
		StringBuffer target_sb = new StringBuffer() ;
		String headStr = 
			"#********************************************************\r\n" +
			"#*  Copyright     Infomation                             \r\n" +
			"#********************************************************\r\n\r\n\r\n";
		target_sb.append(headStr);
		
		
		// open source resource to read
		ResourceSet src_resourceSet = new ResourceSetImpl() ;
		src_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
				put("uitf", new XMIResourceFactoryImpl()) ;
		URI src_uri = URI.createFileURI( source.getLocation().toString() ) ;
		Resource src_res = src_resourceSet.createResource(src_uri);
		
		TestSuite ts = null ;
		try {
			src_res.load(null);
			ts = (TestSuite) src_res.getContents().get(0) ;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ;
		}		
		// write test suite script to target_sb
		for( TestCase tc: ts.getItsTestCase() ) {
			// write test case script, maybe a file for a case.
			String tc_head = 
				"#********************************************************\r\n" +
				"#*  %TEST_CASE_ID%                                       \r\n" +
				"#********************************************************\r\n";
			target_sb.append(tc_head.replace("%TEST_CASE_ID%", tc.getId()));			
			for ( Statement statement : tc.getItsStatement() ) {
				if( statement instanceof AssertInState ) {
					AssertInState ais = (AssertInState) statement ;
					target_sb.append("");					
				} else if (statement instanceof TriggeredTransition ) {
					TriggeredTransition tt = (TriggeredTransition) statement ;
					if(tt.getScriptStr() == null){
						target_sb.append( tt.getScriptStr() + "\r\n");
					}
					else{
						StringTokenizer strtoktt = new StringTokenizer(tt.getScriptStr(),";");
						for(; strtoktt.hasMoreTokens(); ){
							target_sb.append( strtoktt.nextToken() + "\r\n");
						}
					}
				}
			}
		}

		// write file
		InputStream targetFS = new ByteArrayInputStream( target_sb.toString().getBytes()) ;
		String target = source.getFullPath().removeFileExtension().addFileExtension("txt").toFile().getName() ;
		IFile target_file = null ;
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
		try {
			if( target_file.exists()) {
				target_file.setContents(targetFS, IResource.NONE, null);
			}else {
				target_file.create(targetFS, IResource.NONE, null);
			}
		} catch (CoreException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		// refresh project
		try {
			source.getProject().refreshLocal(0, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


		
	}

}
