package name.niu.guitar.uisut.diagram.providers;

import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.edit.parts.CommonStateNameEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.StateshortcutNameEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UIStatemachineNameEditPart;
import name.niu.guitar.uisut.diagram.edit.parts.UITransitionNameEditPart;
import name.niu.guitar.uisut.diagram.parsers.MessageFormatParser;
import name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UisutParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser commonStateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCommonStateName_5001Parser() {
		if (commonStateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			commonStateName_5001Parser = parser;
		}
		return commonStateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser uIStatemachineName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUIStatemachineName_5002Parser() {
		if (uIStatemachineName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			uIStatemachineName_5002Parser = parser;
		}
		return uIStatemachineName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateshortcutName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStateshortcutName_5003Parser() {
		if (stateshortcutName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			stateshortcutName_5003Parser = parser;
		}
		return stateshortcutName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser uITransitionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getUITransitionName_6001Parser() {
		if (uITransitionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { UisutPackage.eINSTANCE
					.getUIElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			uITransitionName_6001Parser = parser;
		}
		return uITransitionName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CommonStateNameEditPart.VISUAL_ID:
			return getCommonStateName_5001Parser();
		case UIStatemachineNameEditPart.VISUAL_ID:
			return getUIStatemachineName_5002Parser();
		case StateshortcutNameEditPart.VISUAL_ID:
			return getStateshortcutName_5003Parser();
		case UITransitionNameEditPart.VISUAL_ID:
			return getUITransitionName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UisutVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UisutVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UisutElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
