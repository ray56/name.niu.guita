package name.niu.guitar.uisut.tcgen;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.UITransition;

public class Path {

	private ArrayList<UITransition> mTransitionSeq = null ;

	public Path(UITransition[] transitionSeq) {
		super();
		this.mTransitionSeq = new ArrayList<UITransition> () ;
		for ( UITransition t : transitionSeq) {
			this.mTransitionSeq.add(t);
		}
	}
	public Path clone() {
		Path p = new Path ( this.mTransitionSeq.toArray( new UITransition[0]));
		return p ;
	}
	
	public UITransition getHead() {
		if ( mTransitionSeq != null && mTransitionSeq.size() != 0 ) {
			return mTransitionSeq.get(mTransitionSeq.size() - 1);
		}
		return null ;
	}
	
	public UITransition getEdge(int index) {
		if ( mTransitionSeq != null && mTransitionSeq.size() < index) {
			return mTransitionSeq.get(index);
		}
		return null ;
	}
	
	public AbstractUIState[] getVertexSeq(){
		ArrayList<AbstractUIState> result = new ArrayList<AbstractUIState> () ;
		if ( mTransitionSeq != null ){
			result.add( mTransitionSeq.get(0).getItsExpandedSrcState() ) ;
			for( UITransition t : mTransitionSeq ) {
				result.add( t.getItsExpandedTarState() ) ;
			}			
		}
		return result.toArray( new AbstractUIState[0]) ;
	}
	
	public UITransition[] getTransitionSeq() {
		if ( mTransitionSeq != null ){
			return mTransitionSeq.toArray(new UITransition[0]) ;
		}
		return null ;
		
	}
	
	public void addHead(UITransition transition) {
		this.mTransitionSeq.add(transition) ;		
	}
	
	public void rollbackHead(){
		this.mTransitionSeq.remove(mTransitionSeq.size() - 1 ) ;
	}
	
	public boolean isSubPathOf( Cycle cycle) {
		UITransition firstT = this.mTransitionSeq.get(0) ;
		if ( mTransitionSeq != null && mTransitionSeq.size() < cycle.getEdgeSize() ) {
			
		}
		return false ;
	}
	
	@Override
	public boolean equals(Object p) {
		if (p instanceof Path) {
			Path path = (Path)p ;
			if (path.mTransitionSeq.size() != this.mTransitionSeq.size())
				return false;
			for (int i = 0; i < this.mTransitionSeq.size(); i++) {
				if (!this.mTransitionSeq.get(i).equals(path.mTransitionSeq.get(i)))
					return false;
			}
			return true;
		}
		return false;

	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer() ;
		for( UITransition t : mTransitionSeq) {
			sb.append( t.getName() ).append( "->") ;
		}
		if( sb.length() == 0 ) {
			return "empty path" ;
		}
		return sb.substring(0, sb.length()  - "->".length() ) ;	
	}
	
	public int getEdgeSize() {
		return mTransitionSeq.size() ;
	}
}
