package music;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
	}
	
	
	/*
	 *  construct a repeat element
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
		System.out.println(meas.toString());
		
		//ending1
		List<Music> ending1 = new ArrayList<Music>();
		ending1.add(tupletCBA);
		ending1.add(AChord);
		Measure measure2= new Measure(ending1);
		List<Measure> ending = new ArrayList<Measure>();
		ending.add(measure2);
		System.out.println(measure2);
		
		
		//ending2
		List<Music> ending2 = new ArrayList<Music>();
		ending2.add(tupletAAA);
		ending2.add(AChord);
		Measure measure3= new Measure(ending2);				
		System.out.println(measure3.toString());
		ending.add(measure3);
				
		
		Repeat repeat =  new Repeat(meas,ending);
		System.out.println(repeat.toString());
	}
}
