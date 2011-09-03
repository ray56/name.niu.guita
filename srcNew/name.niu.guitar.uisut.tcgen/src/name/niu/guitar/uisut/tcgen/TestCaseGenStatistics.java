package name.niu.guitar.uisut.tcgen;

import java.util.HashMap;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.FinalState;
import name.niu.guitar.uisut.InitialState;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UITransition;

public class TestCaseGenStatistics {
	public TestCaseGenStatistics(UIStatemachine statemachine, int maxStep,
			int maxLoop, AbstractUIState startVertex, AbstractUIState endVertex) {
		super();
		this.statemachine = statemachine;
		this.maxStep = maxStep;
		this.maxLoop = maxLoop;
		this.startVertex = startVertex;
		if( this.startVertex == null ) {
			for( AbstractUIState s : statemachine.getItsExpandedUIState()) {
				if ( s instanceof InitialState ) {
					this.startVertex = s ;
					break ;
				}
			}
		}
		if ( this.startVertex == null ) {
			this.startVertex = statemachine.getItsExpandedUIState().get(0) ;
		}
		this.endVertex = endVertex;
		if( this.endVertex == null ) {
			for( AbstractUIState s : statemachine.getItsExpandedUIState()) {
				if ( s instanceof FinalState ) {
					this.endVertex = s ;
					break ;
				}
			}
		}
		if ( this.endVertex == null ) {
			this.endVertex = statemachine.getItsExpandedUIState().get(0) ;
		}
		
		initialize() ;
		
	}

	private void initialize() {
		vertexArray = statemachine.getItsExpandedUIState().toArray(new AbstractUIState[0]);
		vertexCount = vertexArray.length ;
		
		transitionArray = statemachine.getItsExpandedUITransition().toArray( new UITransition[0] ) ;
		transitionCount = transitionArray.length ;
		
		coverageRateSimpleCycle = 0 ;
		coverageRateTransition = 0 ;
		coverageRateVertex = 0 ;
		
		this.genStart = 0 ;
		this.genEnd = 0 ;
		
		this.genDuration = 0 ;
		this.genPathCount = 0 ;
		
		this.simpleCycleCoverageCount = new HashMap<Cycle,Integer>() ;
		this.transitionCoverageCount = new HashMap<UITransition,Integer>() ;
		this.vertexCoverageCount = new HashMap<AbstractUIState,Integer>() ;

	}
	
	
	public int getVertexCount() {
		return vertexCount ;
	}
	
	public int getTransitionCount() {
		return transitionCount ;
	}
	
	public int getSimpleCycleCount() {
		return simpleCycleCount ;
	}
	
	public void setSimpleCount( Cycle[] cycles ) {
		simpleCycleArray = cycles.clone() ;
		simpleCycleCount = simpleCycleArray.length ;
	}
	
	private UIStatemachine statemachine ;
	private int maxStep ;
	private int maxLoop ;
	private AbstractUIState startVertex ;
	private AbstractUIState endVertex ;
	

	private int vertexCount ;
	private AbstractUIState[] vertexArray ;
	private HashMap<AbstractUIState, Integer> vertexCoverageCount ;
	
	private int transitionCount ;
	private UITransition[] transitionArray ;
	private HashMap<UITransition, Integer> transitionCoverageCount ;
	
	private int simpleCycleCount ;
	private Cycle[] simpleCycleArray ;
	private HashMap<Cycle, Integer> simpleCycleCoverageCount ;
	
	private float coverageRateTransition ;
	
	private float coverageRateVertex ;
	
	private float coverageRateSimpleCycle ;
	
	
	
	
	/**
	 * 
	 */
	private float genPathCount ;
	/**
	 * M seconds
	 */
	private float genDuration ;
	private long genStart ;
	private long genEnd ;
	/**
	 * N seconds per 1000 test cases
	 */
	private float genVelocity ;
	
	public void setStart(long milliseconds) {
		genStart = milliseconds ;		
	}
	public void setEnd(long milliseconds) {
		genEnd = milliseconds ;	
		genDuration = genEnd - genStart ;
		if ( genPathCount != 0 ){
			genVelocity = genDuration / genPathCount / 1000 ;
		} else {
			genVelocity = -1 ;
		}
		
		// simple cycle coverage
		int cycleCoveragedCount = 0 ;
		for ( Cycle c : simpleCycleArray ){
			if ( simpleCycleCoverageCount.get(c) != null && 
					simpleCycleCoverageCount.get(c) >= 1 ) {
				cycleCoveragedCount ++ ;
			}
		}
		if ( simpleCycleCount != 0 ){
			coverageRateSimpleCycle = cycleCoveragedCount / simpleCycleCount ;
		} else {
			coverageRateSimpleCycle =  1 ;
		}
		
		// vertex coverage
		int vertexCoveragedCount = 0 ;
		for ( AbstractUIState v : vertexArray ){
			if( vertexCoverageCount.get(v) != null &&
					vertexCoverageCount.get(v) >= 1 ) {
				vertexCoveragedCount ++ ;
			}
		}
		if( vertexCount!= 0 )
			coverageRateVertex = vertexCoveragedCount / vertexCount ;
		
		// transition coverage
		int transitionCoveragedCount = 0 ;
		for ( UITransition t : transitionArray ){
			if( transitionCoverageCount.get(t) != null &&
					transitionCoverageCount.get(t) >= 1 ) {
				transitionCoveragedCount ++ ;
			}
		}
		if( transitionCount!= 0 )
			coverageRateTransition = transitionCoveragedCount /transitionCount ;	
		
	}
	
	public void countCompletedPath( PathCycleDynamicCalcutor calcutor ) {
		Path path = calcutor.getPath() ;
		// count path vertex
		AbstractUIState[] vertexSeq = path.getVertexSeq() ;
		for( AbstractUIState v : vertexSeq ) {
			Integer lastCount = vertexCoverageCount.get(v) ;
			if( lastCount == null )
				lastCount = 0 ;
			this.vertexCoverageCount.put(v, lastCount + 1 ) ;
		}
		// count path transition
		UITransition[] transitionSeq = path.getTransitionSeq() ;
		for( UITransition t : transitionSeq ) {
			Integer lastCount = transitionCoverageCount.get(t) ;
			if( lastCount == null )
				lastCount = 0 ;
			this.transitionCoverageCount.put(t, lastCount + 1 ) ;
		}
		// count simple cycle
		for ( Cycle c : calcutor.getSimpleCycleSeq() ) {
			Integer lastCount = simpleCycleCoverageCount.get(c) ;
			if ( lastCount == null )
				lastCount = 0 ;
			this.simpleCycleCoverageCount.put(c, lastCount + calcutor.getSimpleCycleCount(c) ) ;
		}
		// 
		genPathCount ++ ;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer() ;
		sb.append( String.format("Statemachine:%s\r\n", statemachine.getName() ) );
		sb.append( String.format("From:%s\r\n", startVertex.getName() )) ;
		sb.append( String.format("To:%s\r\n", endVertex.getName() )) ;
		sb.append( String.format("MaxStep:%s\r\n", maxStep )) ;
		sb.append( String.format("MaxLoop:%s\r\n", maxLoop )) ;
		sb.append( String.format("Time Cost: %s (from %s ms to %s ms) \r\n", genDuration, genStart, genEnd )) ;
		sb.append( String.format("Test Case Count: %s \r\n", genPathCount )) ;
		
		
		sb.append( String.format("Vertex Count:%s\r\n", vertexCount )) ;
		sb.append( String.format("Vertex Coverage Rate:%s\r\n", coverageRateVertex )) ;
		for( AbstractUIState v : vertexArray ){
			sb.append( String.format("\t Vertex %s occurs %s times\r\n", 
					v.getName(), vertexCoverageCount.get(v) )) ;
		}
		
		sb.append( String.format("Transition Count:%s\r\n", transitionCount )) ;
		sb.append( String.format("Transition Coverage Rate:%s\r\n", coverageRateTransition )) ;
		for( UITransition t : transitionArray ){
			sb.append( String.format("\t Transition %s occurs %s times\r\n", 
					t.getName(), transitionCoverageCount.get(t) )) ;
		}	
		
		sb.append( String.format("Simple Cycle Count:%s\r\n", simpleCycleCount )) ;
		sb.append( String.format("Simple Cycle Coverage Rate:%s\r\n", coverageRateSimpleCycle )) ;
		for( Cycle c : simpleCycleArray ){
			sb.append( String.format("\t Simple Cycle [%s] occurs %s times\r\n", 
					c.toString(), simpleCycleCoverageCount.get(c) )) ;
		}
		
		
		return sb.toString() ;
	}

}
