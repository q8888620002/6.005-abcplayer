package music;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MeasureTest {
	Key bKey = new Key('B');
	Key aKey = new Key('A');
	Key eKey = new Key('E');
	Key Csharp = new Key(1, 'C');
	Duration duration = new Duration(2,2);
	Duration duration2 = new Duration(1,3);
	Note aNote = new Note(aKey,duration2); 
	Note eNote = new Note(eKey,duration2);
	Note CSharpNote = new Note(Csharp,duration2);
	
	Note B = new Note(bKey, duration);
	
	Chord AChord = new Chord(aNote,eNote,CSharpNote);
	Tuplet tupletBB = new Tuplet(TupletType.DUPLET, B,B);
	
	/**
	 * test measure construct
	 */
	@Test
	public void MeasureTest(){
		List<Music> musics = new ArrayList<Music>();
		musics.add(AChord);
		musics.add(tupletBB);
		
		Measure measure = new Measure(musics);
		System.out.println(measure.toString());
	}
	
	
}
