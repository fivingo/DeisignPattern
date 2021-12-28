package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.Link;

/** 구체적인 부품: HTML의 링크를 나타내는 클래스 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
