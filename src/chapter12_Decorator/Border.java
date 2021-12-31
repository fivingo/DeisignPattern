package chapter12_Decorator;

/** '장식'을 나타내는 클래스 */
public abstract class Border extends Display {
    protected Display display;

    protected Border (Display display) {
        this.display = display;
    }
}
