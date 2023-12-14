package ex03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");

        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}

// 조건이 참이면 참인 조건으로 실행
// 참과 거짓으로 구분
