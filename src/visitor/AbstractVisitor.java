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
		element.getDefinitions().forEach(x -> x.accept(this, params));
		return null;
	}

	/***************************************************
	 *                 DEFINITIONS                     *
	 **************************************************/

	@Override
	public Object visit(FunctionDefinition element, Object params) {
		element.getBody().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(VariableDefinition element, Object params) { return null; }

	/***************************************************
	 *                  EXPRESSIONS                    *
	 **************************************************/

	@Override
	public Object visit(ArithmeticOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public Object visit(Cast element, Object params) {
		element.getExpression().accept(this, params);
		element.getType().accept(this, params);
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object params) { return null;	}

	@Override
	public Object visit(ComparisonOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object params) {
		element.getExpression().accept(this, params);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object params) {
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object params) {
		element.getExpression().accept(this, params);
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object params) {
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object params) {
		element.getExpression().accept(this, params);
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
		element.getId().accept(this, params);
		element.getRefered().accept(this, params);
		return null;
	}

	@Override
	public Object visit(Call element, Object params) {
		element.getFunction().accept(this, params);
		element.getParams().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(If element, Object params) {
		element.getCondition().accept(this, params);
		element.getThen().forEach(x -> x.accept(this, params));
		element.get_else().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(Read element, Object params) {
		element.getExpressions().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(Return element, Object params) {
		element.getReturnValue().accept(this, params);
		return null;
	}

	@Override
	public Object visit(While element, Object params) {
		element.getCondition().accept(this, params);
		element.get_do().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(Write element, Object params) {
		element.getExpressions().forEach(x -> x.accept(this, params));
		return null;
	}

	/***************************************************
	 *                    TYPES                        *
	 **************************************************/

	@Override
	public Object visit(ArrayType element, Object params) {
		element.getType().accept(this, params);
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
		element.getParams().forEach(x -> x.accept(this, params));
		element.getReturnType().accept(this, params);
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
		element.getType().accept(this, params);
		return null;
	}

	@Override
	public Object visit(RecordType element, Object params) {
		element.getRecords().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public Object visit(VoidType element, Object params) {
		return null;
	}
}
