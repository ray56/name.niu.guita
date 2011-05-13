package name.niu.guita;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "name.niu.guita.project"; //$NON-NLS-1$

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
		System.out.println( "[START]: " + "name.niu.guita.Activator.start(BundleContext)" ) ;
		super.start(context);
		plugin = this;
		System.out.println( "[END  ]: " + "name.niu.guita.Activator.start(BundleContext)" ) ;
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println( "[START]: " + "name.niu.guita.Activator.stop(BundleContext)" ) ;
		plugin = null;
		super.stop(context);
		System.out.println( "[END  ]: " + "name.niu.guita.Activator.stop(BundleContext)" ) ;
		
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
