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
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsSubSTM <em>Its Sub STM</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariablePool <em>Its UI System Variable Pool</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariable <em>Its UI System Variable</em>}</li>
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
	 * Returns the value of the '<em><b>Its UI System Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI System Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI System Variable</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsUISystemVariable()
	 * @model derived="true"
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

	/**
	 * Returns the value of the '<em><b>Its UI System Variable Pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI System Variable Pool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI System Variable Pool</em>' containment reference.
	 * @see #setItsUISystemVariablePool(UISystemVariablePool)
	 * @see name.niu.guitar.uisut.UisutPackage#getUIStatemachine_ItsUISystemVariablePool()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UISystemVariablePool getItsUISystemVariablePool();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariablePool <em>Its UI System Variable Pool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its UI System Variable Pool</em>' containment reference.
	 * @see #getItsUISystemVariablePool()
	 * @generated
	 */
	void setItsUISystemVariablePool(UISystemVariablePool value);

} // UIStatemachine
