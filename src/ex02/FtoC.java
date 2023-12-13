package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨(미국 F) 온도를 입력하시오: ");

        // 1. 화씨 온도 받기
        double temp = sc.nextDouble();
        // System.out.println(f); --> 1번하고 확인 해보기(어디서 오류가 났는지 확인)

        // 2. 화씨 온도 --> 섭씨 온도 변환
        double result = 5.0 / 9.0 * (temp - 32);
        System.out.println(result);


    }
}
