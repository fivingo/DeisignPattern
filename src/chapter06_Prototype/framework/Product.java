package chapter06_Prototype.framework;

/** 추상 메서드 use와 createClone이 선언되어 있는 인터페이스 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCloen();
}
