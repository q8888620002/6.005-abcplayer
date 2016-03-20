package music;

import java.util.HashMap;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.SequencePlayer;


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
		private SequencePlayer player;
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
		/**
		 *  Getter of the TickTime per Quarter of a Song
		 * @return Ticktime
		 */
		public int getTickTime(){
			return TickTime;
		}
		
		/**
		 * Construct a player with the tempo and tick time a quarter provided by the Song
		 * @return  player that can plays the music
		 * @throws MidiUnavailableException
		 * @throws InvalidMidiDataException
		 */
		public SequencePlayer player() throws MidiUnavailableException, InvalidMidiDataException{
			player = new SequencePlayer(header.getTempo(), TickTime);
			return player;
		}
		
		/**
		 * @return string representation of the Song
		 */
		@Override 
		public String toString(){
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(header.toString());
			for(int i=1;i< voices.size()+1;i++){
				stringBuilder.append("V:"+i);
				stringBuilder.append(voices.get(i).toString());
			}
			return stringBuilder.toString();
		}
		
		/**
		 * Visitor method for visitor to process a Song
		 */
		@Override
		public void accept(Visitor s) {
			// TODO Auto-generated method stub
			s.visit(this);
		}
		
		
}
