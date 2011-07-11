/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI System Variable Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.UISystemVariablePool#getItsUISystemVariable <em>Its UI System Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariablePool()
 * @model
 * @generated
 */
public interface UISystemVariablePool extends UIElement {
	/**
	 * Returns the value of the '<em><b>Its UI System Variable</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uisut.UISystemVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI System Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI System Variable</em>' containment reference list.
	 * @see name.niu.guitar.uisut.UisutPackage#getUISystemVariablePool_ItsUISystemVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<UISystemVariable> getItsUISystemVariable();

} // UISystemVariablePool
