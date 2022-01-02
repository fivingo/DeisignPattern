package chapter14_ChainOfResponsibility;

/** 트러블을 해결하는 구상클래스 (항상 '처리하지 않는다') */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
