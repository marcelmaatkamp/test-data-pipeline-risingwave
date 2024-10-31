// Generated from /home/marcel/projects/ais_antlr_springboot/src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AISDataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AISDataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AISDataParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(AISDataParser.RowContext ctx);
}