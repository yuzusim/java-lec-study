package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("정수를 입력하시오: ");

            int number = sc.nextInt();

            if (number == 99) {
                break; //반복문을 빠져나가게 함
            }

            if (number > 0) {
                System.out.println("양수 입니다.");
            } else if (number < 0) {
                System.out.println("음수 입니다.");
            } else {
                System.out.println("0");
            }

        }
    }
}

// continue