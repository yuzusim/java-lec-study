package ex06.examlpe6;

class Protoes {

}

class Zealot extends Protoes {
    public void attack() {
        System.out.println("질넛이 공격합니다.");
    }
}

class Dragoon extends Protoes {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
}

public class CastingEx01 {
    // public static void start(Zealot u) {
    //     u.attack();
    // }
//
    // public static void start(Dragoon u) {
    //     u.attack();
    // }

    public static void start(Protoes p) {
        if (p instanceof Zealot) {
            Zealot u = (Zealot) p; // 부모를 자식에게 전달 할 수 없다.
            u.attack();
        }
        if (p instanceof Dragoon) {
            Dragoon u = (Dragoon) p; // 다운캐스팅 --> 자기를 깍아서 대입시켜서 검증시킴
            u.attack();
        }
        // instanceof p의 타입 뭔지 확인

        // p.attack();
        // (protoes p = new = Zealot())
        // Dragoon u = (Zealot) p; // 부모를 자식에게 전달 할 수 없다. 대입 불가능
        // u.attack();
        // 실행시에 오류가 난다. 런타임 인셉션

    }

    public static void main(String[] args) {

        // Protoes d1 = new Dragoon(); // // protoes, Dragoon
        // Dragoon z2 = d1; // protoes, Dragoon
        // Dragoon z2 = (Dragoon) d1; // 명시적 형변환은 가능, 코드상 오류 안남

        start(new Zealot());
        start(new Dragoon());
    }
}
