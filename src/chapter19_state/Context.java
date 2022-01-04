package chapter19_state;

/** 금고의 상태변환을 관리하고 경비센터와 연락을 취하는 인터페이스 */
public interface Context {
    public abstract void setClock(int hour);                // 시간설정
    public abstract void changeState(State state);          // 상태전환
    public abstract void callSecurityCenter(String msg);    // 경비센터 호출
    public abstract void recordLog(String msg);             // 경비센터 기록
}
