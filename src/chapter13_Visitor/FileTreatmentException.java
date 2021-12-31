package chapter13_Visitor;

/** File에 대해서 add한 경우에 발생하는 예외 클래스 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
