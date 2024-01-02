package ex06.example3;

public class StarApp {
    // 메서드 만들기
    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack(); // 질럿
        u2.attack(); // 드라군
    }
    // 메서드 이름이 동일해도 타입 이름이 다르면 오버로딩
    // Dragoon 타입을 --> u1으로, Zealot 타입을 --> u2로 바꿔준다.
    //
    public static void gameStart(Dragoon u1, Zealot u2) {
        u1.attack();  // 여기서 호출 될때마다 동적바인딩으로 재정의 됨
        u2.attack();
    }

    public static void gameStart(Zealot u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        // 질럿이랑 드라군 만들어서 띄움
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d1");
        Zealot z2 = new Zealot("z2");


        gameStart(z1, d1);
        gameStart(d1, z1);
//        gameStart(z1, z2);
//        gameStart(z2, z1);
    }
}