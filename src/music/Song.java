package music;

import java.util.List;

/*
 * this is the immutable, a top class that represents an ABC music
 * also an output of a Tree Visitor & an input of ToPitch Visitor.
 *  It is consist of header and body.    
 *  	Rep invariant:
 *  		Song is immutable.
 *    		header is final.
 *    		voices is final as well.
 */


public class Song implements Sequence{
	
		private final Header header;
		private final List<Voice> voices;
		
		/**
		 * Generate a new Song Object
		 * @param header which contains field info such as index, composer, etc.
		 * @param body refers to the Body datatype containing list of Voice
		 */
		
		public Song(Header header, List<Voice> voices) {
			this.header = header;
			this.voices = voices;
		}
		
		/**
		 * Getter method of header of the song object
		 * @return header of the song object
		 */
		
		public Header getHeader() {
			return header;
		}
		
		/**
		 * Getter method of the voices in the music
		 * @return list of voices
		 */
		public List<Voice> getVoices(){
			return voices;
		}
		
		/**
		 * method for visitor to process Song
		 */
		@Override
		public void accept(Visitor s) {
			s.visit(header);
		}
	
		/**
		 * @return string representation of the Song
		 */
		@Override 
		public String toString(){
			return header.toString()+"\n"+voices.toString();
		}
		
		
}
