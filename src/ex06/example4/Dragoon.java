package ex06.example4;

// 상속은 재정의 하기 위해서 하는 것이 아니라 타입을 일치시켜서
// 동적 바인딩을 하기 위해 하는 것이다.

public class Dragoon extends Protoss {
    String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("드라군이 공격합니다 : " + name);
    }
}








