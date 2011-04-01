/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.UIControl#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.UIControl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getUIControl()
 * @model
 * @generated
 */
public interface UIControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Variable</em>' reference.
	 * @see #setItsVariable(Variable)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getUIControl_ItsVariable()
	 * @model
	 * @generated
	 */
	Variable getItsVariable();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.UIControl#getItsVariable <em>Its Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Variable</em>' reference.
	 * @see #getItsVariable()
	 * @generated
	 */
	void setItsVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getUIControl_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.UIControl#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // UIControl
