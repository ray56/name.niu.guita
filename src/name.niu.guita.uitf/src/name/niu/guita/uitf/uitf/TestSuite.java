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
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.TestSuite#getItsTestCase <em>Its Test Case</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.TestSuite#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uitf.uitf.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Test Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Test Case</em>' containment reference list.
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestSuite_ItsTestCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getItsTestCase();

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
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTestSuite_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.TestSuite#getId <em>Id</em>}' attribute.
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

} // TestSuite
