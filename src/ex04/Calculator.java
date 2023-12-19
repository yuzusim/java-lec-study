package ex04;

// 메서드는 호출할때만 실행
//
// 모든 문법은 클래스 안에 넣어야한다.
// 계산기 클래스 = 설계도
public class Calculator {

    //메서드는 메서드 안에 만들지 못한다.
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

}

