package name.niu.guita;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println( "[START]: " + "name.niu.guita.Application.start(IApplicationContext)" ) ;
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART)
				return IApplication.EXIT_RESTART;
			else
				return IApplication.EXIT_OK;
		} finally {
			display.dispose();
			System.out.println( "[END  ]: " + "name.niu.guita.Application.start(IApplicationContext)" ) ;
		}
		
		
	}

	@Override
	public void stop() {
		System.out.println( "[START]: " + "name.niu.guita.Application.stop()" ) ;
		System.out.println( "[END  ]: " + "name.niu.guita.Application.stop()" ) ;
	}

}
