package chapter10_Strategy;

/** 가위바위보의 '전략'을 표시하는 인터페이스 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
