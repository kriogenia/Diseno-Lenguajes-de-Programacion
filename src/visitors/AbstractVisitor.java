package visitors;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public abstract class AbstractVisitor<P,R> implements Visitor<P,R> {

	@Override
	public R visit(Program element, P params) {
		element.getDefinitions().forEach(x -> x.accept(this, params));
		return null;
	}

	/***************************************************
	 *                 DEFINITIONS                     *
	 **************************************************/

	@Override
	public R visit(FunctionDefinition element, P params) {
		element.getType().accept(this, params);
		element.getBody().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(VariableDefinition element, P params) {
		element.getType().accept(this, params);
		return null;
	}

	/***************************************************
	 *                  EXPRESSIONS                    *
	 **************************************************/

	@Override
	public R visit(ArithmeticOperation element, P params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public R visit(ArrayAccess element, P params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public R visit(Cast element, P params) {
		element.getExpression().accept(this, params);
		element.getTypeToCast().accept(this, params);
		return null;
	}

	@Override
	public R visit(CharacterLiteral element, P params) { return null;	}

	@Override
	public R visit(ComparisonOperation element, P params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public R visit(FieldAccess element, P params) {
		element.getExpression().accept(this, params);
		return null;
	}

	@Override
	public R visit(IntegerLiteral element, P params) {
		return null;
	}

	@Override
	public R visit(LogicalNotOperation element, P params) {
		element.getExpression().accept(this, params);
		return null;
	}

	@Override
	public R visit(LogicalOperation element, P params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		return null;
	}

	@Override
	public R visit(RealLiteral element, P params) {
		return null;
	}

	@Override
	public R visit(UnaryMinusOperation element, P params) {
		element.getExpression().accept(this, params);
		return null;
	}

	@Override
	public R visit(Variable element, P params) {
		return null;
	}

	/***************************************************
	 *                  SENTENCES                      *
	 **************************************************/

	@Override
	public R visit(Assign element, P params) {
		element.getId().accept(this, params);
		element.getRefered().accept(this, params);
		return null;
	}

	@Override
	public R visit(Call element, P params) {
		element.getFunction().accept(this, params);
		element.getParams().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(If element, P params) {
		element.getCondition().accept(this, params);
		element.getThen().forEach(x -> x.accept(this, params));
		element.get_else().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(Read element, P params) {
		element.getExpressions().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(Return element, P params) {
		element.getReturnValue().accept(this, params);
		return null;
	}

	@Override
	public R visit(While element, P params) {
		element.getCondition().accept(this, params);
		element.get_do().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(Write element, P params) {
		element.getExpressions().forEach(x -> x.accept(this, params));
		return null;
	}

	/***************************************************
	 *                    TYPES                        *
	 **************************************************/

	@Override
	public R visit(ArrayType element, P params) {
		element.getType().accept(this, params);
		return null;
	}

	@Override
	public R visit(CharacterType element, P params) {
		return null;
	}

	@Override
	public R visit(ErrorType element, P params) {
		return null;
	}

	@Override
	public R visit(FunctionType element, P params) {
		element.getArgs().forEach(x -> x.accept(this, params));
		element.getReturnType().accept(this, params);
		return null;
	}

	@Override
	public R visit(IntegerType element, P params) {
		return null;
	}

	@Override
	public R visit(RealType element, P params) {
		return null;
	}

	@Override
	public R visit(RecordField element, P params) {
		element.getType().accept(this, params);
		return null;
	}

	@Override
	public R visit(RecordType element, P params) {
		element.getRecords().forEach(x -> x.accept(this, params));
		return null;
	}

	@Override
	public R visit(VoidType element, P params) {
		return null;
	}
}
