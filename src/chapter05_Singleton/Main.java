package chapter05_Singleton;

/** 동작 테스트용 클래스 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("ojb1과 obj2는 다른 인스턴스입니다.");
        }

        System.out.println("End.");
    }
}
