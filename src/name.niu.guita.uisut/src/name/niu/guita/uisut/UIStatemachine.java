/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.UIStatemachine#getItsState <em>Its State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIStatemachine#getItsTransition <em>Its Transition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIStatemachine#getItsDataVariable <em>Its Data Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getUIStatemachine()
 * @model
 * @generated
 */
public interface UIStatemachine extends UISUTElement {
	/**
	 * Returns the value of the '<em><b>Its State</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its State</em>' containment reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIStatemachine_ItsState()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractState> getItsState();

	/**
	 * Returns the value of the '<em><b>Its Transition</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UITransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Transition</em>' containment reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIStatemachine_ItsTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<UITransition> getItsTransition();

	/**
	 * Returns the value of the '<em><b>Its Data Variable</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UIDataVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Data Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Data Variable</em>' containment reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIStatemachine_ItsDataVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIDataVariable> getItsDataVariable();

} // UIStatemachine
