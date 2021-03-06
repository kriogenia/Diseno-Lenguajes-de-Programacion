// Generated from E:/Clase/DLP/Diseno-Lenguajes-de-Programacion/src/parser\Cmm.g4 by ANTLR 4.8
package parser;

    import java.util.Stack;
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.sentences.*;
    import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, WS=36, SCOMMENT=37, MCOMMENT=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, ID=41, CHAR_CONSTANT=42;
	public static final int
		RULE_program = 0, RULE_vardef = 1, RULE_funcdef = 2, RULE_type = 3, RULE_primitiveType = 4, 
		RULE_voidType = 5, RULE_sentence = 6, RULE_expr = 7, RULE_funccall = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "vardef", "funcdef", "type", "primitiveType", "voidType", 
			"sentence", "expr", "funccall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'('", "')'", "'{'", "'}'", "'struct'", "'['", "']'", 
			"'int'", "'char'", "'double'", "'void'", "'return'", "'while'", "'if'", 
			"'else'", "'write'", "'read'", "'='", "'.'", "'-'", "'*'", "'/'", "'%'", 
			"'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "SCOMMENT", "MCOMMENT", "INT_CONSTANT", "REAL_CONSTANT", "ID", 
			"CHAR_CONSTANT"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public VardefContext vardef;
		public FuncdefContext funcdef;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   ((ProgramContext)_localctx).ast =  new Program();   
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(19);
					((ProgramContext)_localctx).vardef = vardef();
					   _localctx.ast.addAll(((ProgramContext)_localctx).vardef.ast);   
					}
					break;
				case 2:
					{
					setState(22);
					((ProgramContext)_localctx).funcdef = funcdef();
					   _localctx.ast.add(((ProgramContext)_localctx).funcdef.ast); 
					}
					break;
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) );
			setState(29);
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

	public static class VardefContext extends ParserRuleContext {
		public List<Definition> ast;
		public TypeContext type;
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   ((VardefContext)_localctx).ast =  new ArrayList<>();   
			setState(32);
			((VardefContext)_localctx).type = type(0);
			setState(33);
			((VardefContext)_localctx).id1 = match(ID);
			   _localctx.ast.add(new VariableDefinition(((VardefContext)_localctx).id1.getLine(), ((VardefContext)_localctx).id1.getCharPositionInLine(), (((VardefContext)_localctx).id1!=null?((VardefContext)_localctx).id1.getText():null), ((VardefContext)_localctx).type.ast));   
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				match(T__0);
				setState(36);
				((VardefContext)_localctx).id2 = match(ID);
				   _localctx.ast.add(new VariableDefinition(((VardefContext)_localctx).id2.getLine(), ((VardefContext)_localctx).id2.getCharPositionInLine(), (((VardefContext)_localctx).id2!=null?((VardefContext)_localctx).id2.getText():null), ((VardefContext)_localctx).type.ast));   
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__1);
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

	public static class FuncdefContext extends ParserRuleContext {
		public Definition ast;
		public PrimitiveTypeContext primitiveType;
		public VoidTypeContext voidType;
		public Token fid;
		public PrimitiveTypeContext t1;
		public Token id1;
		public PrimitiveTypeContext tn;
		public Token idn;
		public VardefContext vardef;
		public SentenceContext sentence;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<PrimitiveTypeContext> primitiveType() {
			return getRuleContexts(PrimitiveTypeContext.class);
		}
		public PrimitiveTypeContext primitiveType(int i) {
			return getRuleContext(PrimitiveTypeContext.class,i);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   List<VariableDefinition> params = new ArrayList<>();
			        List<Sentence> sentences = new ArrayList<>();       
			   Type rt = null; 
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(47);
				((FuncdefContext)_localctx).primitiveType = primitiveType();
				   rt = ((FuncdefContext)_localctx).primitiveType.ast;    
				}
				break;
			case T__12:
				{
				setState(50);
				((FuncdefContext)_localctx).voidType = voidType();
				   rt = ((FuncdefContext)_localctx).voidType.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55);
			((FuncdefContext)_localctx).fid = match(ID);
			setState(56);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(57);
				((FuncdefContext)_localctx).t1 = ((FuncdefContext)_localctx).primitiveType = primitiveType();
				setState(58);
				((FuncdefContext)_localctx).id1 = match(ID);
				   params.add(new VariableDefinition(((FuncdefContext)_localctx).id1.getLine(), ((FuncdefContext)_localctx).id1.getCharPositionInLine(), (((FuncdefContext)_localctx).id1!=null?((FuncdefContext)_localctx).id1.getText():null), ((FuncdefContext)_localctx).t1.ast));   
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(60);
					match(T__0);
					setState(61);
					((FuncdefContext)_localctx).tn = ((FuncdefContext)_localctx).primitiveType = primitiveType();
					setState(62);
					((FuncdefContext)_localctx).idn = match(ID);
					   params.add(new VariableDefinition(((FuncdefContext)_localctx).idn.getLine(), ((FuncdefContext)_localctx).idn.getCharPositionInLine(), (((FuncdefContext)_localctx).idn!=null?((FuncdefContext)_localctx).idn.getText():null), ((FuncdefContext)_localctx).tn.ast));   
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72);
			match(T__3);
			setState(73);
			match(T__4);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(74);
				((FuncdefContext)_localctx).vardef = vardef();
				   ((FuncdefContext)_localctx).vardef.ast.forEach(vd -> sentences.add((VariableDefinition)vd));    
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(82);
				((FuncdefContext)_localctx).sentence = sentence();
				   sentences.add(((FuncdefContext)_localctx).sentence.ast);    
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__5);
			   Type ft = new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), params, rt);
			        ((FuncdefContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), (((FuncdefContext)_localctx).fid!=null?((FuncdefContext)_localctx).fid.getText():null), ft, sentences);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext it;
		public PrimitiveTypeContext primitiveType;
		public TypeContext type;
		public Token id1;
		public Token id2;
		public Token INT_CONSTANT;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(94);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case T__6:
				{
				{
				setState(97);
				match(T__6);
				setState(98);
				match(T__4);
				List<RecordField> list = new ArrayList<>();
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					((TypeContext)_localctx).type = type(0);
					setState(101);
					((TypeContext)_localctx).id1 = match(ID);
					list.add(new RecordField(((TypeContext)_localctx).id1.getLine(), ((TypeContext)_localctx).id1.getCharPositionInLine(), (((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null), ((TypeContext)_localctx).type.ast));
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(103);
						match(T__0);
						setState(104);
						((TypeContext)_localctx).id2 = match(ID);
						   list.add(new RecordField(((TypeContext)_localctx).id2.getLine(), ((TypeContext)_localctx).id2.getCharPositionInLine(), (((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null), ((TypeContext)_localctx).type.ast));   
						}
						}
						setState(110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(111);
					match(T__1);
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) );
				setState(117);
				match(T__5);
				((TypeContext)_localctx).ast =  new RecordType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), list);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.it = _prevctx;
					_localctx.it = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					Stack<Integer> sizes = new Stack<>();
					setState(128); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(124);
							match(T__7);
							setState(125);
							((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
							setState(126);
							match(T__8);
							sizes.add(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)) );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(130); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					   ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), sizes.pop(), ((TypeContext)_localctx).it.ast);
					                      while (!sizes.isEmpty())
					                          ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), sizes.pop(), _localctx.ast);
					                  
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__9);
				 ((PrimitiveTypeContext)_localctx).ast =  IntegerType.getInstance();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__10);
				 ((PrimitiveTypeContext)_localctx).ast =  CharacterType.getInstance();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__11);
				 ((PrimitiveTypeContext)_localctx).ast =  RealType.getInstance();
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

	public static class VoidTypeContext extends ParserRuleContext {
		public Type ast;
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__12);
			((VoidTypeContext)_localctx).ast =  VoidType.getInstance();
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

	public static class SentenceContext extends ParserRuleContext {
		public Sentence ast;
		public FunccallContext funccall;
		public ExprContext expr;
		public SentenceContext s;
		public SentenceContext sn;
		public SentenceContext t;
		public SentenceContext tn;
		public SentenceContext e;
		public SentenceContext en;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext ei;
		public ExprContext er;
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentence);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((SentenceContext)_localctx).funccall = funccall();
				setState(150);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  ((SentenceContext)_localctx).funccall.ast;   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__13);
				setState(154);
				((SentenceContext)_localctx).expr = expr(0);
				setState(155);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  new Return(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((SentenceContext)_localctx).expr.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				   List<Sentence> sentences = new ArrayList<>();   
				setState(159);
				match(T__14);
				setState(160);
				match(T__2);
				setState(161);
				((SentenceContext)_localctx).expr = expr(0);
				setState(162);
				match(T__3);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__13:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__32:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case ID:
				case CHAR_CONSTANT:
					{
					setState(163);
					((SentenceContext)_localctx).s = sentence();
					   sentences.add(((SentenceContext)_localctx).s.ast);   
					}
					break;
				case T__4:
					{
					setState(166);
					match(T__4);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(167);
						((SentenceContext)_localctx).sn = sentence();
						   sentences.add(((SentenceContext)_localctx).sn.ast);  
						}
						}
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(175);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				   ((SentenceContext)_localctx).ast =  new While(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((SentenceContext)_localctx).expr.ast,
				            sentences);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				 List<Sentence> then = new ArrayList<>();
				        List<Sentence> _else = new ArrayList<>();   
				setState(181);
				match(T__15);
				setState(182);
				match(T__2);
				setState(183);
				((SentenceContext)_localctx).expr = expr(0);
				setState(184);
				match(T__3);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__13:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__32:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case ID:
				case CHAR_CONSTANT:
					{
					setState(185);
					((SentenceContext)_localctx).t = sentence();
					   then.add(((SentenceContext)_localctx).t.ast);   
					}
					break;
				case T__4:
					{
					setState(188);
					match(T__4);
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(189);
						((SentenceContext)_localctx).tn = sentence();
						   then.add(((SentenceContext)_localctx).tn.ast);   
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(197);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(200);
					match(T__16);
					setState(214);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
					case T__13:
					case T__14:
					case T__15:
					case T__17:
					case T__18:
					case T__21:
					case T__32:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case ID:
					case CHAR_CONSTANT:
						{
						setState(201);
						((SentenceContext)_localctx).e = sentence();
						   _else.add(((SentenceContext)_localctx).e.ast);   
						}
						break;
					case T__4:
						{
						setState(204);
						match(T__4);
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
							{
							{
							setState(205);
							((SentenceContext)_localctx).en = sentence();
							   _else.add(((SentenceContext)_localctx).en.ast);   
							}
							}
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(213);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				   ((SentenceContext)_localctx).ast =  new If(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((SentenceContext)_localctx).expr.ast, then, _else);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 List<Expression> exprs = new ArrayList<>();    
				setState(221);
				match(T__17);
				setState(222);
				((SentenceContext)_localctx).e1 = expr(0);
				   exprs.add(((SentenceContext)_localctx).e1.ast);    
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(224);
					match(T__0);
					setState(225);
					((SentenceContext)_localctx).e2 = expr(0);
					   exprs.add(((SentenceContext)_localctx).e2.ast);    
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  new Write(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), exprs); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 List<Expression> exprs = new ArrayList<>();    
				setState(237);
				match(T__18);
				setState(238);
				((SentenceContext)_localctx).e1 = expr(0);
				   exprs.add(((SentenceContext)_localctx).e1.ast);    
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(240);
					match(T__0);
					setState(241);
					((SentenceContext)_localctx).e2 = expr(0);
					   exprs.add(((SentenceContext)_localctx).e2.ast);    
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  new Read(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), exprs); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				((SentenceContext)_localctx).ei = expr(0);
				setState(253);
				match(T__19);
				setState(254);
				((SentenceContext)_localctx).er = expr(0);
				setState(255);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  new Assign(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((SentenceContext)_localctx).ei.ast, ((SentenceContext)_localctx).er.ast);    
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

	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext el;
		public ExprContext e;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public PrimitiveTypeContext primitiveType;
		public FunccallContext funccall;
		public Token op;
		public ExprContext er;
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(261);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				   ((ExprContext)_localctx).ast =  new IntegerLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)));   
				}
				break;
			case 2:
				{
				setState(263);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				   ((ExprContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToReal((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(265);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				   ((ExprContext)_localctx).ast =  new CharacterLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(267);
				((ExprContext)_localctx).ID = match(ID);
				   ((ExprContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));  
				}
				break;
			case 5:
				{
				setState(269);
				match(T__2);
				setState(270);
				((ExprContext)_localctx).e = expr(0);
				setState(271);
				match(T__3);
				   ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).e.ast;  
				}
				break;
			case 6:
				{
				setState(274);
				match(T__2);
				setState(275);
				((ExprContext)_localctx).primitiveType = primitiveType();
				setState(276);
				match(T__3);
				setState(277);
				((ExprContext)_localctx).e = expr(8);
				   ((ExprContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).primitiveType.ast);  
				}
				break;
			case 7:
				{
				setState(280);
				match(T__21);
				setState(281);
				((ExprContext)_localctx).e = expr(7);
				   ((ExprContext)_localctx).ast =  new UnaryMinusOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast);   
				}
				break;
			case 8:
				{
				setState(284);
				match(T__32);
				setState(285);
				((ExprContext)_localctx).e = expr(3);
				   ((ExprContext)_localctx).ast =  new LogicalNotOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast);   
				}
				break;
			case 9:
				{
				setState(288);
				((ExprContext)_localctx).funccall = funccall();
				   ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).funccall.ast;   
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(294);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((ExprContext)_localctx).er = expr(7);
						   ((ExprContext)_localctx).ast =  new ArithmeticOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(299);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__25) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						((ExprContext)_localctx).er = expr(6);
						   ((ExprContext)_localctx).ast =  new ArithmeticOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(304);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						((ExprContext)_localctx).er = expr(5);
						   ((ExprContext)_localctx).ast =  new ComparisonOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						((ExprContext)_localctx).er = expr(3);
						   ((ExprContext)_localctx).ast =  new LogicalOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(314);
						match(T__7);
						setState(315);
						((ExprContext)_localctx).er = expr(0);
						setState(316);
						match(T__8);
						   ((ExprContext)_localctx).ast =  new ArrayAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, ((ExprContext)_localctx).er.ast);   
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(320);
						match(T__20);
						setState(321);
						((ExprContext)_localctx).ID = match(ID);
						   ((ExprContext)_localctx).ast =  new FieldAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).e.ast); 
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunccallContext extends ParserRuleContext {
		public Call ast;
		public Token ID;
		public ExprContext e1;
		public ExprContext en;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   List<Expression> params = new ArrayList<>();  
			setState(329);
			((FunccallContext)_localctx).ID = match(ID);
			setState(330);
			match(T__2);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(331);
				((FunccallContext)_localctx).e1 = expr(0);
				   params.add(((FunccallContext)_localctx).e1.ast);    
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(333);
					match(T__0);
					setState(334);
					((FunccallContext)_localctx).en = expr(0);
					   params.add(((FunccallContext)_localctx).en.ast);    
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(T__3);
			   ((FunccallContext)_localctx).ast =  new Call(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
			                    new Variable(((FunccallContext)_localctx).ID.getLine(), ((FunccallContext)_localctx).ID.getCharPositionInLine(), (((FunccallContext)_localctx).ID!=null?((FunccallContext)_localctx).ID.getText():null)), params);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4\f\4\16"+
		"\4G\13\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\4\3\4"+
		"\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\3\5\6\5t\n\5\r\5\16"+
		"\5u\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0083\n\5\r\5\16"+
		"\5\u0084\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0093\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0"+
		"\13\b\3\b\5\b\u00b3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\5\b\u00c9\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\b\5\b\u00d9"+
		"\n\b\5\b\u00db\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e7\n"+
		"\b\f\b\16\b\u00ea\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00f7\n\b\f\b\16\b\u00fa\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0105\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0126"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0146\n\t\f"+
		"\t\16\t\u0149\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0154\n\n\f"+
		"\n\16\n\u0157\13\n\5\n\u0159\n\n\3\n\3\n\3\n\3\n\2\4\b\20\13\2\4\6\b\n"+
		"\f\16\20\22\2\6\3\2\31\33\4\2\30\30\34\34\3\2\35\"\3\2$%\2\u0182\2\24"+
		"\3\2\2\2\4!\3\2\2\2\6/\3\2\2\2\bz\3\2\2\2\n\u0092\3\2\2\2\f\u0094\3\2"+
		"\2\2\16\u0104\3\2\2\2\20\u0125\3\2\2\2\22\u014a\3\2\2\2\24\33\b\2\1\2"+
		"\25\26\5\4\3\2\26\27\b\2\1\2\27\34\3\2\2\2\30\31\5\6\4\2\31\32\b\2\1\2"+
		"\32\34\3\2\2\2\33\25\3\2\2\2\33\30\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\b\3\1\2\"#\5\b"+
		"\5\2#$\7+\2\2$*\b\3\1\2%&\7\3\2\2&\'\7+\2\2\')\b\3\1\2(%\3\2\2\2),\3\2"+
		"\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\4\2\2.\5\3\2\2\2/\60"+
		"\b\4\1\2\60\67\b\4\1\2\61\62\5\n\6\2\62\63\b\4\1\2\638\3\2\2\2\64\65\5"+
		"\f\7\2\65\66\b\4\1\2\668\3\2\2\2\67\61\3\2\2\2\67\64\3\2\2\289\3\2\2\2"+
		"9:\7+\2\2:H\7\5\2\2;<\5\n\6\2<=\7+\2\2=E\b\4\1\2>?\7\3\2\2?@\5\n\6\2@"+
		"A\7+\2\2AB\b\4\1\2BD\3\2\2\2C>\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F"+
		"I\3\2\2\2GE\3\2\2\2H;\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\6\2\2KQ\7\7\2\2"+
		"LM\5\4\3\2MN\b\4\1\2NP\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"RY\3\2\2\2SQ\3\2\2\2TU\5\16\b\2UV\b\4\1\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\b\2\2]^\b\4\1\2^\7\3"+
		"\2\2\2_`\b\5\1\2`a\5\n\6\2ab\b\5\1\2b{\3\2\2\2cd\7\t\2\2de\7\7\2\2es\b"+
		"\5\1\2fg\5\b\5\2gh\7+\2\2hn\b\5\1\2ij\7\3\2\2jk\7+\2\2km\b\5\1\2li\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\4\2\2rt\3\2"+
		"\2\2sf\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\b\2\2xy\b\5"+
		"\1\2y{\3\2\2\2z_\3\2\2\2zc\3\2\2\2{\u0089\3\2\2\2|}\f\3\2\2}\u0082\b\5"+
		"\1\2~\177\7\n\2\2\177\u0080\7)\2\2\u0080\u0081\7\13\2\2\u0081\u0083\b"+
		"\5\1\2\u0082~\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\b\5\1\2\u0087|\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u0093\b\6\1\2\u008e\u008f"+
		"\7\r\2\2\u008f\u0093\b\6\1\2\u0090\u0091\7\16\2\2\u0091\u0093\b\6\1\2"+
		"\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093\13"+
		"\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0096\b\7\1\2\u0096\r\3\2\2\2\u0097"+
		"\u0098\5\22\n\2\u0098\u0099\7\4\2\2\u0099\u009a\b\b\1\2\u009a\u0105\3"+
		"\2\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\4\2\2\u009e"+
		"\u009f\b\b\1\2\u009f\u0105\3\2\2\2\u00a0\u00a1\b\b\1\2\u00a1\u00a2\7\21"+
		"\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00b2\7\6\2\2\u00a5"+
		"\u00a6\5\16\b\2\u00a6\u00a7\b\b\1\2\u00a7\u00b3\3\2\2\2\u00a8\u00ae\7"+
		"\7\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\b\b\1\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\b\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\b"+
		"\1\2\u00b5\u0105\3\2\2\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\7\22\2\2\u00b8"+
		"\u00b9\7\5\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00c8\7\6\2\2\u00bb\u00bc\5"+
		"\16\b\2\u00bc\u00bd\b\b\1\2\u00bd\u00c9\3\2\2\2\u00be\u00c4\7\7\2\2\u00bf"+
		"\u00c0\5\16\b\2\u00c0\u00c1\b\b\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7\b\2\2\u00c8\u00bb\3\2"+
		"\2\2\u00c8\u00be\3\2\2\2\u00c9\u00da\3\2\2\2\u00ca\u00d8\7\23\2\2\u00cb"+
		"\u00cc\5\16\b\2\u00cc\u00cd\b\b\1\2\u00cd\u00d9\3\2\2\2\u00ce\u00d4\7"+
		"\7\2\2\u00cf\u00d0\5\16\b\2\u00d0\u00d1\b\b\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\b\2\2\u00d8"+
		"\u00cb\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00ca\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\b\1\2\u00dd"+
		"\u0105\3\2\2\2\u00de\u00df\b\b\1\2\u00df\u00e0\7\24\2\2\u00e0\u00e1\5"+
		"\20\t\2\u00e1\u00e8\b\b\1\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4\5\20\t\2\u00e4"+
		"\u00e5\b\b\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\b\b\1\2\u00ed\u0105\3\2"+
		"\2\2\u00ee\u00ef\b\b\1\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\5\20\t\2\u00f1"+
		"\u00f8\b\b\1\2\u00f2\u00f3\7\3\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\b"+
		"\b\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd\b\b\1\2\u00fd\u0105\3\2\2\2\u00fe"+
		"\u00ff\5\20\t\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\20\t\2\u0101\u0102"+
		"\7\4\2\2\u0102\u0103\b\b\1\2\u0103\u0105\3\2\2\2\u0104\u0097\3\2\2\2\u0104"+
		"\u009b\3\2\2\2\u0104\u00a0\3\2\2\2\u0104\u00b6\3\2\2\2\u0104\u00de\3\2"+
		"\2\2\u0104\u00ee\3\2\2\2\u0104\u00fe\3\2\2\2\u0105\17\3\2\2\2\u0106\u0107"+
		"\b\t\1\2\u0107\u0108\7)\2\2\u0108\u0126\b\t\1\2\u0109\u010a\7*\2\2\u010a"+
		"\u0126\b\t\1\2\u010b\u010c\7,\2\2\u010c\u0126\b\t\1\2\u010d\u010e\7+\2"+
		"\2\u010e\u0126\b\t\1\2\u010f\u0110\7\5\2\2\u0110\u0111\5\20\t\2\u0111"+
		"\u0112\7\6\2\2\u0112\u0113\b\t\1\2\u0113\u0126\3\2\2\2\u0114\u0115\7\5"+
		"\2\2\u0115\u0116\5\n\6\2\u0116\u0117\7\6\2\2\u0117\u0118\5\20\t\n\u0118"+
		"\u0119\b\t\1\2\u0119\u0126\3\2\2\2\u011a\u011b\7\30\2\2\u011b\u011c\5"+
		"\20\t\t\u011c\u011d\b\t\1\2\u011d\u0126\3\2\2\2\u011e\u011f\7#\2\2\u011f"+
		"\u0120\5\20\t\5\u0120\u0121\b\t\1\2\u0121\u0126\3\2\2\2\u0122\u0123\5"+
		"\22\n\2\u0123\u0124\b\t\1\2\u0124\u0126\3\2\2\2\u0125\u0106\3\2\2\2\u0125"+
		"\u0109\3\2\2\2\u0125\u010b\3\2\2\2\u0125\u010d\3\2\2\2\u0125\u010f\3\2"+
		"\2\2\u0125\u0114\3\2\2\2\u0125\u011a\3\2\2\2\u0125\u011e\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0126\u0147\3\2\2\2\u0127\u0128\f\b\2\2\u0128\u0129\t\2"+
		"\2\2\u0129\u012a\5\20\t\t\u012a\u012b\b\t\1\2\u012b\u0146\3\2\2\2\u012c"+
		"\u012d\f\7\2\2\u012d\u012e\t\3\2\2\u012e\u012f\5\20\t\b\u012f\u0130\b"+
		"\t\1\2\u0130\u0146\3\2\2\2\u0131\u0132\f\6\2\2\u0132\u0133\t\4\2\2\u0133"+
		"\u0134\5\20\t\7\u0134\u0135\b\t\1\2\u0135\u0146\3\2\2\2\u0136\u0137\f"+
		"\4\2\2\u0137\u0138\t\5\2\2\u0138\u0139\5\20\t\5\u0139\u013a\b\t\1\2\u013a"+
		"\u0146\3\2\2\2\u013b\u013c\f\f\2\2\u013c\u013d\7\n\2\2\u013d\u013e\5\20"+
		"\t\2\u013e\u013f\7\13\2\2\u013f\u0140\b\t\1\2\u0140\u0146\3\2\2\2\u0141"+
		"\u0142\f\13\2\2\u0142\u0143\7\27\2\2\u0143\u0144\7+\2\2\u0144\u0146\b"+
		"\t\1\2\u0145\u0127\3\2\2\2\u0145\u012c\3\2\2\2\u0145\u0131\3\2\2\2\u0145"+
		"\u0136\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\21\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014b\b\n\1\2\u014b\u014c\7+\2\2\u014c\u0158\7\5\2\2\u014d"+
		"\u014e\5\20\t\2\u014e\u0155\b\n\1\2\u014f\u0150\7\3\2\2\u0150\u0151\5"+
		"\20\t\2\u0151\u0152\b\n\1\2\u0152\u0154\3\2\2\2\u0153\u014f\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\7\6\2\2\u015b\u015c\b\n\1\2\u015c\23\3\2\2"+
		"\2\37\33\35*\67EHQYnuz\u0084\u0089\u0092\u00ae\u00b2\u00c4\u00c8\u00d4"+
		"\u00d8\u00da\u00e8\u00f8\u0104\u0125\u0145\u0147\u0155\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}