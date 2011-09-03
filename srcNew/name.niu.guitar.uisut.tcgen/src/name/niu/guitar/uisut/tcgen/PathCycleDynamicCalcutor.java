package name.niu.guitar.uisut.tcgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.InitialState;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UITransition;



public class PathCycleDynamicCalcutor {
	public static class Pair<FIRST, SECOND> {
		public FIRST first ;
		public SECOND second ;
	}
	private UIStatemachine mStatemachine = null;
	private AbstractUIState mStartingState = null ;
	private Path mPath = null ;
	private HashMap<Cycle, Cycle> mCycles = new HashMap<Cycle, Cycle>();
	//private HashMap<AbstractUIState, Cycle> mVertex2Cycle = new HashMap<AbstractUIState, Cycle>();
	private HashMap< Cycle , ArrayList< Pair<CycleIterator, Integer> > > mCycleCoverage 
		= new HashMap<Cycle, ArrayList< Pair<CycleIterator, Integer> > > ();
	private Integer maxCycleCount = null ;
	private HashMap< Cycle, Integer> mCycleCounter = new HashMap<Cycle,Integer>() ;
	
	public PathCycleDynamicCalcutor(UIStatemachine stm , AbstractUIState start) {
		mStatemachine = stm ;
		mStartingState = start ;
		if( mStartingState == null ) {
			for( AbstractUIState s : mStatemachine.getItsExpandedUIState()) {
				if ( s instanceof InitialState ) {
					mStartingState = s ;
					break ;
				}
			}
		}
		if ( mStartingState == null ) {
			mStartingState = mStatemachine.getItsExpandedUIState().get(0) ;
		}
		mPath = new Path(new UITransition[0]) ;
	}

	public void initialize() {
		Stack<List<UITransition>> vExpandedPaths = new Stack<List<UITransition>>();
		// initial the stack
		for( UITransition t : mStartingState.getItsExpandedOutTransition() ) {
			LinkedList<UITransition> tranSeq = new LinkedList<UITransition>() ;
			tranSeq.add(t);
			if (t.getItsExpandedSrcState().equals(t.getItsExpandedTarState())){
				Cycle cycle = new Cycle( tranSeq.toArray(new UITransition[0])) ;
				// add the cycle
				this.mCycles.put(cycle, cycle) ;
			} else {
				vExpandedPaths.add(tranSeq) ;
					
			}
		}
		// handle the stack
		while( ! vExpandedPaths.isEmpty() ) {
			List<UITransition> tranSeq = vExpandedPaths.pop();
			AbstractUIState lastVertex = tranSeq.get(tranSeq.size()-1).getItsExpandedTarState() ;
			// tranSeq + lastVergtex.outTransition
			for( UITransition tran2add : lastVertex.getItsExpandedOutTransition()) {
				Cycle cycle ;
				
				if( tran2add.getItsExpandedSrcState().equals( tran2add.getItsExpandedTarState() )) {
					UITransition[] list = {tran2add};
					cycle = new Cycle( list );
					this.mCycles.put(cycle , cycle );
				} else {
					boolean fFindSame = false ;					
					for( int i = 0 ; i < tranSeq.size() ; i ++ ){
						UITransition tt = tranSeq.get(i);
						if ( tran2add.getItsExpandedTarState().equals( tt.getItsExpandedSrcState())) {
							fFindSame = true ;
							List<UITransition> list = tranSeq.subList(i, tranSeq.size());
							list.add(tran2add);
							cycle = new Cycle( list.toArray(new UITransition[0]) ) ;
							this.mCycles.put(cycle, cycle);
							break ;
						}
					}
					if(!fFindSame ){
						LinkedList<UITransition> tranSeq2 = new LinkedList<UITransition>(tranSeq) ;
						tranSeq2.add(tran2add);
						vExpandedPaths.push(tranSeq2);
					}					
				}
			}
		}		
	}
	
	public int getMaxCycleCounter( ){
		if (maxCycleCount == null ) {
			Integer max = 0 ;
			for( Integer counter : this.mCycleCounter.values()) {
				if( counter > max ) 
					max = counter ;
			}
			maxCycleCount = max ;
		}
		return maxCycleCount ;
	}
	
	public int getSimpleCycleCount( Cycle cycle ){
		Integer result = null ;
		if ( mCycleCounter != null ) {
			result = mCycleCounter.get( cycle ) ;
		}
		if ( result == null)
			return 0 ;
		else
			return result ;
	}
	
	public Cycle[] getSimpleCycleSeq() {
		if ( mCycles != null && mCycles.size() != 0 ) {
			return this.mCycles.keySet().toArray( new Cycle[0]) ;	
		}
		return new Cycle[0] ;
	}
	
	public void addPathHead( UITransition transition ) {
		this.mPath.addHead(transition);	
		for ( Cycle c  : mCycles.values() ){
			ArrayList<Pair<CycleIterator,Integer>> cycleList = mCycleCoverage.get(c) ;
			if ( cycleList == null ) {
				cycleList = new ArrayList<Pair<CycleIterator,Integer>> () ;
				mCycleCoverage.put(c, cycleList ) ;
			} 
			// forwared existed in-build cycle
			if ( cycleList.size() != 0 ) {
				Pair<CycleIterator,Integer> pair = cycleList.get(cycleList.size() - 1 ) ;
				if( mPath.getEdgeSize() - 1 - 1 < pair.second + c.getEdgeSize() - 1 ){
					// last path head not greater than cycleIterator's tail
					// the newly added transition may be part of the in-build cycle
					pair.first.moveForward() ;
					if ( pair.first.getCurEdge().equals( transition ) ) {
						if( pair.first.isAtEnd() ) {
							this.mCycleCounter.put(c, cycleList.size());
							if( maxCycleCount != null && maxCycleCount < cycleList.size() )
								maxCycleCount = cycleList.size() ;
						}
					} else {
						cycleList.remove( cycleList.size() - 1 ) ;
					}
				} 
			}
			// create new in-build cycle
			Pair<CycleIterator,Integer> lastPair = null ;
			if ( cycleList.size() != 0 )
				lastPair = cycleList.get(cycleList.size() - 1 ) ;
			if ( lastPair != null &&
				// current path head not greater than cycleIterator's tail
				 ( mPath.getEdgeSize() - 1 <= lastPair.second + c.getEdgeSize() - 1 ) ) {
				continue ;
			} else {
				CycleIterator newIt = c.getIterator(transition) ;
				if( newIt != null) {
					Pair<CycleIterator,Integer> newPair = new Pair<CycleIterator,Integer > () ;
					newPair.first = newIt ;
					newPair.second = mPath.getEdgeSize() - 1;
					cycleList.add( newPair ) ;
					if( newPair.first.isAtEnd() ) {
						this.mCycleCounter.put(c, cycleList.size());
						if( maxCycleCount != null && maxCycleCount < cycleList.size() )
							maxCycleCount = cycleList.size() ;
					}
				}
			}			
		}
	}
	
	public void rollbackPathHead() {
		this.mPath.rollbackHead() ;
		for ( Cycle c  : mCycles.values() ){
			ArrayList<Pair<CycleIterator,Integer>> cycleList = mCycleCoverage.get(c) ;
			if ( cycleList != null && cycleList.size() != 0) {
				Pair<CycleIterator,Integer> lastPair = cycleList.get(cycleList.size() - 1 ) ;
				if ( mPath.getEdgeSize() - 1 + 1 <= lastPair.second  ) {
					cycleList.remove(cycleList.size() - 1 ) ;
					this.mCycleCounter.put(c, cycleList.size());
					// if maxCycleCount == null, then the expression cycleList.size() + 1 == maxCycleCount will throw
					if( maxCycleCount != null && cycleList.size() + 1 == maxCycleCount ) {
						maxCycleCount = null ;
					}
				} else if ( mPath.getEdgeSize() - 1 + 1 <= lastPair.second + c.getEdgeSize() - 1 ) {
					lastPair.first.moveBackward() ;					
				}
			}
			
			// the current path head move to a non-cycle-edge, should try to construct a in-build cycle edge.
			Pair<CycleIterator,Integer> lastPair = null ;
			if ( cycleList != null && cycleList.size() != 0 ) {
				lastPair = cycleList.get( cycleList.size() - 1 ) ;
			}
			if( lastPair == null ||
					lastPair.second + c.getEdgeSize() - 1 < mPath.getEdgeSize() - 1 ){
				int newInBuildAreaStart ;
				if( lastPair == null )
					newInBuildAreaStart = 0 ;
				else 
					newInBuildAreaStart = lastPair.second + c.getEdgeSize() ;
				Path tempPath = mPath.clone() ;
				CycleIterator newIt = null ;
				int inBuildSize = 0 ;
				while ( c.getIterator( tempPath.getHead() ) != null &&
						tempPath.getEdgeSize() - 1 >= newInBuildAreaStart) {
					newIt = c.getIterator( tempPath.getHead() );
					inBuildSize ++ ;
					tempPath.rollbackHead() ;
				}				
				if( newIt != null) {
					for( int i = 0 ; i < inBuildSize - 1 ; i ++ ){
						newIt.moveForward() ;	
					}	
					Pair<CycleIterator,Integer> newPair = new Pair<CycleIterator,Integer > () ;
					newPair.first = newIt ;
					newPair.second = mPath.getEdgeSize() - inBuildSize;
					cycleList.add( newPair ) ;
					if( newPair.first.isAtEnd() ) {
						assert(false):"error" ;
					}
				}	
				
			}
		}
	}
	
	public Path getPath() {
		return mPath ;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer() ;
		sb.append("\r\n©³©¥©¥PathCycleDynamicCalcutor©¥©¥©¥©·\r\n");
		sb.append("max cycle count:").append( getMaxCycleCounter() ).append("\r\n");
		for(Cycle c : mCycles.values() ) {
			sb.append( c.toString() ).append(", ") ;
		}
		sb.append("\r\n");
		sb.append("©Ç©¥©¥©¥©¥©¥©Ï\r\n");
		sb.append( mPath.toString() ).append("\r\n") ;
		sb.append("©Ç©¥©¥©¥©¥©¥©Ï\r\n");
		for(Cycle c : mCycles.values() ) {
			ArrayList<Pair<CycleIterator,Integer>> cycleList = mCycleCoverage.get(c) ;
			if( cycleList == null )
				continue ;
			sb.append("\t©Ç©¥©¥©¥©¥©¥©Ï\r\n");
			sb.append("\t").append(c.toString()).append(" count:").append(mCycleCounter.get(c)).append("\r\n") ;
			for( Pair<CycleIterator,Integer> pair : cycleList ) {
				sb.append("\t").append(pair.first.toString()).append(",").append(pair.second).append("\r\n");
			}
		}
		sb.append("©»©¥©¥©¥©¥©¥©¿\r\n");
		return sb.toString() ;
		
	}
}
