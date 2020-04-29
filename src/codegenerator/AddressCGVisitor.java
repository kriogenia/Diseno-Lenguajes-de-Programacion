package codegenerator;

import ast.definitions.VariableDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.IntegerType;
import ast.types.RecordType;

class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

	private ValueCGVisitor valueCGVisitor;

	AddressCGVisitor(CG cg, ValueCGVisitor valueCGVisitor) {
		super(cg);
		this.valueCGVisitor = valueCGVisitor;
	}

	/*
		address[[ArrayAccess : expr -> left:Expression right:Expression]]() =
			address[[left]]
			value[[right]]
			<pushi> expr.type.size
			<mul>
			<add>
	 */
	public Void visit(ArrayAccess element, Void params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(valueCGVisitor, params);
		cg.push(element.getType().getNumberOfBytes());
		cg.mul(IntegerType.getInstance());
		cg.add(IntegerType.getInstance());
		return null;
	}

	/*
		address[[FieldAccess : expr -> left:Expression]]() =
			address[[left]]
			<pushi> expr.name.type.size
			<add>
	 */
	public Void visit(FieldAccess element, Void params) {
		element.getExpression().accept(this, params);
		cg.push(((RecordType) element.getExpression().getType()).getOffsetOf(element.getName()));
		cg.add(IntegerType.getInstance());
		return null;
	}

	/*
		address[[Variable : Expression -> def:Definition]]() =
			if (def.scope == 0)
				<pusha> def.offset;
			else
	 			<pusha> def.offset
	 			<push bp>
	 			<addi>
	 */
	public Void visit(Variable element, Void params) {
		if (element.getDefinition().getScope() == 0)
			cg.pusha(((VariableDefinition) element.getDefinition()).getOffset());
		else {
			cg.pushbp();
			cg.push(((VariableDefinition) element.getDefinition()).getOffset());
			cg.add(IntegerType.getInstance());
		}
		return null;
	}

}
