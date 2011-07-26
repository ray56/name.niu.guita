package name.niu.guitar.ui.sourceProviders;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;

public class CommandState extends AbstractSourceProvider {

	
	public final static String GEN_AND_EXE_STATUS = "name.niu.guitar.ui.sourceProviders.genAndExeStatus";

	private String genAndExe = "IDLE";
	
	public CommandState() {	}
	@Override
	public void dispose() {	}
	@Override
	public Map getCurrentState() {
		Map map = new HashMap(1);
		String value = genAndExe;
		map.put(GEN_AND_EXE_STATUS, value);
		return map;
	}
	@Override
	public String[] getProvidedSourceNames() {
		return new String[] {GEN_AND_EXE_STATUS};
	}

	// public interface for command
	public void toogleGenAndExeStatus(String cur) {
		if ( cur!= null && !cur.equals(genAndExe)){
			genAndExe = cur ;
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					fireSourceChanged(
							ISources.WORKBENCH | ISources.ACTIVE_MENU, 
							GEN_AND_EXE_STATUS, 
							genAndExe);
				}
			});

		}
	}
	
}
