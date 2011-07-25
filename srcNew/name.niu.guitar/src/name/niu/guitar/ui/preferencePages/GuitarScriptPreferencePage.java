package name.niu.guitar.ui.preferencePages;

import name.niu.guitar.Activator;
import name.niu.guitar.config.Config;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GuitarScriptPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore( Activator.getDefault().getPreferenceStore() );
		setDescription("Config Guitar Script Engine");		
	}

	@Override
	protected void createFieldEditors() {
		addField( new FileFieldEditor(Config.SCRIPTINTERPRETER_COMMANDLINE , "Select the script engine file", 
				getFieldEditorParent()) );
		addField( new FileFieldEditor(Config.SCRIPTINTERPRETER_SCRIPTFILE , "Select temp script file", 
				getFieldEditorParent()) );
	}



}
