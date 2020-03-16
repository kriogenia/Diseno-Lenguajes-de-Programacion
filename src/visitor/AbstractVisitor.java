package visitor;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public abstract class AbstractVisitor implements Visitor {

	@Override
	public Object visit(Program element, Object params) {
		return null;
	}

	/***************************************************
	 *                 DEFINITIONS                     *
	 **************************************************/

	@Override
	public Object visit(FunctionDefinition element, Object params) {
		return null;
	}

	@Override
	public Object visit(VariableDefinition element, Object params) { return null; }

	/***************************************************
	 *                  EXPRESSIONS                    *
	 **************************************************/

	@Override
	public Object visit(ArithmeticOperation element, Object params) {
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object params) {
		return null;
	}

	@Override
	public Object visit(Cast element, Object params) {
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object params) {
		return null;
	}

	@Override
	public Object visit(ComparisonOperation element, Object params) {
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object params) {
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object params) {
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object params) {
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object params) {
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object params) {
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object params) {
		return null;
	}

	@Override
	public Object visit(Variable element, Object params) {
		return null;
	}

	/***************************************************
	 *                  SENTENCES                      *
	 **************************************************/

	@Override
	public Object visit(Assign element, Object params) {
		return null;
	}

	@Override
	public Object visit(Call element, Object params) {
		return null;
	}

	@Override
	public Object visit(If element, Object params) {
		return null;
	}

	@Override
	public Object visit(Read element, Object params) {
		return null;
	}

	@Override
	public Object visit(Return element, Object params) {
		return null;
	}

	@Override
	public Object visit(While element, Object params) {
		return null;
	}

	@Override
	public Object visit(Write element, Object params) {
		return null;
	}

	/***************************************************
	 *                    TYPES                        *
	 **************************************************/

	@Override
	public Object visit(ArrayType element, Object params) {
		return null;
	}

	@Override
	public Object visit(CharacterType element, Object params) {
		return null;
	}

	@Override
	public Object visit(ErrorType element, Object params) {
		return null;
	}

	@Override
	public Object visit(FunctionType element, Object params) {
		return null;
	}

	@Override
	public Object visit(IntegerType element, Object params) {
		return null;
	}

	@Override
	public Object visit(RealType element, Object params) {
		return null;
	}

	@Override
	public Object visit(RecordField element, Object params) {
		return null;
	}

	@Override
	public Object visit(RecordType element, Object params) {
		return null;
	}

	@Override
	public Object visit(VoidType element, Object params) {
		return null;
	}
}
