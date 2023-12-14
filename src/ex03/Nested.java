package ex03;
//양수, 음수, 0 판별하기
import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력하시오.");

        int number=sc.nextInt(); //선언하면서 값을 입력
        if (number>0){
            System.out.println("양수입니다.");
        } else if (number<0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
}
