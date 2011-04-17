package name.niu.guita.uisut.tcgen.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uisut.*;
import name.niu.guita.uitf.uitf.*;
import name.niu.guita.uitf.uitf.impl.UitfPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerationTestCaseAlgorithm {
	public static void gen_algorithm1(String source_file , String target_file){
		// set source
		ResourceSet src_resourceSet = new ResourceSetImpl() ;
		src_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uisut", new XMIResourceFactoryImpl()) ;
		URI src_uri = URI.createFileURI(source_file) ;
		Resource src_res = src_resourceSet.createResource(src_uri);
		// set target
		ResourceSet trgt_resourceSet = new ResourceSetImpl(); 
		trgt_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uitf", new XMIResourceFactoryImpl()) ;
		URI trgt_uri = URI.createFileURI(target_file);
		Resource trgt_res = trgt_resourceSet.createResource(trgt_uri);
		// convert : load source , convert, save target
		try {
			// load and get root element of UIStatemachine
			src_res.load(null);
			UIStatemachine stm =  (UIStatemachine)src_res.getContents().get(0) ;
			System.out.println(stm.getName());
			
			// create target resource and root element
			// UitfPackageImpl.init() ;			
			TestSuite ts = UitfFactory.eINSTANCE.createTestSuite();
			ts.setId("TS_001") ;
			trgt_res.getContents().add(ts) ;
			
			// traversal algorithm to genrate tc
			for( int i = 0 ; i < stm.getItsState().size() ; i ++ ) {
				AbstractState st = stm.getItsState().get(i) ;
				st.getName() ;
				TestCase tc = UitfFactory.eINSTANCE.createTestCase() ;
				tc.setId( String.format("TC_%03d", i) );
				ts.getItsTestCase().add(tc) ;
				
				Statement statement = UitfFactory.eINSTANCE.createStatement() ;
				statement.setDescription( String.format( "[Pre]\n assert in %s\n",st.getName() ) ) ;
				
				for( int ii = 0 ; ii < st.getItsOutTransition().size() ; ii ++ ) {
					UITransition transition = st.getItsOutTransition().get(ii) ;
					Statement step_statement = UitfFactory.eINSTANCE.createStatement() ;
					step_statement.setDescription( String.format("trigger %s \n", transition.getTriggerStr() ) ) ;
					Statement stepAssert_statement = UitfFactory.eINSTANCE.createStatement() ;
					stepAssert_statement.setDescription( String.format("assert in %s\n", transition.getItsTrgtState().getName() )) ;
					break ;
				}
			}				
			// save target resource
			trgt_res.save(null);				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
