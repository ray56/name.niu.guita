package name.niu.guitar.uisut.tcgen;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.UITransition;

public class CycleIterator {
	private Cycle mCycle ;
	private int mBeginEdgeIndex ;
	private int mCurEdgeIndex ;
	
	public CycleIterator( Cycle cycle , UITransition begin ) {
		this.mCycle = cycle ;
		int i ;
		for ( i = 0 ; i < cycle.getEdgeSize() ; i ++ ) {
			if( cycle.getEdge(i).equals(begin) )
				break ;
		}
		if ( i >= cycle.getEdgeSize() ) {
			throw new RuntimeException("Wrong") ;
		} else {
			mBeginEdgeIndex = i ;
			mCurEdgeIndex = i ;
		}		
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer() ;
		sb.append( this.mCycle.toString() ).append(" : ");
		int vSize ;
		if ( mBeginEdgeIndex <= mCurEdgeIndex ){
			vSize = mCurEdgeIndex - mBeginEdgeIndex + 1;
		} else {
			vSize = mCurEdgeIndex + mCycle.getEdgeSize() - mBeginEdgeIndex + 1 ;
		}
		for ( int i = 0 ; i < vSize ; i ++ ){
			sb.append( mCycle.getEdge( ( mBeginEdgeIndex + i ) % mCycle.getEdgeSize() ).getName() );
			if( i < mCycle.getEdgeSize() - 1 ) {
				sb.append("->");
			}
		}
		return sb.toString();
	}
	
	public AbstractUIState getBeginNode() {
		return mCycle.getEdge(mBeginEdgeIndex).getItsExpandedSrcState() ;
	}
	
	public UITransition getBeginEdge() {
		return mCycle.getEdge(mBeginEdgeIndex) ;
	}
	
	public AbstractUIState getEndNode() {
		int endEdgeIndex = ( mBeginEdgeIndex - 1 + mCycle.getEdgeSize() ) % mCycle.getEdgeSize() ;
		return mCycle.getEdge( endEdgeIndex ).getItsExpandedTarState() ;
	}
	
	public UITransition getEndEdge() {
		int endEdgeIndex = ( mBeginEdgeIndex - 1  + mCycle.getEdgeSize() ) % mCycle.getEdgeSize() ;
		return mCycle.getEdge( endEdgeIndex ) ;
	}
	
	public UITransition getCurEdge() {
		return mCycle.getEdge( mCurEdgeIndex ) ;
	}
	
	public boolean isAtBegin() {
		return mBeginEdgeIndex == mCurEdgeIndex ;
	}
	
	public boolean isAtEnd() {
		return ( mBeginEdgeIndex - 1 + mCycle.getEdgeSize() ) % mCycle.getEdgeSize() == mCurEdgeIndex ;
	}
	
	public boolean moveForward() {
		if ( ! isAtEnd() ) {
			mCurEdgeIndex = ( mCurEdgeIndex + 1 ) % mCycle.getEdgeSize() ;
			return true ;
		} 
		return false ;
	}
	
	public boolean moveBackward() {
		if ( ! isAtBegin() ) {
			mCurEdgeIndex = ( mCurEdgeIndex - 1 + mCycle.getEdgeSize() ) % mCycle.getEdgeSize() ;
			return true ;
		}
		return false ;
	}
}
