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
 * A representation of the model object '<em><b>UI Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.UITransition#getItsSrcState <em>Its Src State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UITransition#getItsTarState <em>Its Tar State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UITransition#getGuardedSystemVariable <em>Guarded System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UITransition#getScriptStr <em>Script Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getUITransition()
 * @model
 * @generated
 */
public interface UITransition extends UIElement {
	/**
	 * Returns the value of the '<em><b>Its Src State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.AbstractUIState#getItsOutTrantion <em>Its Out Trantion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Src State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Src State</em>' reference.
	 * @see #setItsSrcState(AbstractUIState)
	 * @see name.niu.guitar.uisut.UisutPackage#getUITransition_ItsSrcState()
	 * @see name.niu.guitar.uisut.AbstractUIState#getItsOutTrantion
	 * @model opposite="itsOutTrantion" required="true"
	 * @generated
	 */
	AbstractUIState getItsSrcState();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UITransition#getItsSrcState <em>Its Src State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Src State</em>' reference.
	 * @see #getItsSrcState()
	 * @generated
	 */
	void setItsSrcState(AbstractUIState value);

	/**
	 * Returns the value of the '<em><b>Its Tar State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.AbstractUIState#getItsInTransition <em>Its In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Tar State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Tar State</em>' reference.
	 * @see #setItsTarState(AbstractUIState)
	 * @see name.niu.guitar.uisut.UisutPackage#getUITransition_ItsTarState()
	 * @see name.niu.guitar.uisut.AbstractUIState#getItsInTransition
	 * @model opposite="itsInTransition" required="true"
	 * @generated
	 */
	AbstractUIState getItsTarState();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UITransition#getItsTarState <em>Its Tar State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Tar State</em>' reference.
	 * @see #getItsTarState()
	 * @generated
	 */
	void setItsTarState(AbstractUIState value);

	/**
	 * Returns the value of the '<em><b>Guarded System Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UISystemVariable#getGuardUITransitions <em>Guard UI Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarded System Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarded System Variable</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUITransition_GuardedSystemVariable()
	 * @see name.niu.guitar.uisut.UISystemVariable#getGuardUITransitions
	 * @model opposite="guardUITransitions"
	 * @generated
	 */
	EList<UISystemVariable> getGuardedSystemVariable();

	/**
	 * Returns the value of the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Str</em>' attribute.
	 * @see #setScriptStr(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getUITransition_ScriptStr()
	 * @model
	 * @generated
	 */
	String getScriptStr();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UITransition#getScriptStr <em>Script Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Str</em>' attribute.
	 * @see #getScriptStr()
	 * @generated
	 */
	void setScriptStr(String value);

} // UITransition
