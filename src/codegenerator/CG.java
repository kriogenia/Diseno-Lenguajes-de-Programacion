package codegenerator;

import ast.types.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CG {

	private PrintWriter out;

	public CG(String output, String source) {
		try {
			this.out = new PrintWriter(output);
		} catch (IOException e) {
			System.err.println("Error opening the file " + output);
			System.exit(-1);
		}
		this.source(source);
	}

	void call(String name) {

	}

	void halt() {

	}

	void in(Type type) {
		out.println("\tin" + type.getSuffix());
		store(type);
		out.flush();
	}

	void load(Type type) {
		out.println("\tload" + type.getSuffix());
		out.flush();
	}

	void out(Type type) {
		out.println("\tout" + type.getSuffix());
		out.flush();
	}

	void store(Type type) {
		out.print("\tstore" + type.getSuffix());
		out.flush();
	}

	private void source(String source) {
		out.println("#source \"" + source + "\"");
	}

}
