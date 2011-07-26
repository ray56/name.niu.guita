package name.niu.guitar.scriptengine.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;
import org.osgi.service.prefs.Preferences;

public class Config {
	
	public static String SCRIPTINTERPRETER_SCRIPTFILE = "scriptInterpreter_scriptFile" ;
	public static String SCRIPTINTERPRETER_COMMANDLINE = "scriptInterpreter_commandLine" ;
	public static String ANIMATIONINTERVAL = "animationInterval" ;

	public static int getAnimationInterval() {
		int interval = Platform.getPreferencesService()
			.getInt("name.niu.guitar", Config.ANIMATIONINTERVAL, 2000, null);
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
