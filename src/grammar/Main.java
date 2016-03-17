package grammar;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import music.SequenceVisitor;
import music.Song;
import sound.SequencePlayer;

public class Main {

	public static void main(String[] strings) throws IOException, MidiUnavailableException, InvalidMidiDataException {
		ANTLRInputStream inputStream = new ANTLRInputStream(fromFile("invention.abc"));
		HelloLexer lexer = new HelloLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokens);
		
		ParseTree tree = parser.abc_tune();
		System.out.println(tree.toStringTree(parser));
		ASTvisitor visitor  = new ASTvisitor();
		Song song = visitor.visit(tree);
		
		SequenceVisitor visitor2 = new SequenceVisitor();
		
		visitor2.ConstructPlayer(new SequencePlayer(song.getHeader().getTempo(),
				song.getTickTime()), song.getTickTime());
		
		visitor2.visit(song);
		System.out.println(song.toString());
		System.err.println(visitor2.getPlayer().toString());
		visitor2.getPlayer().play();
		
		}
	
	
	public static String fromFile(String fileName) throws IOException{
		File newFile = new File("sample_abc/", fileName );
		List<String> lines = Files.readAllLines(Paths.get(newFile.getAbsolutePath())
				, StandardCharsets.UTF_8);
		String ABCmusic ="";
		for(int index= 0; index< lines.size();index++ ){
			ABCmusic+=lines.get(index)+System.lineSeparator();
		}	
		return ABCmusic;
	}
}
