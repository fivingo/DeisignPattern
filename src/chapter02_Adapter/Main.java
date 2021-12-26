package chapter02_Adapter;

/** Client의 역할을 나타내는 클래스 */
public class Main {
    public static void main(String[] args) {
        Print1 p = new PrintBanner1("Hello");           // 상속을 사용한 Adapter 패턴 (인터페이스)
        // Print2 p = new PrintBanner2("Hello");        // 위임을 사용한 Adapter 패턴 (추상 메서드)

        p.printWeak();
        p.printString();
    }
}
