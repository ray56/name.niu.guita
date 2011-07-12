package name.niu.guitar.uisut.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.edit.policies.CommonStateItemSemanticEditPolicy;
import name.niu.guitar.uisut.diagram.part.UisutVisualIDRegistry;
import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
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
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class CommonStateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public CommonStateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CommonStateItemSemanticEditPolicy());
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
		return primaryShape = new CommonStateFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public CommonStateFigureDescriptor getPrimaryShape() {
		return (CommonStateFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CommonStateNameEditPart) {
			((CommonStateNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureCommonStateLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CommonStateNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 100);
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UisutVisualIDRegistry
				.getType(CommonStateNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof name.niu.guitar.uisut.diagram.edit.parts.CommonStateEditPart) {
			types.add(UisutElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof InitialStateEditPart) {
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
		
		if (event.getNotifier() instanceof CommonState ) {
			if ( UisutPackage.eINSTANCE.getCommonState_Picture().equals( event.getFeature() ) ) {
				getPrimaryShape().updateFigureForPic();
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
	public class CommonStateFigureDescriptor extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCommonStateLabel;
		
		// ScreenSnap of CommonState
		private RectangleFigure screensnapContainer = null ;

		/**
		 * @generated NOT
		 */
		public CommonStateFigureDescriptor() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(100)));
			createContents();
			updateFigureForPic();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureCommonStateLabel = new WrappingLabel();
			fFigureCommonStateLabel.setText("");
				GridData 
					constraintFFigureCommonStateLabel = new GridData();
					constraintFFigureCommonStateLabel.verticalAlignment = GridData.BEGINNING;
					constraintFFigureCommonStateLabel.horizontalAlignment = GridData.CENTER;
					constraintFFigureCommonStateLabel.horizontalIndent = 0;
					constraintFFigureCommonStateLabel.horizontalSpan = 1;
					constraintFFigureCommonStateLabel.verticalSpan = 1;
					constraintFFigureCommonStateLabel.grabExcessHorizontalSpace = false;
					constraintFFigureCommonStateLabel.grabExcessVerticalSpace = false;
			this.add(fFigureCommonStateLabel, constraintFFigureCommonStateLabel);

			 
			screensnapContainer = new RectangleFigure();
			screensnapContainer.setFill(false);
			screensnapContainer.setOutline(false);
			screensnapContainer.setLineWidth(0);
			//sandboxRectangle0.setBackgroundColor( new Color(null, 255, 255, 255) );
				GridData 
					constraintSandboxRectangle0 = new GridData();
					constraintSandboxRectangle0.verticalAlignment = GridData.CENTER;
					constraintSandboxRectangle0.horizontalAlignment = GridData.CENTER;
					constraintSandboxRectangle0.horizontalIndent = 0;
					constraintSandboxRectangle0.horizontalSpan = 1;
					constraintSandboxRectangle0.verticalSpan = 1;
					constraintSandboxRectangle0.grabExcessHorizontalSpace = true;
					constraintSandboxRectangle0.grabExcessVerticalSpace = true;
			this.add(screensnapContainer, constraintSandboxRectangle0);

				
				GridLayout 
					layoutScreenshotArea0 = new GridLayout();
					layoutScreenshotArea0.numColumns = 1;
					layoutScreenshotArea0.makeColumnsEqualWidth = true;
					layoutScreenshotArea0.verticalSpacing = 0 ;
					layoutScreenshotArea0.horizontalSpacing = 0 ;
					layoutScreenshotArea0.marginHeight = 0 ;
					layoutScreenshotArea0.marginWidth = 0 ;				
				screensnapContainer.setLayoutManager(layoutScreenshotArea0);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCommonStateLabel() {
			return fFigureCommonStateLabel;
		}
		
		// update according to dynamic property of pic
		public void updateFigureForPic() {
			CommonState commonState = ( CommonState ) ((View)CommonStateEditPart.this.getModel()).getElement() ;
			String picString = commonState.getPicture() ;
			if ( picString == null || picString.isEmpty() )
				return ;
			
			ScalableImageFigure screenshot1 = new ScalableImageFigure(
					RenderedImageFactory.getInstance(picString), true, true, true );
			
			GridData constraintScreenshot1 = new GridData();
			{
				constraintScreenshot1.verticalAlignment = GridData.FILL;
				constraintScreenshot1.horizontalAlignment = GridData.FILL;
				constraintScreenshot1.horizontalIndent = 0;
				constraintScreenshot1.horizontalSpan = 1;
				constraintScreenshot1.verticalSpan = 1;
				constraintScreenshot1.grabExcessHorizontalSpace = true;
				constraintScreenshot1.grabExcessVerticalSpace = true;
			}
			
			this.screensnapContainer.add(screenshot1, constraintScreenshot1 ) ;			
		}
	}

}
