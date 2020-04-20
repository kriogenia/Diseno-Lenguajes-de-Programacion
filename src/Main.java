import codegenerator.CG;
import codegenerator.ExecuteCGVisitor;
import errorhandler.ErrorHandler;
import ast.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.CmmLexer;
import parser.CmmParser;
import semantic.IdentificationVisitor;
import codegenerator.OffsetVisitor;
import semantic.TypeCheckingVisitor;

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

		if (parser.getNumberOfSyntaxErrors() > 0) {
			System.out.println("Program with syntax errors. No code was generated.");
			return;
		}

		p.accept(new IdentificationVisitor(), null);
		p.accept(new TypeCheckingVisitor(), null);

		if (ErrorHandler.getInstance().anyError()) {
			ErrorHandler.getInstance().showErrors(System.out);
			System.out.println("Program with semantic errors. No code was generated.");
		} else {
			p.accept(new OffsetVisitor(), null);
			p.accept(new ExecuteCGVisitor(new CG(args[1], args[0])), null);
		}
	}
	

}
