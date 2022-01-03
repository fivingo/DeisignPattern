package chapter18_Memento.game;

import java.util.*;

/** 게임을 실행하는 주인공의 클래스. Memento의 인스턴스를 만든다 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {
            "사과", "포도", "바나나", "귤",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        if (dice == 1 ) {
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반이 되었습니다.");
        } else if (dice == 6) {
            String f = getFruits();

            System.out.println("과일(" + f + ")을 받았습니다.");
            fruits.add(f);
        } else {
            System.out.println("변한 것이 없습니다.");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();

        while (it.hasNext()) {
            String f = (String) it.next();

            if (f.startsWith("맛있는")) {
                m.addFruit(f);
            }
        }

        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public String getFruits() {
        String prefix = " ";

        if (random.nextBoolean()) {
            prefix = "맛있는";
        }

        return prefix = fruitsname[random.nextInt(fruitsname.length)];
    }
}
