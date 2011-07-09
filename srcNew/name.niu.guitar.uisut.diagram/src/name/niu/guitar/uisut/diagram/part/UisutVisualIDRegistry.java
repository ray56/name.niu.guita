package name.niu.guitar.uisut.diagram.part;

import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.edit.parts.CommonStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.CommonStateNameEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachine2EditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachineEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachineNameEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UITransitionEditPart;

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
public class UisutVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "name.niu.guitar.uisut.diagram/debug/visualID"; //$NON-NLS-1$

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
		return name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry
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
				UisutDiagramEditorPlugin.getInstance().logError(
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
		if (UisutPackage.eINSTANCE.getUIStatemachine().isSuperTypeOf(
				domainElement.eClass())
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
		String containerModelID = name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry
				.getModelID(containerView);
		if (!UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry
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
			if (UisutPackage.eINSTANCE.getCommonState().isSuperTypeOf(
					domainElement.eClass())) {
				return CommonStateEditPart.VISUAL_ID;
			}
			if (UisutPackage.eINSTANCE.getInitialState().isSuperTypeOf(
					domainElement.eClass())) {
				return InitialStateEditPart.VISUAL_ID;
			}
			if (UisutPackage.eINSTANCE.getFinalState().isSuperTypeOf(
					domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (UisutPackage.eINSTANCE.getUIStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				return UIStatemachine2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry
				.getModelID(containerView);
		if (!UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UIStatemachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry
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
			if (CommonStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UIStatemachine2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommonStateEditPart.VISUAL_ID:
			if (CommonStateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UIStatemachine2EditPart.VISUAL_ID:
			if (UIStatemachineNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (UisutPackage.eINSTANCE.getUITransition().isSuperTypeOf(
				domainElement.eClass())) {
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
