import ast.ErrorHandler;
import ast.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.CmmLexer;
import parser.CmmParser;
import visitor.Visitor;
import visitor.semanthic.TypeCheckingVisitor;

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

		Visitor visitor = new TypeCheckingVisitor();
		p.accept(visitor, null);
		ErrorHandler.getInstance().showErrors(System.out);

		//IntrospectorModel model = new IntrospectorModel("Program", p);
		//new IntrospectorTree("Tree", model);
	}
	

}
