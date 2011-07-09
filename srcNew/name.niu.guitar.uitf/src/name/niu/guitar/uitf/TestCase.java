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
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uitf.TestCase#getItsStatement <em>Its Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uitf.UitfPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends TestElement {
	/**
	 * Returns the value of the '<em><b>Its Statement</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guitar.uitf.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Statement</em>' containment reference list.
	 * @see name.niu.guitar.uitf.UitfPackage#getTestCase_ItsStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getItsStatement();

} // TestCase
