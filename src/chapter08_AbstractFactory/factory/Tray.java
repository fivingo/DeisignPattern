package chapter08_AbstractFactory.factory;

import java.util.ArrayList;

/** 추상적인 부품: Link나 Tray를 모은 클래스 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
