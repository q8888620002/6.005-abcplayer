package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import music.Chord;
import music.Duration;
import music.Key;
import music.Measure;
import music.Music;
import music.Note;
import music.Repeat;
import music.Tuplet;
import music.TupletType;

public class RepeatTest {
	Key bKey = new Key('B');
	Key aKey = new Key('A');
	Key eKey = new Key('E');
	Key Csharp = new Key(1, 'C');
	Duration duration = new Duration(1,3);
	Duration duration2 = new Duration(1,3);
	Note aNote = new Note(aKey,duration2); 
	Note eNote = new Note(eKey,duration2);
	Note CSharpNote = new Note(Csharp,duration2);
	
	Note B = new Note(bKey, duration);
	
	Chord AChord = new Chord(aNote,eNote,CSharpNote);
	Tuplet tupletBB = new Tuplet(TupletType.DUPLET, B,B);
	Tuplet tupletABC = new Tuplet(TupletType.TRIPLET, aNote,eNote,CSharpNote);
	Tuplet tupletAAA = new Tuplet(TupletType.TRIPLET, aNote,aNote,aNote);
	Tuplet tupletCBA = new Tuplet(TupletType.DUPLET, CSharpNote, B);
	
	/*
	 *  construct a repeat element
	 */
	@Test
	public void RepeatTest1(){
		List<Music> musics = new ArrayList<Music>();
		musics.add(AChord);
		musics.add(tupletABC);
		musics.add(tupletBB);
		
		Measure measure = new Measure(musics);
		
		
		List<Measure> meas = new ArrayList<Measure>();
		meas.add(measure);
		
		Repeat repeat =  new Repeat(meas);
		assertEquals("|: [A1/3E1/3^C1/3] (3A1/3E1/3^C1/3 (2B2/6B2/6 |[A1/3E1/3^C1/3] (3A1/3E1/3^C1/3 (2B2/6B2/6 |",
				repeat.toString());
		
	}
	
	
	/*
	 *  construct a repeat section with an alternative ending
	 */
	@Test
	public void RepeatAlternativeTest1(){
		List<Music> musics = new ArrayList<Music>();
		musics.add(AChord);
		musics.add(tupletABC);
		musics.add(tupletBB);
		Measure measure = new Measure(musics);
		List<Measure> meas = new ArrayList<Measure>();
		meas.add(measure);
		
		//ending1
		List<Music> ending1 = new ArrayList<Music>();
		ending1.add(tupletCBA);
		ending1.add(AChord);
		Measure measure2= new Measure(ending1);
		List<Measure> ending = new ArrayList<Measure>();
		ending.add(measure2);
		
		
		//ending2
		List<Music> ending2 = new ArrayList<Music>();
		ending2.add(tupletAAA);
		ending2.add(AChord);
		Measure measure3= new Measure(ending2);				
		
		ending.add(measure3);
				
	
		
		Repeat repeat =  new Repeat(meas,ending);
		assertEquals("|: [A1/3E1/3^C1/3] (3A1/3E1/3^C1/3 (2B2/6B2/6 |(2^C2/6B2/6 [A1/3E1/3^C1/3] |"
				+ "[A1/3E1/3^C1/3] (3A1/3E1/3^C1/3 (2B2/6B2/6 |(3A1/3A1/3A1/3 [A1/3E1/3^C1/3] |",
				repeat.toString());
	}
}
