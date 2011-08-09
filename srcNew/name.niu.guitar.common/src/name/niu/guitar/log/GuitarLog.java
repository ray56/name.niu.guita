package name.niu.guitar.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.Platform;

/**
 * frequency:low + framwork : seperated file
 * frequency:hight + detail : seperated file
 * 
 * @author Ray
 *
 */
public class GuitarLog {
	static{
		String installLoc = Platform.getInstallLocation().getURL().getPath();
		//String installLoc = Platform.getInstanceLocation().getURL().getPath();
		PropertyConfigurator.configure(installLoc + "\\log4j.properties") ;
		Logger logger = Logger.getLogger("GuitarLog") ;
		logger.debug("hello! guitar log!");
	}
	private static Logger logger = Logger.getLogger("GuitarLog");
	private static Logger frameLogger = Logger.getLogger("GuitarLog");
	
	public static Logger getInstance() {
		return logger ;
	}
	
	public static Logger getFrameLogger() {
		return frameLogger ;
	}
	
	public static void error( String str ) {
		if(logger != null )
			logger.error(str);
	}
	public static void error( String str, Throwable e ) {
		if(logger != null )
			logger.error(str,e);
	}
	public static void warn( String str ) {
		if(logger != null )
			logger.warn(str);
	}
	public static void warn( String str, Throwable e ) {
		if(logger != null )
			logger.warn(str,e);
	}
	public static void info( String str ) {
		if(logger != null )
			logger.info(str);
	}
	public static void debug( String str ) {
		if(logger != null )
			logger.debug(str);
	}
	public static void trace( String str ) {
		if(logger != null )
			logger.trace(str);
	}
}
