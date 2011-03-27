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

} // UIState
