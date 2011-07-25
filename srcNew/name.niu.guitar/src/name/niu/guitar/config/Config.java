package name.niu.guitar.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import name.niu.guitar.Activator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

public class Config {
	
	public static String ANIMATIONPATHCOLOR = "animationPathColor" ;
	public static String ANIMATIONHEADCOLOR = "animationHeadColor" ;
	public static String ANIMATIONFROMSTATECOLOR = "animationFromStateColor" ;
	public static String ANIMATIONTOSTATECOLOR = "animationToStateColor" ;
	public static String ANIMATIONINTERVAL = "animationInterval" ;
	
	//
	public static String SCRIPTINTERPRETER_SCRIPTFILE = "scriptInterpreter_scriptFile" ;
	public static String SCRIPTINTERPRETER_COMMANDLINE = "scriptInterpreter_commandLine" ;
	
	static private String scriptInterpreter_scriptFile ;
	
	static private String scriptInterpreter_commandLine ;
	
	static private String animationPathColor ;
	
	static private String animationHeadColor ;
	
	static private String animationFromStateColor ;
	
	static private String animationToStateColor ;
	
	public static RGB getAnimationPathColor() {
		RGB rgb = PreferenceConverter.getColor(
				Activator.getDefault().getPreferenceStore() , 
				Config.ANIMATIONPATHCOLOR);
		return rgb ;
	}

	public static RGB getAnimationHeadColor() {
		RGB rgb = PreferenceConverter.getColor(
				Activator.getDefault().getPreferenceStore() , 
				Config.ANIMATIONHEADCOLOR);
		return rgb ;
	}

	public static RGB getAnimationFromStateColor() {
		RGB rgb = PreferenceConverter.getColor(
				Activator.getDefault().getPreferenceStore() , 
				Config.ANIMATIONFROMSTATECOLOR);
		return rgb ;
	}

	public static RGB getAnimationToStateColor() {
		RGB rgb = PreferenceConverter.getColor(
				Activator.getDefault().getPreferenceStore() , 
				Config.ANIMATIONTOSTATECOLOR);
		return rgb ;
	}
	
	public static int getAnimationInterval() {
		int interval = Activator.getDefault().getPreferenceStore().getInt( Config.ANIMATIONINTERVAL);
		return interval ;
	}
	
	
	static {
		Properties property = new Properties();
		String installLoc = Platform.getInstallLocation().getURL().getPath();
		//String installLoc = Platform.getInstanceLocation().getURL().getPath();

		try {			
			property.load(new FileInputStream( installLoc + "\\scriptengine.properties"));
			scriptInterpreter_scriptFile = property.getProperty("scriptInterpreter_scriptFile");
			scriptInterpreter_commandLine = property.getProperty("scriptInterpreter_commandLine");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
