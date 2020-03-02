// Generated from E:/Clase/DLP/Diseno-Lenguajes-de-Programacion/src/parser\Cmm.g4 by ANTLR 4.8
package parser;

    import java.util.Stack;
    import ast.*;
    import ast.definitions.*;
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(80);
				sentence();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(90);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case T__6:
				{
				{
				setState(93);
				match(T__6);
				setState(94);
				match(T__4);
				List<RecordField> list = new ArrayList<>();
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					((TypeContext)_localctx).type = type(0);
					setState(97);
					((TypeContext)_localctx).ID = match(ID);
					setState(98);
					match(T__1);
					list.add(new RecordField((((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null), ((TypeContext)_localctx).type.ast));
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) );
				setState(105);
				match(T__5);
				((TypeContext)_localctx).ast =  new RecordType(list);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
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
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					Stack<Integer> sizes = new Stack<>();
					setState(116); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(112);
							match(T__7);
							setState(113);
							((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
							setState(114);
							match(T__8);
							sizes.add(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)) );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(118); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					   ((TypeContext)_localctx).ast =  new ArrayType(sizes.pop(), ((TypeContext)_localctx).it.ast);
					                      while (!sizes.isEmpty())
					                          ((TypeContext)_localctx).ast =  new ArrayType(sizes.pop(), _localctx.ast);
					                  
					}
					} 
				}
				setState(125);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__9);
				 ((PrimitiveTypeContext)_localctx).ast =  IntegerType.getInstance();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__10);
				 ((PrimitiveTypeContext)_localctx).ast =  CharacterType.getInstance();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
			setState(134);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				funccall();
				setState(138);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__13);
				setState(141);
				expr(0);
				setState(142);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__14);
				setState(145);
				match(T__2);
				setState(146);
				expr(0);
				setState(147);
				match(T__3);
				setState(148);
				match(T__4);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(149);
					sentence();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(T__15);
				setState(158);
				match(T__2);
				setState(159);
				expr(0);
				setState(160);
				match(T__3);
				setState(170);
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
					setState(161);
					sentence();
					}
					break;
				case T__4:
					{
					setState(162);
					match(T__4);
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(163);
						sentence();
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(169);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(172);
					match(T__16);
					setState(182);
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
						setState(173);
						sentence();
						}
						break;
					case T__4:
						{
						setState(174);
						match(T__4);
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
							{
							{
							setState(175);
							sentence();
							}
							}
							setState(180);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(181);
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
				setState(186);
				match(T__17);
				setState(187);
				expr(0);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(188);
					match(T__0);
					setState(189);
					expr(0);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(T__18);
				setState(198);
				expr(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(199);
					match(T__0);
					setState(200);
					expr(0);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				expr(0);
				setState(209);
				match(T__19);
				setState(210);
				expr(0);
				setState(211);
				match(T__1);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(216);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(217);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(218);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(219);
				match(ID);
				}
				break;
			case 5:
				{
				setState(220);
				match(T__2);
				setState(221);
				expr(0);
				setState(222);
				match(T__3);
				}
				break;
			case 6:
				{
				setState(224);
				match(T__2);
				setState(225);
				primitiveType();
				setState(226);
				match(T__3);
				setState(227);
				expr(8);
				}
				break;
			case 7:
				{
				setState(229);
				match(T__21);
				setState(230);
				expr(7);
				}
				break;
			case 8:
				{
				setState(231);
				match(T__32);
				setState(232);
				expr(3);
				}
				break;
			case 9:
				{
				setState(233);
				funccall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(243);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						match(T__7);
						setState(250);
						expr(0);
						setState(251);
						match(T__8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(254);
						match(T__20);
						setState(255);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(260);
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
			setState(261);
			match(ID);
			setState(262);
			match(T__2);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__21) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(263);
				expr(0);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(264);
					match(T__0);
					setState(265);
					expr(0);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13"+
		"\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\7\4T\n\4\f"+
		"\4\16\4W\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5\3\5\3\5\6"+
		"\5w\n\5\r\5\16\5x\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0087\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\5\b\u00ad\n\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\b\5\b\u00b9\n\b\5\b\u00bb"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00cc\n\b\f\b\16\b\u00cf\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00d8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00ed\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0103\n\t\f\t\16\t\u0106"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u010d\n\n\f\n\16\n\u0110\13\n\5\n\u0112"+
		"\n\n\3\n\3\n\3\n\2\4\b\20\13\2\4\6\b\n\f\16\20\22\2\6\3\2\31\33\4\2\30"+
		"\30\34\34\3\2\35\"\3\2$%\2\u0138\2\24\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2"+
		"\bn\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2\2\16\u00d7\3\2\2\2\20\u00ec"+
		"\3\2\2\2\22\u0107\3\2\2\2\24\33\b\2\1\2\25\26\5\4\3\2\26\27\b\2\1\2\27"+
		"\34\3\2\2\2\30\31\5\6\4\2\31\32\b\2\1\2\32\34\3\2\2\2\33\25\3\2\2\2\33"+
		"\30\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37"+
		" \b\3\1\2 !\5\b\5\2!\"\7+\2\2\"(\b\3\1\2#$\7\3\2\2$%\7+\2\2%\'\b\3\1\2"+
		"&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\4\2"+
		"\2,\5\3\2\2\2-.\b\4\1\2.\65\b\4\1\2/\60\5\n\6\2\60\61\b\4\1\2\61\66\3"+
		"\2\2\2\62\63\5\f\7\2\63\64\b\4\1\2\64\66\3\2\2\2\65/\3\2\2\2\65\62\3\2"+
		"\2\2\66\67\3\2\2\2\678\7+\2\28F\7\5\2\29:\5\n\6\2:;\7+\2\2;C\b\4\1\2<"+
		"=\7\3\2\2=>\5\n\6\2>?\7+\2\2?@\b\4\1\2@B\3\2\2\2A<\3\2\2\2BE\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F9\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HI\7\6\2\2IO\7\7\2\2JK\5\4\3\2KL\b\4\1\2LN\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2\2RT\5\16\b\2SR\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\b\2\2YZ\b\4\1\2Z\7\3\2"+
		"\2\2[\\\b\5\1\2\\]\5\n\6\2]^\b\5\1\2^o\3\2\2\2_`\7\t\2\2`a\7\7\2\2ag\b"+
		"\5\1\2bc\5\b\5\2cd\7+\2\2de\7\4\2\2ef\b\5\1\2fh\3\2\2\2gb\3\2\2\2hi\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\b\2\2lm\b\5\1\2mo\3\2\2\2n[\3"+
		"\2\2\2n_\3\2\2\2o}\3\2\2\2pq\f\3\2\2qv\b\5\1\2rs\7\n\2\2st\7)\2\2tu\7"+
		"\13\2\2uw\b\5\1\2vr\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|"+
		"\b\5\1\2{p\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\t\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0081\7\f\2\2\u0081\u0087\b\6\1\2\u0082\u0083\7\r\2\2\u0083"+
		"\u0087\b\6\1\2\u0084\u0085\7\16\2\2\u0085\u0087\b\6\1\2\u0086\u0080\3"+
		"\2\2\2\u0086\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087\13\3\2\2\2\u0088"+
		"\u0089\7\17\2\2\u0089\u008a\b\7\1\2\u008a\r\3\2\2\2\u008b\u008c\5\22\n"+
		"\2\u008c\u008d\7\4\2\2\u008d\u00d8\3\2\2\2\u008e\u008f\7\20\2\2\u008f"+
		"\u0090\5\20\t\2\u0090\u0091\7\4\2\2\u0091\u00d8\3\2\2\2\u0092\u0093\7"+
		"\21\2\2\u0093\u0094\7\5\2\2\u0094\u0095\5\20\t\2\u0095\u0096\7\6\2\2\u0096"+
		"\u009a\7\7\2\2\u0097\u0099\5\16\b\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\b\2\2\u009e\u00d8\3\2\2\2\u009f\u00a0\7\22"+
		"\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00ac\7\6\2\2\u00a3"+
		"\u00ad\5\16\b\2\u00a4\u00a8\7\7\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\b\2\2\u00ac\u00a3\3\2"+
		"\2\2\u00ac\u00a4\3\2\2\2\u00ad\u00ba\3\2\2\2\u00ae\u00b8\7\23\2\2\u00af"+
		"\u00b9\5\16\b\2\u00b0\u00b4\7\7\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\b\2\2\u00b8\u00af\3\2"+
		"\2\2\u00b8\u00b0\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00d8\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00c2\5"+
		"\20\t\2\u00be\u00bf\7\3\2\2\u00bf\u00c1\5\20\t\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00d8\3\2\2\2\u00c7"+
		"\u00c8\7\25\2\2\u00c8\u00cd\5\20\t\2\u00c9\u00ca\7\3\2\2\u00ca\u00cc\5"+
		"\20\t\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\4"+
		"\2\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4\7\26\2\2\u00d4"+
		"\u00d5\5\20\t\2\u00d5\u00d6\7\4\2\2\u00d6\u00d8\3\2\2\2\u00d7\u008b\3"+
		"\2\2\2\u00d7\u008e\3\2\2\2\u00d7\u0092\3\2\2\2\u00d7\u009f\3\2\2\2\u00d7"+
		"\u00bc\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\17\3\2\2"+
		"\2\u00d9\u00da\b\t\1\2\u00da\u00ed\7)\2\2\u00db\u00ed\7*\2\2\u00dc\u00ed"+
		"\7,\2\2\u00dd\u00ed\7+\2\2\u00de\u00df\7\5\2\2\u00df\u00e0\5\20\t\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u00ed\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\5\n"+
		"\6\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5\20\t\n\u00e6\u00ed\3\2\2\2\u00e7"+
		"\u00e8\7\30\2\2\u00e8\u00ed\5\20\t\t\u00e9\u00ea\7#\2\2\u00ea\u00ed\5"+
		"\20\t\5\u00eb\u00ed\5\22\n\2\u00ec\u00d9\3\2\2\2\u00ec\u00db\3\2\2\2\u00ec"+
		"\u00dc\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00e2\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u0104\3\2\2\2\u00ee\u00ef\f\b\2\2\u00ef\u00f0\t\2\2\2\u00f0\u0103\5\20"+
		"\t\t\u00f1\u00f2\f\7\2\2\u00f2\u00f3\t\3\2\2\u00f3\u0103\5\20\t\b\u00f4"+
		"\u00f5\f\6\2\2\u00f5\u00f6\t\4\2\2\u00f6\u0103\5\20\t\7\u00f7\u00f8\f"+
		"\4\2\2\u00f8\u00f9\t\5\2\2\u00f9\u0103\5\20\t\5\u00fa\u00fb\f\f\2\2\u00fb"+
		"\u00fc\7\n\2\2\u00fc\u00fd\5\20\t\2\u00fd\u00fe\7\13\2\2\u00fe\u0103\3"+
		"\2\2\2\u00ff\u0100\f\13\2\2\u0100\u0101\7\27\2\2\u0101\u0103\7+\2\2\u0102"+
		"\u00ee\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00f4\3\2\2\2\u0102\u00f7\3\2"+
		"\2\2\u0102\u00fa\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\21\3\2\2\2\u0106\u0104\3\2\2"+
		"\2\u0107\u0108\7+\2\2\u0108\u0111\7\5\2\2\u0109\u010e\5\20\t\2\u010a\u010b"+
		"\7\3\2\2\u010b\u010d\5\20\t\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\7\6\2\2\u0114\23\3\2\2\2\35\33\35(\65CFOUinx}\u0086\u009a\u00a8"+
		"\u00ac\u00b4\u00b8\u00ba\u00c2\u00cd\u00d7\u00ec\u0102\u0104\u010e\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}