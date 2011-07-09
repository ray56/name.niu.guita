package name.niu.guitar.uisut.tcgen.interfaces;

import name.niu.guitar.uitf.*;

public interface ITCDoneSubscriber {
	
	public void OnUtifFileDone(String uitfFileParth);
	public void OnTestCaseDone(TestCase tc);

}
