package chapter02_Adapter;

/** Adaptee의 역할을 하는 클래스 */
public class Banner {
    private String string;

    public Banner (String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
