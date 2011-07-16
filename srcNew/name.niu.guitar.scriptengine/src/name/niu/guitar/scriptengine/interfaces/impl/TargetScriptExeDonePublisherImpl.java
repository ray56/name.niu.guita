package name.niu.guitar.scriptengine.interfaces.impl;

import java.util.ArrayList;

import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDonePublisher;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDoneSubscriber;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;
import name.niu.guitar.uitf.*;

public class TargetScriptExeDonePublisherImpl implements ITargetScriptExeDonePublisher {

	 ArrayList<ITargetScriptExeDoneSubscriber> sbList = new ArrayList<ITargetScriptExeDoneSubscriber>();
	
	@Override
	public void addSubscriber(ITargetScriptExeDoneSubscriber sb) {
		sbList.add(sb);
	}

	@Override
	public void rmvSubscriber(ITargetScriptExeDoneSubscriber sb) {
		sbList.remove(sb);
	}

	
	@Override
	public void notifyTargetStatementDone(String[] executedUUID) {
		
		for(ITargetScriptExeDoneSubscriber sb : sbList){
			
			sb.OnTargetStatementDone(executedUUID);
		}
	}
	
	@Override
	public void notifyTEStoped() {
		
		for(ITargetScriptExeDoneSubscriber sb : sbList){
			
			sb.OnSEStoped(this);
		}
	}
}
