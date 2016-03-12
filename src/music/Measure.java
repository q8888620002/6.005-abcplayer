package music;

import java.util.List;

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
		 * Getter method of the measure elements 
		 * @return a List of music elements 
		 */
		public List<Music> getMeasures(){
			return music;
		}
		
		
		@Override
		public void accept(Visitor s) {
			s.visit(this);
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
