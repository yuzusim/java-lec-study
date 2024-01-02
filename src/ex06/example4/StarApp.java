package ex06.example4;

public class StarApp {
    // 정적 메서드 오버라이드 만들기
    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack(); // 여기서 호출 될때마다 동적바인딩으로 재정의 됨
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        // 자식 클래스는 부모 클래스로 업캐스팅 가능하다.
        Protoss z1 = new Zealot("z1"); // [Zealot, Protoss]
        Protoss d1 = new Dragoon("d1"); // [Dragoon, Protoss]
        Protoss r1 = new River("r1"); // [River, Protoss]
        Protoss dark1 = new Dark("dark1"); // [Dark, Protoss]

        gameStart(z1, d1); // 동적 바인딩으로 코드가 간결해진다.
        gameStart(dark1, d1);

    }
}
