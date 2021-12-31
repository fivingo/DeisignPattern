package chapter13_Visitor;

/** Visitor 클래스의 생성자를 받아들이는 데이터 구조를 나타내는 인터페이스 */
public interface Element {
    public abstract void accept (Visitor v);
}
