package ex03;

public class SelectdEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        // 변경해야할 위치 replace -> rep

        // min -> m
        final int rep = 0;
        int min = rep;
        //int i = rep;

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

//
//        i=i+1; // 2
//        if (arr[0] > arr[i]) { // 5, 8, 2, 4, 3 --> min = 2
//            min = i;
//        }
//
//        i=i+1; // 3
//        if (arr[2] > arr[i]) { // 5, 8, 2, 4, 3 --> min = 2
//            min = i;
//        }
//
//        i=i+1; // 4
//        if (arr[2] > arr[i]) { // 5, 8, 2, 4, 3 --> min = 2
//            min = i;
//        }
//



    }
}
