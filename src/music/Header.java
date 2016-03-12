package music;

/*
 * A header stores the attributes of an ABC music such as tempo, key, default length, etc.  
 * 		Rep invariant:
 * 			It is immutable.
 * 			all the fields are final. 
 */
public class Header implements Sequence{

	private final int index;
	private final String title;
	private final String composer;
	private final Duration default_length;
	private final Duration meter;
	private final int tempo;
	private final Character Key;
	private final String voice;
	
	
	/**
	 * initialize the header 
	 * @param X, index of the song, non-negative integer
	 * @param T, Title of the piece, non-empty string
	 * @param C, name of the composer, non-empty string, optional
	 * @param L, Default length or duration of a note, Fraction 
	 * @param M, It determines the sum of the durations of all notes within a bar
	 * 			,Fraction
	 * @param Q ,It represents the number of default-length notes per minute 
	 * @param V, Voice of the music, optional
	 * @param K, determines the key signature for the piece, a Key obj 
	 */
	public Header(int X, String T,String C
			,Duration L,Duration M,Integer Q,String V,Character K){
		
		this.index = X;
		this.title = T;
		this.composer = C;
		this.default_length = L;
		this.meter = M;
		this.tempo = Q;
		this.voice = V;
		this.Key = K;
	}
	
	/**
	 * Constructor of the Header 
	 * @param all fields except Voice
	 */
	public Header(int X, String T,String C
			,Duration L,Duration M,Integer Q,Character K){
		
		this.index = X;
		this.title = T;
		this.composer = C;
		this.default_length = L;
		this.meter = M;
		this.tempo = Q;
		this.Key = K;
		this.voice = null;
	}
	
	/**
	 * Constructor of the Header 
	 * @param all fields except composer 
	 */
	public Header(int X, String T
			,Duration L,Duration M,Integer Q,String V,Character K){
		
		this.index = X;
		this.title = T;
		this.composer = null;
		this.default_length = L;
		this.meter = M;
		this.tempo = Q;
		this.Key = K;
		this.voice = null;
	}
	
	/**
	 * Constructor of the Header 
	 * @param all fields but Voice and composer
	 */
	public Header(int X, String T
			,Duration L,Duration M,Integer Q ,Character K){
		
		this.index = X;
		this.title = T;
		this.composer = null;
		this.default_length = L;
		this.meter = M;
		this.tempo = Q;
		this.Key = K;
		this.voice = null;
	}

	/**
	 * 
	 * @return an integer, index of the song
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * 
	 * @return composer of the song 
	 */
	public String getComposer() {
		return composer;
	}
	
	/**
	 * @return default length
	 * 
	 */
	public Duration getLength() {
		return default_length;
	}
	
	/**
	 * @return meter of the song 
	 */
	public Duration getMeter() {
		return meter;
	}
	
	/**
	 * @return tempo of the song
	 */
	public int getTempo() {
		return tempo;
	}
	/**
	 * @return Voices of Song
	 */
	public String getVoice() {
		return voice;
	}
	
	/**
	 * method for visitor to process the object 
	 */
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	
	/**
	 * @return a string representation of Header
	 */
	@Override
	public String toString() {
		return "X:"+index+"\n"+
				"T:" +title+"\n"+
				"C:"+composer+"\n"+
				"M:"+meter.toString()+"\n"+
				"L:"+default_length.toString()+"\n"+
				"Q:"+tempo+"\n"+
				"K:"+Key.toString();
	}
}
