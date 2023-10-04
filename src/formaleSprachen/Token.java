package formaleSprachen;

public class Token {
	
	public enum Type {
		PROJECTION, IDENTIFIER, ALIAS, SOURCE, CONDITION, GT, NUMBER
	}
	
	public final Type TYPE;
	public final String LEXEME;
	
	public Token( Type type, String lexeme ){
		super();
		TYPE = type;
		LEXEME = lexeme;
	}
	
	@Override
	public String toString() {
		return String.format( "(%s, \"%s\")", TYPE, LEXEME );
	}

}
