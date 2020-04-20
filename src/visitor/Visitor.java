package visitor;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public interface Visitor<P,R> {

	R visit(Program element, P params);

	// Definitions
	R visit(FunctionDefinition element, P params);
	R visit(VariableDefinition element, P params);

	// Expression
	R visit(ArithmeticOperation element, P params);
	R visit(ArrayAccess element, P params);
	R visit(Cast element, P params);
	R visit(CharacterLiteral element, P params);
	R visit(ComparisonOperation element, P params);
	R visit(FieldAccess element, P params);
	R visit(IntegerLiteral element, P params);
	R visit(LogicalNotOperation element, P params);
	R visit(LogicalOperation element, P params);
	R visit(RealLiteral element, P params);
	R visit(UnaryMinusOperation element, P params);
	R visit(Variable element, P params);

	// Sentences
	R visit(Assign element, P params);
	R visit(Call element, P params);
	R visit(If element, P params);
	R visit(Read element, P params);
	R visit(Return element, P params);
	R visit(While element, P params);
	R visit(Write element, P params);

	// Types
	R visit(ArrayType element, P params);
	R visit(CharacterType element, P params);
	R visit(ErrorType errorType, P params);
	R visit(FunctionType element, P params);
	R visit(IntegerType element, P params);
	R visit(RealType element, P params);
	R visit(RecordField element, P params);
	R visit(RecordType element, P params);
	R visit(VoidType element, P params);

}
