package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.Item;
import chapter08_AbstractFactory.factory.Page;

import java.util.Iterator;

/** 구체적인 부품: HTML의 페이지를 나타내는 클래스 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");

        Iterator it = content.iterator();

        while (it.hasNext()) {
            Item item = (Item) it.next();

            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }

        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
