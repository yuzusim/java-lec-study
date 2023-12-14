package ex03;

import java.util.Scanner;

public class RocrPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(0), 바위(1), 보(2) 중 하나를 선택: ");

        int user = sc.nextInt();

        int com = (int) (Math.random() * 3);

        if (user == com) {
            System.out.println("비겼습니다.");
        } else if (user == 1 && com == 2) {
            System.out.println("user 가 이겼습니다.");
        }

    }
}

// 가위, 바위, 보 중 하나를 선택
// 컴퓨터가 생성한값과 비교
// 누가 이겼는지 화면에 출력

// 랜덤 함수를 호출
// Random 클래스는 int, long, float, double, boolean type의 난수를 얻을 수 있지만

/**
 * Math.random()은 0.0에서 1사이의 난수를 얻습니다.
 * (int)(Math.random()*10); //0 ~ 10 사이
 * (int)(Math.random()*100); // 0 ~ 100 사이
 */