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
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getStateshortcut()
 * @model
 * @generated
 */
public interface Stateshortcut extends Vertex {
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

} // Stateshortcut
