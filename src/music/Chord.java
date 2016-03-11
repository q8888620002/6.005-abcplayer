package music;

import java.util.ArrayList;
import java.util.List;


/*
 *  A type representing a chord, which is simply a group of 
 * notes played simultaneously within the same voice.
 * 
 * Rep invariant :
 * 	The class is immutable.
 * 	The list of notes is final.
 * 
 */
public class Chord implements Music, Sequence {
	private final List<Note> notes;
	private final Duration duration;

	/**
	 * Construct a new Chord from the notes that compose it
	 * @param notes in the chord 
	 */
	public Chord(Note...note){
		List<Note> notes = new ArrayList<Note>();
		for(Note n: note){
			notes.add(n);
		}
		this.duration = notes.get(0).getDuration();
		this.notes = notes;
	}
	
	/**
	 * Construct a new chord object  
	 * @param a List of Notes 
	 */
	public Chord(List<Note> newN) {
		this.notes = newN;
		this.duration = notes.get(0).getDuration();
	}

	/**
	 * 
	 * @return a list of single notes which can be added to SequencePlayer
	 */
	public List<Note> getNotes(){
		return notes;
	}
	
	
	
	/**
	 * visitor method for sequence Visitor	
	 */

	@Override
	public void accept(Visitor s) {
		// TODO Auto-generated method stub
		s.visit(this);
	}
	
	/**
	 * @return string representation of Chord
	 */
	
	public String toString(){
		String chord = "[";
		
		for(Note n: notes){
			chord+= n.toString();
		}
		return chord+"]";
	}

	/**
	 * @return duration of this chord
	 */
	@Override
	public Duration getDuration() {
		return duration;
	}

	@Override
	public Chord changeDuration(int denominator) {
		List<Note> newN = new ArrayList<Note>();
		for(Note n:notes){
			newN.add(n.changeDuration(denominator));
		}
			return new Chord(newN);
	}


	
	
}
