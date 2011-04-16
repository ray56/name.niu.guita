/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.Action;
import name.niu.guita.uisut.ApplicationSystem;
import name.niu.guita.uisut.ComponentTrigger;
import name.niu.guita.uisut.FinalState;
import name.niu.guita.uisut.InitialState;
import name.niu.guita.uisut.UICondition;
import name.niu.guita.uisut.UIControl;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UISUTElement;
import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.UITrigger;
import name.niu.guita.uisut.UserTrigger;
import name.niu.guita.uisut.uisutFactory;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class uisutPackageImpl extends EPackageImpl implements uisutPackage {
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
	private EClass applicationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiStatemachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

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
	private EClass uiDataVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uisutElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

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
	 * @see name.niu.guita.uisut.uisutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private uisutPackageImpl() {
		super(eNS_URI, uisutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link uisutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static uisutPackage init() {
		if (isInited) return (uisutPackage)EPackage.Registry.INSTANCE.getEPackage(uisutPackage.eNS_URI);

		// Obtain or create and register package
		uisutPackageImpl theuisutPackage = (uisutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof uisutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new uisutPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theuisutPackage.createPackageContents();

		// Initialize created meta-data
		theuisutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theuisutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(uisutPackage.eNS_URI, theuisutPackage);
		return theuisutPackage;
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
	public EReference getUISUT_ItsSTM() {
		return (EReference)uisutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSystem() {
		return applicationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationSystem_ItsUISUT() {
		return (EReference)applicationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIStatemachine() {
		return uiStatemachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsState() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsTransition() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsDataVariable() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIState() {
		return uiStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIState_ItsUIControl() {
		return (EReference)uiStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIState_IsInitial() {
		return (EAttribute)uiStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIState_AddedDataVariable() {
		return (EReference)uiStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIState_DeletedDataVariable() {
		return (EReference)uiStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUITransition() {
		return uiTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsTrgtState() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsSrcState() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsTrigger() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsCondition() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsAction() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUITransition_TriggerStr() {
		return (EAttribute)uiTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUITransition_GuardStr() {
		return (EAttribute)uiTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUITransition_ActionStr() {
		return (EAttribute)uiTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_GuardedDataVariable() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUITransition_ScriptStr() {
		return (EAttribute)uiTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUITrigger() {
		return uiTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTrigger() {
		return userTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentTrigger() {
		return componentTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUICondition() {
		return uiConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
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
	public EReference getUIControl_ItsInputDaa() {
		return (EReference)uiControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIControl_ItsOutputData() {
		return (EReference)uiControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIControl_VariableName() {
		return (EAttribute)uiControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIControl_ValueExpression() {
		return (EAttribute)uiControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIDataVariable() {
		return uiDataVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIDataVariable_ConstraintRE() {
		return (EAttribute)uiDataVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISUTElement() {
		return uisutElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISUTElement_Name() {
		return (EAttribute)uisutElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISUTElement_Description() {
		return (EAttribute)uisutElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISUTElement_Id() {
		return (EAttribute)uisutElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_ItsInTransition() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_ItsOutTransition() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uisutFactory getuisutFactory() {
		return (uisutFactory)getEFactoryInstance();
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
		uisutEClass = createEClass(UISUT);
		createEReference(uisutEClass, UISUT__ITS_STM);

		applicationSystemEClass = createEClass(APPLICATION_SYSTEM);
		createEReference(applicationSystemEClass, APPLICATION_SYSTEM__ITS_UISUT);

		uiStatemachineEClass = createEClass(UI_STATEMACHINE);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_STATE);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_TRANSITION);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_DATA_VARIABLE);

		uiStateEClass = createEClass(UI_STATE);
		createEReference(uiStateEClass, UI_STATE__ITS_UI_CONTROL);
		createEAttribute(uiStateEClass, UI_STATE__IS_INITIAL);
		createEReference(uiStateEClass, UI_STATE__ADDED_DATA_VARIABLE);
		createEReference(uiStateEClass, UI_STATE__DELETED_DATA_VARIABLE);

		uiTransitionEClass = createEClass(UI_TRANSITION);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_TRGT_STATE);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_SRC_STATE);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_TRIGGER);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_CONDITION);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_ACTION);
		createEAttribute(uiTransitionEClass, UI_TRANSITION__TRIGGER_STR);
		createEAttribute(uiTransitionEClass, UI_TRANSITION__GUARD_STR);
		createEAttribute(uiTransitionEClass, UI_TRANSITION__ACTION_STR);
		createEReference(uiTransitionEClass, UI_TRANSITION__GUARDED_DATA_VARIABLE);
		createEAttribute(uiTransitionEClass, UI_TRANSITION__SCRIPT_STR);

		uiTriggerEClass = createEClass(UI_TRIGGER);

		userTriggerEClass = createEClass(USER_TRIGGER);

		componentTriggerEClass = createEClass(COMPONENT_TRIGGER);

		uiConditionEClass = createEClass(UI_CONDITION);

		actionEClass = createEClass(ACTION);

		uiControlEClass = createEClass(UI_CONTROL);
		createEReference(uiControlEClass, UI_CONTROL__ITS_INPUT_DAA);
		createEReference(uiControlEClass, UI_CONTROL__ITS_OUTPUT_DATA);
		createEAttribute(uiControlEClass, UI_CONTROL__VARIABLE_NAME);
		createEAttribute(uiControlEClass, UI_CONTROL__VALUE_EXPRESSION);

		uiDataVariableEClass = createEClass(UI_DATA_VARIABLE);
		createEAttribute(uiDataVariableEClass, UI_DATA_VARIABLE__CONSTRAINT_RE);

		uisutElementEClass = createEClass(UISUT_ELEMENT);
		createEAttribute(uisutElementEClass, UISUT_ELEMENT__NAME);
		createEAttribute(uisutElementEClass, UISUT_ELEMENT__DESCRIPTION);
		createEAttribute(uisutElementEClass, UISUT_ELEMENT__ID);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__ITS_IN_TRANSITION);
		createEReference(abstractStateEClass, ABSTRACT_STATE__ITS_OUT_TRANSITION);
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
		uisutEClass.getESuperTypes().add(this.getUISUTElement());
		applicationSystemEClass.getESuperTypes().add(this.getUISUTElement());
		uiStatemachineEClass.getESuperTypes().add(this.getUISUTElement());
		uiStateEClass.getESuperTypes().add(this.getAbstractState());
		uiTransitionEClass.getESuperTypes().add(this.getUISUTElement());
		uiTriggerEClass.getESuperTypes().add(this.getUISUTElement());
		userTriggerEClass.getESuperTypes().add(this.getUITrigger());
		componentTriggerEClass.getESuperTypes().add(this.getUITrigger());
		uiConditionEClass.getESuperTypes().add(this.getUISUTElement());
		actionEClass.getESuperTypes().add(this.getUISUTElement());
		uiControlEClass.getESuperTypes().add(this.getUISUTElement());
		uiDataVariableEClass.getESuperTypes().add(this.getUISUTElement());
		initialStateEClass.getESuperTypes().add(this.getAbstractState());
		finalStateEClass.getESuperTypes().add(this.getAbstractState());
		abstractStateEClass.getESuperTypes().add(this.getUISUTElement());

		// Initialize classes and features; add operations and parameters
		initEClass(uisutEClass, name.niu.guita.uisut.UISUT.class, "UISUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISUT_ItsSTM(), this.getUIStatemachine(), null, "itsSTM", null, 0, 1, name.niu.guita.uisut.UISUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationSystemEClass, ApplicationSystem.class, "ApplicationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationSystem_ItsUISUT(), this.getUISUT(), null, "itsUISUT", null, 0, 1, ApplicationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiStatemachineEClass, UIStatemachine.class, "UIStatemachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIStatemachine_ItsState(), this.getAbstractState(), null, "itsState", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsTransition(), this.getUITransition(), null, "itsTransition", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsDataVariable(), this.getUIDataVariable(), null, "itsDataVariable", null, 0, 1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiStateEClass, UIState.class, "UIState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIState_ItsUIControl(), this.getUIControl(), null, "itsUIControl", null, 0, -1, UIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, UIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIState_AddedDataVariable(), this.getUIDataVariable(), null, "addedDataVariable", null, 0, -1, UIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIState_DeletedDataVariable(), this.getUIDataVariable(), null, "deletedDataVariable", null, 0, -1, UIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTransitionEClass, UITransition.class, "UITransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUITransition_ItsTrgtState(), this.getAbstractState(), this.getAbstractState_ItsInTransition(), "itsTrgtState", null, 1, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_ItsSrcState(), this.getAbstractState(), this.getAbstractState_ItsOutTransition(), "itsSrcState", null, 1, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_ItsTrigger(), this.getUITrigger(), null, "itsTrigger", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_ItsCondition(), this.getUICondition(), null, "itsCondition", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_ItsAction(), this.getAction(), null, "itsAction", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUITransition_TriggerStr(), ecorePackage.getEString(), "triggerStr", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUITransition_GuardStr(), ecorePackage.getEString(), "guardStr", "", 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUITransition_ActionStr(), ecorePackage.getEString(), "actionStr", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_GuardedDataVariable(), this.getUIDataVariable(), null, "guardedDataVariable", null, 0, -1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUITransition_ScriptStr(), ecorePackage.getEString(), "scriptStr", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTriggerEClass, UITrigger.class, "UITrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTriggerEClass, UserTrigger.class, "UserTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentTriggerEClass, ComponentTrigger.class, "ComponentTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiConditionEClass, UICondition.class, "UICondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiControlEClass, UIControl.class, "UIControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIControl_ItsInputDaa(), this.getUIDataVariable(), null, "itsInputDaa", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIControl_ItsOutputData(), this.getUIDataVariable(), null, "itsOutputData", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIControl_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIControl_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, UIControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDataVariableEClass, UIDataVariable.class, "UIDataVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIDataVariable_ConstraintRE(), ecorePackage.getEString(), "constraintRE", null, 0, 1, UIDataVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uisutElementEClass, UISUTElement.class, "UISUTElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUISUTElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UISUTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISUTElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, UISUTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISUTElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UISUTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_ItsInTransition(), this.getUITransition(), this.getUITransition_ItsTrgtState(), "itsInTransition", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_ItsOutTransition(), this.getUITransition(), this.getUITransition_ItsSrcState(), "itsOutTransition", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //uisutPackageImpl
