package ex02;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        // String name; //한 단어를 읽을 수 있음
        // int age;

        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("이름을 입력하시오: ");
        name = sc.nextLine();
        System.out.println("나이를 입력하시오: ");
        // age = sc.nextLine();

        // System.out.println(name + "님 안녕하세요!" + (age) + "살이시네요.");

    }
}
