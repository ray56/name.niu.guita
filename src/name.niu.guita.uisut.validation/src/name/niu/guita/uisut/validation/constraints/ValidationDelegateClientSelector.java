package name.niu.guita.uisut.validation.constraints;

import org.eclipse.emf.validation.model.IClientSelector;

public class ValidationDelegateClientSelector implements IClientSelector {

	@Override
	public boolean selects(Object object) {
		System.out.println( object.getClass().getName() ) ;
		return true;
	}

}
