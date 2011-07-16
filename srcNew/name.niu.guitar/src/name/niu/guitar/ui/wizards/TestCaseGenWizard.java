package name.niu.guitar.ui.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TestCaseGenWizard extends Wizard 
{
	
	private PageOne one ;	
	private int maxLoopCount = 3 ;
	private int maxStepCount = 50 ;
	
	public int getMaxLoopCount() {
		return maxLoopCount;
	}
	public int getMaxStepCount() {
		return maxStepCount;
	}

	public TestCaseGenWizard()
	{
		super() ;
		setNeedsProgressMonitor(true);
	}
	@Override
	public void addPages() {
		one = new PageOne();
		addPage(one);
	}
	
	@Override
	public boolean performFinish() {
		try {
			maxLoopCount = Integer.parseInt( one.getMaxLoopCountText() ) ;
			maxStepCount = Integer.parseInt( one.getMaxStepCountText() ) ;	
		} catch (Exception e) {
			e.printStackTrace() ;
		}
		return true;
	}
	
	private class PageOne extends WizardPage 
	{
		private Text maxLoopCountText ;
		private Text maxStepCountText ;
		private Composite container;
		
		public PageOne() 
		{
			super("maxCycleCount") ;
			setTitle("Set max cycle count");
			setDescription("Set max cycle count.") ;
		}
		public String getMaxLoopCountText() {
			return maxLoopCountText.getText();
		}
		public String getMaxStepCountText() {
			return maxStepCountText.getText();
		}
		
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NULL);
			GridLayout 
				layout = new GridLayout();
				layout.numColumns = 2;
			container.setLayout(layout);
			
			//maxLoopCount
			Label 
			maxLoopCountLabel = new Label(container, SWT.NULL);
			maxLoopCountLabel.setText("max cycle count");
			maxLoopCountText = new Text(container, SWT.BORDER | SWT.SINGLE);
			maxLoopCountText.setText(Integer.toString( maxLoopCount ) );
			maxLoopCountText.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
				}
				@Override
				public void keyReleased(KeyEvent e) {
					if (!maxLoopCountText.getText().isEmpty()) {
						setPageComplete(true);
					}
				}
			});
			GridData maxLoopGridData = new GridData(GridData.FILL_HORIZONTAL);
			maxLoopCountText.setLayoutData(maxLoopGridData);			
			// maxStepCount
			Label 
			maxStepCountLabel = new Label(container, SWT.NULL);
			maxStepCountLabel.setText("max step count");
			
			maxStepCountText = new Text(container, SWT.BORDER | SWT.SINGLE);
			maxStepCountText.setText(Integer.toString( maxStepCount ) );
			maxStepCountText.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
				}
				@Override
				public void keyReleased(KeyEvent e) {
					if (!maxStepCountText.getText().isEmpty()) {
						setPageComplete(true);
					}
				}

			});
			GridData maxStepCountGridData = new GridData(GridData.FILL_HORIZONTAL);
			maxStepCountText.setLayoutData(maxStepCountGridData);
			// Required to avoid an error in the system
			setControl(container);
			setPageComplete(true);
		}
	}
}
