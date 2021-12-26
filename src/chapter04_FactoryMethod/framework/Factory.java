package chapter04_FactoryMethod.framework;

/** 메서드 create를 구현하고 있는 추상 클래스 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);

        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
