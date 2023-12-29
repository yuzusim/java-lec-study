package ex04;
// 싱글톤 패턴
// 프레지던트르 메모리에 딱 한번만 띄울꺼다.
// President를 new를 한 번만 해!!

class President {
    static President instance = new President();
    // static 안 붙이면 이코드 절때 실행안됨
    // static 붙이면 메인 실행 되기 전에 실행 됨
    // 그때 new가 실행됨 메인 실행전 heap이 뜸
    // 그리고 가리키는 주소는 instance
    // instance 한테 접근하는 거다.

    private President() {
    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());
        // hashCode 임의의 난수
        // 객체.해쉬코드
        // 이 두 코드는 같다.

        President p2 = President.instance;
        System.out.println(p2.hashCode());

        // 객체를 딱 한번만 메모리에 올릴 수 있는 패턴
        // President p1 = new President(); 이렇게 하면
        // 생성자에 접근을 못해 private니까
        // 내가 new 할 수 있는 방법이 없다.
        // 메인 시작 전에 한번 띄운다 --> 어디에?? heap에!!
        // 메모리 공간이 다름

        // 메모리에 한번만 띄우고 싶으면 메인 시작전에
        // staic 으로 띄워도 되지만
        // 싱글톤 패턴으로 --> heap에 띄우면서도 한번 띄울 수 있는 방법이 있구나!
        //

    }
}