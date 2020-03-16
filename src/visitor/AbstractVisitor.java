package visitor;

import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public abstract class AbstractVisitor implements Visitor {

	@Override
	public Object visit(FunctionDefinition element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(VariableDefinition element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ArithmeticOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Cast element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ComparisonOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Variable element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Assign element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Call element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(If element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Read element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Return element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(While element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Write element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ArrayType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(CharacterType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(FunctionType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(IntegerType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(RealType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(RecordField element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(RecordType element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(VoidType element, Object buffer) {
		return null;
	}
}
