package sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;


public class SequencePlayerTest {

	@Test
	public void piece1Test() throws IOException{
		List<String> l= fromFile("piece1.abc");
		System.out.println(l);
		 SequencePlayer player;
		 
		 try {
			 player = new SequencePlayer(140, 12);
			 
			 player.addNote(new Pitch('C').toMidiNote(), 0, 12);
			 player.addNote(new Pitch('C').toMidiNote(), 12, 24);
			 player.addNote(new Pitch('C').toMidiNote(), 24, 9);
			 player.addNote(new Pitch('D').toMidiNote(), 33, 3);
			 player.addNote(new Pitch('E').toMidiNote(), 36, 12);
			 player.addNote(new Pitch('E').toMidiNote(), 48, 9);
			 player.addNote(new Pitch('D').toMidiNote(), 57, 3);
			 player.addNote(new Pitch('E').toMidiNote(), 60, 9);
			 player.addNote(new Pitch('F').toMidiNote(), 69, 3);
			 player.addNote(new Pitch('G').toMidiNote(), 72, 24);
			 player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 96, 4);
			 player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 100, 4);
			 player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 104, 4);
			 player.addNote(new Pitch('G').toMidiNote(), 108, 4);
			 player.addNote(new Pitch('G').toMidiNote(), 112, 4);
			 player.addNote(new Pitch('G').toMidiNote(), 116, 4);
			 player.addNote(new Pitch('E').toMidiNote(), 120, 4);
			 player.addNote(new Pitch('E').toMidiNote(), 124, 4);
			 player.addNote(new Pitch('E').toMidiNote(), 128, 4);
			 player.addNote(new Pitch('C').toMidiNote(), 132, 4);
			 player.addNote(new Pitch('C').toMidiNote(), 136, 4);
			 player.addNote(new Pitch('C').toMidiNote(), 140, 4);
			 player.addNote(new Pitch('G').toMidiNote(), 144, 9);
			 player.addNote(new Pitch('G').toMidiNote(), 153, 3);
			 player.addNote(new Pitch('G').toMidiNote(), 156, 9);
			 player.addNote(new Pitch('G').toMidiNote(), 165, 3);
			 player.addNote(new Pitch('G').toMidiNote(), 168, 24);
			 player.play();
			 
		 } catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		 
	}
	
	@Test
	public void piece2Test(){
		SequencePlayer player;
		try {
			player = new SequencePlayer(200, 12);
			player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 0, 6);
			
			player.addNote(new Pitch('F').toMidiNote(), 6 , 6);
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 6, 6);
			// rest 1/8 ,6 
			player.addNote(new Pitch('F').toMidiNote(), 18 , 2);
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 18, 6);
			// rest 1/8, 6
			player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 30 , 6);
			player.addNote(new Pitch('F').toMidiNote(), 30, 6);
			
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 36 , 12);
			player.addNote(new Pitch('F').toMidiNote(), 36, 12);
			
			player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 48, 12);
			player.addNote(new Pitch('B').toMidiNote(), 48,12);
			player.addNote(new Pitch('G').toMidiNote(), 48,12);

			//rest 1/4 ,4
			player.addNote(new Pitch('G').toMidiNote(), 72,12);
			// rest 1/4 ,4
			
			player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 96 , 18);
			player.addNote(new Pitch('G').toMidiNote(), 114, 6);
			//rest 1/4 , 4 
			player.addNote(new Pitch('E').toMidiNote(), 132, 12);
			
			player.addNote(new Pitch('E').toMidiNote(), 144, 6);
			player.addNote(new Pitch('A').toMidiNote(),150, 12);
			player.addNote(new Pitch('B').toMidiNote(),162,12);
			player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
			player.addNote(new Pitch('A').toMidiNote(), 180, 12);
			
			player.addNote(new Pitch('G').toMidiNote(), 192, 4);
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 196, 4);
			player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 200, 4);
			player.addNote(new Pitch('A').octaveTranspose(1).toMidiNote(), 204, 12);
			player.addNote(new Pitch('F').octaveTranspose(1).toMidiNote(), 216, 6);
			player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 222, 6);
			//rest 1/8,6 
			player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 234, 12);
			player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 246, 6);
			player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 252, 6);
			player.addNote(new Pitch('B').toMidiNote(), 258, 9);
			player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}
	
	// get the sample abc file
	public List<String> fromFile(String fileName) throws IOException{
		File newFile = new File("sample_abc/", fileName );
		List<String> lines = Files.readAllLines(Paths.get(newFile.getAbsolutePath())
				, StandardCharsets.UTF_8);
		return lines;
	}
	
	
	
}
