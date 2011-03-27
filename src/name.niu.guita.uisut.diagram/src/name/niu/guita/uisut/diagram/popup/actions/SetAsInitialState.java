package name.niu.guita.uisut.diagram.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart; 

public class SetAsInitialState implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection ;
	
	/**
	 * Constructor for Action1.
	 */
	public SetAsInitialState() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		MessageDialog.openInformation(
			shell,
			"Uisut Plugin",
			"SetAsInitialState was executed.");
		/*
		CompoundCommand cc = new CompoundCommand("Create Subtopic and Link");

		// Create the new topic for the other end.
		CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(MindmapElementTypes.Topic_2001, selectedElement.getDiagramPreferencesHint());

		Point p = selectedElement.getFigure().getBounds().getTopRight().getCopy();
		selectedElement.getFigure().translateToAbsolute(p);
		int edgeCount = selectedElement.getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom
		int offset = (edgeCount * 50) - 100;
		topicRequest.setLocation(p.translate(100, offset));

		MapEditPart mapEditPart = (MapEditPart) selectedElement.getParent();
		Command createTopicCmd = mapEditPart.getCommand(topicRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List) topicRequest.getNewObject()).get(0);

		cc.add(createTopicCmd);

		// create the subtopics link command
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(MindmapElementTypes.TopicSubtopics_4001,
					((IHintedType) MindmapElementTypes.TopicSubtopics_4001).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject) selectedElement.getModel()),
					topicViewAdapter, selectedElement.getViewer());

		cc.add(new ICommandProxy(createSubTopicsCmd));

		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		// put the new topic in edit mode
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
		if (elementPart != null) {
			Display.getCurrent().asyncExec(new Runnable() {

				public void run() {
						viewer.setSelection(new StructuredSelection(elementPart));
						Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
						elementPart.performRequest(der);
					}
			});
		}*/
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		Class x = selection.getClass() ;
		this.selection = selection ;
		
	}

}
