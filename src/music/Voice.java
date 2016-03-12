package music;
/*
 * 	A Voice represents a complete music section right after ABC header.
 *  It is composed of measures, repetitions ,and the beginning and ending bar.
 * 		Rep invariant:
 * 			The Voice class is immutable.
 * 			Measures and voice number are final.
 */

import java.util.List;

public class Voice implements Sequence{
		private final List <Measure> musics;
		private final int voiceNum;
		/**
		 * Constructor of a Voice class
		 * @param a List of measures.
		 */
		public Voice(List<Measure> Measures, int VoiceNumber) {
				this.musics = Measures;
				this.voiceNum = VoiceNumber;
		}

		/**
		 * Getter method for measure of the Voice 
		 * @return measures of the Voice
		 */
		public List<Measure> getVoice(){
			return musics;
		}
			
		/**
		 * Getter method of Voice index
		 * @return a integer voice number
		 */
		public int getVoiceNum(){
			return voiceNum;
		}
		
		/**
		 * Visitor method for visitor to process a Voice
		 */
		@Override
		public void accept(Visitor s) {
			s.visit(this);
			
		}
		
		/**
		 * @return a string a representation of Voice
		 */
		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append("V:"+voiceNum+"\n");
			for(Measure m: musics){
				s.append(m.toString());
				s.append("\n");
			}
			return s.toString();
		}
}	
