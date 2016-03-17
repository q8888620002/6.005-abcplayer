package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import music.Duration;
import music.Key;
import music.Note;
import music.Tuplet;
import music.TupletType;

public class TupletTest {
	
	Key bKey = new Key('B');
	Key aKey = new Key('A');
	Key eKey = new Key('E');
	Key Csharp = new Key(1, 'C');
	
	
	/**
	 * Test construct a duplet
	 */
	@Test
	public void InitDupletTest(){
		Duration duration = new Duration(1,3);
		Note n = new Note(bKey, duration);
		Tuplet tuplet = new Tuplet(TupletType.DUPLET, n,n);
		
		Duration duration2 = new Duration(1,3);
		Note aNote = new Note(aKey,duration2);
		
		Tuplet ABduplet = new Tuplet(TupletType.DUPLET, aNote, n );
		System.out.println(ABduplet.toString());

	}
	
	/**
	 * Test illegal argument number of a duplet
	 */
	@Test(expected=AssertionError.class)
	public void InitDuipletErrorTest(){
		Duration duration = new Duration(2,2);
		Duration duration2 = new Duration(1,3);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration2);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABduplet = new Tuplet(TupletType.DUPLET, aNote, n,cNote );
		
	}
	
	/**
	 * Test construct a triplet
	 */
	@Test
	public void InitTripletTest(){
		Duration duration = new Duration(2,2);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABCsharpduplet = new Tuplet(TupletType.TRIPLET, aNote, n,cNote );
		assertEquals("(3A6/6B6/6^C6/6",ABCsharpduplet.toString());
	}
	
	/**
	 * Test illegal argument number of a duplet
	 */
	@Test(expected=AssertionError.class)
	public void InitTripletErrorTest1(){
		Duration duration = new Duration(2,2);
		Duration duration2 = new Duration(1,3);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration2);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABduplet = new Tuplet(TupletType.TRIPLET, aNote, n );
	}
	/**
	 * Test illegal argument number of a triplet
	 */
	@Test(expected=AssertionError.class)
	public void InitTripletErrorTest2(){
		Duration duration = new Duration(2,2);
		Duration duration2 = new Duration(1,3);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration2);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABduplet = new Tuplet(TupletType.TRIPLET, aNote, n,n,n );
	}
	
	/**
	 * Test construct a triplet
	 */
	@Test
	public void InitQudrupletTest(){
		Duration duration = new Duration(2,2);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABCsharpduplet = new Tuplet(TupletType.QUADRUPLET, aNote, n,cNote,n );
		assertEquals("(4A4/4B4/4^C4/4B4/4",ABCsharpduplet.toString());
	}
	
	/**
	 * Test illegal argument number of a qudruplet
	 */
	@Test(expected=AssertionError.class)
	public void InitQudrupletErrorTest1(){
		Duration duration = new Duration(2,2);
		Duration duration2 = new Duration(1,3);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration2);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABduplet = new Tuplet(TupletType.QUADRUPLET, aNote, n,n );
	}
	
	/**
	 * Test illegal argument number of a qudruplet
	 */
	@Test(expected=AssertionError.class)
	public void InitQudrupletErrorTest2(){
		Duration duration = new Duration(2,2);
		Duration duration2 = new Duration(1,3);
		
		Note n = new Note(bKey, duration);
		Note aNote = new Note(aKey,duration2);
		Note cNote = new Note(Csharp, duration);
		
		Tuplet ABduplet = new Tuplet(TupletType.TRIPLET, aNote, n,n,n,n );
	}
	
	
}
