package name.niu.guitar.scriptengine.interfaces;

import name.niu.guitar.uitf.*;

public interface ITargetScriptExeDoneSubscriber {
	
	public void OnTargetStatementDone(String[] executedUUID);
	public void OnTestCaseDone(TestCase tc);
	public void OnSEStoped(ITargetScriptExeDonePublisher p);

}
