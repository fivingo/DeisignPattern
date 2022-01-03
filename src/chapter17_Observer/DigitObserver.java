package chapter17_Observer;

/** 숫자로 수를 표시하는 클래스 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DiggitObserver: " + generator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
