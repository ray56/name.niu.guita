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
	public static String SCRIPTINTERPRETER_SCRIPTFILE = "scriptInterpreter_scriptFile" ;
	public static String SCRIPTINTERPRETER_COMMANDLINE = "scriptInterpreter_commandLine" ;
	
	
	static public String scriptInterpreter_scriptFile ;
	
	static public String scriptInterpreter_commandLine ;
	
	static public String animationPathColor ;
	
	static public String animationHeadColor ;
	
	static public String animationFromStateColor ;
	
	static public String animationToStateColor ;
	
	static public String animationInterval ;
	
	static {
		Properties property = new Properties();
		String installLoc = Platform.getInstallLocation().getURL().getPath();
		//String installLoc = Platform.getInstanceLocation().getURL().getPath();

		try {			
			property.load(new FileInputStream( installLoc + "\\scriptengine.properties"));
			scriptInterpreter_scriptFile = property.getProperty(SCRIPTINTERPRETER_SCRIPTFILE);
			scriptInterpreter_commandLine = property.getProperty(SCRIPTINTERPRETER_COMMANDLINE);
			animationPathColor = property.getProperty(ANIMATIONPATHCOLOR);
			animationHeadColor = property.getProperty(ANIMATIONHEADCOLOR);
			animationFromStateColor = property.getProperty(ANIMATIONFROMSTATECOLOR);
			animationToStateColor = property.getProperty(ANIMATIONTOSTATECOLOR);
			animationInterval = property.getProperty(ANIMATIONINTERVAL);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
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
	
	public static String getScriptFile() {
		String file = Platform.getPreferencesService()
			.getString("name.niu.guitar", Config.SCRIPTINTERPRETER_SCRIPTFILE, "C:\\temp.txt", null);
		return file ;
	}
	
	public static String getScriptCommandLine() {
		String cmd = Platform.getPreferencesService()
			.getString("name.niu.guitar", Config.SCRIPTINTERPRETER_COMMANDLINE, "", null);
		return cmd ;
	}
	
	

}
