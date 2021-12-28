package chapter08_AbstractFactory.listfactory;

import chapter08_AbstractFactory.factory.*;

/** 구체적인 부품: HTML의 Link를 나타내는 클래스 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
