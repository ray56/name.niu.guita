package name.niu.guita.sandbox.using_uisut;



import java.io.IOException;

import name.niu.guita.uisut.impl.uisutPackageImpl;
import name.niu.guita.uisut.uisutFactory;

import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.UIStatemachine;

import org.eclipse.emf.common.util.URI ;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DemoUsing {

	public static void main ( String[] args ){
		uisutPackageImpl.init() ;
		
		uisutFactory factory = uisutFactory.eINSTANCE ;
		
		UIStatemachine stm = factory.createUIStatemachine() ;
		stm.setName("CalSM") ;

		UIState st = factory.createUIState() ;
		st.setName("InputFirstNumber") ;
		
		stm.getItsState().add( st ) ;	
		
		ResourceSet resourceSet = new ResourceSetImpl() ;
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uisut", new XMIResourceFactoryImpl()) ;
		URI uri = URI.createURI("file:/C:/1.uisut") ;
		Resource res = resourceSet.createResource(uri);
		res.getContents().add(stm) ;
		try {
			res.save(null);		
			System.out.println("Saved!" + uri ) ;
		} catch ( IOException ex ) {
			System.out.println("Save Error" + uri ) ;
		}
		
	}	
}
