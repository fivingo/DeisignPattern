package chapter10_Strategy;

import java.util.Random;

/** 이기면 다음에도 같은 손을 내는 전략을 표시하는 클래스 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }

        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
