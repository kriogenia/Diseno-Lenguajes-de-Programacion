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
		value[[ArithmeticOperation : expression -> type left right operation]]() =
			value[[expression.left]]
			value[[expression.right]]
			<add/sub/mul/div/mod>
	 */
	public Void visit(ArithmeticOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.arithmetic(element.getType(), element.getOperation());
		return null;
	}

	/*
		value[[ArrayAccess : expression -> type left right]]() =
			address[[expression]]
			<load> expression.type.suffix
	 */
	public Void visit(ArrayAccess element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

	/*
		value[[Call : expression -> function param*^]() =
				for(Expression exp: expression.param*)
					value[[exp]]
				<call> expression.function.name
	 */
	public Void visit(Call element, Void params) {
		element.getParams().forEach((p) -> p.accept(this, params));
		cg.call(element.getFunction().getName());
		return null;
	}

	/*
		value[[Cast : expression -> type expression type]]() =
			value[[expression.expression]]
			<b2i/i2b/i2f/f2i>
	 */
	public Void visit(Cast element, Void params) {
		element.getExpression().accept(this, params);
		cg.cast(element.getExpression().getType(), element.getTypeToCast());
		return null;
	}

	/*
		value[[CharacterLiteral: expression -> type value]]() =
			<pushb> expression.value
	 */
	public Void visit(CharacterLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[ComparisonOperation : expression -> type left right operation]]() =
			value[[expression.left]]
			value[[expression.right]]
			<ge/gt/le/lt/eq/ne>
	 */
	public Void visit(ComparisonOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.comparison(element.getType(), element.getOperation());
		return null;
	}

	/*
		value[[FieldAccess : expression -> type expression name]]() =
			address[[expression]]
			<load> expression.type.suffix
	 */
	public Void visit(FieldAccess element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

	/*
		value[[IntegerLiteral: expression -> type value]]() =
			<pushi> expression.value
	 */
	public Void visit(IntegerLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[LogicalNotOperation: expression -> type expression]]() =
			value[[expression.expression]]
			<not>
	 */
	public Void visit(LogicalNotOperation element, Void params) {
		element.getExpression().accept(this, params);
		cg.not();
		return null;
	}

	/*
		value[[LogicalOperation : expression -> type left right operation]]() =
			value[[expression.left]]
			value[[expression.right]]
			<add/or>
	 */
	public Void visit(LogicalOperation element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		cg.logical(element.getOperation());
		return null;
	}

	/*
		value[[RealLiteral: expression -> type value]]() =
			<pushf> expression.value
	 */
	public Void visit(RealLiteral element, Void params) {
		cg.push(element.getValue());
		return null;
	}

	/*
		value[[UnaryMinusOperation: expression -> type expression]]() =
			<pushi 0>
			value[[expression.expression]]
			<sub>
	 */
	public Void visit(UnaryMinusOperation element, Void params) {
		cg.push(0);
		element.getExpression().accept(this, params);
		cg.sub(element.getType());
		return null;
	}

	/*
		value[[Variable : expression -> type name]]() =
			address[[expression]]
			<load> expression.type.suffix()
	 */
	public Void visit(Variable element, Void params) {
		element.accept(addressCGVisitor, params);
		cg.load(element.getType());
		return null;
	}

}
