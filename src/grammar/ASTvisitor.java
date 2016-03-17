package grammar;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.antlr.v4.runtime.misc.NotNull;

import music.Chord;
import music.Duration;
import music.Header;
import music.Key;
import music.Measure;
import music.Music;
import music.Note;
import music.Repeat;
import music.Song;
import music.Tuplet;
import music.TupletType;
import music.Voice;


public class ASTvisitor extends HelloBaseVisitor <Song>{

	private Song song;
	private Header header;
	private int FieldIndex;
	private String FieldTitle;
	private String Composer;
	private Duration meter;
	private Duration length;
	private int tempo = 0;
	private int voiceNum = 0;
	private int currentVoice;
	private int TickTime;
	private String key;
	private Boolean InChords = false;
	private Boolean inTuplet = false;
	private Boolean inMeasure = false;

	private List<Note> chordNotes;
	private List<Music> musicsInTuplet;
	private List<Music> MusicInMea;
	private HashMap<Integer, Voice> Voices;
	private HashMap<Integer, List<Measure>> MeasOfSong;
	private HashMap<Integer, List<Measure>> MeaInLine;
	private HashMap<Integer, List<Measure>> Endings;
	private HashMap<Integer, List<Measure>> Rp;
	
	private HashMap<Integer, Boolean> inEndings1 ;
	private HashMap<Integer, Boolean> inEndings2 ;
	
	private TupletType Type;
	private HashMap<Integer, Boolean> finishRepition;
	private HashMap<Integer, Boolean> startRepition;
	@Override 
	public Song visitAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx) {
		/*
		 * visit header
		 */
		Voices = new HashMap<Integer, Voice>();
		MeasOfSong = new HashMap<Integer, List<Measure>>();
		inEndings1 = new HashMap<Integer, Boolean>();
		inEndings2 = new HashMap<Integer, Boolean>();
		finishRepition = new HashMap<Integer, Boolean>();
		startRepition = new HashMap<Integer, Boolean>();
		Endings= new HashMap<Integer, List<Measure>>();
		Rp = new HashMap<Integer, List<Measure>>();
		MeaInLine = new HashMap<Integer, List<Measure>>();
		
		
		
		visit(ctx.getChild(0));
		visit(ctx.getChild(1));
		/*
		 * calculating tick time per quarter 
		 */
		TickTime = TickTime/4;
		song = new Song(header, Voices, TickTime);
		
			return song;
		}
	
	@Override
	public Song visitAbc_header(@NotNull HelloParser.Abc_headerContext ctx) {
			return visitChildren(ctx); 
		}
	
	@Override
	public Song visitField_number(@NotNull HelloParser.Field_numberContext ctx) { 
			FieldIndex = Integer.parseInt(ctx.FIELD_NUMBER().getText().replace("X:", "").trim());
			return visitChildren(ctx); 
			}
	
	@Override
	public Song visitOther_fields(@NotNull HelloParser.Other_fieldsContext ctx) { 
			return visitChildren(ctx); 
			}
	@Override
	public Song visitField_title(@NotNull HelloParser.Field_titleContext ctx) { 
			FieldTitle = ctx.FIELD_TITLE().getText().replace("T:", "").replace("\n","");
			return visitChildren(ctx); 
			}
	@Override
	public Song visitField_composer(@NotNull HelloParser.Field_composerContext ctx) {
			Composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").replace("\n","");
			return visitChildren(ctx); 
			}
	
	@Override
	public Song visitField_meter(@NotNull HelloParser.Field_meterContext ctx) { 
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
	public Song visitField_default_length(@NotNull HelloParser.Field_default_lengthContext ctx) {
			
			String[] fraction = ctx.FIELD_DEFAULT_LENGTH()
					.getText().replace("L:","").replace("\n","").trim().split("/");
			length = new Duration(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));	
			TickTime = Integer.parseInt(fraction[1]);
			return visitChildren(ctx);
		
		
			}

	@Override 
	public Song visitField_tempo(@NotNull HelloParser.Field_tempoContext ctx) { 
			tempo = Integer.parseInt(ctx.FIELD_TEMPO().getText().replace("Q:", "").trim());
			return visitChildren(ctx); 
			}
	
	@Override 
	public Song visitField_voice(@NotNull HelloParser.Field_voiceContext ctx) {

		voiceNum += 1;
		inEndings1.put(voiceNum, false);
		inEndings2.put(voiceNum, false);
		finishRepition.put(voiceNum, false);
		startRepition.put(voiceNum,false);
		Endings.put(voiceNum,new ArrayList<Measure>());
		MeasOfSong.put(voiceNum, new ArrayList<Measure>());
		MeaInLine.put(voiceNum,  new ArrayList<Measure>());
		Rp.put(voiceNum, new ArrayList<Measure>());
		currentVoice = 1;
		return null; 
	}

		
	@Override 
	public Song visitField_key(@NotNull HelloParser.Field_keyContext ctx) { 
		key = ctx.FIELD_KEY().getText().replace("K:", "");

		if(length==null){
			length = new Duration(1,8);
			TickTime = 8;
		}
		
		if(meter == null){
			meter = new Duration(4,4);
		}

		if(tempo==0){
			tempo = 100;
		}
		header = new Header(FieldIndex, FieldTitle,Composer, length, meter,tempo,voiceNum,key);
		
		return visitChildren(ctx);
		}
	
	@Override
	public Song visitAbc_music(@NotNull HelloParser.Abc_musicContext ctx) { 
		visitChildren(ctx);
		/*
		 * init a Vocie after visiting children;
		 * Add rest measures in repe to  Song
		 */
		
		
		for(int i=1;i< voiceNum+1;i++){
			MeasOfSong.get(i).addAll(Rp.get(i));
			Voice v = new Voice(MeasOfSong.get(i),i);
			Voices.put(i, v);
		}
		
		return null; 
		}

	@Override 
	public Song visitAbc_line(@NotNull HelloParser.Abc_lineContext ctx) {
		if(voiceNum == 0){
			/*
			 * if header contains no voice fields information.
			 */
			voiceNum+=1;
			
			currentVoice = voiceNum;
			inEndings1.put(voiceNum, false);
			inEndings2.put(voiceNum, false);
			finishRepition.put(voiceNum, false);
			startRepition.put(voiceNum,false);
			Endings.put(voiceNum,new ArrayList<Measure>());
			MeasOfSong.put(voiceNum, new ArrayList<Measure>());
			MeaInLine.put(voiceNum,  new ArrayList<Measure>());
			Rp.put(voiceNum, new ArrayList<Measure>());
			
			visitChildren(ctx);
			MeasOfSong.get(voiceNum).addAll(MeaInLine.get(currentVoice));
			Voice v = new Voice(MeasOfSong.get(voiceNum),currentVoice);
			
			Voices.put(currentVoice, v);
			
		}else{
			/*
			 * header with V:1
			 */
			MeaInLine.put(currentVoice, new ArrayList<Measure>());
			visitChildren(ctx);
			Rp.get(currentVoice).addAll(MeaInLine.get(currentVoice));

		}
		
		return null;
		}
	
	@Override 
	public Song visitMid_tune_field(@NotNull HelloParser.Mid_tune_fieldContext ctx) {
		currentVoice = Integer.parseInt(ctx.FIELD_VOICE().getText().replaceAll("[^\\d]", ""));
		return visitChildren(ctx); }
	
	@Override 	
	public Song visitBar_line(@NotNull HelloParser.Bar_lineContext ctx) { 
	
			switch (ctx.BARLINE_START().getText().replaceAll("\\[", "").trim().length()) {
				case 1:
					if(ctx.BARLINE_START().getText().trim().charAt(1) == '1'){
						inEndings1.put(currentVoice, true);
					}else if(ctx.BARLINE_START().getText().trim().charAt(1)=='2'){
						inEndings2.put(currentVoice, true);
					}
					
					break;
				case 2:
					startRepition.put(currentVoice, true);
					MeasOfSong.get(currentVoice).addAll(Rp.get(currentVoice));
					Rp.put(currentVoice, new ArrayList<Measure>());
				default:
					break;
			}
		return visitChildren(ctx); }
	
	@Override 
	public Song visitMeasure(@NotNull HelloParser.MeasureContext ctx) { 
		MusicInMea = new ArrayList<Music>();
		inMeasure = true;
		visitChildren(ctx);
		
		Measure measure = new Measure(MusicInMea);
		
			if(inEndings1.get(currentVoice)){
				Endings.get(currentVoice).add(measure);
				inEndings1.put(currentVoice,false); 
				
			}else if(inEndings2.get(currentVoice)){
				Endings.get(currentVoice).add(measure);
				inEndings2.put(currentVoice,false); 
				
				Rp.get(currentVoice).addAll(MeaInLine.get(currentVoice));
				//System.err.println(Rp.get(currentVoice).toString());
				Repeat Repeat = new Repeat(Rp.get(currentVoice), Endings.get(currentVoice));

			
				MeasOfSong.get(currentVoice).addAll(Repeat.getRepeat());
				
				Endings.put(currentVoice,new ArrayList<Measure>());
				MeaInLine.put(currentVoice, new ArrayList<Measure>());
				Rp.put(currentVoice, new ArrayList<Measure>());
				
			}else if(finishRepition.get(currentVoice))
			{
				/*
				 *     ":|" the last measure of a repition
				 */
				
				MeaInLine.get(currentVoice).add(measure);
				Rp.get(currentVoice).addAll(MeaInLine.get(currentVoice));
				
				Repeat repeat = new Repeat(Rp.get(currentVoice));
				
				
				MeasOfSong.get(currentVoice).addAll(repeat.getRepeat()); 
				
				MeaInLine.put(currentVoice, new ArrayList<Measure>());
				Rp.put(currentVoice, new ArrayList<Measure>());
				
				startRepition.put(currentVoice, false);
				finishRepition.put(currentVoice, false);
				
			}
			else
			{
				MeaInLine.get(currentVoice).add(measure);
			}
			
			
		return null;
		}

	@Override 
	public Song visitMeasure_end(@NotNull HelloParser.Measure_endContext ctx) { 
		inMeasure = false;
		String repeatEnd = ctx.MEASURE_END().getText();
			if(repeatEnd.charAt(0)==':'&(!inEndings1.get(currentVoice))){
				finishRepition.put(currentVoice, true);
					}	
		
			
		return null; 
		}
	
	@Override 
	public Song visitNote_element(@NotNull HelloParser.Note_elementContext ctx) { 
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
				
				
				if((fractions[0].length()==1)&((fractions[1].length()==1))){
					/*
					 * Note with fractional duration ex. z3/4 
					 */
					duration = new Duration(numerator*Integer.parseInt(fractions[0]),
							denominator*Integer.parseInt(fractions[1]));
						GetLCD(denominator*Integer.parseInt(fractions[1]));
					
				}else if(fractions[1].length()==1){
					/*
					 * Note with fractional duration ex. z/4
					 */
					duration = new Duration(numerator,
							denominator*Integer.parseInt(fractions[1]));
					
						GetLCD(denominator*Integer.parseInt(fractions[1]));
					
				}else{
					/* 
					 * Duration with a single slash ex, D/
					 */
					duration = new Duration(numerator,
							denominator*2);
						GetLCD(denominator*2);	
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
			case",,,":
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
			}else{
				if(inMeasure){
					MusicInMea.add(note);
				}
			}
			
			return visitChildren(ctx); 
		}
	
	@Override 
	public Song visitChord_element(@NotNull HelloParser.Chord_elementContext ctx) { 
		chordNotes = new ArrayList<Note>();
		InChords = true;
		return visitChildren(ctx); 
		}
	
	
	@Override 
	public Song visitClose_bracet(@NotNull HelloParser.Close_bracetContext ctx) { 
		InChords = false;
		Chord chord = new Chord(chordNotes);
			if(inTuplet){
				musicsInTuplet.add(chord);
			}else if(inMeasure){
				MusicInMea.add(chord);
			}
		return visitChildren(ctx); 
		}
	
	@Override 
	public Song visitTuplet_element(@NotNull HelloParser.Tuplet_elementContext ctx) { 
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
		if(inMeasure){
			MusicInMea.add(tuplet);
		}
		
		GetLCD(tuplet.getDuration().getDenominator());
		inTuplet = false;
		return null;
		}
	
	private void GetLCD(int denominator){
		int max;
		int min;
		if(TickTime < denominator){
			min = TickTime;
			max = denominator;
		}else{
			min = denominator;
			max = TickTime;
		}
	
		for(int t = 1; t <= min;t++){
			if(((max*t) % min )==0){
				TickTime = max*t;
				break;
			}
		}		
	}

	
	}
	
	

