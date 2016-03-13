package grammar;


import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import music.Duration;
import music.Header;
import music.Key;
import music.Measure;
import music.Note;
import music.Song;
import music.Voice;


public class ASTvisitor extends HelloBaseVisitor <Void>{

	private Song song;
	private Header header;
	private int FieldIndex;
	private String FieldTitle;
	private String Composer;
	private Duration meter;
	private Duration length;
	private int tempo;
	private String voiceNum;
	private String key;
	private List<Voice> voices;
	
	@Override 
	public Void visitAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx) {
			return visitChildren(ctx);
		}
	
	@Override
	public Void visitAbc_header(@NotNull HelloParser.Abc_headerContext ctx) {
			return visitChildren(ctx); 
		}
	
	@Override
	public Void visitField_number(@NotNull HelloParser.Field_numberContext ctx) { 
			FieldIndex = Integer.parseInt(ctx.FIELD_NUMBER().getText().replace("X:", "").trim());
			return visitChildren(ctx); 
			}
	
	@Override
	public Void visitOther_fields(@NotNull HelloParser.Other_fieldsContext ctx) { 
			return visitChildren(ctx); 
			}
	@Override
	public Void visitField_title(@NotNull HelloParser.Field_titleContext ctx) { 
			FieldTitle = ctx.FIELD_TITLE().getText().replace("T:", "").replace("\n","");
			return visitChildren(ctx); 
			}
	@Override
	public Void visitField_composer(@NotNull HelloParser.Field_composerContext ctx) {
			Composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").replace("\n","");
			return visitChildren(ctx); 
			}
	
	@Override
	public Void visitField_meter(@NotNull HelloParser.Field_meterContext ctx) { 
			String[] fraction = ctx.FIELD_METER()
					.getText().replace("M:","").replace("\n","").trim().split("/");
			meter = new Duration(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
		
			return visitChildren(ctx); 
			}
	
	@Override 
	public Void visitField_default_length(@NotNull HelloParser.Field_default_lengthContext ctx) {
			String[] fraction = ctx.FIELD_DEFAULT_LENGTH()
					.getText().replace("L:","").replace("\n","").trim().split("/");
			length = new Duration(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));			
			return visitChildren(ctx);
		
		
			}

	@Override 
	public Void visitField_tempo(@NotNull HelloParser.Field_tempoContext ctx) { 
			tempo = Integer.parseInt(ctx.FIELD_TEMPO().getText().replace("Q:", "").trim());
			return visitChildren(ctx); 
			}
	
	@Override 
	public Void visitField_voice(@NotNull HelloParser.Field_voiceContext ctx) {
		List<Voice> voices = new ArrayList<Voice>();
		voiceNum = ctx.FIELD_VOICE().getText().replace("V:", "");
		 
		return visitChildren(ctx); }

		
	@Override 
	public Void visitField_key(@NotNull HelloParser.Field_keyContext ctx) { 
		key = ctx.FIELD_KEY().getText().replace("K:", "");
		if(length==null){
			length = new Duration(1,4);
		}
		header = new Header(FieldIndex, FieldTitle,Composer, length, meter,tempo,voiceNum,key);
		
		System.out.println(header.toString());
		return visitChildren(ctx);
		}
	
	@Override
	public Void visitAbc_music(@NotNull HelloParser.Abc_musicContext ctx) { 
		if(header.getVoice() == null){
			voices = new ArrayList<Voice>();
			
			Measure measure = new Measure();
			List<Measure> ms = new ArrayList<Measure>();
			ms.add(measure);
			Voice voice = new Voice(ms,1);
			voices.add(voice);
			return visitChildren(ctx); 
		}	
		
		return visitChildren(ctx); 
		}

	@Override 
	public Void visitAbc_line(@NotNull HelloParser.Abc_lineContext ctx) {
		
		return visitChildren(ctx);
		}
	
	@Override 
	public Void visitMid_tune_field(@NotNull HelloParser.Mid_tune_fieldContext ctx) {
		return visitChildren(ctx); }
	
	@Override 
	public Void visitNote_element(@NotNull HelloParser.Note_elementContext ctx) { 
		
		/*
		 *Set for Note 
		 */
		String noteString = ctx.NOTE().getText().trim();
		
		String[] splitNote = noteString.split("(?=[\\d+/])",2);
		String KeyOfNote = splitNote[0].replaceAll("[^A-Za-z]", "");
		String AccidentalStr = splitNote[0].replaceAll("[A-Za-z]", "");
		int Octave = 0;
		int accidental=0;
		int numerator = header.getLength().getNumerator();
		int denominator = header.getLength().getDenominator();
		Duration duration;
		Key key;
		
		/*
		 * Set duration 
		 */
		
		if(splitNote.length!=1){
			String[] fractions = splitNote[1].split("/",2);
			/*
			 * with fractional duration
			 */
			if(fractions.length!=1){
				if(fractions[0].length()!=0){
					duration = new Duration(numerator*Integer.parseInt(fractions[0]),
							denominator*Integer.parseInt(fractions[1]));
				}else{
					duration = new Duration(numerator,
							denominator*Integer.parseInt(fractions[1]));
				}
			}else{
				duration = new Duration(numerator*Integer.parseInt(fractions[0]),
						denominator);
			}
		}else{
			/*
			 * without duration after key
			 */
			duration = new Duration(numerator,denominator);
		}
		
		/*
		 * Set accidental if exists
		 */
		if(AccidentalStr.length()!=0){
			switch (AccidentalStr) {
			case "^":
				accidental+=1;
				break;
			case"^^":
				accidental+=2;
				break;
			case "_":
				accidental-=1;
				break;
			case"__":
				accidental-=2;
				break;
			case"'":
				Octave+=1;
				break;
			case"''":
				Octave+=2;
				break;
			case ",":
				Octave-=1;
				break;
			case",,":
				Octave-=2;
				break;
			default:
				break;
			}
		}
		
		if(Character.isLowerCase(KeyOfNote.charAt(0))&(KeyOfNote.charAt(0)!='z') ){
			
			Octave+=1;
			key = new Key(accidental,Character.toUpperCase(KeyOfNote.charAt(0)), Octave);
			Note note = new Note(key,duration);
		}else if(KeyOfNote.charAt(0) =='z'){
			/*
			 * rest element
			 */
			Note rest = new Note(duration);
			
		}else{
			key = new Key(accidental,KeyOfNote.charAt(0), Octave);
			Note note = new Note(key,duration);
		}
		
		return visitChildren(ctx); 
		}
	
	}
	
	

