package music;

import org.junit.Test;

public class TupletTest {
	@Test
	public void InitTupletTest1(){
		Key k = new Key('B');
		Duration duration = new Duration(2,2);
		Note n = new Note(k, duration);
		
		
		Tuplet tuplet = new Tuplet(TupletType.DUPLET, n,n);
		System.out.println(tuplet.getMusic().get(0).getDuration().toString());
		
	}
}
