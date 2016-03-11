package music;

import java.util.List;

/*
 *  A Measure represents a group of music elements(Notes, Chords, Tuplet)
 *   between two bars.
 *   	Rep invariant: 
 */
public class Measure implements Sequence{
		private final List<Music> music;
		private final Boolean repeat;
		private final int Sequence;
		
		
		
		/**
		 * Construct a Measure object 
		 */
		public Measure(Boolean repeat,List<Music> musics) {
				this.repeat = repeat;
				this.music = musics;
				
		}
		
		
		@Override
		public void accept(Visitor s) {
			// TODO Auto-generated method stub
			
		}
		
}
