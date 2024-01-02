package ex08;
// 예외 처리
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 컨트롤 + 알트 + t
        int result = 0;
        try {
            result = 10/num;
        } catch (Exception e) { //Exception e = new ArithmeticException()
//            System.out.println("0으로 나누면 안되요");
//            System.out.println(e.getMessage()); // 여기서 예외 처리
//            System.out.println(e.getClass());
//            e.printStackTrace(); //
           throw new RuntimeException(("0으로 나눌 수 없어요"));
        }
        System.out.println("나눗셈 결과는: " + result);
        // 실행시 오류 런타임 인셉션
    }
}

//Throwable  --> getMessage()
//Exception --> x
//RuntimeException --> x
//ArithmeticException --> x