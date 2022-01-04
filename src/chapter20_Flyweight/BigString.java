package chapter20_Flyweight;

/** BigChar를 모아서 만든 '큰 문자열'을 나타내는 클래스 */
public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
