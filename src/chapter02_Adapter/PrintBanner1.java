package chapter02_Adapter;

/** Adapter의 역할을 하는 클래스 (상속) */
public class PrintBanner1 extends Banner implements Print1 {
    public PrintBanner1(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printString() {
        showWithAster();
    }
}
