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
			setState(30);
			((VardefContext)_localctx).type = type(0);
			setState(31);
			((VardefContext)_localctx).id1 = match(ID);
			   _localctx.ast.add(new VariableDefinition(((VardefContext)_localctx).id1.getLine(), ((VardefContext)_localctx).id1.getCharPositionInLine(), (((VardefContext)_localctx).id1!=null?((VardefContext)_localctx).id1.getText():null), ((VardefContext)_localctx).type.ast));   
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				match(T__0);
				setState(34);
				((VardefContext)_localctx).id2 = match(ID);
				   _localctx.ast.add(new VariableDefinition(((VardefContext)_localctx).id2.getLine(), ((VardefContext)_localctx).id2.getCharPositionInLine(), (((VardefContext)_localctx).id2!=null?((VardefContext)_localctx).id2.getText():null), ((VardefContext)_localctx).type.ast));   
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(45);
				((FuncdefContext)_localctx).primitiveType = primitiveType();
				   rt = ((FuncdefContext)_localctx).primitiveType.ast;    
				}
				break;
			case T__12:
				{
				setState(48);
				((FuncdefContext)_localctx).voidType = voidType();
				   rt = ((FuncdefContext)_localctx).voidType.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			((FuncdefContext)_localctx).fid = match(ID);
			setState(54);
			match(T__2);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(55);
				((FuncdefContext)_localctx).t1 = ((FuncdefContext)_localctx).primitiveType = primitiveType();
				setState(56);
				((FuncdefContext)_localctx).id1 = match(ID);
				   params.add(new VariableDefinition(((FuncdefContext)_localctx).id1.getLine(), ((FuncdefContext)_localctx).id1.getCharPositionInLine(), (((FuncdefContext)_localctx).id1!=null?((FuncdefContext)_localctx).id1.getText():null), ((FuncdefContext)_localctx).t1.ast));   
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(58);
					match(T__0);
					setState(59);
					((FuncdefContext)_localctx).tn = ((FuncdefContext)_localctx).primitiveType = primitiveType();
					setState(60);
					((FuncdefContext)_localctx).idn = match(ID);
					   params.add(new VariableDefinition(((FuncdefContext)_localctx).idn.getLine(), ((FuncdefContext)_localctx).idn.getCharPositionInLine(), (((FuncdefContext)_localctx).idn!=null?((FuncdefContext)_localctx).idn.getText():null), ((FuncdefContext)_localctx).tn.ast));   
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__3);
			setState(71);
			match(T__4);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(72);
				((FuncdefContext)_localctx).vardef = vardef();
				   ((FuncdefContext)_localctx).vardef.ast.forEach(vd -> sentences.add((VariableDefinition)vd));    
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(80);
				((FuncdefContext)_localctx).sentence = sentence();
				   sentences.add(((FuncdefContext)_localctx).sentence.ast);    
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__5);
			   Type ft = new FunctionType(params, rt);
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
		public Token ID;
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(92);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case T__6:
				{
				{
				setState(95);
				match(T__6);
				setState(96);
				match(T__4);
				List<RecordField> list = new ArrayList<>();
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					((TypeContext)_localctx).type = type(0);
					setState(99);
					((TypeContext)_localctx).ID = match(ID);
					setState(100);
					match(T__1);
					list.add(new RecordField((((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null), ((TypeContext)_localctx).type.ast));
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) );
				setState(107);
				match(T__5);
				((TypeContext)_localctx).ast =  new RecordType(list);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
					setState(112);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					Stack<Integer> sizes = new Stack<>();
					setState(118); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(114);
							match(T__7);
							setState(115);
							((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
							setState(116);
							match(T__8);
							sizes.add(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)) );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(120); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					   ((TypeContext)_localctx).ast =  new ArrayType(sizes.pop(), ((TypeContext)_localctx).it.ast);
					                      while (!sizes.isEmpty())
					                          ((TypeContext)_localctx).ast =  new ArrayType(sizes.pop(), _localctx.ast);
					                  
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__9);
				 ((PrimitiveTypeContext)_localctx).ast =  IntegerType.getInstance();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__10);
				 ((PrimitiveTypeContext)_localctx).ast =  CharacterType.getInstance();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
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
			setState(136);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((SentenceContext)_localctx).funccall = funccall();
				setState(140);
				match(T__1);
				   ((SentenceContext)_localctx).ast =  ((SentenceContext)_localctx).funccall.ast;   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__13);
				setState(144);
				expr(0);
				setState(145);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__14);
				setState(148);
				match(T__2);
				setState(149);
				expr(0);
				setState(150);
				match(T__3);
				setState(151);
				match(T__4);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(152);
					sentence();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__15);
				setState(161);
				match(T__2);
				setState(162);
				expr(0);
				setState(163);
				match(T__3);
				setState(173);
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
					setState(164);
					sentence();
					}
					break;
				case T__4:
					{
					setState(165);
					match(T__4);
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(166);
						sentence();
						}
						}
						setState(171);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(172);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(175);
					match(T__16);
					setState(185);
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
						setState(176);
						sentence();
						}
						break;
					case T__4:
						{
						setState(177);
						match(T__4);
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
							{
							{
							setState(178);
							sentence();
							}
							}
							setState(183);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(184);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__17);
				setState(190);
				expr(0);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(191);
					match(T__0);
					setState(192);
					expr(0);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(T__18);
				setState(201);
				expr(0);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(202);
					match(T__0);
					setState(203);
					expr(0);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				((SentenceContext)_localctx).ei = expr(0);
				setState(212);
				match(T__19);
				setState(213);
				((SentenceContext)_localctx).er = expr(0);
				setState(214);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(220);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				   ((ExprContext)_localctx).ast =  new IntegerLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)));   
				}
				break;
			case 2:
				{
				setState(222);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				   ((ExprContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToReal((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(224);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				   ((ExprContext)_localctx).ast =  new CharacterLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(),
				                        LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(226);
				((ExprContext)_localctx).ID = match(ID);
				   ((ExprContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));  
				}
				break;
			case 5:
				{
				setState(228);
				match(T__2);
				setState(229);
				((ExprContext)_localctx).e = expr(0);
				setState(230);
				match(T__3);
				   ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).e.ast;  
				}
				break;
			case 6:
				{
				setState(233);
				match(T__2);
				setState(234);
				((ExprContext)_localctx).primitiveType = primitiveType();
				setState(235);
				match(T__3);
				setState(236);
				((ExprContext)_localctx).e = expr(8);
				   ((ExprContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).primitiveType.ast);  
				}
				break;
			case 7:
				{
				setState(239);
				match(T__21);
				setState(240);
				((ExprContext)_localctx).e = expr(7);
				   ((ExprContext)_localctx).ast =  new UnaryMinusOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast);   
				}
				break;
			case 8:
				{
				setState(243);
				match(T__32);
				setState(244);
				((ExprContext)_localctx).e = expr(3);
				   ((ExprContext)_localctx).ast =  new LogicalNotOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).e.ast);   
				}
				break;
			case 9:
				{
				setState(247);
				((ExprContext)_localctx).funccall = funccall();
				   ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).funccall.ast;   
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(253);
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
						setState(254);
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
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258);
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
						setState(259);
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
						setState(262);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(263);
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
						setState(264);
						((ExprContext)_localctx).er = expr(5);
						   ((ExprContext)_localctx).ast =  new LogicalOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(268);
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
						setState(269);
						((ExprContext)_localctx).er = expr(3);
						   ((ExprContext)_localctx).ast =  new ComparisonOperation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((ExprContext)_localctx).el.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).er.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(273);
						match(T__7);
						setState(274);
						((ExprContext)_localctx).er = expr(0);
						setState(275);
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
						setState(278);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(279);
						match(T__20);
						setState(280);
						((ExprContext)_localctx).ID = match(ID);
						   ((ExprContext)_localctx).ast =  new FieldAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).e.ast); 
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(288);
			((FunccallContext)_localctx).ID = match(ID);
			setState(289);
			match(T__2);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(290);
				((FunccallContext)_localctx).e1 = expr(0);
				   params.add(((FunccallContext)_localctx).e1.ast);    
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(292);
					match(T__0);
					setState(293);
					((FunccallContext)_localctx).en = expr(0);
					   params.add(((FunccallContext)_localctx).en.ast);    
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(303);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13"+
		"\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3\4\7"+
		"\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\5\5\5q\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5y\n\5\r\5\16\5z\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\5\b\u00b0"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\5\b\u00bc\n"+
		"\b\5\b\u00be\n\b\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7\13\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00cf\n\b\f\b\16\b\u00d2\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00fd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u011d\n\t\f\t\16\t\u0120\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u012b\n\n\f\n\16\n\u012e\13\n\5\n\u0130\n\n\3\n\3\n\3\n\3"+
		"\n\2\4\b\20\13\2\4\6\b\n\f\16\20\22\2\6\3\2\31\33\4\2\30\30\34\34\3\2"+
		"\35\"\3\2$%\2\u0157\2\24\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2\bp\3\2\2\2\n"+
		"\u0088\3\2\2\2\f\u008a\3\2\2\2\16\u00db\3\2\2\2\20\u00fc\3\2\2\2\22\u0121"+
		"\3\2\2\2\24\33\b\2\1\2\25\26\5\4\3\2\26\27\b\2\1\2\27\34\3\2\2\2\30\31"+
		"\5\6\4\2\31\32\b\2\1\2\32\34\3\2\2\2\33\25\3\2\2\2\33\30\3\2\2\2\34\35"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \b\3\1\2 !\5\b\5"+
		"\2!\"\7+\2\2\"(\b\3\1\2#$\7\3\2\2$%\7+\2\2%\'\b\3\1\2&#\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\4\2\2,\5\3\2\2\2-.\b"+
		"\4\1\2.\65\b\4\1\2/\60\5\n\6\2\60\61\b\4\1\2\61\66\3\2\2\2\62\63\5\f\7"+
		"\2\63\64\b\4\1\2\64\66\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2"+
		"\678\7+\2\28F\7\5\2\29:\5\n\6\2:;\7+\2\2;C\b\4\1\2<=\7\3\2\2=>\5\n\6\2"+
		">?\7+\2\2?@\b\4\1\2@B\3\2\2\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"DG\3\2\2\2EC\3\2\2\2F9\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\6\2\2IO\7\7\2\2"+
		"JK\5\4\3\2KL\b\4\1\2LN\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PW\3\2\2\2QO\3\2\2\2RS\5\16\b\2ST\b\4\1\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\b\2\2[\\\b\4\1\2\\\7\3"+
		"\2\2\2]^\b\5\1\2^_\5\n\6\2_`\b\5\1\2`q\3\2\2\2ab\7\t\2\2bc\7\7\2\2ci\b"+
		"\5\1\2de\5\b\5\2ef\7+\2\2fg\7\4\2\2gh\b\5\1\2hj\3\2\2\2id\3\2\2\2jk\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\b\2\2no\b\5\1\2oq\3\2\2\2p]\3"+
		"\2\2\2pa\3\2\2\2q\177\3\2\2\2rs\f\3\2\2sx\b\5\1\2tu\7\n\2\2uv\7)\2\2v"+
		"w\7\13\2\2wy\b\5\1\2xt\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2"+
		"|~\b\5\1\2}r\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\t\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0089\b\6\1\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0089\b\6\1\2\u0086\u0087\7\16\2\2\u0087\u0089\b"+
		"\6\1\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\13\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\b\7\1\2\u008c\r\3\2\2\2\u008d"+
		"\u008e\5\22\n\2\u008e\u008f\7\4\2\2\u008f\u0090\b\b\1\2\u0090\u00dc\3"+
		"\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\4\2\2\u0094"+
		"\u00dc\3\2\2\2\u0095\u0096\7\21\2\2\u0096\u0097\7\5\2\2\u0097\u0098\5"+
		"\20\t\2\u0098\u0099\7\6\2\2\u0099\u009d\7\7\2\2\u009a\u009c\5\16\b\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\b\2\2\u00a1"+
		"\u00dc\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5"+
		"\20\t\2\u00a5\u00af\7\6\2\2\u00a6\u00b0\5\16\b\2\u00a7\u00ab\7\7\2\2\u00a8"+
		"\u00aa\5\16\b\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\7\b\2\2\u00af\u00a6\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\u00bd\3\2"+
		"\2\2\u00b1\u00bb\7\23\2\2\u00b2\u00bc\5\16\b\2\u00b3\u00b7\7\7\2\2\u00b4"+
		"\u00b6\5\16\b\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bc\7\b\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00dc\3\2\2\2\u00bf"+
		"\u00c0\7\24\2\2\u00c0\u00c5\5\20\t\2\u00c1\u00c2\7\3\2\2\u00c2\u00c4\5"+
		"\20\t\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\4"+
		"\2\2\u00c9\u00dc\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00d0\5\20\t\2\u00cc"+
		"\u00cd\7\3\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00dc\3\2\2\2\u00d5\u00d6\5\20"+
		"\t\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\7\4\2\2\u00d9"+
		"\u00da\b\b\1\2\u00da\u00dc\3\2\2\2\u00db\u008d\3\2\2\2\u00db\u0091\3\2"+
		"\2\2\u00db\u0095\3\2\2\2\u00db\u00a2\3\2\2\2\u00db\u00bf\3\2\2\2\u00db"+
		"\u00ca\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\17\3\2\2\2\u00dd\u00de\b\t\1"+
		"\2\u00de\u00df\7)\2\2\u00df\u00fd\b\t\1\2\u00e0\u00e1\7*\2\2\u00e1\u00fd"+
		"\b\t\1\2\u00e2\u00e3\7,\2\2\u00e3\u00fd\b\t\1\2\u00e4\u00e5\7+\2\2\u00e5"+
		"\u00fd\b\t\1\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7"+
		"\6\2\2\u00e9\u00ea\b\t\1\2\u00ea\u00fd\3\2\2\2\u00eb\u00ec\7\5\2\2\u00ec"+
		"\u00ed\5\n\6\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\20\t\n\u00ef\u00f0\b"+
		"\t\1\2\u00f0\u00fd\3\2\2\2\u00f1\u00f2\7\30\2\2\u00f2\u00f3\5\20\t\t\u00f3"+
		"\u00f4\b\t\1\2\u00f4\u00fd\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\5\20"+
		"\t\5\u00f7\u00f8\b\t\1\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\5\22\n\2\u00fa"+
		"\u00fb\b\t\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00dd\3\2\2\2\u00fc\u00e0\3\2"+
		"\2\2\u00fc\u00e2\3\2\2\2\u00fc\u00e4\3\2\2\2\u00fc\u00e6\3\2\2\2\u00fc"+
		"\u00eb\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f9\3\2"+
		"\2\2\u00fd\u011e\3\2\2\2\u00fe\u00ff\f\b\2\2\u00ff\u0100\t\2\2\2\u0100"+
		"\u0101\5\20\t\t\u0101\u0102\b\t\1\2\u0102\u011d\3\2\2\2\u0103\u0104\f"+
		"\7\2\2\u0104\u0105\t\3\2\2\u0105\u0106\5\20\t\b\u0106\u0107\b\t\1\2\u0107"+
		"\u011d\3\2\2\2\u0108\u0109\f\6\2\2\u0109\u010a\t\4\2\2\u010a\u010b\5\20"+
		"\t\7\u010b\u010c\b\t\1\2\u010c\u011d\3\2\2\2\u010d\u010e\f\4\2\2\u010e"+
		"\u010f\t\5\2\2\u010f\u0110\5\20\t\5\u0110\u0111\b\t\1\2\u0111\u011d\3"+
		"\2\2\2\u0112\u0113\f\f\2\2\u0113\u0114\7\n\2\2\u0114\u0115\5\20\t\2\u0115"+
		"\u0116\7\13\2\2\u0116\u0117\b\t\1\2\u0117\u011d\3\2\2\2\u0118\u0119\f"+
		"\13\2\2\u0119\u011a\7\27\2\2\u011a\u011b\7+\2\2\u011b\u011d\b\t\1\2\u011c"+
		"\u00fe\3\2\2\2\u011c\u0103\3\2\2\2\u011c\u0108\3\2\2\2\u011c\u010d\3\2"+
		"\2\2\u011c\u0112\3\2\2\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\21\3\2\2\2\u0120\u011e\3\2\2"+
		"\2\u0121\u0122\b\n\1\2\u0122\u0123\7+\2\2\u0123\u012f\7\5\2\2\u0124\u0125"+
		"\5\20\t\2\u0125\u012c\b\n\1\2\u0126\u0127\7\3\2\2\u0127\u0128\5\20\t\2"+
		"\u0128\u0129\b\n\1\2\u0129\u012b\3\2\2\2\u012a\u0126\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\7\6\2\2\u0132\u0133\b\n\1\2\u0133\23\3\2\2\2\35\33\35"+
		"(\65CFOWkpz\177\u0088\u009d\u00ab\u00af\u00b7\u00bb\u00bd\u00c5\u00d0"+
		"\u00db\u00fc\u011c\u011e\u012c\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}