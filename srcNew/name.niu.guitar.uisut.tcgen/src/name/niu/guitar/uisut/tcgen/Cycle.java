package name.niu.guitar.uisut.tcgen;

import java.util.ArrayList;

import name.niu.guitar.uisut.UITransition;

public class Cycle {
	private UITransition[] mTransitionSeq ;

	public Cycle(UITransition[] mTransitionSeq) {
		super();
		this.mTransitionSeq = mTransitionSeq;
	}
	
	@Override
	public int hashCode() {
		int ret = 1 ;
		for(UITransition t : mTransitionSeq ){
			ret = ret * t.hashCode() ;
		}
		return ret;		
	}
	
	@Override
	public boolean equals( Object cycle ) {
		if( cycle != null && cycle instanceof Cycle ) {
			Cycle operand2 = (Cycle) cycle ;
			Cycle operand1 = this ;
			if( operand1.mTransitionSeq.length == operand2.mTransitionSeq.length ){
				UITransition t = operand1.getEdge(0) ;
				int i ;
				for( i = 0 ; i < operand2.mTransitionSeq.length 
					&& ! operand2.getEdge(i).equals(t); i ++) {
				} ;
				if ( i < operand2.mTransitionSeq.length ){
					int j ;
					for ( j = 0 ; j < operand2.mTransitionSeq.length 
						&& ! operand1.getEdge(j).equals( operand2.getEdge( (j+i )% operand2.mTransitionSeq.length ) ); j ++ ) {				
					}
					if ( j >=operand2.mTransitionSeq.length ){
						return true ;
					} 
				}
			}
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
			return "empty cycle" ;
		}
		return sb.substring(0, sb.length() - "->".length() ) ;	
	}
	
	public UITransition getEdge( int index ){
		if( mTransitionSeq!= null ) {
			return mTransitionSeq[index];
		}
		return null ;
	}
	
	public int getEdgeSize() {
		return mTransitionSeq.length ;
	}
	
	public Path toPath(UITransition startingEdge ){
		for( int i = 0 ; i < mTransitionSeq.length ; i ++ ) {
			if ( mTransitionSeq[i].equals(startingEdge) ) {
				ArrayList<UITransition> ts = new ArrayList<UITransition>();
				for ( int j = 0 ; j < i ; j ++ ) {
					ts.add(ts.remove(0));
				}
				
				Path p = new Path((UITransition[]) ts.toArray());
				return p ;
			}
		}
		return null;
	}
	
	/**
	 * @param begin
	 * @return null if the begin is not in the cycle
	 */
	CycleIterator getIterator( UITransition begin) {
		CycleIterator it = null ;
		try {
			it = new CycleIterator(this, begin) ;
		}catch (RuntimeException e){
			
		}
		return it ;
	}
}
