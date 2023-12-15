package ex03.Text;

public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        // 상수는 대문자로 만든다. 변하지 않는 수 앞에 final 붙임
        final int N = arr.length;

        int temp;
        // 첫번째 교환
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        if (arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        if (arr[3] > arr[4]) {
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + "");
        }

    }
}

