package chapter19_state;

/** State를 구현하고 있는 클래스. 야간의 상태를 나타낸다 */
public class NightState implements State {
    private static NightState singleton = new NightState();
    
    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }
    
    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상: 야간금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야간)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("야간통화 녹음");
    }

    public String toString() {
        return "[야간]";
    }
}
