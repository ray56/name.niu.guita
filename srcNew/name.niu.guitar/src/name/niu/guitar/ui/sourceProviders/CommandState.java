package name.niu.guitar.ui.sourceProviders;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;

public class CommandState extends AbstractSourceProvider {

	
	public final static String GEN_AND_EXE_STATUS = "name.niu.guitar.ui.sourceProviders.genAndExeStatus";
	// Start clickable, 
	public final static String GEN_AND_EXE_IN_IDLE = "GEN_AND_EXE_IN_IDLE";
	// Start not clickable, Resume not clickable, Stop clickable
	public final static String GEN_AND_EXE_IN_STEPPING = "GEN_AND_EXE_IN_STEPPING";
	// Start not clickable, Resume clickable, Stop clickable
	public final static String GEN_AND_EXE_IN_STEPED = "GEN_AND_EXE_IN_STEPED";
	private String genAndExe = GEN_AND_EXE_IN_IDLE;
	
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
			fireSourceChanged(ISources.WORKBENCH, GEN_AND_EXE_STATUS, genAndExe);
		}
	}
	
}
