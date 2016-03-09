package music;



import org.antlr.v4.parse.ANTLRParser.ruleReturns_return;

/*
 * A header is immutable It stores the attributes of an ABC music 
 * such as tempo, key, default length, etc.  
 */
public class Header implements Sequence{

	private final int index;
	private final String title;
	private final String composer;
	private final Fraction default_length;
	private final Fraction meter;
	private final int tempo;
	private final Key Key;
	private final Voice voice;
	
	
	/**
	 * initialize the header 
	 * @param X, index of the song, non-negative integer
	 * @param C, name of the composer, non-empty string
	 * @param T, Title of the piece, non-empty string
	 * @param L, Default length or duration of a note, Fraction 
	 * @param M, It determines the sum of the durations of all notes within a bar
	 * 			,Fraction
	 * @param Q ,It represents the number of default-length notes per minute 
	 * @param K, determines the key signature for the piece, a Key obj 
	 */
	public Header(Integer X, String T,String C
			,Fraction L,Fraction M,Integer Q,Key K,Voice V){
		
		this.index = X;
		this.composer = C;
		this.title = T;
		this.default_length = L;
		this.meter = M;
		this.tempo = Q;
		this.Key = K;
		this.voice = V;
	}
	
	
	
	
	/**
	 * method for visitor to process the object 
	 */
	public void accept(Visitor v) {
		
		// TODO Auto-generated method stub
	
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
	 * @return 
	 * 
	 */

	public Fraction getLength() {
		return default_length;
	}
	
	/**
	 * @return meter of the song 
	 */
	public Fraction getMeter() {
		return meter;
	}
	
	/**
	 * @return tempo of the song
	 */
	public int getTempo() {
		return tempo;
	}
}
