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
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.AbstractState#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.AbstractState#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends UISUTElement {
	/**
	 * Returns the value of the '<em><b>Its In Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guita.uisut.UITransition#getItsTrgtState <em>Its Trgt State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its In Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its In Transition</em>' reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getAbstractState_ItsInTransition()
	 * @see name.niu.guita.uisut.UITransition#getItsTrgtState
	 * @model opposite="itsTrgtState"
	 * @generated
	 */
	EList<UITransition> getItsInTransition();

	/**
	 * Returns the value of the '<em><b>Its Out Transition</b></em>' reference list.
	 * The list contents are of type {@link name.niu.guita.uisut.UITransition}.
	 * It is bidirectional and its opposite is '{@link name.niu.guita.uisut.UITransition#getItsSrcState <em>Its Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Out Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Out Transition</em>' reference list.
	 * @see name.niu.guita.uisut.uisutPackage#getAbstractState_ItsOutTransition()
	 * @see name.niu.guita.uisut.UITransition#getItsSrcState
	 * @model opposite="itsSrcState"
	 * @generated
	 */
	EList<UITransition> getItsOutTransition();

} // AbstractState
