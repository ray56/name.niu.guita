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
 * A representation of the model object '<em><b>Stateshortcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor <em>Its Shortcut For</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.Stateshortcut#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.Stateshortcut#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getStateshortcut()
 * @model
 * @generated
 */
public interface Stateshortcut extends UIElement {
	/**
	 * Returns the value of the '<em><b>Its Shortcut For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.CommonState#getItsShortcut <em>Its Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Shortcut For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Shortcut For</em>' reference.
	 * @see #setItsShortcutFor(CommonState)
	 * @see name.niu.guitar.uisut.UisutPackage#getStateshortcut_ItsShortcutFor()
	 * @see name.niu.guitar.uisut.CommonState#getItsShortcut
	 * @model opposite="itsShortcut"
	 * @generated
	 */
	CommonState getItsShortcutFor();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor <em>Its Shortcut For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Shortcut For</em>' reference.
	 * @see #getItsShortcutFor()
	 * @generated
	 */
	void setItsShortcutFor(CommonState value);

	/**
	 * Returns the value of the '<em><b>Its In Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getItsTarStateShortcut <em>Its Tar State Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its In Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its In Transition</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getStateshortcut_ItsInTransition()
	 * @see name.niu.guitar.uisut.UITransition#getItsTarStateShortcut
	 * @model opposite="itsTarStateShortcut"
	 * @generated
	 */
	EList<UITransition> getItsInTransition();

	/**
	 * Returns the value of the '<em><b>Its Out Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getItsSrcStateShortcut <em>Its Src State Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Out Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Out Transition</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getStateshortcut_ItsOutTransition()
	 * @see name.niu.guitar.uisut.UITransition#getItsSrcStateShortcut
	 * @model opposite="itsSrcStateShortcut"
	 * @generated
	 */
	EList<UITransition> getItsOutTransition();

} // Stateshortcut
