package music;

import java.util.HashMap;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;


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
		private final HashMap<Integer, Voice> voices;
		private final int TickTime;
		/**
		 * Generate a new Song Object
		 * @param header which contains field info such as index, composer, etc.
		 * @param body refers to the Body datatype containing list of Voice
		 */
		
		public Song(Header header, HashMap<Integer, Voice> voices,int TickTIme) {
			this.header = header;
			this.voices = voices;
			this.TickTime = TickTIme;
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
		 * @return Hashmap of voices
		 */
		public HashMap<Integer, Voice> getVoices(){
			return voices;
		}
		
		public int getTickTime(){
			return TickTime;
		}
		
		/**
		 * method for visitor to process Song
		 * @return 
		 */
		@Override
		public void accept(Visitor s) {
			s.visit(voices.get(1));
		}
		
		
		
		/**
		 * @return string representation of the Song
		 */
		@Override 
		public String toString(){
			return header.toString()+"\n"+voices.toString();
		}
		
		
}
