package visitor;

import ast.definitions.*;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;

public interface Visitor {

	// Definitions
	Object visit(FunctionDefinition element, Object buffer);
	Object visit(VariableDefinition element, Object buffer);

	// Expression
	Object visit(ArithmeticOperation element, Object buffer);
	Object visit(ArrayAccess element, Object buffer);
	Object visit(Cast element, Object buffer);
	Object visit(CharacterLiteral element, Object buffer);
	Object visit(ComparisonOperation element, Object buffer);
	Object visit(FieldAccess element, Object buffer);
	Object visit(IntegerLiteral element, Object buffer);
	Object visit(LogicalNotOperation element, Object buffer);
	Object visit(LogicalOperation element, Object buffer);
	Object visit(RealLiteral element, Object buffer);
	Object visit(UnaryMinusOperation element, Object buffer);
	Object visit(Variable element, Object buffer);

	// Sentences
	Object visit(Assign element, Object buffer);
	Object visit(Call element, Object buffer);
	Object visit(If element, Object buffer);
	Object visit(Read element, Object buffer);
	Object visit(Return element, Object buffer);
	Object visit(While element, Object buffer);
	Object visit(Write element, Object buffer);

	// Types
	Object visit(ArrayType element, Object buffer);
	Object visit(CharacterType element, Object buffer);
	Object visit(FunctionType element, Object buffer);
	Object visit(IntegerType element, Object buffer);
	Object visit(RealType element, Object buffer);
	Object visit(RecordField element, Object buffer);
	Object visit(RecordType element, Object buffer);
	Object visit(VoidType element, Object buffer);

}
