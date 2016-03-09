package grammar;


import org.antlr.v4.runtime.misc.NotNull;

import music.Body;
import music.Header;
import music.Song;


public class ASTvisitor extends HelloBaseVisitor <String>{

	private Song song;
	private Header header;
	private Body body;
	
	@Override 
	public String visitAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx) {
		Song = new Song(header,body); 
				
		}
	}
