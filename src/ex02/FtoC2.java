package ex02;

import java.util.Scanner;

public class FtoC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨(미국 C) 온도를 입력하시오: ");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
        //System.out.println(c); // --> 1번하고 확인 해보기(어디서 오류가 났는지 확인)

        // 2. 섭씨 온도 --> 화씨 온도 변환
        double result = 9.0 / 5.0 * temp + 32;
        System.out.println(result);
    }
}
