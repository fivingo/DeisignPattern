package chapter08_AbstractFactory.factory;

/** 추상적인 부품: HTML의 Link를 나타내는 클래스 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
