package formaleSprachen;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static List<Token> analyze(String input) {
        List<Token> result = new ArrayList<>();

        String[] split = input.split(" ");
        List<String> splitList = List.of(split);
        boolean isNumber = false;
        for (String a : splitList) {
            if (isNumber) {
                result.add(new Token(Token.Type.NUMBER, a));
                continue;
            }
            String aNew = a.toUpperCase();
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
