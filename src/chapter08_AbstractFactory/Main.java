package chapter08_AbstractFactory;

import chapter08_AbstractFactory.factory.*;

/** 동작 테스트용 클래스 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "https://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "https://www.chosun.com/");

        Link us_google = factory.createLink("Google", "https://www.google.com/");
        Link kr_google = factory.createLink("Google Korea", "https://www.google.co.kr/");
        Link naver = factory.createLink("Naver", "https://www.naver.com/");
        Link daum = factory.createLink("Daum", "https://www.daum.net/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Tray traygoogle = factory.createTray("Google");
        traygoogle.add(us_google);
        traygoogle.add(kr_google);

        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(traygoogle);
        traysearch.add(naver);
        traysearch.add(daum);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
