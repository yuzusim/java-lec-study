package ex03;

import java.util.Scanner;

public class GogodanEx01 {
    public static void main(String[] args) {
        // 1. 2~9 단가지 출력되는 프로그램을 만드시오.
        // 2.
        /*
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력하시오: ");
        int d = sc.nextInt();

        //for 문에 변수 int d를 넣어줌
        for (int i = 2; i <= d; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }


    }
}

//System.out.println("2*"+i+" = " +(2*i));


// System.out.println(i + "*2=4");
// System.out.println(i + "*3=6");
// System.out.println(i + "*4=8");
// System.out.println(i + "*5=10");
// System.out.println(i + "*6=12");
// System.out.println(i + "*7=14");
// System.out.println(i + "*8=16");
// System.out.println(i + "*9=18");