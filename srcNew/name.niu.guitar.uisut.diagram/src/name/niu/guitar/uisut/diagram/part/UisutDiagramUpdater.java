package name.niu.guitar.uisut.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.FinalState;
import name.niu.guitar.uisut.InitialState;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.edit.parts.CommonStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachine2EditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachineEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UITransitionEditPart;
import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UisutDiagramUpdater {

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
	public static List<UisutNodeDescriptor> getSemanticChildren(View view) {
		switch (UisutVisualIDRegistry.getVisualID(view)) {
		case UIStatemachineEditPart.VISUAL_ID:
			return getUIStatemachine_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutNodeDescriptor> getUIStatemachine_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UIStatemachine modelElement = (UIStatemachine) view.getElement();
		LinkedList<UisutNodeDescriptor> result = new LinkedList<UisutNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsUIState().iterator(); it
				.hasNext();) {
			AbstractUIState childElement = (AbstractUIState) it.next();
			int visualID = UisutVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommonStateEditPart.VISUAL_ID) {
				result.add(new UisutNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialStateEditPart.VISUAL_ID) {
				result.add(new UisutNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalStateEditPart.VISUAL_ID) {
				result.add(new UisutNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsSubSTM().iterator(); it
				.hasNext();) {
			UIStatemachine childElement = (UIStatemachine) it.next();
			int visualID = UisutVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UIStatemachine2EditPart.VISUAL_ID) {
				result.add(new UisutNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getContainedLinks(View view) {
		switch (UisutVisualIDRegistry.getVisualID(view)) {
		case UIStatemachineEditPart.VISUAL_ID:
			return getUIStatemachine_1000ContainedLinks(view);
		case CommonStateEditPart.VISUAL_ID:
			return getCommonState_2001ContainedLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002ContainedLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003ContainedLinks(view);
		case UIStatemachine2EditPart.VISUAL_ID:
			return getUIStatemachine_2004ContainedLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getIncomingLinks(View view) {
		switch (UisutVisualIDRegistry.getVisualID(view)) {
		case CommonStateEditPart.VISUAL_ID:
			return getCommonState_2001IncomingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002IncomingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003IncomingLinks(view);
		case UIStatemachine2EditPart.VISUAL_ID:
			return getUIStatemachine_2004IncomingLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getOutgoingLinks(View view) {
		switch (UisutVisualIDRegistry.getVisualID(view)) {
		case CommonStateEditPart.VISUAL_ID:
			return getCommonState_2001OutgoingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002OutgoingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2003OutgoingLinks(view);
		case UIStatemachine2EditPart.VISUAL_ID:
			return getUIStatemachine_2004OutgoingLinks(view);
		case UITransitionEditPart.VISUAL_ID:
			return getUITransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUIStatemachine_1000ContainedLinks(
			View view) {
		UIStatemachine modelElement = (UIStatemachine) view.getElement();
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getCommonState_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getInitialState_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getFinalState_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUIStatemachine_2004ContainedLinks(
			View view) {
		UIStatemachine modelElement = (UIStatemachine) view.getElement();
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUITransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getCommonState_2001IncomingLinks(
			View view) {
		CommonState modelElement = (CommonState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getInitialState_2002IncomingLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getFinalState_2003IncomingLinks(
			View view) {
		FinalState modelElement = (FinalState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UITransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUIStatemachine_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUITransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getCommonState_2001OutgoingLinks(
			View view) {
		CommonState modelElement = (CommonState) view.getElement();
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getInitialState_2002OutgoingLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getFinalState_2003OutgoingLinks(
			View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UITransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUIStatemachine_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UisutLinkDescriptor> getUITransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<UisutLinkDescriptor> getContainedTypeModelFacetLinks_UITransition_4001(
			UIStatemachine container) {
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		for (Iterator<?> links = container.getItsUITransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) linkObject;
			if (UITransitionEditPart.VISUAL_ID != UisutVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractUIState dst = link.getItsTarState();
			AbstractUIState src = link.getItsSrcState();
			result.add(new UisutLinkDescriptor(src, dst, link,
					UisutElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UisutLinkDescriptor> getIncomingTypeModelFacetLinks_UITransition_4001(
			AbstractUIState target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UisutPackage.eINSTANCE
					.getUITransition_ItsTarState()
					|| false == setting.getEObject() instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) setting.getEObject();
			if (UITransitionEditPart.VISUAL_ID != UisutVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractUIState src = link.getItsSrcState();
			result.add(new UisutLinkDescriptor(src, target, link,
					UisutElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UisutLinkDescriptor> getOutgoingTypeModelFacetLinks_UITransition_4001(
			AbstractUIState source) {
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
		LinkedList<UisutLinkDescriptor> result = new LinkedList<UisutLinkDescriptor>();
		for (Iterator<?> links = container.getItsUITransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UITransition) {
				continue;
			}
			UITransition link = (UITransition) linkObject;
			if (UITransitionEditPart.VISUAL_ID != UisutVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractUIState dst = link.getItsTarState();
			AbstractUIState src = link.getItsSrcState();
			if (src != source) {
				continue;
			}
			result.add(new UisutLinkDescriptor(src, dst, link,
					UisutElementTypes.UITransition_4001,
					UITransitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
