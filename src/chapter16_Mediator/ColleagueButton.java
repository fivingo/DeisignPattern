package chapter16_Mediator;

import java.awt.*;

/** Colleage 인터페이스 구현. 버튼을 나타내는 클래스 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMeidator(Mediator meidator) {
        this.mediator = meidator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
