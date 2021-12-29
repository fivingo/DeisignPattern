package chapter09_Bridge;

/** '지정 횟수만큼 표시한다'는 기능을 추가하는 클래스 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();

        for (int i = 0; i < times; i++) {
            print();
        }

        close();
    }
}
