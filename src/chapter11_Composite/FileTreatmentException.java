package chapter11_Composite;

/** 파일에 Entry를 추가하려고 할 때 발생하는 예외 클래스 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {

    }

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
