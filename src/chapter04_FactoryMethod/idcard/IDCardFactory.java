package chapter04_FactoryMethod.idcard;

import chapter04_FactoryMethod.framework.*;
import java.util.*;

/** 메서드 createProduct, registerProduct를 구현하고 있는 클래스 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
