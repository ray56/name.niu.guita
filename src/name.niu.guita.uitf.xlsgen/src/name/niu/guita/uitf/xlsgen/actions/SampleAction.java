package name.niu.guita.uitf.xlsgen.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uitf.xlsgen.dataObject.TestCaseDescription;
import name.niu.guita.uitf.xlsgen.util.excelExporter.ExportExcel2;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class SampleAction implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	/**
	 * The constructor.
	 */
	public SampleAction() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		MessageDialog.openInformation(
			window.getShell(),
			"Xlsgen",
			"Hello, Eclipse world");
		
		// Test TestCaseDescription

		
		ExportExcel2<TestCaseDescription> eetc = null ;
		try {
			eetc = new ExportExcel2<TestCaseDescription>();
		} catch (Exception e){
			e.printStackTrace() ;
		}
		String eetc_title = "TestSuite1" ;
		String[] eetc_header = { "No.", "Test Case Id", "Operations",
				"Excepted Result" };
		int[]eetc_columnWidth = {1000, 4000, 10000, 10000} ;
		List<TestCaseDescription> eetc_dataset = new ArrayList<TestCaseDescription>();
		eetc_dataset.add(new TestCaseDescription("1", "Case_001",
				"[Precondition]\n1.系统在A界面下\n[Steps]\n1.点击Button1\n",
				"[Excepted]\n1.到达画面B"));
		eetc_dataset.add(new TestCaseDescription("2", "Case_002",
				"[Precondition]\n1.系统在B界面下\n[Steps]\n1.点击Button2\n",
				"[Excepted]\n1.到达画面C"));
		eetc_dataset.add(new TestCaseDescription("3", "Case_003",
				"[Precondition]\n1.系统在C界面下\n[Steps]\n1.点击Button3\n",
				"[Excepted]\n1.到达画面A\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

		OutputStream eetc_out;
		try {
			eetc_out = new FileOutputStream("C:\\tc.xls");
			eetc.exportExcel(eetc_title,eetc_header, eetc_columnWidth,eetc_dataset, eetc_out,"YYYY-MM-DD");
			eetc_out.close();
			JOptionPane.showMessageDialog(null, "导出成功!");
			System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}