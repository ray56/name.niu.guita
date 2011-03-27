/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class uisutFactoryImpl extends EFactoryImpl implements uisutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static uisutFactory init() {
		try {
			uisutFactory theuisutFactory = (uisutFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.niu.name/guita/uisut/1.0"); 
			if (theuisutFactory != null) {
				return theuisutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new uisutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uisutFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case uisutPackage.UISUT: return (EObject)createUISUT();
			case uisutPackage.APPLICATION_SYSTEM: return (EObject)createApplicationSystem();
			case uisutPackage.UI_STATEMACHINE: return (EObject)createUIStatemachine();
			case uisutPackage.UI_STATE: return (EObject)createUIState();
			case uisutPackage.UI_TRANSITION: return (EObject)createUITransition();
			case uisutPackage.USER_TRIGGER: return (EObject)createUserTrigger();
			case uisutPackage.COMPONENT_TRIGGER: return (EObject)createComponentTrigger();
			case uisutPackage.UI_CONDITION: return (EObject)createUICondition();
			case uisutPackage.ACTION: return (EObject)createAction();
			case uisutPackage.UI_CONTROL: return (EObject)createUIControl();
			case uisutPackage.UI_DATA_VARIABLE: return (EObject)createUIDataVariable();
			case uisutPackage.INITIAL_STATE: return (EObject)createInitialState();
			case uisutPackage.FINAL_STATE: return (EObject)createFinalState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISUT createUISUT() {
		UISUTImpl uisut = new UISUTImpl();
		return uisut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSystem createApplicationSystem() {
		ApplicationSystemImpl applicationSystem = new ApplicationSystemImpl();
		return applicationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStatemachine createUIStatemachine() {
		UIStatemachineImpl uiStatemachine = new UIStatemachineImpl();
		return uiStatemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIState createUIState() {
		UIStateImpl uiState = new UIStateImpl();
		return uiState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITransition createUITransition() {
		UITransitionImpl uiTransition = new UITransitionImpl();
		return uiTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTrigger createUserTrigger() {
		UserTriggerImpl userTrigger = new UserTriggerImpl();
		return userTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTrigger createComponentTrigger() {
		ComponentTriggerImpl componentTrigger = new ComponentTriggerImpl();
		return componentTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UICondition createUICondition() {
		UIConditionImpl uiCondition = new UIConditionImpl();
		return uiCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIControl createUIControl() {
		UIControlImpl uiControl = new UIControlImpl();
		return uiControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDataVariable createUIDataVariable() {
		UIDataVariableImpl uiDataVariable = new UIDataVariableImpl();
		return uiDataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uisutPackage getuisutPackage() {
		return (uisutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static uisutPackage getPackage() {
		return uisutPackage.eINSTANCE;
	}

} //uisutFactoryImpl
