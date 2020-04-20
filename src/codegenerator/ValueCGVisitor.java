package codegenerator;

import ast.expressions.ArithmeticOperation;

class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	ValueCGVisitor(CG cg) {
		super(cg);
	}

	/*
		value[[ArithmeticOperation : expression -> left right operation]]() =
		value[[left]]
		value[[right]]
	 	<add>
	 */

	/*
		value[[ArrayAccess : expression -> left right]]() =
		address[[expression]]
		<load> expression.type.suffix
	 */

	/*
		value[[Variable : expression -> ID]]() =
		address[[expression]]
		<load> expression.type.suffix()
	 */

}
