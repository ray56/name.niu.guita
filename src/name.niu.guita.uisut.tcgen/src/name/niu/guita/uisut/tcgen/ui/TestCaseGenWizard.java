package name.niu.guita.uisut.tcgen.ui;



import java.util.ArrayList;

import name.niu.guita.uisut.tcgen.actions.GenerationTestCaseAlgorithm;
import name.niu.guita.uisut.tcgen.config.Configuration;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

public class TestCaseGenWizard extends Wizard 
{
	
	private PageOne one ;
	private PageTwo two ;
	private PageThree three ;
	
	private int maxLoopCount = Configuration.getMaxLoopCount() ;
	private int maxStepCount = Configuration.getMaxStepCount() ;
	private String genFrom = Configuration.getGenFrom() ;
	private String genTo = Configuration.getGenTo() ;
	private ArrayList<String> genScope = Configuration.getGenScope() ;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	private String source = null ;
	private String target = null ;


	public TestCaseGenWizard()
	{
		super() ;
		setNeedsProgressMonitor(true);
	}
	@Override
	public void addPages() {
		one = new PageOne();
		two = new PageTwo() ;
		three = new PageThree() ;
		addPage(one);
		addPage(two);
		addPage(three) ;
	}
	
	@Override
	public boolean performFinish() {
		try {
			maxLoopCount = Integer.parseInt( one.getMaxLoopCountText() ) ;
			maxStepCount = Integer.parseInt( two.getMaxStepCountText() ) ;	
			Configuration.setMaxLoopCount(maxLoopCount);
			Configuration.setMaxStepCount(maxStepCount);
			
		} catch (Exception e) {
			e.printStackTrace() ;
		}
		
		GenerationTestCaseAlgorithm.genAlgorithm(
				source, 
				target, 
				Configuration.getMaxLoopCount() ,
				Configuration.getMaxStepCount() ,
				Configuration.getGenFrom() ,
				Configuration.getGenTo() ,
				Configuration.getGenScope() );
		
		return true;
	}
	
	public class PageOne extends WizardPage 
	{

		
		private Text maxLoopCountText ;
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
		
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NULL);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 2;
			Label label1 = new Label(container, SWT.NULL);
			label1.setText("max cycle count");

			maxLoopCountText = new Text(container, SWT.BORDER | SWT.SINGLE);
			// set default value
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
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			maxLoopCountText.setLayoutData(gd);
			// Required to avoid an error in the system
			setControl(container);
			setPageComplete(true);
		}
	}

	public class PageTwo extends WizardPage 
	{
		private Text maxStepCountText ;
		private Composite container;
		
		public PageTwo() 
		{
			super("MaxStepCount") ;
			setTitle("Set max step count");
			setDescription("Set max step count.") ;
		}
		
		public String getMaxStepCountText() {
			return maxStepCountText.getText();
		}
		
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NULL);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 2;
			Label label1 = new Label(container, SWT.NULL);
			label1.setText("max step count");

			maxStepCountText = new Text(container, SWT.BORDER | SWT.SINGLE);
			// set default value
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
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			maxStepCountText.setLayoutData(gd);
			
			//Label labelCheck = new Label(container, SWT.NONE);
			//labelCheck.setText("This is a check");
			//Button check = new Button(container, SWT.CHECK);
			//check.setSelection(true);
			// Required to avoid an error in the system
			
			setControl(container);
			setPageComplete(true);
		}
	}
	
	public class PageThree extends WizardPage 
	{
		private Text genFromText ;
		private Text genToText ;
		private List genScopeList ;
		private Composite container;
		
		public PageThree() 
		{
			super("view") ;
			setTitle("view scope...");
			setDescription("view start, end and scope of test case.") ;
		}
		
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NULL);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 2;
			{{
				Label label1 = new Label(container, SWT.NULL);
				label1.setText("start from:");

				genFromText = new Text(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY );
				genFromText.setText( (genFrom == null ) ? "" : genFrom );
				
				GridData gd = new GridData(GridData.FILL_HORIZONTAL);
				genFromText.setLayoutData(gd);
			}}
			{{
				Label label2 = new Label( container, SWT.NULL ) ;
				label2.setText("end to: ");
				
				genToText = new Text(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY );
				genToText.setText( (genTo == null ) ? "" : genTo );
				
				GridData gd = new GridData(GridData.FILL_HORIZONTAL);
				genToText.setLayoutData(gd);
			}}
			{{
				Label label3 = new Label( container, SWT.NULL ) ;
				label3.setText("scope: ");
				
				genScopeList = new List(container, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.V_SCROLL) ;
				if( genScope != null )
				{
					for( String scopeItem : genScope ) 
					{
						genScopeList.add( scopeItem==null ? "<no name>" : scopeItem );
					}
				}
				GridData gd = new GridData(GridData.FILL_HORIZONTAL);
				gd.heightHint = 200 ;
				
				genScopeList.setLayoutData(gd);
				//genScopeList.setBounds(0, 0, 100, 100) ;
				genScopeList.pack() ;
				
			}}
			
			setControl(container);
			container.pack();
			setPageComplete(true);
		}
	}
}
