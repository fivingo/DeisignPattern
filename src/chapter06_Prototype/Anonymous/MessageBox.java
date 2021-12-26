package chapter06_Prototype.Anonymous;

import chapter06_Prototype.framework.*;

/** 문자열을 테두리로 표시하는 클래스, use와 createClone을 구현 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }

        System.out.println(" ");
        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
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
