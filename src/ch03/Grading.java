package ch03;
//성적 처리 예제
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("성적을 입력하세요");
        int grade=sc.nextInt();
        if(grade>=90){
            System.out.println("당신의 학점은 A입니다.");
        }else if(grade>=80){
            System.out.println("당신의 학점은 B입니다.");
        }else if(grade>=70) {
            System.out.println("당신의 학점은 C입니다.");
        }else if(grade>=60){
            System.out.println("당신의 학점은 D입니다.");
        }else{
            System.out.println("당신의 학점은 E입니다.");
        }
    }
}
