package ex02;

/* 변수 작성법
 * 1. 카멜 표기법을 사용한다.
 * 2. 숫자를 먼저 사용하지 않는다.
 * 3. 특수문자는 사용하지 않는다. */
public class IdenEx01 {
    public static void main(String[] args) {
        // int class=1; 자바가 기본적으로 사용하고 있는 키워드 = 안 됨
        // int public=1; " 안 됨
        int abc__; // 절대 사용 안함
        int userMoney; // 카멜 표기법
        // int abc#; 안 됨
        int method;
        double abc$$; // 특수문자 사용하지 말 것
        // int 1stMoney; 안 됨 숫자로 변수를 지정할 수 없음
    }
}
