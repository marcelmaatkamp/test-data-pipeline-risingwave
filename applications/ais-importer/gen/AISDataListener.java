// Generated from /home/marcel/projects/ais_antlr_springboot/src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AISDataParser}.
 */
public interface AISDataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AISDataParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AISDataParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(AISDataParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(AISDataParser.RowContext ctx);
}