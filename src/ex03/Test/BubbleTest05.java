package ex03.Test;

/**
 * * 1회전 (4바퀴)
 * * (1) 5, 8 비교 (변화없음)
 * * (2) 8, 2 비교 (5,2,8,4,3)
 * * (3) 8, 4 비교 (5,2,4,8,3)
 * * (4) 8, 3 비교 (5,2,4,3,8)
 */
public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        // 상수는 대문자로 만든다. 변하지 않는 수 앞에 final 붙임
        final int N = arr.length;

        int temp;

        // j < N - 1 - i; --> 이 부분!!

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println();
            }
        }


        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + "");
        }

    }
}


// 1회전
//        for (int i = 0; i < N - 1; i++) {
//           if (arr[i] > arr[i + 1]) {
//               temp = arr[i];
//               arr[i] = arr[i + 1];
//               arr[i + 1] = temp;
//           }
//           System.out.println();
//        }

//        // 2회전
//        for (int i = 0; i < N - 2; i++) {
//            if (arr[i] > arr[i + 1]) {
//                temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//            System.out.println();
//        }

