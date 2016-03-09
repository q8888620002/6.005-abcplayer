package player;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Main entry point of your application.
 */
public class Main {

	/**
	 * Plays the input file using Java MIDI API and displays
	 * header information to the standard output stream.
	 * 
	 * <p>Your code <b>should not</b> exit the application abnormally using
	 * System.exit()</p>
	 * 
	 * @param file the name of input abc file
	 */
	public static void play(String file) {
		// YOUR CODE HERE
		
		
		
		
	
	}
	
	
	
	/**
	 * Interpret the file content, a  non-empty List of string, then add it to sequencePlayer 
	 * @param file, non-empty list of string
	 * 
	 */
	
	private void InterpretFile(List<String> file){
		
	}
	
	
	
	// get the sample abc file
		public List<String> fromFile(String fileName) throws IOException{
			File newFile = new File("sample_abc/", fileName );
			List<String> lines = Files.readAllLines(Paths.get(newFile.getAbsolutePath())
					, StandardCharsets.UTF_8);
			return lines;
		}
}
