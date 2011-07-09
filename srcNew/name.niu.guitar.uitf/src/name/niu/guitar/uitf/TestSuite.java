/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uitf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uitf.TestSuite#getItsTestCase <em>Its Test Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uitf.UitfPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends TestElement {
	/**
	 * Returns the value of the '<em><b>Its Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uitf.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Test Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Test Case</em>' containment reference list.
	 * @see name.niu.guitar.uitf.UitfPackage#getTestSuite_ItsTestCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getItsTestCase();

} // TestSuite
