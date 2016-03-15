package music;

import sound.Pitch;


/*
 * A Note represent a single note element or rest in a measure, a chord, or a tuplet. 
 *  It stores attributes such as Duration, Key. 
 */
public class Note implements Music,Sequence{
		private final Key key;
		private final Duration duration;
		private final String rest;
		
		/**
		 * @param key of the note.
		 * @param duration of the note.
		 */
		public Note(Key key, Duration duration){
			this.key = key;
			this.duration = duration;
			this.rest = null;
		}
		
		/** 
		 * @param duration of the rest element.
		 */
		public Note(Duration duration){
			this.key = null;
			this.duration = duration;
			this.rest = "z";
		}
		
		
		/**
		 * @return a Key that can be added to SequencePlayer.
		 */
		public Key getKey(){
			return key;
		}
		
		/**
		 * @return the duration(ticks) for a Note to be added to SequencePlayer 
		 */
		@Override
		public Duration getDuration(){
			return duration;
		}
		
		
		/**
		 * Generate a new note object with same duration value but 
		 *  		different denominator & numerator representation.
		 * @param different denominator
		 * @return new Note 
		 */
		@Override
		public Note changeDuration(int denominator) {
			Duration newD = duration.getLCD(denominator); 
			return new Note(key,newD);
		}

		@Override
		public void accept(Visitor s) {
			s.visit(this);
		}
		/**
		 * @return a String representation of this note/rest
		 */
		public String toString() {
			if(key!=null){
				return key.toString()+ duration.toString();
			}else if(rest =="z"){
				return rest+ duration.toString();
			}else{
				throw new NullPointerException("failed to output Note element");	
			}
		}

		

}
