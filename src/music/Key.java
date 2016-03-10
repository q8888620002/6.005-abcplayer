package music;


import sound.Pitch;

/*
 * A key object specifies accidental, octave, or minor to some of notes element 
 * in the music part. It also represents the Key_field in the header 
 */
public class Key {
	private final Pitch pitch;
	private final String modeMinor;
	/**
	 * generate a Key object with an accidental and an octave
	 * @param accidental of the note  
	 * @param a char note within 'A'...'G' 
	 * @param mode 'm'
	 */
	public Key(int accidental, char note, String mode ) {
		this.pitch = new Pitch(note).accidentalTranspose(accidental);
		this.modeMinor = mode;
		checkRep();
	}
	/**
	 * generate a Key object with an accidental and an octave
	 * @param accidental of the note  
	 * @param a char note within 'A'...'G' 
	 * @param an integer octave
	 */
	public Key(int accidental, char note, int octave ) {
		this.pitch = new Pitch(note).accidentalTranspose(accidental)
				.octaveTranspose(octave);
		this.modeMinor = null;
		checkRep();
	}
	
	/**
	 * Generate a Key with an accidental.
	 * @param an integer accidental
	 * @param a char note within 'A'...'G' 
	 */
	public Key(int accidental,char note) {
		this.pitch = new Pitch(note).accidentalTranspose(accidental);
		this.modeMinor = null;
		checkRep();
	}
	
	/**
	 * Generate a Key with an octave.
	 * @param an integer Octave
	 * @param a char note within 'A'...'G' 
	 */
	public Key(char note,int Octave ) {
		this.pitch = new Pitch(note).octaveTranspose(Octave);
		this.modeMinor = null;
		checkRep();
	}
	
	/**
	 * Generate a minor Key without accidental, octave.
	 * @param char note within  'A'..'G'
	 * @param char mode 'm'
	 */
	public Key(char note,String mode) {
		this.pitch = new Pitch(note);
		this.modeMinor = mode;
		checkRep();
	}
	/**
	 * Generate a Key without accidental, octave, or minor.
	 * @param char note within  'A'..'G'
	 */
	public Key(char note) {
		this.pitch = new Pitch(note);
		this.modeMinor = null;
		checkRep();
	}
	
	/**
	 * @return a Pitch that can be added to SequencePlayer
	 */
	
	public Pitch getPitch(){
		return pitch;
	}
	
	
	/**
	 * @return a String representation of a Key object 
	 */
	@Override
	public String toString(){
		if(modeMinor!=null){
			return pitch.toString()+ modeMinor;
		}else{
			return pitch.toString();
		}
	}
	
	
	
	
	private void checkRep(){
		assert isValid(modeMinor): "mode should be minor 'm'";
	}
	
	private boolean isValid(String mode) {
		return mode == "m" || mode == null;
	}
	
	
}
