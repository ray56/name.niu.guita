package name.niu.guita.uisut.diagram.providers;

import name.niu.guita.uisut.diagram.part.UISUTDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UISUTDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			UISUTDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
