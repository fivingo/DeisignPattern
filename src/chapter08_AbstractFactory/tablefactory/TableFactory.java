package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.*;

/** 구체적인 공장을 나타내는 클래스 (TableLink, TableTray, TablePage를 만든다) */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
