package chapter10_Strategy;

/** 가위바위보를 하는 플레이어를 표시하는 클래스 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

    public String toString() {
        return "[" + name + ": " + gamecount + " games, " + wincount + "  win, " + losecount + " lose]";
    }
}
