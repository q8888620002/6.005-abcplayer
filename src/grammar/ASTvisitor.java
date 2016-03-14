package grammar;


import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.misc.NotNull;

import music.Chord;
import music.Duration;
import music.Header;
import music.Key;
import music.Measure;
import music.Music;
import music.Note;
import music.Song;
import music.Tuplet;
import music.TupletType;
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
	private Boolean InChords = false;
	private Boolean inTuplet = false;
	private List<Note> chordNotes;
	private List<Music> musicsInTuplet;
	private TupletType Type;
	
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
				if(fraction[0].length() == 1){
					/*
					 * Meter :C
					 */
						meter = new Duration(4,4);
					}else if(fraction[0].length() == 2){
						/*
						 * Meter :C|
						 */
						meter = new Duration(2,2);
					}else{
						meter = new Duration(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				}		
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
		Note note;
		/*
		 * Set duration 
		 */
		
		if(splitNote.length!=1){
			String[] fractions = splitNote[1].split("/",2);
		
			if(fractions.length!=1){
				if(fractions[0].length()==2){
					/*
					 * Note with fractional duration ex. z3/4 
					 */
					duration = new Duration(numerator*Integer.parseInt(fractions[0]),
							denominator*Integer.parseInt(fractions[1]));
				}else if(fractions[0].length()==1){
					/*
					 * Note with fractional duration ex. z/4
					 */
					duration = new Duration(numerator,
							denominator*Integer.parseInt(fractions[0]));
				}else{
					/* 
					 * Duration with a single slash ex, D/
					 */
					duration = new Duration(numerator,
							denominator*2);
				}
			}else{
				/*
				 *   Key with integer duration ex. D2 
				 */
				if(fractions[0].length()!=0){
					duration = new Duration(numerator*Integer.parseInt(fractions[0]),
							denominator);
				}else{
					/*
					 * Note with explicit duration ex. D 
					 */
					duration = new Duration(numerator,
							denominator);
				}
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
		    note = new Note(key,duration);
		}else if(KeyOfNote.charAt(0) =='z'){
			/*
			 * rest element
			 */
			note = new Note(duration);
			
		}else{
			key = new Key(accidental,KeyOfNote.charAt(0), Octave);
		 note = new Note(key,duration);
		}
		
			if(InChords){
				chordNotes.add(note);
			}else if((inTuplet)&(!InChords)){
				musicsInTuplet.add(note);
			}
			
			return visitChildren(ctx); 
		}
	
	@Override 
	public Void visitChord_element(@NotNull HelloParser.Chord_elementContext ctx) { 
		chordNotes = new ArrayList<Note>();
		InChords = true;
		return visitChildren(ctx); 
		}
	
	
	@Override 
	public Void visitClose_bracet(@NotNull HelloParser.Close_bracetContext ctx) { 
		InChords = false;
		Chord chord = new Chord(chordNotes);
			if(inTuplet){
				musicsInTuplet.add(chord);
			}
		return visitChildren(ctx); 
		}
	
	@Override 
	public Void visitTuplet_element(@NotNull HelloParser.Tuplet_elementContext ctx) { 
		inTuplet = true;
		musicsInTuplet = new ArrayList<Music>();
		switch (ctx.TUPLET_START().getText()) {
			case "(2":
				Type = TupletType.DUPLET;
				break;
			case"(3":
				Type = TupletType.TRIPLET;
				break;
			case"(4":
				Type = TupletType.QUADRUPLET;
				break;
			default:
				break;
		}
		visitChildren(ctx);
		Tuplet tuplet = new Tuplet(Type, musicsInTuplet);
		inTuplet = false;
		return null;
		}

	
	}
	
	

