package music;

/*
 * this is the immutable, a top class that represents an ABC music
 * also an output of a Tree Visitor & an input of ToPitch Visitor.
 *  It is consist of header and body.    
 */


public class Song implements Sequence{
	
		private final Header header;
		private final Body body;
		
		/**
		 * Generate a new Song Object
		 * @param header which contains field info such as index, composer, etc.
		 * @param body refers to the Body datatype containing list of Voice
		 */
		public Song(Header header, Body body) {
			this.body = body;
			this.header = header;
		}
		
		/**
		 * Observor of the song object
		 * @return header of the song object
		 */
		
		public Header getHeader() {
			return this.header;
		}
		/**
		 * Observor of the song object
		 * @return body of the song object
		 */
		public Body getBody(){
			return this.body;
		}
		
		/**
		 * method that allows visitor to process the object
		 */
		public void accept(Visitor v) {
			// TODO Auto-generated method stub
			v.visit(this);
			v.visit(body);
			v.visit(header);
		}
		
		
}
