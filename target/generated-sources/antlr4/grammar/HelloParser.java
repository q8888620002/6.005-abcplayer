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
		FIELD_TEMPO=6, FIELD_DEFAULT_LENGTH=7, FIELD_KEY=8, NOTE=9, CHORDS=10, 
		DURATION=11, FRACTION=12, BARLINE=13, NTH_REPEAT=14, TUPLET=15, PITCH=16, 
		OCTAVE=17, END=18, BASENOTE=19, REST=20, ACCIDENTAL=21, METER=22, NOTE_LENGTH=23, 
		NOTE_LENGTH_STRICT=24, VOICE_CHANNEL=25, TEMPO=26, TEXT=27, EOL=28, SLASH=29, 
		DIGIT=30, CHARACTER=31, NEWLINE=32, SPACE=33, SYMBOL=34, WS=35, COMMENT=36, 
		KEY=37, MODE_MINOR=38, KEY_ACCIDENTAL=39;
	public static final String[] tokenNames = {
		"<INVALID>", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_METER", 
		"FIELD_VOICE", "FIELD_TEMPO", "FIELD_DEFAULT_LENGTH", "FIELD_KEY", "NOTE", 
		"CHORDS", "DURATION", "FRACTION", "BARLINE", "NTH_REPEAT", "TUPLET", "PITCH", 
		"OCTAVE", "']'", "BASENOTE", "'z'", "ACCIDENTAL", "METER", "NOTE_LENGTH", 
		"NOTE_LENGTH_STRICT", "VOICE_CHANNEL", "TEMPO", "TEXT", "EOL", "'/'", 
		"DIGIT", "CHARACTER", "NEWLINE", "SPACE", "':'", "WS", "COMMENT", "KEY", 
		"'m'", "KEY_ACCIDENTAL"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_other_fields = 2, RULE_field_number = 3, 
		RULE_field_title = 4, RULE_field_composer = 5, RULE_field_meter = 6, RULE_field_default_length = 7, 
		RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, RULE_abc_music = 11, 
		RULE_abc_line = 12, RULE_mid_tune_field = 13, RULE_element = 14, RULE_note_element = 15, 
		RULE_tuplet_element = 16, RULE_nth_repeat = 17, RULE_bar_line = 18;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "other_fields", "field_number", "field_title", 
		"field_composer", "field_meter", "field_default_length", "field_tempo", 
		"field_voice", "field_key", "abc_music", "abc_line", "mid_tune_field", 
		"element", "note_element", "tuplet_element", "nth_repeat", "bar_line"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); abc_header();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FIELD_NUMBER );
			setState(43); abc_music();
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
			setState(45); field_number();
			setState(46); field_title();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_COMPOSER) | (1L << FIELD_METER) | (1L << FIELD_VOICE) | (1L << FIELD_TEMPO) | (1L << FIELD_DEFAULT_LENGTH))) != 0)) {
				{
				{
				setState(47); other_fields();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); field_key();
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
			setState(60);
			switch (_input.LA(1)) {
			case FIELD_COMPOSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); field_composer();
				}
				break;
			case FIELD_DEFAULT_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); field_default_length();
				}
				break;
			case FIELD_METER:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); field_meter();
				}
				break;
			case FIELD_TEMPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); field_tempo();
				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); field_voice();
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
			setState(62); match(FIELD_NUMBER);
			setState(64);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(63); match(EOL);
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
			setState(66); match(FIELD_TITLE);
			setState(68);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(67); match(EOL);
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
			setState(70); match(FIELD_COMPOSER);
			setState(72);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(71); match(EOL);
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
			setState(74); match(FIELD_METER);
			setState(76);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(75); match(EOL);
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
			setState(78); match(FIELD_DEFAULT_LENGTH);
			setState(80);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(79); match(EOL);
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
			setState(82); match(FIELD_TEMPO);
			setState(84);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(83); match(EOL);
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
			setState(86); match(FIELD_VOICE);
			setState(88);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(87); match(EOL);
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
			setState(90); match(FIELD_KEY);
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(91); match(EOL);
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94); abc_line();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_VOICE) | (1L << NOTE) | (1L << CHORDS) | (1L << BARLINE) | (1L << NTH_REPEAT) | (1L << TUPLET) | (1L << END) | (1L << EOL))) != 0) );
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
			int _alt;
			setState(105);
			switch (_input.LA(1)) {
			case NOTE:
			case CHORDS:
			case BARLINE:
			case NTH_REPEAT:
			case TUPLET:
			case END:
			case EOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99); element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(102); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); mid_tune_field();
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
		enterRule(_localctx, 26, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(FIELD_VOICE);
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(108); match(EOL);
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
		public Nth_repeatContext nth_repeat() {
			return getRuleContext(Nth_repeatContext.class,0);
		}
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
		public TerminalNode END() { return getToken(HelloParser.END, 0); }
		public List<TerminalNode> SPACE() { return getTokens(HelloParser.SPACE); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
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
		enterRule(_localctx, 28, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			switch (_input.LA(1)) {
			case NOTE:
			case CHORDS:
				{
				setState(111); note_element();
				}
				break;
			case TUPLET:
				{
				setState(112); tuplet_element();
				}
				break;
			case BARLINE:
				{
				setState(113); bar_line();
				}
				break;
			case NTH_REPEAT:
				{
				setState(114); nth_repeat();
				}
				break;
			case END:
				{
				setState(115); match(END);
				}
				break;
			case EOL:
				{
				setState(116); match(EOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(119); match(SPACE);
				}
				}
				setState(124);
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

	public static class Note_elementContext extends ParserRuleContext {
		public TerminalNode CHORDS() { return getToken(HelloParser.CHORDS, 0); }
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
		enterRule(_localctx, 30, RULE_note_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==NOTE || _la==CHORDS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode TUPLET() { return getToken(HelloParser.TUPLET, 0); }
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
		enterRule(_localctx, 32, RULE_tuplet_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(TUPLET);
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

	public static class Nth_repeatContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(HelloParser.NTH_REPEAT, 0); }
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNth_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNth_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nth_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(NTH_REPEAT);
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
		public TerminalNode BARLINE() { return getToken(HelloParser.BARLINE, 0); }
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
		enterRule(_localctx, 36, RULE_bar_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(BARLINE);
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(132); match(EOL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u008a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\5\5"+
		"C\n\5\3\6\3\6\5\6G\n\6\3\7\3\7\5\7K\n\7\3\b\3\b\5\bO\n\b\3\t\3\t\5\tS"+
		"\n\t\3\n\3\n\5\nW\n\n\3\13\3\13\5\13[\n\13\3\f\3\f\5\f_\n\f\3\r\6\rb\n"+
		"\r\r\r\16\rc\3\16\6\16g\n\16\r\16\16\16h\3\16\5\16l\n\16\3\17\3\17\5\17"+
		"p\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20x\n\20\3\20\7\20{\n\20\f\20\16"+
		"\20~\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0088\n\24\3\24"+
		"\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\13\f\u008f"+
		"\2)\3\2\2\2\4/\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nD\3\2\2\2\fH\3\2\2\2\16"+
		"L\3\2\2\2\20P\3\2\2\2\22T\3\2\2\2\24X\3\2\2\2\26\\\3\2\2\2\30a\3\2\2\2"+
		"\32k\3\2\2\2\34m\3\2\2\2\36w\3\2\2\2 \177\3\2\2\2\"\u0081\3\2\2\2$\u0083"+
		"\3\2\2\2&\u0085\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,-\3\2\2\2-.\5\30\r\2.\3\3\2\2\2/\60\5\b\5\2\60\64\5\n\6\2\61\63\5"+
		"\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3"+
		"\2\2\2\66\64\3\2\2\2\678\5\26\f\28\5\3\2\2\29?\5\f\7\2:?\5\20\t\2;?\5"+
		"\16\b\2<?\5\22\n\2=?\5\24\13\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2"+
		">=\3\2\2\2?\7\3\2\2\2@B\7\3\2\2AC\7\36\2\2BA\3\2\2\2BC\3\2\2\2C\t\3\2"+
		"\2\2DF\7\4\2\2EG\7\36\2\2FE\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HJ\7\5\2\2IK"+
		"\7\36\2\2JI\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LN\7\6\2\2MO\7\36\2\2NM\3\2\2"+
		"\2NO\3\2\2\2O\17\3\2\2\2PR\7\t\2\2QS\7\36\2\2RQ\3\2\2\2RS\3\2\2\2S\21"+
		"\3\2\2\2TV\7\b\2\2UW\7\36\2\2VU\3\2\2\2VW\3\2\2\2W\23\3\2\2\2XZ\7\7\2"+
		"\2Y[\7\36\2\2ZY\3\2\2\2Z[\3\2\2\2[\25\3\2\2\2\\^\7\n\2\2]_\7\36\2\2^]"+
		"\3\2\2\2^_\3\2\2\2_\27\3\2\2\2`b\5\32\16\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\31\3\2\2\2eg\5\36\20\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2il\3\2\2\2jl\5\34\17\2kf\3\2\2\2kj\3\2\2\2l\33\3\2\2\2mo\7\7\2\2"+
		"np\7\36\2\2on\3\2\2\2op\3\2\2\2p\35\3\2\2\2qx\5 \21\2rx\5\"\22\2sx\5&"+
		"\24\2tx\5$\23\2ux\7\24\2\2vx\7\36\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt"+
		"\3\2\2\2wu\3\2\2\2wv\3\2\2\2x|\3\2\2\2y{\7#\2\2zy\3\2\2\2{~\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\37\3\2\2\2~|\3\2\2\2\177\u0080\t\2\2\2\u0080!\3\2"+
		"\2\2\u0081\u0082\7\21\2\2\u0082#\3\2\2\2\u0083\u0084\7\20\2\2\u0084%\3"+
		"\2\2\2\u0085\u0087\7\17\2\2\u0086\u0088\7\36\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\'\3\2\2\2\24+\64>BFJNRVZ^chkow|\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}