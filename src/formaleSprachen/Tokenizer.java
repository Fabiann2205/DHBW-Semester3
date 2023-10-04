package formaleSprachen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tokenizer {

    public static List<Token> analyze(String input) {
        List<Token> result = new ArrayList<>();

        String[] split = input.split("[\\n\\r\\s]+");
        List<String> splitList = new ArrayList<>(List.of(split));
        

        boolean isNumber = false;
        String lastWord = null;
        for (String a : splitList) {
            if (isNumber) {
                result.add(new Token(Token.Type.NUMBER, a));
                isNumber = false;
                continue;
            }
            String aNew = a.toUpperCase();
            if ((Objects.equals(lastWord, "SELECT") && aNew.equals("SELECT")) || (Objects.equals(lastWord, "FROM") && aNew.equals("FROM")) || (Objects.equals(lastWord, "AS") && aNew.equals("AS")) || (Objects.equals(lastWord, "WHERE") && aNew.equals("WHERE"))) {
                result.add(new Token(Token.Type.IDENTIFIER, a));
                continue;
            }
            lastWord = aNew;
            switch (aNew) {
                case "SELECT":
                    result.add(new Token(Token.Type.PROJECTION, a));
                    break;
                case "AS":
                    result.add(new Token(Token.Type.ALIAS, a));
                    break;
                case "FROM":
                    result.add(new Token(Token.Type.SOURCE, a));
                    break;
                case "WHERE":
                    result.add(new Token(Token.Type.CONDITION, a));
                    break;
                case ">", "<", "=":
                    result.add(new Token(Token.Type.GT, a));
                    isNumber = true;
                    break;
                default:
                    result.add(new Token(Token.Type.IDENTIFIER, a));
                    break;
            }
        }
        return result;
    }
}
