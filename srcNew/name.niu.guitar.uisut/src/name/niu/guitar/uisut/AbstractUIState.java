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
 * A representation of the model object '<em><b>Abstract UI State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.AbstractUIState#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.AbstractUIState#getItsOutTrantion <em>Its Out Trantion</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.AbstractUIState#getAddedSystemVariable <em>Added System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.AbstractUIState#getDeletedSystemVariable <em>Deleted System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.AbstractUIState#getScriptStr <em>Script Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState()
 * @model
 * @generated
 */
public interface AbstractUIState extends UIElement {
	/**
	 * Returns the value of the '<em><b>Its In Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getItsTarState <em>Its Tar State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its In Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its In Transition</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState_ItsInTransition()
	 * @see name.niu.guitar.uisut.UITransition#getItsTarState
	 * @model opposite="itsTarState"
	 * @generated
	 */
	EList<UITransition> getItsInTransition();

	/**
	 * Returns the value of the '<em><b>Its Out Trantion</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getItsSrcState <em>Its Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Out Trantion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Out Trantion</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState_ItsOutTrantion()
	 * @see name.niu.guitar.uisut.UITransition#getItsSrcState
	 * @model opposite="itsSrcState"
	 * @generated
	 */
	EList<UITransition> getItsOutTrantion();

	/**
	 * Returns the value of the '<em><b>Added System Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UISystemVariable#getAddUIState <em>Add UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added System Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added System Variable</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState_AddedSystemVariable()
	 * @see name.niu.guitar.uisut.UISystemVariable#getAddUIState
	 * @model opposite="addUIState"
	 * @generated
	 */
	EList<UISystemVariable> getAddedSystemVariable();

	/**
	 * Returns the value of the '<em><b>Deleted System Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UISystemVariable#getDeleteUIState <em>Delete UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted System Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted System Variable</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState_DeletedSystemVariable()
	 * @see name.niu.guitar.uisut.UISystemVariable#getDeleteUIState
	 * @model opposite="deleteUIState"
	 * @generated
	 */
	EList<UISystemVariable> getDeletedSystemVariable();

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
	 * @see name.niu.guitar.uisut.UisutPackage#getAbstractUIState_ScriptStr()
	 * @model
	 * @generated
	 */
	String getScriptStr();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.AbstractUIState#getScriptStr <em>Script Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Str</em>' attribute.
	 * @see #getScriptStr()
	 * @generated
	 */
	void setScriptStr(String value);

} // AbstractUIState