package ex03;

public class SelectedEx02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
/*
        주어진 배열 중에서 최솟값을 찾는다.
        그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
        맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
        하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
*/
        int min;
        for (int i = 0; i < N; i++) {
            min = i;
        }
        System.out.println(min);


    }
}



