package chapter12_Decorator;

/** 동작 테스트용의 클래스 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(
                        new StringDisplay("I'm studying disign pattern.")), '*'))), '/');

        b4.show();
    }
}
