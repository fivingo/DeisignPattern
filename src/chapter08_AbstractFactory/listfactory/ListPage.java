package chapter08_AbstractFactory.listfactory;

import chapter08_AbstractFactory.factory.*;

import java.util.Iterator;

/** 구체적인 제품: HTML의 Page를 나타내는 클래스 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<html><head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");

        Iterator it = content.iterator();

        while (it.hasNext()) {
            Item item = (Item) it.next();

            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><addree>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
