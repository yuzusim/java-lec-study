package ex03.Test;

/**
 * 오름차순을 기준으로 정렬한다.
 * 5, 8, 2, 4, 3
 * (N)
 * 회전수 : N-1
 * 1회전때 비교 횟수 : N-1
 * 2회전때 비교 횟수 : N-2
 * 3회전때 비교 횟수 : N-3
 * 4회전때 비교 횟수 : N-4
 * <p>
 * 1회전(4바퀴)
 */


public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        // 상수는 대문자로 만든다. 변하지 않는 수 앞에 final 붙임
        final int N = arr.length;

        //첫번째
        for (int i = 0; i < N - 1; i++) {
            System.out.println("몇번 돌지");
        }

        //4바퀴 돌고 내부적으로 4바퀴 돌기
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                //
            }
            System.out.println("몇번 돌지");
        }

    }
}
