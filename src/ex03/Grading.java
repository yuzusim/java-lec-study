package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        // 90 이상 A
        // 80 이상 90미만 B
        // 70 이상 80 미만 C
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력 받으시오: ");

        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("A 학점");
        } else if (grade >= 80) {
            System.out.println("B 학점");
        } else if (grade >= 70) {
            System.out.println("C 학점");
        }

    }
}
