package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		try {
			String sub = str.substring(1,str.length()-1);
			if (sub.length() == 1)
				return sub.charAt(0);
			else if (sub.length() == 2)
				if (sub.equals("\\n"))
					return (char)10;
				else
					return (char)9;
			else
				return (char)Integer.parseInt(sub.substring(1));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		return (char)-1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
	
}
