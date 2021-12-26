package chapter02_Adapter;

/** Adapter의 역할을 하는 클래스 (위임) */
public class PrintBanner2  extends Print2{
    private Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printString() {
        banner.showWithAster();
    }
}
