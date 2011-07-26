package name.niu.guitar.ui.preferencePages;

import name.niu.guitar.Activator;
import name.niu.guitar.config.Config;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.ScaleFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GuitarGenPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore( Activator.getDefault().getPreferenceStore() );
		setDescription("Config Guitar Gen");
	}

	@Override
	protected void createFieldEditors() {
		addField( new ColorFieldEditor(Config.ANIMATIONPATHCOLOR ,		
				"animation path color\t",
				getFieldEditorParent() ) );
		addField( new ColorFieldEditor(Config.ANIMATIONHEADCOLOR,		
				"animation head color\t",
				getFieldEditorParent() ) );
		addField( new ColorFieldEditor(Config.ANIMATIONFROMSTATECOLOR,	
				"animation from color\t",
				getFieldEditorParent() ) );
		addField( new ColorFieldEditor(Config.ANIMATIONTOSTATECOLOR,	
				"animation to color\t\t",
				getFieldEditorParent() ) );
		addField( new ScaleFieldEditor(Config.ANIMATIONINTERVAL, 
				"interval of continual steps\t",
				getFieldEditorParent(),
				1000,10000,500,2000));
	}

}
