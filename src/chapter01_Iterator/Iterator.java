package chapter01_Iterator;

/** 하나씩 나열하면서 검색을 실행하는 인터페이스 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
