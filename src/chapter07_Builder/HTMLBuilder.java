package chapter07_Builder;

import java.io.*;

/** HTML 파일을 이용해서 문서를 만드는 클래스 */
public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = "src/chapter07_Builder/" + title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><meta charset=\"utf-8\"><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");

        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }

        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
