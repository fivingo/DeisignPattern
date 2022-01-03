package chapter16_Mediator;

/** '중개인'의 인터페이스(API)를 결정하는 인터페이스 */
public interface Mediator {
    public abstract void createColleagues();
    public abstract void colleagueChanged();
}
