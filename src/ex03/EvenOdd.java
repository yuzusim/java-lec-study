package ex03;
// 짝수, 홀수 판별하기
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number; //정수는 값을 할당하지 않으면 0이 된다. //값을 입력하기 전에 먼저 선언

        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력하시오.");

        number=sc.nextInt();

        if(number%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
    }
}
