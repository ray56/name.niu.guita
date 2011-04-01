/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.TestCase#getItsUISUT <em>Its UISUT</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.TestCase#getItsStatement <em>Its Statement</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.TestCase#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Its UISUT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UISUT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UISUT</em>' containment reference.
	 * @see #setItsUISUT(UISUT)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestCase_ItsUISUT()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UISUT getItsUISUT();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.TestCase#getItsUISUT <em>Its UISUT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its UISUT</em>' containment reference.
	 * @see #getItsUISUT()
	 * @generated
	 */
	void setItsUISUT(UISUT value);

	/**
	 * Returns the value of the '<em><b>Its Statement</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uitf.uitf.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Statement</em>' containment reference list.
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestCase_ItsStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getItsStatement();

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
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestCase_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.TestCase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // TestCase
