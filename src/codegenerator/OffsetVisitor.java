package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

	private int globalOffset = 0;
	private int localOffset = 0;

	// Definitions ---------------------------------------------------------

	@Override
	public Void visit(VariableDefinition element, Void params) {
		super.visit(element, params);
		if (element.getScope() == 0) {
			element.setOffset(globalOffset);
			globalOffset += element.getType().getNumberOfBytes();
		} else {
			localOffset -= element.getType().getNumberOfBytes();
			element.setOffset(localOffset);
		}
		return null;
	}

	@Override
	public Void visit(FunctionDefinition element, Void params) {
		localOffset = 0;
		element.getBody().forEach(x -> x.accept(this, params));
		element.setLocalsNumberOfBytes(-localOffset);
		element.getType().accept(this, params);
		return null;
	}

	// Types ----------------------------------------------------------------

	@Override
	public Void visit(FunctionType element, Void params) {
		super.visit(element, params);
		int callOffset = 4;
		for (int i = element.getArgs().size()-1; i >= 0; i--){
			element.getArgs().get(i).setOffset(callOffset);
			callOffset += element.getArgs().get(i).getType().getNumberOfBytes();
		}
		element.setArgsNumberOfBytes(
				element.getArgs().stream().map(x -> x.getType().getNumberOfBytes()).reduce(0, Integer::sum));
		return null;
	}

	@Override
	public Void visit(RecordType element, Void params) {
		super.visit(element, params);
		int recordOffset = 0;
		for (RecordField field: element.getRecords()) {
			field.setOffset(recordOffset);
			recordOffset += field.getType().getNumberOfBytes();
		}
		return null;
	}

}
