package name.niu.guitar.uisut.tcgen.interfaces.impl;

import java.util.ArrayList;

import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;
import name.niu.guitar.uitf.*;

public class TCDonePublisherImpl implements ITCDonePublisher {

	 ArrayList<ITCDoneSubscriber> sbList = new ArrayList<ITCDoneSubscriber>();
	
	@Override
	public void addSubscriber(ITCDoneSubscriber sb) {
		sbList.add(sb);
	}

	@Override
	public void rmvSubscriber(ITCDoneSubscriber sb) {
		sbList.remove(sb);
	}

	
	@Override
	public void notifyUitfFileDone(String uitfFilePath) {
		
		for(ITCDoneSubscriber sb : sbList){
			
			sb.OnUtifFileDone(uitfFilePath);
		}
	}

	@Override
	public void notifyTestCaseDone(TestCase tc) {
		
		for(ITCDoneSubscriber sb : sbList){
			
			sb.OnTestCaseDone(tc);
		}
	}
	
	@Override
	public void notifyTCGStoped() {
		
		for(ITCDoneSubscriber sb : sbList){			
			sb.OnTCGStoped(this);
		}
	}
	
}
