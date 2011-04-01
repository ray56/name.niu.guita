/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see name.niu.guita.uitf.uitf.UitfFactory
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
	UitfPackage eINSTANCE = name.niu.guita.uitf.uitf.impl.UitfPackageImpl.init();

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.TestCaseImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 0;

	/**
	 * The feature id for the '<em><b>Its UISUT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ITS_UISUT = 0;

	/**
	 * The feature id for the '<em><b>Its Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ITS_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.TestSuiteImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 1;

	/**
	 * The feature id for the '<em><b>Its Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__ITS_TEST_CASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__ID = 1;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.VariableImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.UISUTImpl <em>UISUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.UISUTImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUISUT()
	 * @generated
	 */
	int UISUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Its Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ITS_VARIABLE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its UI Ctrl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ITS_UI_CTRL = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__OBJECT_URI = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UISUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.UIControlVariableImpl <em>UI Control Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.UIControlVariableImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUIControlVariable()
	 * @generated
	 */
	int UI_CONTROL_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The number of structural features of the '<em>UI Control Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.StatementImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Its Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ITS_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__KIND = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.impl.UIControlImpl <em>UI Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.impl.UIControlImpl
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUIControl()
	 * @generated
	 */
	int UI_CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Its Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__ITS_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__ID = 1;

	/**
	 * The number of structural features of the '<em>UI Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link name.niu.guita.uitf.uitf.UserInstructionEnum <em>User Instruction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uitf.uitf.UserInstructionEnum
	 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUserInstructionEnum()
	 * @generated
	 */
	int USER_INSTRUCTION_ENUM = 7;


	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see name.niu.guita.uitf.uitf.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uitf.uitf.TestCase#getItsUISUT <em>Its UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its UISUT</em>'.
	 * @see name.niu.guita.uitf.uitf.TestCase#getItsUISUT()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_ItsUISUT();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uitf.uitf.TestCase#getItsStatement <em>Its Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Statement</em>'.
	 * @see name.niu.guita.uitf.uitf.TestCase#getItsStatement()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_ItsStatement();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.TestCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guita.uitf.uitf.TestCase#getId()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Id();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see name.niu.guita.uitf.uitf.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uitf.uitf.TestSuite#getItsTestCase <em>Its Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Test Case</em>'.
	 * @see name.niu.guita.uitf.uitf.TestSuite#getItsTestCase()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_ItsTestCase();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.TestSuite#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guita.uitf.uitf.TestSuite#getId()
	 * @see #getTestSuite()
	 * @generated
	 */
	EAttribute getTestSuite_Id();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see name.niu.guita.uitf.uitf.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.Variable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guita.uitf.uitf.Variable#getId()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Id();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.UISUT <em>UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UISUT</em>'.
	 * @see name.niu.guita.uitf.uitf.UISUT
	 * @generated
	 */
	EClass getUISUT();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uitf.uitf.UISUT#getItsVariable <em>Its Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Variable</em>'.
	 * @see name.niu.guita.uitf.uitf.UISUT#getItsVariable()
	 * @see #getUISUT()
	 * @generated
	 */
	EReference getUISUT_ItsVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uitf.uitf.UISUT#getItsUICtrl <em>Its UI Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its UI Ctrl</em>'.
	 * @see name.niu.guita.uitf.uitf.UISUT#getItsUICtrl()
	 * @see #getUISUT()
	 * @generated
	 */
	EReference getUISUT_ItsUICtrl();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.UISUT#getObjectURI <em>Object URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object URI</em>'.
	 * @see name.niu.guita.uitf.uitf.UISUT#getObjectURI()
	 * @see #getUISUT()
	 * @generated
	 */
	EAttribute getUISUT_ObjectURI();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.UIControlVariable <em>UI Control Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Control Variable</em>'.
	 * @see name.niu.guita.uitf.uitf.UIControlVariable
	 * @generated
	 */
	EClass getUIControlVariable();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see name.niu.guita.uitf.uitf.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uitf.uitf.Statement#getItsVariable <em>Its Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Variable</em>'.
	 * @see name.niu.guita.uitf.uitf.Statement#getItsVariable()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_ItsVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.Statement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see name.niu.guita.uitf.uitf.Statement#getDescription()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Description();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.Statement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see name.niu.guita.uitf.uitf.Statement#getKind()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Kind();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uitf.uitf.UIControl <em>UI Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Control</em>'.
	 * @see name.niu.guita.uitf.uitf.UIControl
	 * @generated
	 */
	EClass getUIControl();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uitf.uitf.UIControl#getItsVariable <em>Its Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Variable</em>'.
	 * @see name.niu.guita.uitf.uitf.UIControl#getItsVariable()
	 * @see #getUIControl()
	 * @generated
	 */
	EReference getUIControl_ItsVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uitf.uitf.UIControl#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guita.uitf.uitf.UIControl#getId()
	 * @see #getUIControl()
	 * @generated
	 */
	EAttribute getUIControl_Id();

	/**
	 * Returns the meta object for enum '{@link name.niu.guita.uitf.uitf.UserInstructionEnum <em>User Instruction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Instruction Enum</em>'.
	 * @see name.niu.guita.uitf.uitf.UserInstructionEnum
	 * @generated
	 */
	EEnum getUserInstructionEnum();

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
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.TestCaseImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Its UISUT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__ITS_UISUT = eINSTANCE.getTestCase_ItsUISUT();

		/**
		 * The meta object literal for the '<em><b>Its Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__ITS_STATEMENT = eINSTANCE.getTestCase_ItsStatement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ID = eINSTANCE.getTestCase_Id();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.TestSuiteImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getTestSuite()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE__ID = eINSTANCE.getTestSuite_Id();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.VariableImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ID = eINSTANCE.getVariable_Id();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.UISUTImpl <em>UISUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.UISUTImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUISUT()
		 * @generated
		 */
		EClass UISUT = eINSTANCE.getUISUT();

		/**
		 * The meta object literal for the '<em><b>Its Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UISUT__ITS_VARIABLE = eINSTANCE.getUISUT_ItsVariable();

		/**
		 * The meta object literal for the '<em><b>Its UI Ctrl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UISUT__ITS_UI_CTRL = eINSTANCE.getUISUT_ItsUICtrl();

		/**
		 * The meta object literal for the '<em><b>Object URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UISUT__OBJECT_URI = eINSTANCE.getUISUT_ObjectURI();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.UIControlVariableImpl <em>UI Control Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.UIControlVariableImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUIControlVariable()
		 * @generated
		 */
		EClass UI_CONTROL_VARIABLE = eINSTANCE.getUIControlVariable();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.StatementImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Its Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__ITS_VARIABLE = eINSTANCE.getStatement_ItsVariable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__DESCRIPTION = eINSTANCE.getStatement_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__KIND = eINSTANCE.getStatement_Kind();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.impl.UIControlImpl <em>UI Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.impl.UIControlImpl
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUIControl()
		 * @generated
		 */
		EClass UI_CONTROL = eINSTANCE.getUIControl();

		/**
		 * The meta object literal for the '<em><b>Its Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTROL__ITS_VARIABLE = eINSTANCE.getUIControl_ItsVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CONTROL__ID = eINSTANCE.getUIControl_Id();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uitf.uitf.UserInstructionEnum <em>User Instruction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uitf.uitf.UserInstructionEnum
		 * @see name.niu.guita.uitf.uitf.impl.UitfPackageImpl#getUserInstructionEnum()
		 * @generated
		 */
		EEnum USER_INSTRUCTION_ENUM = eINSTANCE.getUserInstructionEnum();

	}

} //UitfPackage
