package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import music.Chord;
import music.Duration;
import music.Key;
import music.Note;

public class ChordTest {
	@Test
	public void InitChordTest(){
		Key k = new Key('B');
		Duration duration = new Duration(1,2);
		
		Note note = new Note(k, duration);
		
		Chord chord = new Chord(note,note,note);
		System.err.println(chord.toString());
		assertEquals("[B1/2B1/2B1/2]",chord.toString());
	}
}
