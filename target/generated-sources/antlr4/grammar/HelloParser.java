// Generated from Hello.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIELD_NUMBER=1, FIELD_TITLE=2, FIELD_COMPOSER=3, FIELD_METER=4, FIELD_VOICE=5, 
		FIELD_TEMPO=6, FIELD_DEFAULT_LENGTH=7, FIELD_KEY=8, MEASURE_END=9, NOTE=10, 
		DURATION=11, FRACTION=12, BARLINE_START=13, NTH_REPEAT=14, TUPLET_START=15, 
		PITCH=16, OCTAVE=17, OPEN_BRACET=18, CLOSE_BRACET=19, BASENOTE=20, REST=21, 
		ACCIDENTAL=22, METER=23, NOTE_LENGTH=24, NOTE_LENGTH_STRICT=25, VOICE_CHANNEL=26, 
		TEMPO=27, TEXT=28, EOL=29, SLASH=30, DIGIT=31, CHARACTER=32, NEWLINE=33, 
		SPACE=34, SYMBOL=35, WS=36, COMMENT=37, MODE_MINOR=38, KEY_ACCIDENTAL=39;
	public static final String[] tokenNames = {
		"<INVALID>", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_METER", 
		"FIELD_VOICE", "FIELD_TEMPO", "FIELD_DEFAULT_LENGTH", "FIELD_KEY", "MEASURE_END", 
		"NOTE", "DURATION", "FRACTION", "BARLINE_START", "NTH_REPEAT", "TUPLET_START", 
		"PITCH", "OCTAVE", "OPEN_BRACET", "CLOSE_BRACET", "BASENOTE", "'z'", "ACCIDENTAL", 
		"METER", "NOTE_LENGTH", "NOTE_LENGTH_STRICT", "VOICE_CHANNEL", "TEMPO", 
		"TEXT", "EOL", "'/'", "DIGIT", "CHARACTER", "NEWLINE", "SPACE", "':'", 
		"WS", "COMMENT", "'m'", "KEY_ACCIDENTAL"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_other_fields = 2, RULE_field_number = 3, 
		RULE_field_title = 4, RULE_field_composer = 5, RULE_field_meter = 6, RULE_field_default_length = 7, 
		RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, RULE_abc_music = 11, 
		RULE_abc_line = 12, RULE_repeat = 13, RULE_alternative_endings = 14, RULE_measure = 15, 
		RULE_measure_end = 16, RULE_mid_tune_field = 17, RULE_element = 18, RULE_close_bracet = 19, 
		RULE_chord_element = 20, RULE_note_element = 21, RULE_tuplet_element = 22, 
		RULE_bar_line = 23;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "other_fields", "field_number", "field_title", 
		"field_composer", "field_meter", "field_default_length", "field_tempo", 
		"field_voice", "field_key", "abc_music", "abc_line", "repeat", "alternative_endings", 
		"measure", "measure_end", "mid_tune_field", "element", "close_bracet", 
		"chord_element", "note_element", "tuplet_element", "bar_line"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header(int i) {
			return getRuleContext(Abc_headerContext.class,i);
		}
		public List<Abc_headerContext> abc_header() {
			return getRuleContexts(Abc_headerContext.class);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAbc_tune(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAbc_tune(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); abc_header();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FIELD_NUMBER );
			setState(53); abc_music();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAbc_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAbc_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); field_number();
			setState(56); field_title();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_COMPOSER) | (1L << FIELD_METER) | (1L << FIELD_VOICE) | (1L << FIELD_TEMPO) | (1L << FIELD_DEFAULT_LENGTH))) != 0)) {
				{
				{
				setState(57); other_fields();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOther_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOther_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_other_fields);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case FIELD_COMPOSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); field_composer();
				}
				break;
			case FIELD_DEFAULT_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); field_default_length();
				}
				break;
			case FIELD_METER:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); field_meter();
				}
				break;
			case FIELD_TEMPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); field_tempo();
				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(69); field_voice();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_numberContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_NUMBER() { return getToken(HelloParser.FIELD_NUMBER, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(FIELD_NUMBER);
			setState(74);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(73); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_titleContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_TITLE() { return getToken(HelloParser.FIELD_TITLE, 0); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(FIELD_TITLE);
			setState(78);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(77); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_composerContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_COMPOSER() { return getToken(HelloParser.FIELD_COMPOSER, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_composer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_composer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(FIELD_COMPOSER);
			setState(82);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(81); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_meterContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_METER() { return getToken(HelloParser.FIELD_METER, 0); }
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_meter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_meter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(FIELD_METER);
			setState(86);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(85); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_DEFAULT_LENGTH() { return getToken(HelloParser.FIELD_DEFAULT_LENGTH, 0); }
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_default_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_default_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_default_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(FIELD_DEFAULT_LENGTH);
			setState(90);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(89); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_TEMPO() { return getToken(HelloParser.FIELD_TEMPO, 0); }
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_tempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_tempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(FIELD_TEMPO);
			setState(94);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(93); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_VOICE() { return getToken(HelloParser.FIELD_VOICE, 0); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_voice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_voice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(FIELD_VOICE);
			setState(98);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(97); match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_KEY() { return getToken(HelloParser.FIELD_KEY, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(FIELD_KEY);
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(101); match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAbc_music(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAbc_music(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); abc_line();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_VOICE) | (1L << NOTE) | (1L << BARLINE_START) | (1L << NTH_REPEAT) | (1L << TUPLET_START) | (1L << OPEN_BRACET) | (1L << CLOSE_BRACET) | (1L << EOL) | (1L << WS))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_lineContext extends ParserRuleContext {
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAbc_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAbc_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abc_line);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); measure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); repeat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); mid_tune_field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatContext extends ParserRuleContext {
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public Alternative_endingsContext alternative_endings(int i) {
			return getRuleContext(Alternative_endingsContext.class,i);
		}
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public List<Alternative_endingsContext> alternative_endings() {
			return getRuleContexts(Alternative_endingsContext.class);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << BARLINE_START) | (1L << TUPLET_START) | (1L << OPEN_BRACET) | (1L << CLOSE_BRACET) | (1L << EOL) | (1L << WS))) != 0)) {
				{
				{
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114); measure();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124); alternative_endings();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alternative_endingsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public Measure_endContext measure_end() {
			return getRuleContext(Measure_endContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NTH_REPEAT() { return getToken(HelloParser.NTH_REPEAT, 0); }
		public Alternative_endingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative_endings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAlternative_endings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAlternative_endings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAlternative_endings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alternative_endingsContext alternative_endings() throws RecognitionException {
		Alternative_endingsContext _localctx = new Alternative_endingsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alternative_endings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(NTH_REPEAT);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); element();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << BARLINE_START) | (1L << TUPLET_START) | (1L << OPEN_BRACET) | (1L << CLOSE_BRACET) | (1L << EOL) | (1L << WS))) != 0) );
			setState(135); measure_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasureContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public Measure_endContext measure_end() {
			return getRuleContext(Measure_endContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMeasure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137); element();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << BARLINE_START) | (1L << TUPLET_START) | (1L << OPEN_BRACET) | (1L << CLOSE_BRACET) | (1L << EOL) | (1L << WS))) != 0) );
			setState(142); measure_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Measure_endContext extends ParserRuleContext {
		public TerminalNode MEASURE_END() { return getToken(HelloParser.MEASURE_END, 0); }
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public Measure_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMeasure_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMeasure_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMeasure_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Measure_endContext measure_end() throws RecognitionException {
		Measure_endContext _localctx = new Measure_endContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_measure_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(MEASURE_END);
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(145); match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode FIELD_VOICE() { return getToken(HelloParser.FIELD_VOICE, 0); }
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMid_tune_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMid_tune_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(FIELD_VOICE);
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(149); match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(HelloParser.SPACE, i);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public Bar_lineContext bar_line() {
			return getRuleContext(Bar_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(HelloParser.SPACE); }
		public Close_bracetContext close_bracet() {
			return getRuleContext(Close_bracetContext.class,0);
		}
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Chord_elementContext chord_element() {
			return getRuleContext(Chord_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(152); note_element();
				}
				break;
			case 2:
				{
				setState(153); tuplet_element();
				}
				break;
			case 3:
				{
				setState(154); chord_element();
				}
				break;
			case 4:
				{
				setState(155); bar_line();
				}
				break;
			case 5:
				{
				setState(156); close_bracet();
				}
				break;
			case 6:
				{
				setState(157); match(EOL);
				}
				break;
			}
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(160); match(SPACE);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_bracetContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACET() { return getToken(HelloParser.CLOSE_BRACET, 0); }
		public Close_bracetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_bracet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterClose_bracet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitClose_bracet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitClose_bracet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_bracetContext close_bracet() throws RecognitionException {
		Close_bracetContext _localctx = new Close_bracetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_close_bracet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(CLOSE_BRACET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chord_elementContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(HelloParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(HelloParser.WS); }
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public TerminalNode OPEN_BRACET() { return getToken(HelloParser.OPEN_BRACET, 0); }
		public Close_bracetContext close_bracet() {
			return getRuleContext(Close_bracetContext.class,0);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Chord_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterChord_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitChord_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitChord_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chord_elementContext chord_element() throws RecognitionException {
		Chord_elementContext _localctx = new Chord_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_chord_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168); match(WS);
				}
			}

			{
			setState(171); match(OPEN_BRACET);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE) {
				{
				{
				setState(172); note_element();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178); close_bracet();
			}
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(180); match(WS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_elementContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(HelloParser.NOTE, 0); }
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNote_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNote_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_note_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Chord_elementContext chord_element(int i) {
			return getRuleContext(Chord_elementContext.class,i);
		}
		public TerminalNode WS() { return getToken(HelloParser.WS, 0); }
		public TerminalNode TUPLET_START() { return getToken(HelloParser.TUPLET_START, 0); }
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public List<Chord_elementContext> chord_element() {
			return getRuleContexts(Chord_elementContext.class);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTuplet_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTuplet_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tuplet_element);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(185); match(WS);
				}
			}

			setState(188); match(TUPLET_START);
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(191);
					switch (_input.LA(1)) {
					case OPEN_BRACET:
					case WS:
						{
						setState(189); chord_element();
						}
						break;
					case NOTE:
						{
						setState(190); note_element();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bar_lineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HelloParser.EOL, 0); }
		public TerminalNode BARLINE_START() { return getToken(HelloParser.BARLINE_START, 0); }
		public Bar_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBar_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBar_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBar_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bar_lineContext bar_line() throws RecognitionException {
		Bar_lineContext _localctx = new Bar_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bar_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(BARLINE_START);
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(196); match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\5\5M\n\5\3\6\3\6\5\6Q"+
		"\n\6\3\7\3\7\5\7U\n\7\3\b\3\b\5\bY\n\b\3\t\3\t\5\t]\n\t\3\n\3\n\5\na\n"+
		"\n\3\13\3\13\5\13e\n\13\3\f\3\f\5\fi\n\f\3\r\6\rl\n\r\r\r\16\rm\3\16\3"+
		"\16\3\16\5\16s\n\16\3\17\6\17v\n\17\r\17\16\17w\7\17z\n\17\f\17\16\17"+
		"}\13\17\3\17\6\17\u0080\n\17\r\17\16\17\u0081\3\20\3\20\6\20\u0086\n\20"+
		"\r\20\16\20\u0087\3\20\3\20\3\21\6\21\u008d\n\21\r\21\16\21\u008e\3\21"+
		"\3\21\3\22\3\22\5\22\u0095\n\22\3\23\3\23\5\23\u0099\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00a1\n\24\3\24\7\24\u00a4\n\24\f\24\16\24\u00a7"+
		"\13\24\3\25\3\25\3\26\5\26\u00ac\n\26\3\26\3\26\7\26\u00b0\n\26\f\26\16"+
		"\26\u00b3\13\26\3\26\3\26\3\26\5\26\u00b8\n\26\3\27\3\27\3\30\5\30\u00bd"+
		"\n\30\3\30\3\30\3\30\6\30\u00c2\n\30\r\30\16\30\u00c3\3\31\3\31\5\31\u00c8"+
		"\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\2\u00d6\2\63\3\2\2\2\49\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fR\3"+
		"\2\2\2\16V\3\2\2\2\20Z\3\2\2\2\22^\3\2\2\2\24b\3\2\2\2\26f\3\2\2\2\30"+
		"k\3\2\2\2\32r\3\2\2\2\34{\3\2\2\2\36\u0083\3\2\2\2 \u008c\3\2\2\2\"\u0092"+
		"\3\2\2\2$\u0096\3\2\2\2&\u00a0\3\2\2\2(\u00a8\3\2\2\2*\u00ab\3\2\2\2,"+
		"\u00b9\3\2\2\2.\u00bc\3\2\2\2\60\u00c5\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\5\30"+
		"\r\28\3\3\2\2\29:\5\b\5\2:>\5\n\6\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\5\26\f\2B\5\3\2\2\2CI\5\f\7\2D"+
		"I\5\20\t\2EI\5\16\b\2FI\5\22\n\2GI\5\24\13\2HC\3\2\2\2HD\3\2\2\2HE\3\2"+
		"\2\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JL\7\3\2\2KM\7\37\2\2LK\3\2\2\2LM\3"+
		"\2\2\2M\t\3\2\2\2NP\7\4\2\2OQ\7\37\2\2PO\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2"+
		"RT\7\5\2\2SU\7\37\2\2TS\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VX\7\6\2\2WY\7\37"+
		"\2\2XW\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z\\\7\t\2\2[]\7\37\2\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]\21\3\2\2\2^`\7\b\2\2_a\7\37\2\2`_\3\2\2\2`a\3\2\2\2a\23\3"+
		"\2\2\2bd\7\7\2\2ce\7\37\2\2dc\3\2\2\2de\3\2\2\2e\25\3\2\2\2fh\7\n\2\2"+
		"gi\7\37\2\2hg\3\2\2\2hi\3\2\2\2i\27\3\2\2\2jl\5\32\16\2kj\3\2\2\2lm\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2n\31\3\2\2\2os\5 \21\2ps\5\34\17\2qs\5$\23\2"+
		"ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\33\3\2\2\2tv\5 \21\2ut\3\2\2\2vw\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2~\u0080\5\36\20\2\177~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\35\3\2\2\2\u0083\u0085"+
		"\7\20\2\2\u0084\u0086\5&\24\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\5\"\22\2\u008a\37\3\2\2\2\u008b\u008d\5&\24\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\5\"\22\2\u0091!\3\2\2\2\u0092\u0094\7\13\2\2\u0093\u0095"+
		"\7\37\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095#\3\2\2\2\u0096"+
		"\u0098\7\7\2\2\u0097\u0099\7\37\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099%\3\2\2\2\u009a\u00a1\5,\27\2\u009b\u00a1\5.\30\2\u009c\u00a1"+
		"\5*\26\2\u009d\u00a1\5\60\31\2\u009e\u00a1\5(\25\2\u009f\u00a1\7\37\2"+
		"\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a4\7$\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\'\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\7\25\2\2\u00a9)\3\2\2\2\u00aa\u00ac\7&\2\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\7\24\2\2\u00ae\u00b0\5"+
		",\27\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5("+
		"\25\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7&\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8+\3\2\2\2\u00b9\u00ba\7\f\2\2\u00ba-\3\2\2\2\u00bb"+
		"\u00bd\7&\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c1\7\21\2\2\u00bf\u00c2\5*\26\2\u00c0\u00c2\5,\27\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4/\3\2\2\2\u00c5\u00c7\7\17\2\2\u00c6\u00c8"+
		"\7\37\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\61\3\2\2\2\37"+
		"\65>HLPTX\\`dhmrw{\u0081\u0087\u008e\u0094\u0098\u00a0\u00a5\u00ab\u00b1"+
		"\u00b7\u00bc\u00c1\u00c3\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}