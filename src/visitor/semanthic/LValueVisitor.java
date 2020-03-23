package visitor.semanthic;

import ast.ErrorHandler;
import ast.expressions.*;
import ast.sentences.Assign;
import ast.sentences.Call;
import ast.sentences.Read;
import ast.types.ErrorType;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor<Void,Void> {

	// Assign ---------------------------------------------------------

	@Override
	public Void visit(Assign element, Void params) {
		element.getId().accept(this, params);
		// Checks the left side of the assignation is valid
		if(!element.getId().getLValue())
			ErrorHandler.getInstance().addError(new ErrorType(element.getId().getLine(),element.getId().getColumn(),
					"(Invalid Assignation): unexpected token at the left of the assignation"));
		// Continues checking the assignation
		element.getRefered().accept(this, params);
		return null;
	}

	// Read ---------------------------------------------------------

	@Override
	public Void visit(Read element, Void params) {
		for(Expression e: element.getExpressions()) {
			e.accept(this, params);
			if(!e.getLValue())
				ErrorHandler.getInstance().addError(new ErrorType(e.getLine(),e.getColumn(),
						"(Invalid Read): supplied tokens should be able to store the input"));
		}
		return null;
	}

	// Expressions ---------------------------------------------------------

	@Override
	public Void visit(ArithmeticOperation element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(ArrayAccess element, Void params) {
		super.visit(element, params);
		element.setLValue(true);
		return null;
	}

	@Override
	public Void visit(Call element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(Cast element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(CharacterLiteral element, Void params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(ComparisonOperation element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(FieldAccess element, Void params) {
		super.visit(element, params);
		element.setLValue(true);
		return null;
	}

	@Override
	public Void visit(IntegerLiteral element, Void params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(LogicalNotOperation element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(LogicalOperation element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(RealLiteral element, Void params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(UnaryMinusOperation element, Void params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(Variable element, Void params) {
		element.setLValue(true);
		return null;
	}
}
