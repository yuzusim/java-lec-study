package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        //int rep;
        int min;

        int rep = 0;
        min = rep;

        for (int i = rep + 1; i < N; i++) {
            rep = i;
            min = rep;
            if (arr[min] > arr[i]) {
                min = i;
            }
        }

        if (rep != min) {
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        // for 위치문 전체 출력 할때
        for (int v : arr) {
            System.out.println(v + " ");

        }//end main


    }
}