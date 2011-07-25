package name.niu.guitar.preference;

import name.niu.guitar.Activator;
import name.niu.guitar.config.Config;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;


public class GuitarPreferenceInitializer extends AbstractPreferenceInitializer {

	public GuitarPreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		PreferenceConverter.setDefault(store, Config.ANIMATIONPATHCOLOR, 		new RGB(255,0,255));
		PreferenceConverter.setDefault(store, Config.ANIMATIONHEADCOLOR, 		new RGB(0,255,255));
		PreferenceConverter.setDefault(store, Config.ANIMATIONFROMSTATECOLOR, 	new RGB(255,0,0));
		PreferenceConverter.setDefault(store, Config.ANIMATIONTOSTATECOLOR, 	new RGB(0,255,0));
	}

}
