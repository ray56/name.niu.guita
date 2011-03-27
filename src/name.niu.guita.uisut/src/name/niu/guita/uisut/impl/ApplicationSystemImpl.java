/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.ApplicationSystem;
import name.niu.guita.uisut.UISUT;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.ApplicationSystemImpl#getItsUISUT <em>Its UISUT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationSystemImpl extends UISUTElementImpl implements ApplicationSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.APPLICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISUT getItsUISUT() {
		return (UISUT)eGet(uisutPackage.Literals.APPLICATION_SYSTEM__ITS_UISUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsUISUT(UISUT newItsUISUT) {
		eSet(uisutPackage.Literals.APPLICATION_SYSTEM__ITS_UISUT, newItsUISUT);
	}

} //ApplicationSystemImpl
