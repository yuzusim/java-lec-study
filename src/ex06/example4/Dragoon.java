package ex06.example3;

public class Dragoon {

    String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("드라곤이 공격합니다." + name);
    }
}

