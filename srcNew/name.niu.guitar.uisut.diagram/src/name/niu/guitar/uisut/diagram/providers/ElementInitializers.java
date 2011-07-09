package name.niu.guitar.uisut.diagram.providers;

import name.niu.guitar.uisut.diagram.part.UisutDiagramEditorPlugin;

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
		ElementInitializers cached = UisutDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			UisutDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
