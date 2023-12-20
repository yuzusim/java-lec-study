package ex04;

// 설계도
class people {
    String name;
    int power;
    int hp;

    public people(String name, int power) {
        this.name = name;
        this.power = power;
        this.hp = 100; //
    }

    // 행위
    public void upgradePower() {
        this.power++;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", poewr=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PresonEx01 {
    public static void main(String[] args) {
        people p1 = new people("티모", 10);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);


    }
}
