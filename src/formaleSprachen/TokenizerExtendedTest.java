package formaleSprachen;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokenizerExtendedTest {

    @Test
    void noSpace() {
        List<Token> tokens = Tokenizer.analyze("SELECT a AS b FROM table WHERE z>50");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"a\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]");
    }

    @Test
    void nameDuplication() {
        List<Token> tokens = Tokenizer.analyze("SELECT select AS b FROM table WHERE z > 50");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"select\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]");
    }

    @Test
    void capitalized() {
        List<Token> tokens = Tokenizer.analyze("Select a As b From table Where z > 50");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"Select\"), (IDENTIFIER, \"a\"), (ALIAS, \"As\"), (IDENTIFIER, \"b\"), (SOURCE, \"From\"), (IDENTIFIER, \"table\"), (CONDITION, \"Where\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]");
    }

    @Test
    void numberFormat() {
        List<Token> tokens = Tokenizer.analyze("SELECT a AS b FROM table WHERE z > 50f");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"a\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50f\")]");
    }

    @Test
    void lineBreaks() {
        List<Token> tokens = Tokenizer.analyze("SELECT a AS b\nFROM table\nWHERE z > 50");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"a\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]");
    }

    @Test
    void leadingDigits() {
        List<Token> tokens = Tokenizer.analyze("SELECT 90erHits AS b FROM table WHERE z > 50");
        verify(tokens);
        assertEquals(tokens.toString(), "[(PROJECTION, \"SELECT\"), (IDENTIFIER, \"90erHits\"), (ALIAS, \"AS\"), (IDENTIFIER, \"b\"), (SOURCE, \"FROM\"), (IDENTIFIER, \"table\"), (CONDITION, \"WHERE\"), (IDENTIFIER, \"z\"), (GT, \">\"), (NUMBER, \"50\")]");
    }

    private static void verify(List<Token> tokens) {
        assertEquals(tokens.size(), 10);
        assertEquals(tokens.get(0).TYPE, Token.Type.PROJECTION);
        assertEquals(tokens.get(1).TYPE, Token.Type.IDENTIFIER);
        assertEquals(tokens.get(2).TYPE, Token.Type.ALIAS);
        assertEquals(tokens.get(3).TYPE, Token.Type.IDENTIFIER);
        assertEquals(tokens.get(4).TYPE, Token.Type.SOURCE);
        assertEquals(tokens.get(5).TYPE, Token.Type.IDENTIFIER);
        assertEquals(tokens.get(6).TYPE, Token.Type.CONDITION);
        assertEquals(tokens.get(7).TYPE, Token.Type.IDENTIFIER);
        assertEquals(tokens.get(8).TYPE, Token.Type.GT);
        assertEquals(tokens.get(9).TYPE, Token.Type.NUMBER);
    }

}