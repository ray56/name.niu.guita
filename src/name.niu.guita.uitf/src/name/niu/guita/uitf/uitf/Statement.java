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
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.Statement#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.Statement#getDescription <em>Description</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.Statement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
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
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getStatement_ItsVariable()
	 * @model
	 * @generated
	 */
	Variable getItsVariable();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.Statement#getItsVariable <em>Its Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Variable</em>' reference.
	 * @see #getItsVariable()
	 * @generated
	 */
	void setItsVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getStatement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.Statement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link name.niu.guita.uitf.uitf.UserInstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see name.niu.guita.uitf.uitf.UserInstructionEnum
	 * @see #setKind(UserInstructionEnum)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getStatement_Kind()
	 * @model
	 * @generated
	 */
	UserInstructionEnum getKind();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.Statement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see name.niu.guita.uitf.uitf.UserInstructionEnum
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UserInstructionEnum value);

} // Statement
