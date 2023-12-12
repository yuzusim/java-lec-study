package ex01;

public class varEx01 {

    //모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지 (4Byte)
        double d1 = 1.5; // 21억까지 (8Byte)
        long big1 = 20000000000L; //경까지 (8Byte)
        boolean b1 = true; //trun, false
        char c1 = '가';

        // 모니터 출력 코드
        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // 자바 프로그램 종료 , 메인의 시작부터 끝 자바의 생명주기다
}
