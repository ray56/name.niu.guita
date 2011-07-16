package name.niu.guitar.scriptengine.interfaces;

import name.niu.guitar.uitf.*;

public interface ITargetScriptExeDoneSubscriber {
	
	public void OnTargetStatementDone(String[] executedUUID);
	public void OnSEStoped(ITargetScriptExeDonePublisher p);

}
