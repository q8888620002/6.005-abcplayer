/**
 * Define a grammar called Hello
 */

grammar Hello;


abc_tune : abc_header+ abc_music;
abc_header : field_number field_title other_fields* field_key;

other_fields : 
	field_composer | field_default_length | field_meter
	| field_tempo| field_voice ;

field_number:FIELD_NUMBER (EOL)?;
field_title: FIELD_TITLE (EOL)?;
field_composer : FIELD_COMPOSER (EOL)?;
field_meter: FIELD_METER (EOL)?;
field_default_length: FIELD_DEFAULT_LENGTH (EOL)?;
field_tempo : FIELD_TEMPO (EOL)?;
field_voice : FIELD_VOICE (EOL)?;
field_key : FIELD_KEY (EOL)?;

FIELD_NUMBER:'X:'(WS)*DIGIT+ (WS)*;
FIELD_TITLE:'T:' (WS)*TEXT+ (WS)*;
FIELD_COMPOSER:'C:' TEXT+ (WS)* ;
FIELD_METER:'M:'(WS)* METER (WS)* ;
FIELD_VOICE:'V:'(WS)* VOICE_CHANNEL (WS)* ;
FIELD_TEMPO:'Q:'(WS)* TEMPO(WS)*  ;
FIELD_DEFAULT_LENGTH: 'L:'(WS)* NOTE_LENGTH_STRICT (WS)* ;
FIELD_KEY: 'K:'(WS)*KEY(WS)* ;


abc_music : abc_line+;
abc_line : element+| mid_tune_field   ;
mid_tune_field: FIELD_VOICE (EOL)?;
element : (note_element |tuplet_element |
	bar_line | nth_repeat |END |EOL)(SPACE*);
note_element: NOTE |CHORDS;
tuplet_element: TUPLET;
nth_repeat : NTH_REPEAT ;
bar_line : BARLINE (EOL)? ; 

NOTE:(WS)? (PITCH | REST) DURATION? (WS)? ;
CHORDS: (WS)?'['NOTE+']'(WS)?;
DURATION: DIGIT+ | FRACTION ;

FRACTION:(DIGIT+)? SLASH (DIGIT+)?; 
BARLINE: (WS?)('|' | '||' | '[|' | '|]' | ':|' | '|:')(WS?);
NTH_REPEAT :('[1' | '[2');
TUPLET: (WS)?'('('2'|'3'|'4')(PITCH+|CHORDS|NOTE)+;

PITCH :  ACCIDENTAL? BASENOTE OCTAVE?;
OCTAVE: ('\''|',')+;
END:']';

BASENOTE : ('A'..'G' | 'a'..'g');
REST:'z';
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';



METER : 'C'|'C|' | FRACTION ;

NOTE_LENGTH : FRACTION;
NOTE_LENGTH_STRICT : FRACTION ;
VOICE_CHANNEL: DIGIT+;
TEMPO : (FRACTION '=')? DIGIT+ ;

TEXT: (~'\n'); 
EOL: NEWLINE|COMMENT;
SLASH:'/' ;
DIGIT: [0-9];
CHARACTER:'.'|'/'|',';
NEWLINE:[\n]+ ;
SPACE:[ \t]+-> skip ;
SYMBOL :':';
WS : [ \t\r\n]+ ; // skip spaces, tabs, newlines
COMMENT:'%' TEXT* NEWLINE;

KEY : KEY_ACCIDENTAL? BASENOTE  MODE_MINOR?;

MODE_MINOR: 'm';
KEY_ACCIDENTAL:'#' | 'b';