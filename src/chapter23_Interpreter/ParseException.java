package chapter23_Interpreter;

/** 구문해석 중의 예외 클래스 */
public class ParseException extends Exception {
    public ParseException(String msg) {
        super(msg);
    }
}
