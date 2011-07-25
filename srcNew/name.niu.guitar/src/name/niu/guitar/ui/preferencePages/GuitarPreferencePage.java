package name.niu.guitar.ui.preferencePages;

import name.niu.guitar.Activator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;


public class GuitarPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore( Activator.getDefault().getPreferenceStore() );
		setDescription("Config Guitar Preferences");
		
	}

	@Override
	protected void createFieldEditors() {
		
		String myPrefString = Activator.getDefault().getPreferenceStore()
		.getString("MySTRING1");
		
		String text = Platform.getPreferencesService().getString(
				"name.niu.guitar", "MySTRING2", "hello", null);
		
		////
		addField(new DirectoryFieldEditor("PATH", "&Directory preference:",
				getFieldEditorParent()));
		addField( new ColorFieldEditor("COLOR","&Color",
				getFieldEditorParent() ) );
		addField( new PathEditor("PATH2","","",
				getFieldEditorParent()));
		addField( new FileFieldEditor("File" , "", 
				getFieldEditorParent()) );
		addField(new BooleanFieldEditor("BOOLEAN_VALUE",
				"&An example of a boolean preference", 
				getFieldEditorParent()));

		addField(new RadioGroupFieldEditor("CHOICE",
				"An example of a multiple-choice preference", 1,
				new String[][] { { "&Choice 1", "choice1" },
						{ "C&hoice 2", "choice2" } }, 
				getFieldEditorParent()));
		addField(new StringFieldEditor("MySTRING1", "A &text preference:",
				getFieldEditorParent()));
		addField(new StringFieldEditor("MySTRING2", "A &text preference:",
				getFieldEditorParent()));
		
		
		////
		String myPrefString2 = Activator.getDefault().getPreferenceStore().getString("MySTRING1");
		
	}


}
