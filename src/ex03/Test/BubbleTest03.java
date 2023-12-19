package ex03.Test;

public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        // 스왑 할때 변수를 하나 만들어서 저장한다.
        // 보통 temp라는 변수를 사용 선언하고
        // temp에 arr[0] 번지 수를 담는다.
        // arr[0] = arr[1]; 변경 해주고
        // arr[1] = temp; 변경 해주고 확인해봄

        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        // 스왑 되었는지 확인
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
