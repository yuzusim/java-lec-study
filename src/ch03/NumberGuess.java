package ch03;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int rdNum = random.nextInt(100) + 1;

        while(true) {
            System.out.print("번호를 추측하는 게임입니다. 번호를 입력하세요. : ");
            int g = sc.nextInt();
            if (g < rdNum) {
                System.out.println("제시한 번호가 정답보다 낮습니다.");
            } else if (g > rdNum) {
                System.out.println("제시한 번호가 정답보다 높습니다.");
            } else {
                System.out.println("축하합니다. 맞추셨습니다. 게임을 종료합니다.");
                break;
            }
        }
    }
}
