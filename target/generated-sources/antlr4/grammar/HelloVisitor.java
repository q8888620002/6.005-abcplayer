// Generated from Hello.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#abc_tune}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_tune(@NotNull HelloParser.Abc_tuneContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#abc_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_line(@NotNull HelloParser.Abc_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_number(@NotNull HelloParser.Field_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bar_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBar_line(@NotNull HelloParser.Bar_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#tuplet_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplet_element(@NotNull HelloParser.Tuplet_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_composer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_composer(@NotNull HelloParser.Field_composerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_tempo(@NotNull HelloParser.Field_tempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_title(@NotNull HelloParser.Field_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#other_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_fields(@NotNull HelloParser.Other_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_key(@NotNull HelloParser.Field_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#abc_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_header(@NotNull HelloParser.Abc_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#abc_music}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_music(@NotNull HelloParser.Abc_musicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mid_tune_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMid_tune_field(@NotNull HelloParser.Mid_tune_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_voice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_voice(@NotNull HelloParser.Field_voiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#note_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_element(@NotNull HelloParser.Note_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_meter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_meter(@NotNull HelloParser.Field_meterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field_default_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_default_length(@NotNull HelloParser.Field_default_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull HelloParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#nth_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNth_repeat(@NotNull HelloParser.Nth_repeatContext ctx);
}