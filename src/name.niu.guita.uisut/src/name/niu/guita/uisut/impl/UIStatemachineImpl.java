/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UIStatemachineImpl#getItsState <em>Its State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIStatemachineImpl#getItsTransition <em>Its Transition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIStatemachineImpl#getItsDataVariable <em>Its Data Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIStatemachineImpl extends UISUTElementImpl implements UIStatemachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIStatemachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UI_STATEMACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractState> getItsState() {
		return (EList<AbstractState>)eGet(uisutPackage.Literals.UI_STATEMACHINE__ITS_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UITransition> getItsTransition() {
		return (EList<UITransition>)eGet(uisutPackage.Literals.UI_STATEMACHINE__ITS_TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIDataVariable> getItsDataVariable() {
		return (EList<UIDataVariable>)eGet(uisutPackage.Literals.UI_STATEMACHINE__ITS_DATA_VARIABLE, true);
	}

} //UIStatemachineImpl
