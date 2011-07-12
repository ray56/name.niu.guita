/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import name.niu.guitar.uisut.*;

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
public class UisutFactoryImpl extends EFactoryImpl implements UisutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UisutFactory init() {
		try {
			UisutFactory theUisutFactory = (UisutFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.niu.name/guita/uisut/1.0"); 
			if (theUisutFactory != null) {
				return theUisutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UisutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UisutFactoryImpl() {
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
			case UisutPackage.UI_STATEMACHINE: return createUIStatemachine();
			case UisutPackage.ABSTRACT_UI_STATE: return createAbstractUIState();
			case UisutPackage.UI_TRANSITION: return createUITransition();
			case UisutPackage.UI_SYSTEM_VARIABLE: return createUISystemVariable();
			case UisutPackage.UI_ELEMENT: return createUIElement();
			case UisutPackage.COMMON_STATE: return createCommonState();
			case UisutPackage.INITIAL_STATE: return createInitialState();
			case UisutPackage.FINAL_STATE: return createFinalState();
			case UisutPackage.UISUT: return createUISUT();
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL: return createUISystemVariablePool();
			case UisutPackage.STATESHORTCUT: return createStateshortcut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public AbstractUIState createAbstractUIState() {
		AbstractUIStateImpl abstractUIState = new AbstractUIStateImpl();
		return abstractUIState;
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
	public UISystemVariable createUISystemVariable() {
		UISystemVariableImpl uiSystemVariable = new UISystemVariableImpl();
		return uiSystemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement createUIElement() {
		UIElementImpl uiElement = new UIElementImpl();
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonState createCommonState() {
		CommonStateImpl commonState = new CommonStateImpl();
		return commonState;
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
	public UISUT createUISUT() {
		UISUTImpl uisut = new UISUTImpl();
		return uisut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISystemVariablePool createUISystemVariablePool() {
		UISystemVariablePoolImpl uiSystemVariablePool = new UISystemVariablePoolImpl();
		return uiSystemVariablePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stateshortcut createStateshortcut() {
		StateshortcutImpl stateshortcut = new StateshortcutImpl();
		return stateshortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UisutPackage getUisutPackage() {
		return (UisutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UisutPackage getPackage() {
		return UisutPackage.eINSTANCE;
	}

} //UisutFactoryImpl
