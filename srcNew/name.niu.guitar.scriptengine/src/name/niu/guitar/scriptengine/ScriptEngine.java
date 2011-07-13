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

import name.niu.guitar.uitf.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class ScriptEngine implements ITCDoneSubscriber {

	@Override
	public void OnUtifFileDone(String uitfFileParth) {
		
	}

	@Override
	public void OnTestCaseDone(TestCase tc) {
		
		StringBuffer target_sb = new StringBuffer();
		
		for(Statement statement : tc.getItsStatement()){
			
			if(statement.getScriptStr() != null){
				StringTokenizer strtoktt = new StringTokenizer(statement.getScriptStr(),";");
				for(; strtoktt.hasMoreTokens(); ){
					target_sb.append( strtoktt.nextToken() + "\r\n");
				}
				
				// write file
				String tempFilePath = "";// get current workspace and create a temp txt 
				OutputStream os;
				
				try {
					os = new FileOutputStream(tempFilePath);
					os.write(target_sb.toString().getBytes( "utf8"));
					os.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				// sent to engine
				Runtime rt = Runtime.getRuntime();
				Process pc = null;
				try {
					pc = rt.exec("");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else{
				continue;
			}
			
			// if next button, continue
			
			// if stop button, break
		}
		
	}

}
