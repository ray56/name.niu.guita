package name.niu.guitar.uisut.diagram.edit.parts;


import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.diagram.config.Config;
import name.niu.guitar.uisut.diagram.edit.policies.UITransitionItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class UITransitionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public UITransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new UITransitionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new UITransitionFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public UITransitionFigureDescriptor getPrimaryShape() {
		return (UITransitionFigureDescriptor) getFigure();
	}
	
	// @generated NOT
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof UITransition ) {
			if ( UisutPackage.eINSTANCE.getUIElement_Highlight().equals( event.getFeature() )) {
				getPrimaryShape().updateHighlightProperty();//for test
			}
		}
		super.handleNotificationEvent(event);		
	}


	/**
	 * @generated
	 */
	public class UITransitionFigureDescriptor extends PolylineConnectionEx {
		
		// colors
		ColorRegistry colorRegistry = new ColorRegistry();

		/**
		 * @generated NOT
		 */
		public UITransitionFigureDescriptor() {

			setTargetDecoration(createTargetDecoration());
			updateHighlightProperty();
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}
		
		// update according to dynamic property of hight
		public void updateHighlightProperty() {
			UITransition transition = ( UITransition ) ((View)UITransitionEditPart.this.getModel()).getElement() ;
			String hightlintSyle = transition.getHighlight() ;
			if ( hightlintSyle == null ) 
				return ;
			if ( "none".equals(hightlintSyle.toLowerCase()) ){
				this.setLineWidth(1);
				this.setForegroundColor( Display.getCurrent().getSystemColor(SWT.COLOR_BLACK)) ;				
			} else if ( Config.ANIMATIONHEADCOLOR.equals(hightlintSyle) ){
				Color color = colorRegistry.get( Config.getAnimationHeadColor().toString() ) ;
				if ( color == null ){
					colorRegistry.put(Config.getAnimationHeadColor().toString(), Config.getAnimationHeadColor() ) ;
					color = colorRegistry.get( Config.getAnimationHeadColor().toString() ) ;
				}	
				this.setForegroundColor( color ) ;
				int linewith = 3 ;
				this.setLineWidth(linewith);
			} else if ( Config.ANIMATIONPATHCOLOR.equals(hightlintSyle) ){
				Color color = colorRegistry.get( Config.getAnimationPathColor().toString() ) ;
				if ( color == null ){
					colorRegistry.put(Config.getAnimationPathColor().toString(), Config.getAnimationPathColor() ) ;
					color = colorRegistry.get( Config.getAnimationPathColor().toString() ) ;
				}	
				this.setForegroundColor( color ) ;
				int linewith = 3 ;
				this.setLineWidth(linewith);
			}
		}
	}

}
