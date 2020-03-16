import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.*;

import org.antlr.v4.runtime.*;
import ast.*;
import visitor.Visitor;
import visitor.semanthic.LValueVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		Program p = parser.program().ast;

		Visitor visitor = new LValueVisitor();
		p.accept(visitor, null);
		ErrorHandler.getInstance().showErrors(System.out);

		//IntrospectorModel model = new IntrospectorModel("Program", p);
		//new IntrospectorTree("Tree", model);
	}
	

}
