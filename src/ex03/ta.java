package ex03;

import java.util.Scanner;

public class ta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~9단 중 출력을 원하는 구구단의 단을 입력하세요");
        int dan = sc.nextInt();

        for (int i = 1; i < 9; i++) {
            System.out.println(dan + dan * i);
        }
    }
}
