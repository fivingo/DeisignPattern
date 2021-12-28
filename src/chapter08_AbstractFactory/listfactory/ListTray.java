package chapter08_AbstractFactory.listfactory;

import chapter08_AbstractFactory.factory.*;

import java.util.Iterator;

/** 구체적인 부품: Link나 Tray를 모은 클래스 */
public class ListTray  extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");

        Iterator it = tray.iterator();

        while (it.hasNext()) {
            Item item = (Item) it.next();

            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}
