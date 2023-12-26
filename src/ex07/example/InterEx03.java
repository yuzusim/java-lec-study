package ex07.example;

interface Remocon {
    void on();

    void off();

}

class SamsungRemocon implements Remocon {
    // 인터페이스는 강제성을 띔 --> 메서드 무조건!
    // interface는 implements에서 만든다.
    @Override
    public void on() {
        System.out.println("삼성 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모콘 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocon, LgRemocon (구현체가 누군지 적어 줘야함)
 */
class CommonRemocon {
    // Remocon <- SamsungRemocon
    // Remocon <- LgRemocon
    private Remocon r; // 인터페이스 or 추상 클래스 추측

    public CommonRemocon(Remocon r) { // 생성자로 객체 전달
        this.r = r;
    }

    public void on() {
        r.on();
    }

    public void off() {
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        // Remocon samsung = new SamsungRemocon();
        // // Remocon, SamsungRemocon 같이 뜸
        // samsung.on();

        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        // new가 떴는지 왜 new가 안되지??  -> 45번 라인
        cr.on();


    }
}
// 메서드를 강제 시킬 수 있다.
// 동적 바인딩 시킬 수 있다.
// 메서드 이름 동일하게 해야한다.
// 문법은 반드시 알아야 된다.
// 사용할 줄 알아야 된다.
//