// Generated from /home/marcel/projects/ais_antlr_springboot/src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AISDataParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "header", "row"
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

	@Override
	public String getGrammarFileName() { return "AISData.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AISDataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AISDataParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			header();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MMSI) {
				{
				{
				setState(7);
				row();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			row();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode MMSI() { return getToken(AISDataParser.MMSI, 0); }
		public TerminalNode DateTime() { return getToken(AISDataParser.DateTime, 0); }
		public TerminalNode LAT() { return getToken(AISDataParser.LAT, 0); }
		public TerminalNode LON() { return getToken(AISDataParser.LON, 0); }
		public TerminalNode SOG() { return getToken(AISDataParser.SOG, 0); }
		public TerminalNode COG() { return getToken(AISDataParser.COG, 0); }
		public TerminalNode Heading() { return getToken(AISDataParser.Heading, 0); }
		public TerminalNode VesselName() { return getToken(AISDataParser.VesselName, 0); }
		public TerminalNode IMO() { return getToken(AISDataParser.IMO, 0); }
		public TerminalNode TransceiverClass() { return getToken(AISDataParser.TransceiverClass, 0); }
		public TerminalNode CallSign() { return getToken(AISDataParser.CallSign, 0); }
		public TerminalNode VesselType() { return getToken(AISDataParser.VesselType, 0); }
		public TerminalNode Status() { return getToken(AISDataParser.Status, 0); }
		public TerminalNode Length() { return getToken(AISDataParser.Length, 0); }
		public TerminalNode Width() { return getToken(AISDataParser.Width, 0); }
		public TerminalNode Draft() { return getToken(AISDataParser.Draft, 0); }
		public TerminalNode Cargo() { return getToken(AISDataParser.Cargo, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(MMSI);
			setState(18);
			match(T__0);
			setState(19);
			match(DateTime);
			setState(20);
			match(T__0);
			setState(21);
			match(LAT);
			setState(22);
			match(T__0);
			setState(23);
			match(LON);
			setState(24);
			match(T__0);
			setState(25);
			match(SOG);
			setState(26);
			match(T__0);
			setState(27);
			match(COG);
			setState(28);
			match(T__0);
			setState(29);
			match(Heading);
			setState(30);
			match(T__0);
			setState(31);
			match(VesselName);
			setState(32);
			match(T__0);
			setState(33);
			match(IMO);
			setState(34);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CallSign) {
				{
				setState(35);
				match(CallSign);
				}
			}

			setState(38);
			match(T__0);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VesselType) {
				{
				setState(39);
				match(VesselType);
				}
			}

			setState(42);
			match(T__0);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Status) {
				{
				setState(43);
				match(Status);
				}
			}

			setState(46);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Length) {
				{
				setState(47);
				match(Length);
				}
			}

			setState(50);
			match(T__0);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Width) {
				{
				setState(51);
				match(Width);
				}
			}

			setState(54);
			match(T__0);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Draft) {
				{
				setState(55);
				match(Draft);
				}
			}

			setState(58);
			match(T__0);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Cargo) {
				{
				setState(59);
				match(Cargo);
				}
			}

			setState(62);
			match(T__0);
			setState(63);
			match(TransceiverClass);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(64);
				match(T__1);
				}
			}

			setState(67);
			match(T__2);
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
		"\u0004\u0001#F\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0001\u0000\u0001\u0000\u0005\u0000\t\b\u0000\n\u0000\f\u0000"+
		"\f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00021\b\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000"+
		"\u0000K\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000"+
		"\u0000\u0004\u0011\u0001\u0000\u0000\u0000\u0006\n\u0003\u0002\u0001\u0000"+
		"\u0007\t\u0003\u0004\u0002\u0000\b\u0007\u0001\u0000\u0000\u0000\t\f\u0001"+
		"\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\r\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0003\u0004\u0002\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0005\u0004\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014"+
		"\u0005\u0005\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016"+
		"\u0005\u0006\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018"+
		"\u0005\u0007\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a"+
		"\u0005\b\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\t\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005\n"+
		"\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0005\u000b\u0000"+
		"\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\f\u0000\u0000\"$\u0005\u0001"+
		"\u0000\u0000#%\u0005\r\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0005\u0001\u0000\u0000\')\u0005"+
		"\u000e\u0000\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0005\u0001\u0000\u0000+-\u0005\u000f\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0005\u0001\u0000\u0000/1\u0005\u0010\u0000\u00000/\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0005\u0001\u0000\u000035\u0005\u0011\u0000\u000043\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0005\u0001"+
		"\u0000\u000079\u0005\u0012\u0000\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0005\u0001\u0000\u0000"+
		";=\u0005\u0013\u0000\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000\u0000?A\u0005\u0014"+
		"\u0000\u0000@B\u0005\u0002\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000\t\n$(,048<A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}