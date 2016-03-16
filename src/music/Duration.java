package music;
/*
 * this represent the Duration or Fractional mathematics in the song object   
 */
public class Duration {
		private final int numerator;
		private final int denominator;
		
	/**
	 * Create a fractional Duration object 
	 * @param an integer numerator
	 * @param an non-zero integer denominator 
	 * 
	 */
		public Duration(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
			checkRep();
		}
		
		/**
		 * Create a integer Duration  
		 * @param an integer numerator
		 * @param an non-zero integer denominator 
		 * 
		 */
			public Duration(int numerator) {
				this.numerator = numerator;
				this.denominator = 1;
				checkRep();
			}
		
		
		/*
		 * check the rep invariant of Duration
		 * numerator, denominator > 0 
		 */
		
		private void checkRep() {
		try {
			assert false;
		} catch (AssertionError e) {
			assert numerator > 0 && denominator > 0
			: "numerator and denominator should be greater than 0";
		}
			 
	}


		/**
		 * @return the numerator 
		 */
		public int getNumerator(){
			return numerator;
		}
		
		/**
		 * @return denominator
		 */
		public int getDenominator() {
			return denominator;
		}
		
		/**
		 * @param a positive integer denominator from another Duration(fraction).
		 * @return a new Duration that has the same value but 
		 * 		shares a common denominator with another Duration(fraction) denominator.
		 * 
		 */
		public Duration getLCD(int other_deminator){
			if(other_deminator<=0){
				throw new IllegalArgumentException("denominator should be greater than 0");
			}
			
			int min,max;
			if(denominator < other_deminator){
				min = denominator;
				max = other_deminator;
			}else{
				max = denominator;
				min = other_deminator;
			}
			for(int i=1;i <= min ; i++){
				if(((max*i)% min)==0){
					int NewNumerator = ((max*i)/denominator)*numerator;
					int NewDenominator = max*i;
					return new Duration(NewNumerator/other_deminator,NewDenominator );
				}
			}
			return null;
		}
		
		
		/**
		 *  @return representation of the Duration(fraction) value
		 */
		public String toString() {
			return numerator+"/"+denominator;
		}
		
		/**
		 * 
		 */
		public Boolean equals(Duration otherDura){
			if((denominator== otherDura.getDenominator())&(numerator==otherDura.getNumerator())){
				return true;
			}else{
				return false;
			}
		}
}
