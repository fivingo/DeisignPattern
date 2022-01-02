package chapter15_Facede.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/** 메일 주소에서 사용자의 웹 페이지를 작성하는 클래스 */
public class PageMaker {
    private PageMaker() {       // 인스턴스는 만들지 않기 떄문에 private 선언
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("src/chapter15_Facede/maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title("Welcome to " + username + "'s page!");
            writer.patagraph(username + "의 페이지에 오신 걸 환영합니다.");
            writer.patagraph("메일을 기다리고 있습니다.");
            writer.mailto(mailaddr, username);
            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
