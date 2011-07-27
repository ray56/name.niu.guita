package name.niu.guitar.preference;

import name.niu.guitar.Activator;
import name.niu.guitar.config.Config;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;


public class GuitarPreferenceInitializer extends AbstractPreferenceInitializer {

	public GuitarPreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		PreferenceConverter.setDefault(store, Config.ANIMATIONPATHCOLOR, 
				StringConverter.asRGB( Config.animationPathColor , new RGB(0,0,0) )  );
		PreferenceConverter.setDefault(store, Config.ANIMATIONHEADCOLOR, 		
				StringConverter.asRGB( Config.animationHeadColor , new RGB(0,0,0) ));
		PreferenceConverter.setDefault(store, Config.ANIMATIONFROMSTATECOLOR, 	
				StringConverter.asRGB( Config.animationFromStateColor , new RGB(0,0,0) ));
		PreferenceConverter.setDefault(store, Config.ANIMATIONTOSTATECOLOR, 	
				StringConverter.asRGB( Config.animationToStateColor , new RGB(0,0,0) ));
		store.setDefault(Config.ANIMATIONINTERVAL, 	
				StringConverter.asInt( Config.animationInterval, 2000 ));
		store.setDefault( Config.SCRIPTINTERPRETER_SCRIPTFILE, 
				Config.scriptInterpreter_scriptFile ) ;
		store.setDefault( Config.SCRIPTINTERPRETER_COMMANDLINE, 
				Config.scriptInterpreter_commandLine ) ;
	}

}
