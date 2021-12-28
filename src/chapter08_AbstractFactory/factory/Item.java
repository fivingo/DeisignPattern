package chapter08_AbstractFactory.factory;

/** Link와 Tray를 통일적으로 취급하기 위한 클래스 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
