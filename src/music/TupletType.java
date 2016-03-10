package music;

public enum TupletType {
	/**
	 *  the three types of tuplet
	 */
		DUPLET,
		TRIPLET,
		QUADRUPLET;
	
	 /**
     * @return a string representation of the tuplet
     */
    @Override
    public String toString(){
	        switch(this){
	        case DUPLET:
	            return "(2";
	        case TRIPLET:
	            return "(3";
	        case QUADRUPLET:
	            return "(4";
	        default:
	            return "X";
	        }
    	}
    
    /**
     * 
     * @return the size of the tuplet 
     */
    public int size(){
    	 switch(this){
	        case DUPLET:
	            return 2;
	        case TRIPLET:
	            return 3;
	        case QUADRUPLET:
	            return 4;
	        default:
	            return 0;
	        }
    }
    }
