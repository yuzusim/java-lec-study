package ex03;

public class SelectdEx02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep;
        int min;

        // min -> m
        final int rep = 0;
        int min = rep;

        for (int j = 0; j < N-1; j++) {
            rep =j;
            min = i;
            for (int i = rep+1; i < N; i++) {
                if (arr[0] > arr[i) { // 5, 8, 2, 4, 3
                    min = i;
                }
            }

            if (rep != min) {
                int temp = arr[rep]; // temp = 5
                arr[rep] = arr[min];
                arr[min] = temp;
            }
        }

        // for 위치문 전체 출력 할때
        for (int v : arr) {
            System.out.println(v + " ");

        }//end main


    }
}
