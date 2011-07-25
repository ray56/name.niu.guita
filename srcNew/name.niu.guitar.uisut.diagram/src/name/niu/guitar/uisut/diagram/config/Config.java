package name.niu.guitar.uisut.diagram.config;

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
	
	public static String ANIMATIONPATHCOLOR = "animationPathColor" ;
	public static String ANIMATIONHEADCOLOR = "animationHeadColor" ;
	public static String ANIMATIONFROMSTATECOLOR = "animationFromStateColor" ;
	public static String ANIMATIONTOSTATECOLOR = "animationToStateColor" ;
	
	public static RGB getAnimationPathColor() {
		String str = Platform.getPreferencesService().getString(
				"name.niu.guitar", Config.ANIMATIONPATHCOLOR,"", null);
		RGB rgb = StringConverter.asRGB(str) ;
		return rgb ;
	}

	public static RGB getAnimationHeadColor() {
		String str = Platform.getPreferencesService().getString(
				"name.niu.guitar", Config.ANIMATIONHEADCOLOR,"", null);
		RGB rgb = StringConverter.asRGB(str) ;
		return rgb ;
	}

	public static RGB getAnimationFromStateColor() {
		String str = Platform.getPreferencesService().getString(
				"name.niu.guitar", Config.ANIMATIONFROMSTATECOLOR,"", null);
		RGB rgb = StringConverter.asRGB(str) ;
		return rgb ;
	}

	public static RGB getAnimationToStateColor() {
		String str = Platform.getPreferencesService().getString(
				"name.niu.guitar", Config.ANIMATIONTOSTATECOLOR,"", null);
		RGB rgb = StringConverter.asRGB(str) ;
		return rgb ;
	}


}
