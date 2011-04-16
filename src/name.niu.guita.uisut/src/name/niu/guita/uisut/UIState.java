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
 * A representation of the model object '<em><b>UI State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.UIState#getItsUIControl <em>Its UI Control</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIState#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIState#getAddedDataVariable <em>Added Data Variable</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIState#getDeletedDataVariable <em>Deleted Data Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getUIState()
 * @model
 * @generated
 */
public interface UIState extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Its UI Control</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UIControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI Control</em>' containment reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIState_ItsUIControl()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIControl> getItsUIControl();

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see name.niu.guita.uisut.uisutPackage#getUIState_IsInitial()
	 * @model
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UIState#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Added Data Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UIDataVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Data Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Data Variable</em>' reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIState_AddedDataVariable()
	 * @model
	 * @generated
	 */
	EList<UIDataVariable> getAddedDataVariable();

	/**
	 * Returns the value of the '<em><b>Deleted Data Variable</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UIDataVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Data Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Data Variable</em>' reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getUIState_DeletedDataVariable()
	 * @model
	 * @generated
	 */
	EList<UIDataVariable> getDeletedDataVariable();

} // UIState
