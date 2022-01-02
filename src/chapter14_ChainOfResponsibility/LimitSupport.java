package chapter14_ChainOfResponsibility;

/** 트러블을 해결하는 구상 클래스 (지정한 번호 미만의 트러블을 해결) */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
