package chapter20_Flyweight;

import java.util.HashMap;

/** BigChar의 인스턴스를 공유하면서 생성하는 클래스 */
public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar의 인스턴스 생성 (공유)
    public synchronized  BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);

        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }

        return bc;
    }
}
