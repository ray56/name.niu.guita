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
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.Vertex#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.Vertex#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends UIElement {
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
	 * @see name.niu.guitar.uisut.UisutPackage#getVertex_ItsInTransition()
	 * @see name.niu.guitar.uisut.UITransition#getItsTarState
	 * @model opposite="itsTarState"
	 * @generated
	 */
	EList<UITransition> getItsInTransition();

	/**
	 * Returns the value of the '<em><b>Its Out Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guitar.uisut.UITransition#getItsSrcState <em>Its Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Out Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Out Transition</em>' reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getVertex_ItsOutTransition()
	 * @see name.niu.guitar.uisut.UITransition#getItsSrcState
	 * @model opposite="itsSrcState"
	 * @generated
	 */
	EList<UITransition> getItsOutTransition();

} // Vertex
