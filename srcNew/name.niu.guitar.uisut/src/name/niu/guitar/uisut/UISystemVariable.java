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
 * A representation of the model object '<em><b>UI System Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.UISystemVariable#getAddUIState <em>Add UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UISystemVariable#getDeleteUIState <em>Delete UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UISystemVariable#getGuardUITransitions <em>Guard UI Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariable()
 * @model
 * @generated
 */
public interface UISystemVariable extends UIElement {
	/**
	 * Returns the value of the '<em><b>Add UI State</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.AbstractUIState}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.AbstractUIState#getAddedSystemVariable <em>Added System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add UI State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add UI State</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariable_AddUIState()
	 * @see name.niu.guitar.uisut.AbstractUIState#getAddedSystemVariable
	 * @model opposite="addedSystemVariable"
	 * @generated
	 */
	EList<AbstractUIState> getAddUIState();

	/**
	 * Returns the value of the '<em><b>Delete UI State</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.AbstractUIState}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.AbstractUIState#getDeletedSystemVariable <em>Deleted System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete UI State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete UI State</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariable_DeleteUIState()
	 * @see name.niu.guitar.uisut.AbstractUIState#getDeletedSystemVariable
	 * @model opposite="deletedSystemVariable"
	 * @generated
	 */
	EList<AbstractUIState> getDeleteUIState();

	/**
	 * Returns the value of the '<em><b>Guard UI Transitions</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getGuardedSystemVariable <em>Guarded System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard UI Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard UI Transitions</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariable_GuardUITransitions()
	 * @see name.niu.guitar.uisut.UITransition#getGuardedSystemVariable
	 * @model opposite="guardedSystemVariable"
	 * @generated
	 */
	EList<UITransition> getGuardUITransitions();

} // UISystemVariable
