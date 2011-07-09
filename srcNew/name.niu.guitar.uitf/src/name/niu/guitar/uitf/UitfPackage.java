/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uitf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see name.niu.guitar.uitf.UitfFactory
 * @model kind="package"
 * @generated
 */
public interface UitfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uitf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.niu.name/guita/uitf/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UITF_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UitfPackage eINSTANCE = name.niu.guitar.uitf.impl.UitfPackageImpl.init();

	/**
	 * The meta object id for the '{@link name.niu.guitar.uitf.impl.TestElementImpl <em>Test Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uitf.impl.TestElementImpl
	 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestElement()
	 * @generated
	 */
	int TEST_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Test Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uitf.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uitf.impl.TestSuiteImpl
	 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__ID = TEST_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Its Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__ITS_TEST_CASE = TEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = TEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uitf.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uitf.impl.TestCaseImpl
	 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = TEST_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Its Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ITS_STATEMENT = TEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = TEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uitf.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uitf.impl.StatementImpl
	 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ID = TEST_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__DESCRIPTION = TEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SCRIPT_STR = TEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = TEST_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uitf.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see name.niu.guitar.uitf.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uitf.TestSuite#getItsTestCase <em>Its Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Test Case</em>'.
	 * @see name.niu.guitar.uitf.TestSuite#getItsTestCase()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_ItsTestCase();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uitf.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see name.niu.guitar.uitf.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uitf.TestCase#getItsStatement <em>Its Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Statement</em>'.
	 * @see name.niu.guitar.uitf.TestCase#getItsStatement()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_ItsStatement();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uitf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see name.niu.guitar.uitf.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uitf.Statement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see name.niu.guitar.uitf.Statement#getDescription()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Description();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uitf.Statement#getScriptStr <em>Script Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Str</em>'.
	 * @see name.niu.guitar.uitf.Statement#getScriptStr()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_ScriptStr();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uitf.TestElement <em>Test Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Element</em>'.
	 * @see name.niu.guitar.uitf.TestElement
	 * @generated
	 */
	EClass getTestElement();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uitf.TestElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guitar.uitf.TestElement#getId()
	 * @see #getTestElement()
	 * @generated
	 */
	EAttribute getTestElement_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UitfFactory getUitfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link name.niu.guitar.uitf.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uitf.impl.TestSuiteImpl
		 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Its Test Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__ITS_TEST_CASE = eINSTANCE.getTestSuite_ItsTestCase();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uitf.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uitf.impl.TestCaseImpl
		 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Its Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__ITS_STATEMENT = eINSTANCE.getTestCase_ItsStatement();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uitf.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uitf.impl.StatementImpl
		 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__DESCRIPTION = eINSTANCE.getStatement_Description();

		/**
		 * The meta object literal for the '<em><b>Script Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__SCRIPT_STR = eINSTANCE.getStatement_ScriptStr();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uitf.impl.TestElementImpl <em>Test Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uitf.impl.TestElementImpl
		 * @see name.niu.guitar.uitf.impl.UitfPackageImpl#getTestElement()
		 * @generated
		 */
		EClass TEST_ELEMENT = eINSTANCE.getTestElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ELEMENT__ID = eINSTANCE.getTestElement_Id();

	}

} //UitfPackage
