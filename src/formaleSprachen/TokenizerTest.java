package formaleSprachen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class TokenizerTest {
	
	@Test
	void standard() {
		List<Token> tokens = Tokenizer.analyze( "SELECT a AS b FROM table WHERE z > 50" );
		assertEquals( tokens.size(), 10 );
		assertEquals( tokens.get(0).TYPE, Token.Type.PROJECTION );
		assertEquals( tokens.get(1).TYPE, Token.Type.IDENTIFIER );
		assertEquals( tokens.get(2).TYPE, Token.Type.ALIAS );
		assertEquals( tokens.get(3).TYPE, Token.Type.IDENTIFIER );
		assertEquals( tokens.get(4).TYPE, Token.Type.SOURCE );
		assertEquals( tokens.get(5).TYPE, Token.Type.IDENTIFIER );
		assertEquals( tokens.get(6).TYPE, Token.Type.CONDITION );
		assertEquals( tokens.get(7).TYPE, Token.Type.IDENTIFIER );
		assertEquals( tokens.get(8).TYPE, Token.Type.GT );
		assertEquals( tokens.get(9).TYPE, Token.Type.NUMBER );
		assertEquals( tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"a\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]" );
	}

}
