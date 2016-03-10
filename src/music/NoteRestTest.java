package music;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoteRestTest {
	@Test
	public void CreateNoteTest1(){
		Key k = new Key('B');
		Duration duration = new Duration(1);
		
		Note note = new Note(k, duration);
		assertEquals("B1/1",note.toString());
	}
	
	@Test
	public void CreateNoteTest2(){
		Duration duration = new Duration(1,2);
		
		Note note = new Note( duration);
		assertEquals("z1/2",note.toString());
	}
	
}
