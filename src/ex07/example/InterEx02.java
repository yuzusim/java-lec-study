package ex07.example;

// 라이브러리 판매
interface EventListener {
    void action();

}

// 라이브러리 판매자가 생성
class MyApp {

    public void click(EventListener l) {
        l.action();
    }

}

// 개발자인 내가 구현 --> 필요
//class Button implements EventListener {
//
//    @Override
//    public void action() {
//        System.out.println("회원가입 로직이 실행 됩니다.");
//        // 중요 코드
//    }
//}

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행 됩니다.");
            // 컨트롤 + 스페이스
            // 메서드만 넘기는 기법
            // 구현체 만들지 않아도 됨
        });
    }
}
