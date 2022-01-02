package chapter14_ChainOfResponsibility;

/** 트러블을 해결하는 구상 클래스 (홀수 번호의 트러블을 해결) */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
