package codegenerator;

class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

	private ValueCGVisitor valueCGVisitor;

	AddressCGVisitor(CG cg, ValueCGVisitor valueCGVisitor) {
		super(cg);
		this.valueCGVisitor = valueCGVisitor;
	}

	/*
		address[[Variable : expression -> ID]]() =
			if (expression.definition.scope == 0)
				<pusha> expression.definition.offset;
			else
	 			<pusha> expression.definition.offset
	 			<push bp>
	 			<addi>
	 */

}
