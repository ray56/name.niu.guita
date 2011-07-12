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
 * A representation of the model object '<em><b>Common State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.CommonState#getPicture <em>Picture</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.CommonState#getItsShortcut <em>Its Shortcut</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getCommonState()
 * @model
 * @generated
 */
public interface CommonState extends AbstractUIState {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getCommonState_Picture()
	 * @model
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.CommonState#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

	/**
	 * Returns the value of the '<em><b>Its Shortcut</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.Stateshortcut}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor <em>Its Shortcut For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Shortcut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Shortcut</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getCommonState_ItsShortcut()
	 * @see name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor
	 * @model opposite="itsShortcutFor"
	 * @generated
	 */
	EList<Stateshortcut> getItsShortcut();

} // CommonState
