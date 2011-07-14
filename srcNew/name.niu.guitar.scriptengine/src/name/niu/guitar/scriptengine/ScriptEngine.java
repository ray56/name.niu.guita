package name.niu.guitar.scriptengine;

import java.lang.Runtime;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDonePublisher;
import name.niu.guitar.scriptengine.interfaces.impl.TargetScriptExeDonePublisherImpl;
import name.niu.guitar.uitf.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class ScriptEngine 
	extends TargetScriptExeDonePublisherImpl
	implements ITCDoneSubscriber
{

	@Override
	public void OnUtifFileDone(String uitfFileParth) {
		
	}

	@Override
	public void OnTestCaseDone(TestCase tc) {
		for(Statement statement : tc.getItsStatement()){			
			if(statement.getScriptStr() != null){
				
				// convert state to string
				String generatedScriptStatement = convertTargetScript(statement);
				
				// write file
				String targetScriptFile = writeTargetScripToFile(generatedScriptStatement);
				
				// sent to engine
				executeTargetScrip(statement, targetScriptFile);
			}
		}
	}

	private String convertTargetScript(Statement statement) {
		String generatedScriptStatement = null ;
		StringBuffer target_sb = new StringBuffer();
		StringTokenizer strtoktt = new StringTokenizer(statement.getScriptStr(),";");
		for(; strtoktt.hasMoreTokens(); ){
			target_sb.append( strtoktt.nextToken() + "\r\n");
		}
		generatedScriptStatement = target_sb.toString() ;
		return generatedScriptStatement;
	}
	
	private String writeTargetScripToFile(String generatedScriptStatement) {
		String tempFilePath = "";// get current workspace and create a temp txt 
		OutputStream os;
		
		try {
			os = new FileOutputStream(tempFilePath);
			os.write(generatedScriptStatement.getBytes( "utf8"));
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tempFilePath ;
	}



	private void executeTargetScrip(Statement statement, String targetScripFile) {
		Runtime rt = Runtime.getRuntime();
		Process pc = null;
		try {
			pc = rt.exec("");
			
			String [] trackbackIds = {statement.getTrackbackID()};
			this.notifyTargetStatementDone(trackbackIds);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
