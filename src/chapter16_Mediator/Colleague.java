package chapter16_Mediator;

/** '회원'의 인터페이스(API)를 결정하는 인터페이스 */
public interface Colleague {
    public abstract void setMeidator(Mediator meidator);
    public abstract void setColleagueEnabled(boolean enabled);
}
