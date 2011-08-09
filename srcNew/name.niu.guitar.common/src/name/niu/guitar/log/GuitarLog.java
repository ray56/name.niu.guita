package name.niu.guitar.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.Platform;

public class GuitarLog {
	static{
		String installLoc = Platform.getInstallLocation().getURL().getPath();
		//String installLoc = Platform.getInstanceLocation().getURL().getPath();
		PropertyConfigurator.configure(installLoc + "\\log4j.properties") ;
		Logger logger = Logger.getLogger("GuitarLog") ;
		logger.debug("hello! guitar log!");
	}
	private static Logger logger = Logger.getLogger("GuitarLog");
	
	public static Logger getInstance() {
		return logger ;
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
