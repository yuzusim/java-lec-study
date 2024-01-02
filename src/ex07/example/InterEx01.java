package ex07.example;

// 인터페이스는 오브젝트일까 ? 아니다 new 이다.

interface Remocon {
    public abstract void on();

    public abstract void off();

}

class SamsungRemocon implements Remocon {
    // interface는 implements에서 만든다.
    // 인터페이스는 강제성을 띔 --> 메서드 무조건 강제화 시킨다!
    // 이 구조는 규칙을 만들어서 강제화 시키는 행위이다.

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
    // 라이브러리 위에는 캡슐화 되어 있고 CommonRemocon 부터 볼 수 있을때
    // 리모콘은 오브젝트가 아니구나
    // 여기서 디버깅 해보면 인터페이스 or 추상 클래스로 만들었구나 추측 해야한다.
    // 그럼 내가 직접 못 넣으니까
    // 구현한 구현체만 넣을 수 있다.
    // 구현체는 상속을 한 자식이나 implements 한 구현체
    // 그러면 클래스 위에 사용법을 반드시 적어줘야 한다. --> 추적할 수 있게
    //


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

        // 라이브러리에 판매 하려고 한다. --> 생성자 하나 만들기
        // CommonRemocon cr = new CommonRemocon(new Remocon());
        // new가 떴는지? 왜 new가 안되지?? --> 여기서 라이브러리 사용법 확인
        // 구현체 확인하고
        // 그럼 이제 내가 공통 리모콘을 하나 만들껀데 삼성 티비를 킬꺼라면
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on(); // 호출 --> 이제 공통 리모콘이 만들어짐

    }
}
// 메서드를 강제 시킬 수 있다.
// 동적 바인딩 시킬 수 있다.
// 메서드 이름 동일하게 해야한다.
// 문법은 반드시 알아야 된다.
