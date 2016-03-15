package grammar;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import music.Song;

public class Main {

	public static void main(String[] strings) throws IOException {
		ANTLRInputStream inputStream = new ANTLRInputStream(fromFile("paddy.abc"));
		HelloLexer lexer = new HelloLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokens);
			
		ParseTree tree = parser.abc_tune();
		System.out.println(tree.toStringTree(parser));
		ASTvisitor visitor  = new ASTvisitor();
		Song song = visitor.visit(tree);
		System.out.println(song.toString());
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
