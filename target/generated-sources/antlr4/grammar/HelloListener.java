// Generated from Hello.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#abc_tune}.
	 * @param ctx the parse tree
	 */
	void enterAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#abc_tune}.
	 * @param ctx the parse tree
	 */
	void exitAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#abc_line}.
	 * @param ctx the parse tree
	 */
	void enterAbc_line(@NotNull HelloParser.Abc_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#abc_line}.
	 * @param ctx the parse tree
	 */
	void exitAbc_line(@NotNull HelloParser.Abc_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_number}.
	 * @param ctx the parse tree
	 */
	void enterField_number(@NotNull HelloParser.Field_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_number}.
	 * @param ctx the parse tree
	 */
	void exitField_number(@NotNull HelloParser.Field_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bar_line}.
	 * @param ctx the parse tree
	 */
	void enterBar_line(@NotNull HelloParser.Bar_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bar_line}.
	 * @param ctx the parse tree
	 */
	void exitBar_line(@NotNull HelloParser.Bar_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tuplet_element}.
	 * @param ctx the parse tree
	 */
	void enterTuplet_element(@NotNull HelloParser.Tuplet_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tuplet_element}.
	 * @param ctx the parse tree
	 */
	void exitTuplet_element(@NotNull HelloParser.Tuplet_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_composer}.
	 * @param ctx the parse tree
	 */
	void enterField_composer(@NotNull HelloParser.Field_composerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_composer}.
	 * @param ctx the parse tree
	 */
	void exitField_composer(@NotNull HelloParser.Field_composerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_tempo}.
	 * @param ctx the parse tree
	 */
	void enterField_tempo(@NotNull HelloParser.Field_tempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_tempo}.
	 * @param ctx the parse tree
	 */
	void exitField_tempo(@NotNull HelloParser.Field_tempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_title}.
	 * @param ctx the parse tree
	 */
	void enterField_title(@NotNull HelloParser.Field_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_title}.
	 * @param ctx the parse tree
	 */
	void exitField_title(@NotNull HelloParser.Field_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#other_fields}.
	 * @param ctx the parse tree
	 */
	void enterOther_fields(@NotNull HelloParser.Other_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#other_fields}.
	 * @param ctx the parse tree
	 */
	void exitOther_fields(@NotNull HelloParser.Other_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#close_bracet}.
	 * @param ctx the parse tree
	 */
	void enterClose_bracet(@NotNull HelloParser.Close_bracetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#close_bracet}.
	 * @param ctx the parse tree
	 */
	void exitClose_bracet(@NotNull HelloParser.Close_bracetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#measure}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(@NotNull HelloParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#measure}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(@NotNull HelloParser.MeasureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_key}.
	 * @param ctx the parse tree
	 */
	void enterField_key(@NotNull HelloParser.Field_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_key}.
	 * @param ctx the parse tree
	 */
	void exitField_key(@NotNull HelloParser.Field_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#abc_header}.
	 * @param ctx the parse tree
	 */
	void enterAbc_header(@NotNull HelloParser.Abc_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#abc_header}.
	 * @param ctx the parse tree
	 */
	void exitAbc_header(@NotNull HelloParser.Abc_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#abc_music}.
	 * @param ctx the parse tree
	 */
	void enterAbc_music(@NotNull HelloParser.Abc_musicContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#abc_music}.
	 * @param ctx the parse tree
	 */
	void exitAbc_music(@NotNull HelloParser.Abc_musicContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mid_tune_field}.
	 * @param ctx the parse tree
	 */
	void enterMid_tune_field(@NotNull HelloParser.Mid_tune_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mid_tune_field}.
	 * @param ctx the parse tree
	 */
	void exitMid_tune_field(@NotNull HelloParser.Mid_tune_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_voice}.
	 * @param ctx the parse tree
	 */
	void enterField_voice(@NotNull HelloParser.Field_voiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_voice}.
	 * @param ctx the parse tree
	 */
	void exitField_voice(@NotNull HelloParser.Field_voiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#measure_end}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_end(@NotNull HelloParser.Measure_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#measure_end}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_end(@NotNull HelloParser.Measure_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#note_element}.
	 * @param ctx the parse tree
	 */
	void enterNote_element(@NotNull HelloParser.Note_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#note_element}.
	 * @param ctx the parse tree
	 */
	void exitNote_element(@NotNull HelloParser.Note_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#chord_element}.
	 * @param ctx the parse tree
	 */
	void enterChord_element(@NotNull HelloParser.Chord_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#chord_element}.
	 * @param ctx the parse tree
	 */
	void exitChord_element(@NotNull HelloParser.Chord_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_meter}.
	 * @param ctx the parse tree
	 */
	void enterField_meter(@NotNull HelloParser.Field_meterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_meter}.
	 * @param ctx the parse tree
	 */
	void exitField_meter(@NotNull HelloParser.Field_meterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field_default_length}.
	 * @param ctx the parse tree
	 */
	void enterField_default_length(@NotNull HelloParser.Field_default_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field_default_length}.
	 * @param ctx the parse tree
	 */
	void exitField_default_length(@NotNull HelloParser.Field_default_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull HelloParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull HelloParser.ElementContext ctx);
}