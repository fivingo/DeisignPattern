package chapter08_AbstractFactory.listfactory;

import chapter08_AbstractFactory.factory.*;

/** 구체적인 공장을 나타내는 클래스 (LiskLink, ListTray, ListPage를 만든다) */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
