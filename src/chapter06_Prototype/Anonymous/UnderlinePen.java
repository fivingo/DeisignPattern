package chapter06_Prototype.Anonymous;

import chapter06_Prototype.framework.*;

/** 문자열에 밑줄을 표시하는 클래스, use와 createClone을 구현 */
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");

        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }

        System.out.println(" ");
    }

    @Override
    public Product createCloen() {
        Product p = null;

        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
