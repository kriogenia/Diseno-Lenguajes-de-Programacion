package visitor;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public interface Visitor {

	Object visit(Program element, Object params);

	// Definitions
	Object visit(FunctionDefinition element, Object params);
	Object visit(VariableDefinition element, Object params);

	// Expression
	Object visit(ArithmeticOperation element, Object params);
	Object visit(ArrayAccess element, Object params);
	Object visit(Cast element, Object params);
	Object visit(CharacterLiteral element, Object params);
	Object visit(ComparisonOperation element, Object params);
	Object visit(FieldAccess element, Object params);
	Object visit(IntegerLiteral element, Object params);
	Object visit(LogicalNotOperation element, Object params);
	Object visit(LogicalOperation element, Object params);
	Object visit(RealLiteral element, Object params);
	Object visit(UnaryMinusOperation element, Object params);
	Object visit(Variable element, Object params);

	// Sentences
	Object visit(Assign element, Object params);
	Object visit(Call element, Object params);
	Object visit(If element, Object params);
	Object visit(Read element, Object params);
	Object visit(Return element, Object params);
	Object visit(While element, Object params);
	Object visit(Write element, Object params);

	// Types
	Object visit(ArrayType element, Object params);
	Object visit(CharacterType element, Object params);
	Object visit(ErrorType errorType, Object params);
	Object visit(FunctionType element, Object params);
	Object visit(IntegerType element, Object params);
	Object visit(RealType element, Object params);
	Object visit(RecordField element, Object params);
	Object visit(RecordType element, Object params);
	Object visit(VoidType element, Object params);

}
