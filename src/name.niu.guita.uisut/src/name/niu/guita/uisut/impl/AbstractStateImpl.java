/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.AbstractStateImpl#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.AbstractStateImpl#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends UISUTElementImpl implements AbstractState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UITransition> getItsInTransition() {
		return (EList<UITransition>)eGet(uisutPackage.Literals.ABSTRACT_STATE__ITS_IN_TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UITransition> getItsOutTransition() {
		return (EList<UITransition>)eGet(uisutPackage.Literals.ABSTRACT_STATE__ITS_OUT_TRANSITION, true);
	}

} //AbstractStateImpl
