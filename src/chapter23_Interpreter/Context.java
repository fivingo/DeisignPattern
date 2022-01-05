package chapter23_Interpreter;

import java.util.StringTokenizer;

/** 구문해석을 위한 전후 관계를 나타내는 클래스 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);

        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }

        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found");
        }

        nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;

        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }

        return number;
    }
}
