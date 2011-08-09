package name.niu.guitar;

import java.util.Timer;
import java.util.TimerTask;

import name.niu.guitar.log.GuitarLog;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "name.niu.guitar"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		final Timer timer = new Timer();
		TimerTask autoSaveTask = new TimerTask() {
			public void run() {
				Display.getDefault().asyncExec
				(new Runnable() {
					 public void run() {
						 PlatformUI.getWorkbench().saveAllEditors(false);
						 GuitarLog.getInstance().debug("auto saved");
					 }
				 });
			}
		};
		// every 5 minutes ( 5*60*1000 mili seconds) save.
		timer.schedule(autoSaveTask, 1*1000, 10*60*1000) ;
		Workbench.getInstance().addWorkbenchListener(
				new IWorkbenchListener () {

					@Override
					public boolean preShutdown(IWorkbench workbench,
							boolean forced) {
						timer.cancel();
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeAllEditors(true);
						return true;
					}

					@Override
					public void postShutdown(IWorkbench workbench) {
						
					}
					
				});
		plugin = this;		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
