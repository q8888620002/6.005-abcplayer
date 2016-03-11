package music;

public interface Music {
		
		public Duration getDuration();
		/**
		 * 
		 * @param denominator
		 * @return 
		 */
		public Music changeDuration(int denominator);
}
