package codegenerator;

import ast.types.CharacterType;
import ast.types.IntegerType;
import ast.types.RealType;
import ast.types.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CG {

	private PrintWriter out;
	private int nextLabel;

	public CG(String output, String source) {
		try {
			this.out = new PrintWriter(output);
		} catch (IOException e) {
			System.err.println("Error opening the file " + output);
			System.exit(-1);
		}
		this.source(source);
		this.nextLabel = 0;
	}

	void start() {
		out.println("\n' Invocation to the main function");
		out.println("call main");
		halt();
		out.flush();
	}

	int getLabels(int number) {
		int label = this.nextLabel;
		this.nextLabel += number;
		return label;
	}

	// ARITHMETIC OPERATIONS

	void arithmetic(Type type, String operator) {
		if (operator.equals("+"))
			add(type);
		if (operator.equals("-"))
			sub(type);
		if (operator.equals("*"))
			mul(type);
		if (operator.equals("/"))
			div(type);
		if (operator.equals("%"))
			mod(type);
	}

	void add(Type type) {
		out.println("\tadd" + type.getSuffix());
		out.flush();
	}

	void sub(Type type) {
		out.println("\tsub" + type.getSuffix());
		out.flush();
	}

	void mul(Type type) {
		out.println("\tmul" + type.getSuffix());
		out.flush();
	}

	void div(Type type) {
		out.println("\tdiv" + type.getSuffix());
		out.flush();
	}

	void mod(Type type) {
		out.println("\tmod" + type.getSuffix());
		out.flush();
	}

	// CONVERSIONS

	void cast(Type from, Type to) {
		if (from.equals(to))
			return;
		if (from.equals(CharacterType.getInstance())) {
			b2i();
			if(to.equals(RealType.getInstance()))
				i2f();
		}
		if (from.equals(IntegerType.getInstance())) {
			if (to.equals(CharacterType.getInstance()))
				i2b();
			else
				i2f();
		}
		if (from.equals(RealType.getInstance())) {
			f2i();
			if (to.equals(CharacterType.getInstance()))
				i2b();
		}
	}

	void b2i() {
		out.println("\tb2i");
		out.flush();
	}

	void f2i() {
		out.println("\tf2i");
		out.flush();
	}

	void i2b() {
		out.println("\ti2b");
		out.flush();
	}

	void i2f() {
		out.println("\ti2f");
		out.flush();
	}

	// COMPARISON OPERATIONS

	void comparison(Type type, String operator) {
		if (operator.equals(">"))
			gt(type);
		if (operator.equals("<"))
			lt(type);
		if (operator.equals(">="))
			ge(type);
		if (operator.equals("<="))
			le(type);
		if (operator.equals("=="))
			eq(type);
		if (operator.equals("!="))
			ne(type);
	}

	void gt(Type type) {
		out.println("\tgt" + type.getSuffix());
		out.flush();
	}

	void lt(Type type) {
		out.println("\tlt" + type.getSuffix());
		out.flush();
	}

	void ge(Type type) {
		out.println("\tge" + type.getSuffix());
		out.flush();
	}

	void le(Type type) {
		out.println("\tle" + type.getSuffix());
		out.flush();
	}

	void eq(Type type) {
		out.println("\teq" + type.getSuffix());
		out.flush();
	}

	void ne(Type type) {
		out.println("\tne" + type.getSuffix());
		out.flush();
	}

	// FUNCTION INSTRUCTIONS

	void call(String name) {
		out.println("\tcall\t" + name);
		out.flush();
	}

	void enter(int bytes) {
		out.println("\tenter\t" + bytes);
		out.flush();
	}

	void halt() {
		out.println("halt\n");
		out.flush();
	}

	void ret(int bReturn, int bLocal, int bArgs) {
		out.println("\tret " + bReturn + ", " + bLocal + ", " + bArgs);
		out.flush();
	}


	// INPUT AND OUTPUT INSTRUCTIONS

	void in(Type type) {
		out.println("\tin" + type.getSuffix());
		store(type);
		out.flush();
	}

	void out(Type type) {
		out.println("\tout" + type.getSuffix());
		out.flush();
	}

	// JUMP

	void define(String name) {
		out.println("\n " + name + ":");
		out.flush();
	}

	void label(int number) {
		out.println(" label" + number + ":");
		out.flush();
	}

	void jmp(int label) {
		out.println("\tjmp label" + label);
		out.flush();
	}

	void jz(int label) {
		out.println("\tjz label" + label);
		out.flush();
	}

	// LOAD AND STORE INSTRUCTIONS

	void load(Type type) {
		out.println("\tload" + type.getSuffix());
		out.flush();
	}

	void store(Type type) {
		out.println("\tstore" + type.getSuffix());
		out.flush();
	}

	// LOGICAL OPERATION

	void logical(String operator) {
		if (operator.equals("&&"))
			and();
		if (operator.equals("||"))
			or();
	}

	void and() {
		out.println("\tand");
		out.flush();
	}

	void or() {
		out.println("\tor");
		out.flush();
	}

	void not() {
		out.println("\tnot");
		out.flush();
	}

	// POP AND DUP INSTRUCTIONS

	void pop(Type type) {
		out.println("\tpop" + type.getSuffix());
		out.flush();
	}

	void dup(Type type) {
		out.println("\tdup" + type.getSuffix());
		out.flush();
	}

	// PUSH INSTRUCTIONS

	void push(char value) {
		out.println("\tpushb\t" + (int)value);
		out.flush();
	}

	void push(int value) {
		out.println("\tpushi\t" + value);
		out.flush();
	}

	void push(double value) {
		out.println("\tpushf\t" + value);
		out.flush();
	}

	void pusha(int address) {
		out.println("\tpusha\t" + address);
		out.flush();
	}

	void pushbp() {
		out.println("\tpush\tbp");
		out.flush();
	}

	// COMMENT

	void comment(String comment) {
		out.println("\t' * " + comment);
		out.flush();
	}

	void commentLine(int line) {
		out.println("\n#line\t" + line );
		out.flush();
	}

	private void source(String source) {
		out.println("\n#source \"" + source + "\"\n");
		out.flush();
	}

}
