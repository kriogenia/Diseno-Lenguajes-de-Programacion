package codegenerator;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractCGVisitor<P, R> implements Visitor<P, R> {

	CG cg;

	AbstractCGVisitor(CG cg) {
		this.cg = cg;
	}

	public CG getCG() {
		return this.cg;
	}

	@Override
	public R visit(Program element, P params) {
		throwException("Program");
		return null;
	}

	@Override
	public R visit(FunctionDefinition element, P params) {
		throwException("FunctionDefinition");
		return null;
	}

	@Override
	public R visit(VariableDefinition element, P params) {
		throwException("VariableDefinition");
		return null;
	}

	@Override
	public R visit(ArithmeticOperation element, P params) {
		throwException("ArithmeticOperation");
		return null;
	}

	@Override
	public R visit(ArrayAccess element, P params) {
		throwException("ArrayAccess");
		return null;
	}

	@Override
	public R visit(Cast element, P params) {
		throwException("Cast");
		return null;
	}

	@Override
	public R visit(CharacterLiteral element, P params) {
		throwException("CharacterLiteral");
		return null;
	}

	@Override
	public R visit(ComparisonOperation element, P params) {
		throwException("ComparisonOperation");
		return null;
	}

	public R visit(FieldAccess element, P params) {
		throwException("FieldAccess");
		return null;
	}

	@Override
	public R visit(IntegerLiteral element, P params) {
		throwException("IntegerLiteral");
		return null;
	}

	@Override
	public R visit(LogicalNotOperation element, P params) {
		throwException("LogicalNotOperation");
		return null;
	}

	@Override
	public R visit(LogicalOperation element, P params) {
		throwException("LogicalOperation");
		return null;
	}

	@Override
	public R visit(RealLiteral element, P params) {
		throwException("RealLiteral");
		return null;
	}

	@Override
	public R visit(UnaryMinusOperation element, P params) {
		throwException("UnaryMinusOperation");
		return null;
	}

	@Override
	public R visit(Variable element, P params) {
		throwException("Variable");
		return null;
	}

	@Override
	public R visit(Assign element, P params) {
		throwException("Assign");
		return null;
	}

	@Override
	public R visit(Call element, P params) {
		throwException("Call");
		return null;
	}

	@Override
	public R visit(If element, P params) {
		throwException("If");
		return null;
	}

	@Override
	public R visit(Read element, P params) {
		throwException("Read");
		return null;
	}

	@Override
	public R visit(Return element, P params) {
		throwException("Return");
		return null;
	}

	@Override
	public R visit(While element, P params) {
		throwException("While");
		return null;
	}

	@Override
	public R visit(Write element, P params) {
		throwException("Write");
		return null;
	}

	@Override
	public R visit(ArrayType element, P params) {
		throwException("ArrayType");
		return null;
	}

	@Override
	public R visit(CharacterType element, P params) {
		throwException("CharacterType");
		return null;
	}

	@Override
	public R visit(ErrorType errorType, P params) {
		throwException("ErrorType");
		return null;
	}

	@Override
	public R visit(FunctionType element, P params) {
		throwException("FunctionType");
		return null;
	}

	@Override
	public R visit(IntegerType element, P params) {
		throwException("IntegerType");
		return null;
	}

	@Override
	public R visit(RealType element, P params) {
		throwException("RealType");
		return null;
	}

	@Override
	public R visit(RecordField element, P params) {
		throwException("RecordField");
		return null;
	}

	@Override
	public R visit(RecordType element, P params) {
		throwException("RecordType");
		return null;
	}

	@Override
	public R visit(VoidType element, P params) {
		throwException("VoidType");
		return null;
	}

	private void throwException(String name) {
		throw new IllegalStateException("Code generation template \"" + name + "\" not defined for the code function "
				+ this.getClass().getName());
	}
}
