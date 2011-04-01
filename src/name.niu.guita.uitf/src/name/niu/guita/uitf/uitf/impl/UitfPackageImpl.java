/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.TestCase;
import name.niu.guita.uitf.uitf.TestSuite;
import name.niu.guita.uitf.uitf.UIControl;
import name.niu.guita.uitf.uitf.UIControlVariable;
import name.niu.guita.uitf.uitf.UitfFactory;
import name.niu.guita.uitf.uitf.UitfPackage;
import name.niu.guita.uitf.uitf.UserInstructionEnum;
import name.niu.guita.uitf.uitf.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UitfPackageImpl extends EPackageImpl implements UitfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uisutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiControlVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userInstructionEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see name.niu.guita.uitf.uitf.UitfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UitfPackageImpl() {
		super(eNS_URI, UitfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UitfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UitfPackage init() {
		if (isInited) return (UitfPackage)EPackage.Registry.INSTANCE.getEPackage(UitfPackage.eNS_URI);

		// Obtain or create and register package
		UitfPackageImpl theUitfPackage = (UitfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UitfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UitfPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUitfPackage.createPackageContents();

		// Initialize created meta-data
		theUitfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUitfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UitfPackage.eNS_URI, theUitfPackage);
		return theUitfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_ItsUISUT() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_ItsStatement() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Id() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_ItsTestCase() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuite_Id() {
		return (EAttribute)testSuiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Id() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISUT() {
		return uisutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISUT_ItsVariable() {
		return (EReference)uisutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISUT_ItsUICtrl() {
		return (EReference)uisutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISUT_ObjectURI() {
		return (EAttribute)uisutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIControlVariable() {
		return uiControlVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_ItsVariable() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Description() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Kind() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIControl() {
		return uiControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIControl_ItsVariable() {
		return (EReference)uiControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIControl_Id() {
		return (EAttribute)uiControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserInstructionEnum() {
		return userInstructionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UitfFactory getUitfFactory() {
		return (UitfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__ITS_UISUT);
		createEReference(testCaseEClass, TEST_CASE__ITS_STATEMENT);
		createEAttribute(testCaseEClass, TEST_CASE__ID);

		testSuiteEClass = createEClass(TEST_SUITE);
		createEReference(testSuiteEClass, TEST_SUITE__ITS_TEST_CASE);
		createEAttribute(testSuiteEClass, TEST_SUITE__ID);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__ID);

		uisutEClass = createEClass(UISUT);
		createEReference(uisutEClass, UISUT__ITS_VARIABLE);
		createEReference(uisutEClass, UISUT__ITS_UI_CTRL);
		createEAttribute(uisutEClass, UISUT__OBJECT_URI);

		uiControlVariableEClass = createEClass(UI_CONTROL_VARIABLE);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__ITS_VARIABLE);
		createEAttribute(statementEClass, STATEMENT__DESCRIPTION);
		createEAttribute(statementEClass, STATEMENT__KIND);

		uiControlEClass = createEClass(UI_CONTROL);
		createEReference(uiControlEClass, UI_CONTROL__ITS_VARIABLE);
		createEAttribute(uiControlEClass, UI_CONTROL__ID);

		// Create enums
		userInstructionEnumEEnum = createEEnum(USER_INSTRUCTION_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uisutEClass.getESuperTypes().add(this.getVariable());
		uiControlVariableEClass.getESuperTypes().add(this.getVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCase_ItsUISUT(), this.getUISUT(), null, "itsUISUT", null, 1, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_ItsStatement(), this.getStatement(), null, "itsStatement", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCase_Id(), ecorePackage.getEString(), "id", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testCaseEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testCaseEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuite_ItsTestCase(), this.getTestCase(), null, "itsTestCase", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSuite_Id(), ecorePackage.getEString(), "id", null, 0, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testSuiteEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testSuiteEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(variableEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, ecorePackage.getEString(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uisutEClass, name.niu.guita.uitf.uitf.UISUT.class, "UISUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISUT_ItsVariable(), this.getVariable(), null, "itsVariable", null, 0, -1, name.niu.guita.uitf.uitf.UISUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUISUT_ItsUICtrl(), this.getUIControl(), null, "itsUICtrl", null, 0, -1, name.niu.guita.uitf.uitf.UISUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISUT_ObjectURI(), ecorePackage.getEString(), "objectURI", null, 0, 1, name.niu.guita.uitf.uitf.UISUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(uisutEClass, null, "onUITrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "trigger", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uisutEClass, null, "onManipulateUIControl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "controlPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "manipulationKind", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uisutEClass, null, "onManipulateUIControlData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "controlPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "controlPropertyKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "controlPropertyVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uiControlVariableEClass, UIControlVariable.class, "UIControlVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_ItsVariable(), this.getVariable(), null, "itsVariable", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_Kind(), this.getUserInstructionEnum(), "kind", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiControlEClass, UIControl.class, "UIControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIControl_ItsVariable(), this.getVariable(), null, "itsVariable", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIControl_Id(), ecorePackage.getEString(), "id", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(userInstructionEnumEEnum, UserInstructionEnum.class, "UserInstructionEnum");
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.SET_UI_VALUE);
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.SEND_UI_TRIGGER);
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.MANIPULATE_UI_CONTROL);
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.ASSERT_UI_VALUE);
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.ASSERT_UI_STATE);
		addEEnumLiteral(userInstructionEnumEEnum, UserInstructionEnum.INSTANTIATE_UISUT);

		// Create resource
		createResource(eNS_URI);
	}

} //UitfPackageImpl
