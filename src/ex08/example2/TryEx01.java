package ex08.example2;
// 예외 처리 --> 컴파일 인셉션 -->

class MyZeroDivideException extends Exception{
    // 컴파일 체크 인셉션
    // 내가 만든다. --> 상속만 받으면 끝나니까
    // 내가 만드는 이름 --> 오류 났을때 정확히 알 수 있음
}


class Cal2{
    // RuntimeException = 엄마가 알려주지 않았을때
    public void divide(int num) throws Exception {
        System.out.println(10 / num);
        // throws 메서드 걸면 마음대로 처리 위임하는 것
        // 호출자한테 예외 위임 함

    }
}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}





