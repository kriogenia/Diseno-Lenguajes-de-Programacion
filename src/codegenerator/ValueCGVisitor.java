package codegenerator;

import ast.expressions.*;

class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;

	ValueCGVisitor(CG cg) {
		super(cg);
	}

	void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
		this.addressCGVisitor = addressCGVisitor;
	}

	/*
		value[[ArithmeticOperation : expr -> left:Expression right:Expression]]() =
			value[[left]]
			value[[right]]
			if (expr.operator == "+")
				<add>
			if (expr.operator == "-")
				<sub>
			if (expr.operator == "*")
				<mul>
			if (expr.operator == "/")
				<div>
			if (expr.operator == "%")
				<mod>
	 */
	public Void visit(ArithmeticOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.arithmetic(element.getType(), element.getOperation());
		return null;
	}

	/*
		value[[ArrayAccess : expr -> left:Expression right:Expression]]() =
			address[[expr]]
			<load> expr.type.suffix
	 */
	public Void visit(ArrayAccess element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

	/*
		value[[Call : expr -> function:Variable params:Expression*]() =
			for(Expression exp: params)
				value[[exp]]
			<call> function.name
	 */
	public Void visit(Call element, Void params) {
		element.getParams().forEach((p) -> p.accept(this, params));
		cg.call(element.getFunction().getName());
		return null;
	}

	/*
		value[[Cast : expr -> expression:Expression typeToCast:Type]]() =
			value[[expression]]
			if (expression.type == CharacterType && typeToCast == IntegerType)
				<b2i>
			if (expression.type == CharacterType && typeToCast == RealType)
				<b2i>
				<i2f>
			if (expression.type == IntegerType && typeToCast == CharacterType)
				<i2b>
			if (expression.type == IntegerType && typeToCast == RealType)
				<i2f>
			if (expression.type == RealType && typeToCast == CharacterType)
				<f2i>
				<i2c>
			if (expression.type == RealType && typeToCast == IntegerType)
				<f2i>
	 */
	public Void visit(Cast element, Void params) {
		element.getExpression().accept(this, params);
		cg.cast(element.getExpression().getType(), element.getTypeToCast());
		return null;
	}

	/*
		value[[CharacterLiteral: expr]]() =
			<pushb> expression.value
	 */
	public Void visit(CharacterLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[ComparisonOperation : expr -> left:Expression right:Expression]]() =
			value[[left]]
			value[[right]]
			if (expr.operator == ">=")
				<ge>
			if (expr.operator == ">")
				<gt>
			if (expr.operator == "<=")
				<le>
			if (expr.operator == "<")
				<lt>
			if (expr.operator == "==")
				<eq>
			if (expr.operator == "!=")
				<ne>
	 */
	public Void visit(ComparisonOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.comparison(element.getType(), element.getOperation());
		return null;
	}

	/*
		value[[FieldAccess : expr -> expression:Expression]]() =
			address[[expr]]
			<load> expr.type.suffix
	 */
	public Void visit(FieldAccess element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

	/*
		value[[IntegerLiteral: expr]]() =
			<pushi> expr.value
	 */
	public Void visit(IntegerLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[LogicalNotOperation: expr -> expression:Expression]]() =
			value[[expression]]
			<not>
	 */
	public Void visit(LogicalNotOperation element, Void params) {
		element.getExpression().accept(this, params);
		cg.not();
		return null;
	}

	/*
		value[[LogicalOperation : expr -> left:Expression right:Expression]]() =
			value[[left]]
			value[[right]]
			if (expr.operator == "&&")
				<and>
			if (expr.operator == "||")
				<or>
	 */
	public Void visit(LogicalOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.logical(element.getOperation());
		return null;
	}

	/*
		value[[RealLiteral: expr]]() =
			<pushf> expr.value
	 */
	public Void visit(RealLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[UnaryMinusOperation: expr -> expression:Expression]]() =
			<pushi 0>
			value[[expression]]
			<sub>
	 */
	public Void visit(UnaryMinusOperation element, Void params) {
		cg.push(0);
		element.getExpression().accept(this, params);
		cg.sub(element.getType());
		return null;
	}

	/*
		value[[Variable : expr -> def:Definition]]() =
			address[[expr]]
			<load> expr.type.suffix
	 */
	public Void visit(Variable element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

}
