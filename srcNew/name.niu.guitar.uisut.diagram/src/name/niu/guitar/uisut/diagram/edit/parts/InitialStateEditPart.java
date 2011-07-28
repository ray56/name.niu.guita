package name.niu.guitar.uisut.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.InitialState;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.config.Config;
import name.niu.guitar.uisut.diagram.edit.policies.InitialStateItemSemanticEditPolicy;
import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class InitialStateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InitialStateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InitialStateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InitialStateFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public InitialStateFigureDescriptor getPrimaryShape() {
		return (InitialStateFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UisutElementTypes.UITransition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CommonStateEditPart) {
			types.add(UisutElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof name.niu.guitar.uisut.diagram.edit.parts.InitialStateEditPart) {
			types.add(UisutElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof FinalStateEditPart) {
			types.add(UisutElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof StateshortcutEditPart) {
			types.add(UisutElementTypes.UITransition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UisutElementTypes.UITransition_4001) {
			types.add(UisutElementTypes.CommonState_2001);
			types.add(UisutElementTypes.InitialState_2002);
			types.add(UisutElementTypes.FinalState_2003);
			types.add(UisutElementTypes.Stateshortcut_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UisutElementTypes.UITransition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UisutElementTypes.UITransition_4001) {
			types.add(UisutElementTypes.CommonState_2001);
			types.add(UisutElementTypes.InitialState_2002);
			types.add(UisutElementTypes.FinalState_2003);
			types.add(UisutElementTypes.Stateshortcut_2005);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof InitialState) {
			if (UisutPackage.eINSTANCE.getUIElement_Highlight().equals(
					event.getFeature())) {
				getPrimaryShape().updateHighlightProperty();//for test
			}
		}

		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class InitialStateFigureDescriptor extends Ellipse {

		// colors
		ColorRegistry colorRegistry = new ColorRegistry();

		/**
		 * @generated
		 */
		public InitialStateFigureDescriptor() {
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
		}

		public void updateHighlightProperty() {
			InitialState commonState = (InitialState) ((View) InitialStateEditPart.this
					.getModel()).getElement();
			String hightlintSyle = commonState.getHighlight();
			if ("none".equals(hightlintSyle.toLowerCase())) {
				this.setLineWidth(1);
				this.setForegroundColor(Display.getCurrent().getSystemColor(
						SWT.COLOR_BLACK));
			} else if (Config.ANIMATIONHEADCOLOR.equals(hightlintSyle)) {
				Color color = colorRegistry.get(Config.getAnimationHeadColor()
						.toString());
				if (color == null) {
					colorRegistry.put(
							Config.getAnimationHeadColor().toString(),
							Config.getAnimationHeadColor());
					color = colorRegistry.get(Config.getAnimationHeadColor()
							.toString());
				}
				this.setForegroundColor(color);
				int linewith = 3;
				this.setLineWidth(linewith);
			} else if (Config.ANIMATIONPATHCOLOR.equals(hightlintSyle)) {
				Color color = colorRegistry.get(Config.getAnimationPathColor()
						.toString());
				if (color == null) {
					colorRegistry.put(
							Config.getAnimationPathColor().toString(),
							Config.getAnimationPathColor());
					color = colorRegistry.get(Config.getAnimationPathColor()
							.toString());
				}
				this.setForegroundColor(color);
				int linewith = 3;
				this.setLineWidth(linewith);
			} else if ("from=true".equals(hightlintSyle.toLowerCase())) {
				Color color = colorRegistry.get(Config
						.getAnimationFromStateColor().toString());
				if (color == null) {
					colorRegistry.put(Config.getAnimationFromStateColor()
							.toString(), Config.getAnimationFromStateColor());
					color = colorRegistry.get(Config
							.getAnimationFromStateColor().toString());
				}
				this.setBackgroundColor(color);
			} else if ("from=false".equals(hightlintSyle.toLowerCase())) {
				this.setBackgroundColor(Display.getCurrent().getSystemColor(
						SWT.COLOR_WHITE));
			} else if ("to=true".equals(hightlintSyle.toLowerCase())) {
				Color color = colorRegistry.get(Config
						.getAnimationToStateColor().toString());
				if (color == null) {
					colorRegistry.put(Config.getAnimationToStateColor()
							.toString(), Config.getAnimationToStateColor());
					color = colorRegistry.get(Config.getAnimationToStateColor()
							.toString());
				}
				this.setBackgroundColor(color);
				;
			} else if ("to=false".equals(hightlintSyle.toLowerCase())) {
				this.setBackgroundColor(Display.getCurrent().getSystemColor(
						SWT.COLOR_WHITE));
			}
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 0, 0, 0);

}
