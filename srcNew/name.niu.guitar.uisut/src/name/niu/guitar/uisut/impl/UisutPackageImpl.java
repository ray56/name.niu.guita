/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.FinalState;
import name.niu.guitar.uisut.InitialState;
import name.niu.guitar.uisut.UIElement;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UISystemVariablePool;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutFactory;
import name.niu.guitar.uisut.UisutPackage;

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
public class UisutPackageImpl extends EPackageImpl implements UisutPackage {
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
	private EClass abstractUIStateEClass = null;

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
	private EClass uiSystemVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonStateEClass = null;

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
	private EClass uisutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSystemVariablePoolEClass = null;

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
	 * @see name.niu.guitar.uisut.UisutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UisutPackageImpl() {
		super(eNS_URI, UisutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UisutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UisutPackage init() {
		if (isInited) return (UisutPackage)EPackage.Registry.INSTANCE.getEPackage(UisutPackage.eNS_URI);

		// Obtain or create and register package
		UisutPackageImpl theUisutPackage = (UisutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UisutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UisutPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUisutPackage.createPackageContents();

		// Initialize created meta-data
		theUisutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUisutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UisutPackage.eNS_URI, theUisutPackage);
		return theUisutPackage;
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
	public EReference getUIStatemachine_ItsUIState() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsUITransition() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsUISystemVariable() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsSubSTM() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStatemachine_ItsUISystemVariablePool() {
		return (EReference)uiStatemachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractUIState() {
		return abstractUIStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractUIState_ItsInTransition() {
		return (EReference)abstractUIStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractUIState_ItsOutTrantion() {
		return (EReference)abstractUIStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractUIState_AddedSystemVariable() {
		return (EReference)abstractUIStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractUIState_DeletedSystemVariable() {
		return (EReference)abstractUIStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractUIState_ScriptStr() {
		return (EAttribute)abstractUIStateEClass.getEStructuralFeatures().get(4);
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
	public EReference getUITransition_ItsSrcState() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_ItsTarState() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUITransition_GuardedSystemVariable() {
		return (EReference)uiTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUITransition_ScriptStr() {
		return (EAttribute)uiTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISystemVariable() {
		return uiSystemVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystemVariable_AddUIState() {
		return (EReference)uiSystemVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystemVariable_DeleteUIState() {
		return (EReference)uiSystemVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystemVariable_GuardUITransitions() {
		return (EReference)uiSystemVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIElement() {
		return uiElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElement_Name() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElement_Description() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElement_Id() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonState() {
		return commonStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonState_Picture() {
		return (EAttribute)commonStateEClass.getEStructuralFeatures().get(0);
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
	public EClass getUISystemVariablePool() {
		return uiSystemVariablePoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystemVariablePool_ItsUISystemVariable() {
		return (EReference)uiSystemVariablePoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UisutFactory getUisutFactory() {
		return (UisutFactory)getEFactoryInstance();
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
		uiStatemachineEClass = createEClass(UI_STATEMACHINE);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_UI_STATE);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_UI_TRANSITION);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_SUB_STM);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL);
		createEReference(uiStatemachineEClass, UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE);

		abstractUIStateEClass = createEClass(ABSTRACT_UI_STATE);
		createEReference(abstractUIStateEClass, ABSTRACT_UI_STATE__ITS_IN_TRANSITION);
		createEReference(abstractUIStateEClass, ABSTRACT_UI_STATE__ITS_OUT_TRANTION);
		createEReference(abstractUIStateEClass, ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE);
		createEReference(abstractUIStateEClass, ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE);
		createEAttribute(abstractUIStateEClass, ABSTRACT_UI_STATE__SCRIPT_STR);

		uiTransitionEClass = createEClass(UI_TRANSITION);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_SRC_STATE);
		createEReference(uiTransitionEClass, UI_TRANSITION__ITS_TAR_STATE);
		createEReference(uiTransitionEClass, UI_TRANSITION__GUARDED_SYSTEM_VARIABLE);
		createEAttribute(uiTransitionEClass, UI_TRANSITION__SCRIPT_STR);

		uiSystemVariableEClass = createEClass(UI_SYSTEM_VARIABLE);
		createEReference(uiSystemVariableEClass, UI_SYSTEM_VARIABLE__ADD_UI_STATE);
		createEReference(uiSystemVariableEClass, UI_SYSTEM_VARIABLE__DELETE_UI_STATE);
		createEReference(uiSystemVariableEClass, UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS);

		uiElementEClass = createEClass(UI_ELEMENT);
		createEAttribute(uiElementEClass, UI_ELEMENT__NAME);
		createEAttribute(uiElementEClass, UI_ELEMENT__DESCRIPTION);
		createEAttribute(uiElementEClass, UI_ELEMENT__ID);

		commonStateEClass = createEClass(COMMON_STATE);
		createEAttribute(commonStateEClass, COMMON_STATE__PICTURE);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		uisutEClass = createEClass(UISUT);
		createEReference(uisutEClass, UISUT__ITS_STM);

		uiSystemVariablePoolEClass = createEClass(UI_SYSTEM_VARIABLE_POOL);
		createEReference(uiSystemVariablePoolEClass, UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE);
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
		uiStatemachineEClass.getESuperTypes().add(this.getUIElement());
		abstractUIStateEClass.getESuperTypes().add(this.getUIElement());
		uiTransitionEClass.getESuperTypes().add(this.getUIElement());
		uiSystemVariableEClass.getESuperTypes().add(this.getUIElement());
		commonStateEClass.getESuperTypes().add(this.getAbstractUIState());
		initialStateEClass.getESuperTypes().add(this.getAbstractUIState());
		finalStateEClass.getESuperTypes().add(this.getAbstractUIState());
		uisutEClass.getESuperTypes().add(this.getUIElement());
		uiSystemVariablePoolEClass.getESuperTypes().add(this.getUIElement());

		// Initialize classes and features; add operations and parameters
		initEClass(uiStatemachineEClass, UIStatemachine.class, "UIStatemachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIStatemachine_ItsUIState(), this.getAbstractUIState(), null, "itsUIState", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsUITransition(), this.getUITransition(), null, "itsUITransition", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsSubSTM(), this.getUIStatemachine(), null, "itsSubSTM", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsUISystemVariablePool(), this.getUISystemVariablePool(), null, "itsUISystemVariablePool", null, 1, 1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIStatemachine_ItsUISystemVariable(), this.getUISystemVariable(), null, "itsUISystemVariable", null, 0, -1, UIStatemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractUIStateEClass, AbstractUIState.class, "AbstractUIState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractUIState_ItsInTransition(), this.getUITransition(), this.getUITransition_ItsTarState(), "itsInTransition", null, 0, -1, AbstractUIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractUIState_ItsOutTrantion(), this.getUITransition(), this.getUITransition_ItsSrcState(), "itsOutTrantion", null, 0, -1, AbstractUIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractUIState_AddedSystemVariable(), this.getUISystemVariable(), this.getUISystemVariable_AddUIState(), "addedSystemVariable", null, 0, -1, AbstractUIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractUIState_DeletedSystemVariable(), this.getUISystemVariable(), this.getUISystemVariable_DeleteUIState(), "deletedSystemVariable", null, 0, -1, AbstractUIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUIState_ScriptStr(), ecorePackage.getEString(), "scriptStr", null, 0, 1, AbstractUIState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTransitionEClass, UITransition.class, "UITransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUITransition_ItsSrcState(), this.getAbstractUIState(), this.getAbstractUIState_ItsOutTrantion(), "itsSrcState", null, 1, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_ItsTarState(), this.getAbstractUIState(), this.getAbstractUIState_ItsInTransition(), "itsTarState", null, 1, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUITransition_GuardedSystemVariable(), this.getUISystemVariable(), this.getUISystemVariable_GuardUITransitions(), "guardedSystemVariable", null, 0, -1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUITransition_ScriptStr(), ecorePackage.getEString(), "scriptStr", null, 0, 1, UITransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSystemVariableEClass, UISystemVariable.class, "UISystemVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISystemVariable_AddUIState(), this.getAbstractUIState(), this.getAbstractUIState_AddedSystemVariable(), "addUIState", null, 0, -1, UISystemVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUISystemVariable_DeleteUIState(), this.getAbstractUIState(), this.getAbstractUIState_DeletedSystemVariable(), "deleteUIState", null, 0, -1, UISystemVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUISystemVariable_GuardUITransitions(), this.getUITransition(), this.getUITransition_GuardedSystemVariable(), "guardUITransitions", null, 0, -1, UISystemVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiElementEClass, UIElement.class, "UIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonStateEClass, CommonState.class, "CommonState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonState_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, CommonState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uisutEClass, name.niu.guitar.uisut.UISUT.class, "UISUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISUT_ItsSTM(), this.getUIStatemachine(), null, "itsSTM", null, 0, 1, name.niu.guitar.uisut.UISUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSystemVariablePoolEClass, UISystemVariablePool.class, "UISystemVariablePool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISystemVariablePool_ItsUISystemVariable(), this.getUISystemVariable(), null, "itsUISystemVariable", null, 0, -1, UISystemVariablePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UisutPackageImpl
