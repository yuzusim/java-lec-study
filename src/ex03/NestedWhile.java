package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("정수를 입력하시오.");

            int number=sc.nextInt(); //선언하면서 값을 입력
//            if(number==99){
//                break;
//            } //종료
//            if (number==99){
//                continue;
//            } //반복을 건너뜀
            if (number>0){
                System.out.println("양수입니다.");
            } else if (number<0) {
                System.out.println("음수입니다.");
            } else {
                System.out.println("0입니다.");
            }
        }
    }
}
