package chapter16_Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/** Colleague 인터페이를 구현. 텍스트 입력을 실행하는 클래스 */
public class ColleagueTextfield extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextfield(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMeidator(Mediator meidator) {
        this.mediator = meidator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ?  Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
