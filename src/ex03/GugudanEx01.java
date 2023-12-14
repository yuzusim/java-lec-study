package ex03;

import java.util.Scanner;
//구구단 출력하기
public class GugudanEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("구구단을 확인할 숫자를 입력하시오.");
            System.out.println("종료하려면 '100'을 입력하시오.");
            int x = sc.nextInt();
            for (int i = 1; i < 10; i++) {
                int g = x * i;
                System.out.println(x + "x" + i + "=" + g);
            }
            if(x==100){
                break;
            }
        }
    }
}
