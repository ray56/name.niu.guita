package name.niu.guitar.uisut.tcgen.interfaces;

import name.niu.guitar.uitf.*;

public interface ITCDonePublisher {
	
	public void addSubscriber( ITCDoneSubscriber sb );
	public void rmvSubscriber( ITCDoneSubscriber sb );
	public void notifyUitfFileDone( String uitfFilePath );
	public void notifyTestCaseDone( TestCase tc );
	
}
