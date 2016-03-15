package music;

import java.util.ArrayList;
import java.util.List;

import sound.SequencePlayer;

/*
 *  A Measure is composed a group of music elements such as Notes, Chords, Tuplet.
 *  Sometimes also referred to as a bar.
 *   	Rep invariant:
 *   		Measure is immutable.
 *   		music is final. 
 */			
public class Measure implements Sequence{
		private final List<Music> music;
		
		/**
		 * Construct a Measure object	 
		 */
		public Measure(List<Music> musics) {
				this.music = musics;		
		}
		
		/**
		 * Construct a Measure object with an empty music list 	 
		 */
		public Measure() {
				this.music = new ArrayList<Music>();		
		}
		
		/**
		 * Getter method of the measure elements 
		 * @return a List of music elements 
		 */
		public List<Music> getMeasures(){
			return music;
		}
		
		
		@Override
		public SequencePlayer accept(Visitor s) {
			s.visit(this);
			return null;
		}
		
		/**
		 * @return a string representation of measure
		 */
		public String toString(){
			StringBuilder s = new StringBuilder();
			for(Music m: music){
				s.append(m.toString()).append(" ");
			}
			s.append("|");
			return s.toString();
		}
		
}
