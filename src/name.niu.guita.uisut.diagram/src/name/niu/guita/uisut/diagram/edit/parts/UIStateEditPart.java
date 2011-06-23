package name.niu.guita.uisut.diagram.edit.parts;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.uisutPackage;
import name.niu.guita.uisut.diagram.edit.policies.UIStateItemSemanticEditPolicy;
import name.niu.guita.uisut.diagram.part.UISUTVisualIDRegistry;
import name.niu.guita.uisut.diagram.providers.UISUTElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.notation.Image;

/**
 * @generated
 */
public class UIStateEditPart extends ShapeNodeEditPart {

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

	//2011-06-06
	String screenshotURL;

	/**
	 * @generated
	 */
	public UIStateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new UIStateItemSemanticEditPolicy());
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
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		primaryShape = new GgFigureDescriptor_UIStateFigure();
		
		// 2011-06-06
		UIState semanticEle = (UIState) ((View)this.getModel()).getElement() ;		
		screenshotURL =  semanticEle.getPic()  ;	
		this.getPrimaryShape().freshScreenShot( screenshotURL ) ;		
		
		return primaryShape ;
	}

	/**
	 * @generated
	 */
	public GgFigureDescriptor_UIStateFigure getPrimaryShape() {
		return (GgFigureDescriptor_UIStateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UIStateNameEditPart) {
			((UIStateNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureGgLable_UIStateNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UIStateNameEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(300, 200);
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
		return getChildBySemanticHint(UISUTVisualIDRegistry
				.getType(UIStateNameEditPart.VISUAL_ID));
	}

	// 2011-06-08
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UISUTElementTypes.UITransition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart) {
			types.add(UISUTElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof InitialStateEditPart) {
			types.add(UISUTElementTypes.UITransition_4001);
		}
		if (targetEditPart instanceof FinalStateEditPart) {
			types.add(UISUTElementTypes.UITransition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UISUTElementTypes.UITransition_4001) {
			types.add(UISUTElementTypes.UIState_2001);
			types.add(UISUTElementTypes.InitialState_2002);
			types.add(UISUTElementTypes.FinalState_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UISUTElementTypes.UITransition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UISUTElementTypes.UITransition_4001) {
			types.add(UISUTElementTypes.UIState_2001);
			types.add(UISUTElementTypes.InitialState_2002);
			types.add(UISUTElementTypes.FinalState_2003);
		}
		return types;
	}

	// 2011-06-06
	protected void handleNotificationEvent(Notification notification) {

		Object feature = notification.getFeature();
		if (uisutPackage.eINSTANCE.getUIState_Pic().equals(feature)) {
			screenshotURL = notification.getNewStringValue();
			this.getPrimaryShape().freshScreenShot(screenshotURL);
			//				if( screenshotURL == null ) {
			//					screenshotURL = new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Apple.png");
			//				} else if( screenshotURL.equals( new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Apple.png"))) {
			//					screenshotURL = new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Orange.png");	
			//				} else if ( screenshotURL.equals( new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Orange.png") )){
			//					screenshotURL = new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Apple.png");
			//				}			

		}

		super.handleNotificationEvent(notification);

		//		this.refresh() ;
		//		this.refreshVisuals() ;
		//		this.refreshVisibility() ;

		//this.refreshVisuals();

		//		Object feature = notification.getFeature();
		//		if (NotationPackage.eINSTANCE.getView_SourceEdges().equals(feature))
		//			refreshSourceConnections();
		//		else if (NotationPackage.eINSTANCE.getView_TargetEdges().equals(feature))
		//			refreshTargetConnections();
		//		else if (NotationPackage.eINSTANCE.getFillStyle_Gradient().equals(feature) ||
		//				NotationPackage.eINSTANCE.getFillStyle_FillColor().equals(feature)) {				
		//			refreshBackgroundColor();
		//		} else if (NotationPackage.eINSTANCE.getFillStyle_Transparency().equals(feature)) {
		//			refreshTransparency();			
		//		} else {
		//			super.handleNotificationEvent(notification);
		//		}
	}

	/**
	 * @generated
	 */
	public class GgFigureDescriptor_UIStateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGgLable_UIStateNameFigure;

		//2011-06-06
		RectangleFigure screenshotArea0;
		URL screenshotURL;

		/**
		 * @generated
		 */
		public GgFigureDescriptor_UIStateFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(150)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(150)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(150)));

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureGgLable_UIStateNameFigure = new WrappingLabel();
			fFigureGgLable_UIStateNameFigure.setText("<...>");

			GridData constraintFFigureGgLable_UIStateNameFigure = new GridData();
			constraintFFigureGgLable_UIStateNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureGgLable_UIStateNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureGgLable_UIStateNameFigure.horizontalIndent = 10;
			constraintFFigureGgLable_UIStateNameFigure.horizontalSpan = 1;
			constraintFFigureGgLable_UIStateNameFigure.verticalSpan = 1;
			constraintFFigureGgLable_UIStateNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureGgLable_UIStateNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureGgLable_UIStateNameFigure,
					constraintFFigureGgLable_UIStateNameFigure);

					createStateScreenshot() ;

}

		// 2011-06-06: create pic
		private void createStateScreenshot() {
			RectangleFigure screenshotArea0 = new RectangleFigure();
			screenshotArea0.setBackgroundColor(new Color(null, 255, 255, 255));

			GridData constraintScreenshotArea0 = new GridData();
			constraintScreenshotArea0.verticalAlignment = GridData.FILL;
			constraintScreenshotArea0.horizontalAlignment = GridData.FILL;
			constraintScreenshotArea0.horizontalIndent = 0;
			constraintScreenshotArea0.horizontalSpan = 1;
			constraintScreenshotArea0.verticalSpan = 1;
			constraintScreenshotArea0.grabExcessHorizontalSpace = true;
			constraintScreenshotArea0.grabExcessVerticalSpace = true;
			// add 
			this.add(screenshotArea0, constraintScreenshotArea0);
			this.screenshotArea0 = screenshotArea0;

			GridLayout layoutScreenshotArea0 = new GridLayout();
			layoutScreenshotArea0.numColumns = 1;
			layoutScreenshotArea0.makeColumnsEqualWidth = true;
			layoutScreenshotArea0.verticalSpacing = 0;
			layoutScreenshotArea0.horizontalSpacing = 0;
			layoutScreenshotArea0.marginHeight = 0;
			layoutScreenshotArea0.marginWidth = 0;

			screenshotArea0.setLayoutManager(layoutScreenshotArea0);

			//URL url = this.getClass().getResource("") ;
			//URL url = Platform.getBundle("name.niu.guita.uisut.diagram").getEntry("/images/book.png") ;
			//			URL url = null;
			//			try {
			//				int i = ( int)  ( Math.floor( Math.random() * 2 ) ) ;
			//				if ( i == 0 ) {
			//					url = new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Apple.png");	
			//				} else {
			//					url = new URL("file:///F:/x.home/x.repositories/x.repository51(AuthoringMaterial)/x.repository(Picture)/实体.自然物/Nature/s/Orange.png");
			//				}
			//				
			//			} catch (MalformedURLException e) {
			//				// TODO Auto-generated catch block
			//				e.printStackTrace();
			//			}
			//			ScalableImageFigure screenshot1 = new ScalableImageFigure(
			//					RenderedImageFactory.getInstance(url), true, true, true );
			//			
			//			GridData constraintScreenshot1 = new GridData();
			//			{
			//				constraintScreenshot1.verticalAlignment = GridData.CENTER;
			//				constraintScreenshot1.horizontalAlignment = GridData.CENTER;
			//				constraintScreenshot1.horizontalIndent = 0;
			//				constraintScreenshot1.horizontalSpan = 1;
			//				constraintScreenshot1.verticalSpan = 1;
			//				constraintScreenshot1.grabExcessHorizontalSpace = true;
			//				constraintScreenshot1.grabExcessVerticalSpace = true;
			//			}
			//			screenshotArea0.removeAll() ;
			//			screenshotArea0.add(screenshot1, constraintScreenshot1);		

		}

		//2011-06-06
		public void freshScreenShot(String url) {
			UIState s = (UIState) ((Node) UIStateEditPart.this.getModel())
					.getElement();
			url = s.getPic();
			if (url == null || url.equals("")) {
				this.screenshotArea0.removeAll();
				return;
			}
			this.screenshotArea0.removeAll();

			ScalableImageFigure screenshot1 = new ScalableImageFigure(
					RenderedImageFactory.getInstance(url), true, true, true);

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

			this.screenshotArea0.add(screenshot1, constraintScreenshot1);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGgLable_UIStateNameFigure() {
			return fFigureGgLable_UIStateNameFigure;
		}

	}

}
