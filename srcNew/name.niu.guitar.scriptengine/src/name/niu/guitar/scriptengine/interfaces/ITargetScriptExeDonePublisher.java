package name.niu.guitar.scriptengine.interfaces;

import name.niu.guitar.uitf.*;

public interface ITargetScriptExeDonePublisher {
	
	public void addSubscriber( ITargetScriptExeDoneSubscriber sb );
	public void rmvSubscriber( ITargetScriptExeDoneSubscriber sb );
	public void notifyTargetStatementDone( String[] executedUUID );	
	public void notifyTestCaseDone( TestCase tc );	
	public void notifyTEStoped() ;	
}
