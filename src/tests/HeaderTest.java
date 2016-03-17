package tests;

import org.junit.Test;

import music.Duration;
import music.Header;

public class HeaderTest {
	
		@Test
		public void HeaderConstructtest(){
			Duration meter = new Duration(4,4);
			Duration length = new Duration(1,16);
			int tempo = 100;
			Header header = new Header(1, "TEst2","Test1", length, meter, tempo,"C" );
			System.err.println(header.toString());
		}
}
