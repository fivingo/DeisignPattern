package chapter04_FactoryMethod.idcard;

import chapter04_FactoryMethod.framework.*;

/** 메서드 use를 구현하고 있는 클래스 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
