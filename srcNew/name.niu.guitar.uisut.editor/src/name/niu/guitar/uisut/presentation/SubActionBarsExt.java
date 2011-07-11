package name.niu.guitar.uisut.presentation;

import java.util.Map;

import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.SubCoolBarManager;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IActionBars2;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.SubActionBars2;

/**
 * An extended sub cool bar manager for used by the <code>TopicmapMultipageActionBarContributor</code>.
 * @see UISUTMultipageActionBarContributor
 */
public class SubActionBarsExt extends SubActionBars2 {

	private IEditorActionBarContributor myContributor;

	private String myType;

	private IToolBarManager myToolBarManager;

	private ToolBarContributionItem myToolBarContributionItem;

	private PartListener myPartListener;

	/**
	 * Default constructor.
	 * @param page
	 * @param parent
	 * @param subContributor
	 * @param type
	 */
	public SubActionBarsExt(IWorkbenchPage page, IActionBars2 parent,
			IEditorActionBarContributor subContributor, String type) {
		super(parent, parent.getServiceLocator());
		assert type != null;
		myType = type;
		assert page != null;
		myPartListener = new PartListener(page);
		assert subContributor != null;
		myContributor = subContributor;
		myContributor.init(this, page);
	}

	/**
	 * @return the action bar contributor
	 */
	public IEditorActionBarContributor getContributor() {
		return myContributor;
	}

	/**
	 * Changes the active editor part.
	 * @param editorPart
	 */
	public void setEditorPart(IEditorPart editorPart) {
		myContributor.setActiveEditor(editorPart);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.SubActionBars#getToolBarManager()
	 */
	public IToolBarManager getToolBarManager() {
		if (myToolBarManager == null) {
			ICoolBarManager parentCoolBarManager = getTopCoolBarManager();
			if (parentCoolBarManager == null) {
				return null;
			}
			IContributionItem foundItem = parentCoolBarManager.find(myType);
			if (foundItem instanceof ToolBarContributionItem
					&& ((ToolBarContributionItem) foundItem)
							.getToolBarManager() != null) {
				myToolBarContributionItem = (ToolBarContributionItem) foundItem;
				myToolBarManager = myToolBarContributionItem
						.getToolBarManager();
			} else {
				if (false == parentCoolBarManager instanceof ContributionManager) {
					return null;
				}
				myToolBarManager = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
				myToolBarContributionItem = new ToolBarContributionItem(
						myToolBarManager, myType);
				if (!((ContributionManager) parentCoolBarManager).replaceItem(
						myType, myToolBarContributionItem)) {
					parentCoolBarManager.add(myToolBarContributionItem);
				}
			}
			myToolBarContributionItem.setVisible(getActive());
			myToolBarManager.markDirty();
		}

		return myToolBarManager;
	}

	/**
	 * @return the top-level cool bar manager instance
	 */
	private ICoolBarManager getTopCoolBarManager() {
		ICoolBarManager coolBarManager = getCastedParent().getCoolBarManager();
		while (coolBarManager instanceof SubCoolBarManager
				&& ((SubCoolBarManager) coolBarManager).getParent() instanceof ICoolBarManager) {
			coolBarManager = (ICoolBarManager) ((SubCoolBarManager) coolBarManager)
					.getParent();
		}
		return coolBarManager;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.SubActionBars2#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		myContributor.dispose();
		myContributor = null;

		if (myToolBarContributionItem != null) {
			myToolBarContributionItem.dispose();
			myToolBarContributionItem = null;
		}

		if (myToolBarManager != null) {
			myToolBarManager.removeAll();
			myToolBarManager = null;
		}

		myPartListener.dispose();
		myPartListener = null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.SubActionBars2#setActive(boolean)
	 */
	@Override
	protected void setActive(boolean value) {
		if (getActive() == value) {
			return;
		}
		super.setActive(value);

		ICoolBarManager parentCoolBarManager = getTopCoolBarManager();
		if (parentCoolBarManager != null) {
			parentCoolBarManager.markDirty();
		}
		if (myToolBarManager != null && parentCoolBarManager != null) {
			IContributionItem[] items = myToolBarManager.getItems();
			for (int i = 0; i < items.length; i++) {
				IContributionItem item = items[i];
				item.setVisible(value);
			}
			myToolBarManager.markDirty();
			myToolBarManager.update(false);
		}

		if (value) {
			@SuppressWarnings("unchecked")
			Map<String, IAction> globals = getGlobalActionHandlers();
			for (Map.Entry<String, IAction> nextEntry : globals.entrySet()) {
				getParent().setGlobalActionHandler(nextEntry.getKey(),
						nextEntry.getValue());
			}
		} else {
			getParent().clearGlobalActionHandlers();
		}
		getParent().updateActionBars();
	}

	/**
	 * Inner class to be able to be notified when parts are activated.
	 */
	private class PartListener implements IPartListener {

		private IWorkbenchPage myPage;

		/**
		 * Default constructor.
		 * @param page
		 */
		public PartListener(IWorkbenchPage page) {
			myPage = page;
			myPage.addPartListener(this);
		}

		/**
		 * Default cleanup method.
		 */
		public void dispose() {
			myPage.removePartListener(this);
			myPage = null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
		 */
		public void partActivated(IWorkbenchPart part) {
			if (part instanceof IEditorPart) {
				IEditorPart editorPart = (IEditorPart) part;
				if (editorPart.getEditorSite().getActionBars() != getParent()
						&& getActive()) {
					deactivate();
					updateActionBars();
				}
			}
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart)
		 */
		public void partBroughtToTop(IWorkbenchPart part) {
			// not required
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
		 */
		public void partClosed(IWorkbenchPart part) {
			// not required
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart)
		 */
		public void partDeactivated(IWorkbenchPart part) {
			// not required
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
		 */
		public void partOpened(IWorkbenchPart part) {
			// not required
		}

	}

}
