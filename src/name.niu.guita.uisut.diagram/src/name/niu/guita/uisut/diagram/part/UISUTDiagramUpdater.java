package name.niu.guita.uisut.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.FinalState;
import name.niu.guita.uisut.InitialState;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIDataVariableEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStatemachineEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UITransitionEditPart;
import name.niu.guita.uisut.diagram.providers.UISUTElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UISUTDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<UISUTNodeDescriptor> getSemanticChildren(View view) {
		switch (UISUTVisualIDRegistry.getVisualID(view)) {
		case UIStatemachineEditPart.VISUAL_ID:
			return getUIStatemachine_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTNodeDescriptor> getUIStatemachine_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UIStatemachine modelElement = (UIStatemachine) view.getElement();
		LinkedList<UISUTNodeDescriptor> result = new LinkedList<UISUTNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsState().iterator(); it
				.hasNext();) {
			AbstractState childElement = (AbstractState) it.next();
			int visualID = UISUTVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UIStateEditPart.VISUAL_ID) {
				result.add(new UISUTNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialStateEditPart.VISUAL_ID) {
				result.add(new UISUTNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalStateEditPart.VISUAL_ID) {
				result.add(new UISUTNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsDataVariable().iterator(); it
				.hasNext();) {
			UIDataVariable childElement = (UIDataVariable) it.next();
			int visualID = UISUTVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UIDataVariableEditPart.VISUAL_ID) {
				result.add(new UISUTNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getContainedLinks(View view) {
		switch (UISUTVisualIDRegistry.getVisualID(view)) {
		case UIStatemachineEditPart.VISUAL_ID:
			return getUIStatemachine_1000ContainedLinks(view);
		case UIStateEditPart.VISUAL_ID:
			return getUIState_2001ContainedLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002ContainedLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003ContainedLinks(view);
		case UIDataVariableEditPart.VISUAL_ID:
			return getUIDataVariable_2004ContainedLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getIncomingLinks(View view) {
		switch (UISUTVisualIDRegistry.getVisualID(view)) {
		case UIStateEditPart.VISUAL_ID:
			return getUIState_2001IncomingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002IncomingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003IncomingLinks(view);
		case UIDataVariableEditPart.VISUAL_ID:
			return getUIDataVariable_2004IncomingLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getOutgoingLinks(View view) {
		switch (UISUTVisualIDRegistry.getVisualID(view)) {
		case UIStateEditPart.VISUAL_ID:
			return getUIState_2001OutgoingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002OutgoingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003OutgoingLinks(view);
		case UIDataVariableEditPart.VISUAL_ID:
			return getUIDataVariable_2004OutgoingLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIStatemachine_1000ContainedLinks(
			View view) {
		UIStatemachine modelElement = (UIStatemachine) view.getElement();
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIState_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getInitialState_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getFinalState_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIDataVariable_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUITransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIState_2001IncomingLinks(
			View view) {
		UIState modelElement = (UIState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getInitialState_2002IncomingLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getFinalState_2003IncomingLinks(
			View view) {
		FinalState modelElement = (FinalState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIDataVariable_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUITransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIState_2001OutgoingLinks(
			View view) {
		UIState modelElement = (UIState) view.getElement();
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getInitialState_2002OutgoingLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getFinalState_2003OutgoingLinks(
			View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUIDataVariable_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UISUTLinkDescriptor> getUITransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<UISUTLinkDescriptor> getContainedTypeModelFacetLinks_UITransition_4001(
			UIStatemachine container) {
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		for (Iterator<?> links = container.getItsTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) linkObject;
			if (UITransitionEditPart.VISUAL_ID != UISUTVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractState dst = link.getItsTrgtState();
			AbstractState src = link.getItsSrcState();
			result.add(new UISUTLinkDescriptor(src, dst, link,
					UISUTElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UISUTLinkDescriptor> getIncomingTypeModelFacetLinks_UITransition_4001(
			AbstractState target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != name.niu.guita.uisut.uisutPackage.eINSTANCE
					.getUITransition_ItsTrgtState()
					|| false == setting.getEObject() instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) setting.getEObject();
			if (UITransitionEditPart.VISUAL_ID != UISUTVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractState src = link.getItsSrcState();
			result.add(new UISUTLinkDescriptor(src, target, link,
					UISUTElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UISUTLinkDescriptor> getOutgoingTypeModelFacetLinks_UITransition_4001(
			AbstractState source) {
		UIStatemachine container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof UIStatemachine) {
				container = (UIStatemachine) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UISUTLinkDescriptor> result = new LinkedList<UISUTLinkDescriptor>();
		for (Iterator<?> links = container.getItsTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) linkObject;
			if (UITransitionEditPart.VISUAL_ID != UISUTVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractState dst = link.getItsTrgtState();
			AbstractState src = link.getItsSrcState();
			if (src != source) {
				continue;
			}
			result.add(new UISUTLinkDescriptor(src, dst, link,
					UISUTElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
