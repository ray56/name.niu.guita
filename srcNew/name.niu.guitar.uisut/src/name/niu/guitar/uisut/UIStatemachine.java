/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsUIState <em>Its UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsUITransition <em>Its UI Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariable <em>Its UI System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsSubSTM <em>Its Sub STM</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine()
 * @model
 * @generated
 */
public interface UIStatemachine extends UIElement {
	/**
	 * Returns the value of the '<em><b>Its UI State</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.AbstractUIState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI State</em>' containment reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsUIState()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractUIState> getItsUIState();

	/**
	 * Returns the value of the '<em><b>Its UI Transition</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI Transition</em>' containment reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsUITransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<UITransition> getItsUITransition();

	/**
	 * Returns the value of the '<em><b>Its UI System Variable</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI System Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI System Variable</em>' containment reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsUISystemVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<UISystemVariable> getItsUISystemVariable();

	/**
	 * Returns the value of the '<em><b>Its Sub STM</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UIStatemachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Sub STM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Sub STM</em>' containment reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsSubSTM()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIStatemachine> getItsSubSTM();

} // UIStatemachine
