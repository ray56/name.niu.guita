package name.niu.guitar.uisut.tcgen.interfaces;

import name.niu.guitar.uitf.*;

public interface ITCDoneSubscriber {
	
	public void OnUtifFileDone(String uitfFileParth);
	public void OnTestCaseDone(TestCase tc);
	public static String Stop_Reason_Completion 	= "Stop_Reason_Completion";
	public static String Stop_Reason_Cancellation 	= "Stop_Reason_Cancellation";
	public static String Stop_Reason_ValidatioError 	= "Stop_Reason_ValidatioError";
	public void OnTCGStoped(ITCDonePublisher tcg , String reason) ;

}
