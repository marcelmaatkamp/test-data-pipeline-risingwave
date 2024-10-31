// Generated from /home/marcel/projects/ais_antlr_springboot/src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AISDataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MMSI=4, DateTime=5, LAT=6, LON=7, SOG=8, COG=9, 
		Heading=10, VesselName=11, IMO=12, CallSign=13, VesselType=14, Status=15, 
		Length=16, Width=17, Draft=18, Cargo=19, TransceiverClass=20, FLOAT=21, 
		NUMBER=22, SIGN=23, MMSINUMBER=24, DATETIME=25, DATE=26, TIME=27, YEAR=28, 
		MONTH=29, DAY=30, HOUR=31, MINUTE=32, SECOND=33, TEXT=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MMSI", "DateTime", "LAT", "LON", "SOG", "COG", 
			"Heading", "VesselName", "IMO", "CallSign", "VesselType", "Status", "Length", 
			"Width", "Draft", "Cargo", "TransceiverClass", "FLOAT", "NUMBER", "SIGN", 
			"MMSINUMBER", "DATETIME", "DATE", "TIME", "YEAR", "MONTH", "DAY", "HOUR", 
			"MINUTE", "SECOND", "DIGIT", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\r'", "'\\n'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MMSI", "DateTime", "LAT", "LON", "SOG", "COG", 
			"Heading", "VesselName", "IMO", "CallSign", "VesselType", "Status", "Length", 
			"Width", "Draft", "Cargo", "TransceiverClass", "FLOAT", "NUMBER", "SIGN", 
			"MMSINUMBER", "DATETIME", "DATE", "TIME", "YEAR", "MONTH", "DAY", "HOUR", 
			"MINUTE", "SECOND", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AISDataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AISData.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u00bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0003\u0015w\b\u0015\u0001\u0015\u0004\u0015"+
		"z\b\u0015\u000b\u0015\f\u0015{\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001\"\u0004\"\u00b1\b\"\u000b\"\f\"\u00b2"+
		"\u0001#\u0004#\u00b6\b#\u000b#\f#\u00b7\u0001#\u0001#\u0000\u0000$\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\u0000E\""+
		"G#\u0001\u0000\u0003\u0001\u000009\u0004\u0000  09AZaz\u0002\u0000\t\t"+
		"  \u00bd\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K\u0001\u0000\u0000\u0000"+
		"\u0005M\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\tQ\u0001"+
		"\u0000\u0000\u0000\u000bS\u0001\u0000\u0000\u0000\rU\u0001\u0000\u0000"+
		"\u0000\u000fW\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013"+
		"[\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017_\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000"+
		"\u0000\u001de\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000!"+
		"i\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000"+
		"\u0000\'o\u0001\u0000\u0000\u0000)q\u0001\u0000\u0000\u0000+v\u0001\u0000"+
		"\u0000\u0000-}\u0001\u0000\u0000\u0000/\u007f\u0001\u0000\u0000\u0000"+
		"1\u0089\u0001\u0000\u0000\u00003\u008d\u0001\u0000\u0000\u00005\u0093"+
		"\u0001\u0000\u0000\u00007\u0099\u0001\u0000\u0000\u00009\u009e\u0001\u0000"+
		"\u0000\u0000;\u00a1\u0001\u0000\u0000\u0000=\u00a4\u0001\u0000\u0000\u0000"+
		"?\u00a7\u0001\u0000\u0000\u0000A\u00aa\u0001\u0000\u0000\u0000C\u00ad"+
		"\u0001\u0000\u0000\u0000E\u00b0\u0001\u0000\u0000\u0000G\u00b5\u0001\u0000"+
		"\u0000\u0000IJ\u0005,\u0000\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005"+
		"\r\u0000\u0000L\u0004\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000N\u0006"+
		"\u0001\u0000\u0000\u0000OP\u0003/\u0017\u0000P\b\u0001\u0000\u0000\u0000"+
		"QR\u00031\u0018\u0000R\n\u0001\u0000\u0000\u0000ST\u0003)\u0014\u0000"+
		"T\f\u0001\u0000\u0000\u0000UV\u0003)\u0014\u0000V\u000e\u0001\u0000\u0000"+
		"\u0000WX\u0003)\u0014\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0003)\u0014"+
		"\u0000Z\u0012\u0001\u0000\u0000\u0000[\\\u0003)\u0014\u0000\\\u0014\u0001"+
		"\u0000\u0000\u0000]^\u0003E\"\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0003"+
		"E\"\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0003E\"\u0000b\u001a\u0001"+
		"\u0000\u0000\u0000cd\u0003+\u0015\u0000d\u001c\u0001\u0000\u0000\u0000"+
		"ef\u0003+\u0015\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0003)\u0014\u0000"+
		"h \u0001\u0000\u0000\u0000ij\u0003)\u0014\u0000j\"\u0001\u0000\u0000\u0000"+
		"kl\u0003)\u0014\u0000l$\u0001\u0000\u0000\u0000mn\u0003E\"\u0000n&\u0001"+
		"\u0000\u0000\u0000op\u0003E\"\u0000p(\u0001\u0000\u0000\u0000qr\u0003"+
		"+\u0015\u0000rs\u0005.\u0000\u0000st\u0003+\u0015\u0000t*\u0001\u0000"+
		"\u0000\u0000uw\u0003-\u0016\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xz\u0007\u0000\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|,\u0001\u0000\u0000\u0000}~\u0005-\u0000\u0000"+
		"~.\u0001\u0000\u0000\u0000\u007f\u0080\u0003C!\u0000\u0080\u0081\u0003"+
		"C!\u0000\u0081\u0082\u0003C!\u0000\u0082\u0083\u0003C!\u0000\u0083\u0084"+
		"\u0003C!\u0000\u0084\u0085\u0003C!\u0000\u0085\u0086\u0003C!\u0000\u0086"+
		"\u0087\u0003C!\u0000\u0087\u0088\u0003C!\u0000\u00880\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u00033\u0019\u0000\u008a\u008b\u0005T\u0000\u0000\u008b"+
		"\u008c\u00035\u001a\u0000\u008c2\u0001\u0000\u0000\u0000\u008d\u008e\u0003"+
		"7\u001b\u0000\u008e\u008f\u0005-\u0000\u0000\u008f\u0090\u00039\u001c"+
		"\u0000\u0090\u0091\u0005-\u0000\u0000\u0091\u0092\u0003;\u001d\u0000\u0092"+
		"4\u0001\u0000\u0000\u0000\u0093\u0094\u0003=\u001e\u0000\u0094\u0095\u0005"+
		":\u0000\u0000\u0095\u0096\u0003?\u001f\u0000\u0096\u0097\u0005:\u0000"+
		"\u0000\u0097\u0098\u0003A \u0000\u00986\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0003C!\u0000\u009a\u009b\u0003C!\u0000\u009b\u009c\u0003C!\u0000"+
		"\u009c\u009d\u0003C!\u0000\u009d8\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0003C!\u0000\u009f\u00a0\u0003C!\u0000\u00a0:\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0003C!\u0000\u00a2\u00a3\u0003C!\u0000\u00a3<\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0003C!\u0000\u00a5\u00a6\u0003C!\u0000\u00a6"+
		">\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003C!\u0000\u00a8\u00a9\u0003"+
		"C!\u0000\u00a9@\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003C!\u0000\u00ab"+
		"\u00ac\u0003C!\u0000\u00acB\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007"+
		"\u0000\u0000\u0000\u00aeD\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0001"+
		"\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3F\u0001\u0000\u0000\u0000\u00b4\u00b6\u0007\u0002\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006#\u0000\u0000"+
		"\u00baH\u0001\u0000\u0000\u0000\u0005\u0000v{\u00b2\u00b7\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}