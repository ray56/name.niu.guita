package name.niu.guita.uisut.tcgen.config;

import java.util.ArrayList;

import org.eclipse.osgi.util.NLS;

public class Configuration extends NLS {
	
	static {
		NLS.initializeMessages("config/configuration", Configuration.class); //$NON-NLS-1$
		maxLoopCount = Integer.parseInt(Configuration.Tcgen_Configuration_Default_MaxLoopCount) ;
		maxStepCount = Integer.parseInt(Configuration.Tcgen_Configuration_Default_MaxStepCount) ;
	}	
	
	private Configuration () {
		
	}
	
	public static String Tcgen_Configuration_Default_MaxLoopCount ;
	
	public static String Tcgen_Configuration_Default_MaxStepCount ;
	
	private static int maxLoopCount ;
	
	private static int maxStepCount ;
	
	public static String getGenFrom() {
		return genFrom;
	}

	public static void setGenFrom(String genFrom) {
		Configuration.genFrom = genFrom;
	}

	public static String getGenTo() {
		return genTo;
	}

	public static void setGenTo(String genTo) {
		Configuration.genTo = genTo;
	}

	public static ArrayList<String> getGenScope() {
		return genScope;
	}

	public static void setGenScope(ArrayList<String> genScope) {
		Configuration.genScope = genScope;
	}

	private static String genFrom = null ;
	private static String genTo = null ;
	private static ArrayList<String> genScope = null ;
	
	public static int getMaxLoopCount() {
		return maxLoopCount ;
	}
	
	public static int getMaxStepCount() {
		return maxStepCount ;
	}

	public static void setMaxLoopCount(int maxLoopCount) {
		Configuration.maxLoopCount = maxLoopCount;
	}

	public static void setMaxStepCount(int maxStepCount) {
		Configuration.maxStepCount = maxStepCount;
	}
}
