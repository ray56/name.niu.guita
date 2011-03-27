/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.UISUT;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UISUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UISUTImpl#getItsSTM <em>Its STM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISUTImpl extends UISUTElementImpl implements UISUT {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UISUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStatemachine getItsSTM() {
		return (UIStatemachine)eGet(uisutPackage.Literals.UISUT__ITS_STM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSTM(UIStatemachine newItsSTM) {
		eSet(uisutPackage.Literals.UISUT__ITS_STM, newItsSTM);
	}

} //UISUTImpl
