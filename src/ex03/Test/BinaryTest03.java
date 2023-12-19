package ex03.Test;

public class BinaryTest03 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9 / 2 = 4
        int N = arr.length;
        final int target = 8;
        int start = 0;
        int end = N - 1;
        int mid = (end - start) / 2;

        if (arr[mid] == target) {
            System.out.println("1회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }

        if (arr[mid] < target) { // 기대값 start 5, end 8
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("1회전 start : " + start);
        System.out.println("1회전 end : " + end);

    }
}