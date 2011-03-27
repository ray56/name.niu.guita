package name.niu.guita.uisut.diagram.part;

import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStateNameEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStatemachineEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UITransitionEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UITransitionNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UISUTVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "name.niu.guita.uisut.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UIStatemachineEditPart.MODEL_ID.equals(view.getType())) {
				return UIStatemachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				UISUTDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (name.niu.guita.uisut.uisutPackage.eINSTANCE.getUIStatemachine()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UIStatemachine) domainElement)) {
			return UIStatemachineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry
				.getModelID(containerView);
		if (!UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIStatemachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UIStatemachineEditPart.VISUAL_ID:
			if (name.niu.guita.uisut.uisutPackage.eINSTANCE.getUIState()
					.isSuperTypeOf(domainElement.eClass())) {
				return UIStateEditPart.VISUAL_ID;
			}
			if (name.niu.guita.uisut.uisutPackage.eINSTANCE.getInitialState()
					.isSuperTypeOf(domainElement.eClass())) {
				return InitialStateEditPart.VISUAL_ID;
			}
			if (name.niu.guita.uisut.uisutPackage.eINSTANCE.getFinalState()
					.isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry
				.getModelID(containerView);
		if (!UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIStatemachineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UIStatemachineEditPart.VISUAL_ID:
			if (UIStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UIStateEditPart.VISUAL_ID:
			if (UIStateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UITransitionEditPart.VISUAL_ID:
			if (UITransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (name.niu.guita.uisut.uisutPackage.eINSTANCE.getUITransition()
				.isSuperTypeOf(domainElement.eClass())) {
			return UITransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(UIStatemachine element) {
		return true;
	}

}
