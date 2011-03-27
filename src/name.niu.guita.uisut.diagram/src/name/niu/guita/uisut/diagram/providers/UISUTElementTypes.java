package name.niu.guita.uisut.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import name.niu.guita.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStatemachineEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UITransitionEditPart;
import name.niu.guita.uisut.diagram.part.UISUTDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class UISUTElementTypes {

	/**
	 * @generated
	 */
	private UISUTElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType UIStatemachine_1000 = getElementType("name.niu.guita.uisut.diagram.UIStatemachine_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UIState_2001 = getElementType("name.niu.guita.uisut.diagram.UIState_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialState_2002 = getElementType("name.niu.guita.uisut.diagram.InitialState_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalState_2003 = getElementType("name.niu.guita.uisut.diagram.FinalState_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UITransition_4001 = getElementType("name.niu.guita.uisut.diagram.UITransition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return UISUTDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UIStatemachine_1000,
					name.niu.guita.uisut.uisutPackage.eINSTANCE
							.getUIStatemachine());

			elements.put(UIState_2001,
					name.niu.guita.uisut.uisutPackage.eINSTANCE.getUIState());

			elements.put(InitialState_2002,
					name.niu.guita.uisut.uisutPackage.eINSTANCE
							.getInitialState());

			elements.put(FinalState_2003,
					name.niu.guita.uisut.uisutPackage.eINSTANCE.getFinalState());

			elements.put(UITransition_4001,
					name.niu.guita.uisut.uisutPackage.eINSTANCE
							.getUITransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UIStatemachine_1000);
			KNOWN_ELEMENT_TYPES.add(UIState_2001);
			KNOWN_ELEMENT_TYPES.add(InitialState_2002);
			KNOWN_ELEMENT_TYPES.add(FinalState_2003);
			KNOWN_ELEMENT_TYPES.add(UITransition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UIStatemachineEditPart.VISUAL_ID:
			return UIStatemachine_1000;
		case UIStateEditPart.VISUAL_ID:
			return UIState_2001;
		case InitialStateEditPart.VISUAL_ID:
			return InitialState_2002;
		case FinalStateEditPart.VISUAL_ID:
			return FinalState_2003;
		case UITransitionEditPart.VISUAL_ID:
			return UITransition_4001;
		}
		return null;
	}

}
