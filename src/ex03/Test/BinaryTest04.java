package ex03.Test;

public class BinaryTest04 {
    public static void main(String[] args) {
        // N = 13
        // 시간복잡도 log2(N) -> log2(13) -> 3.700 (3과 4사이)
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // 9 / 2 = 4
        int N = arr.length;
        final int target = 8;
        int start = 0; // 시작 0번 방 값 --> 0
        int end = N - 1; // 9번 방 값 --> 9 - 1 = 8
        int mid; // 중간 mid 값 --> 8/2 = 4


        // 1회전
        mid = start + ((end - start) / 2); // {1, 2, 3, 4, 5, 6, 7, 8, 9}
        if (arr[mid] == target) {
            System.out.println("1회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }
        if (arr[mid] < target) { // 기대값 start 5, end 8
            start = mid + 1;
        }
        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("1회전 start: " + start);
        System.out.println("1회전 end: " + end);


        // 2회전
        mid = start + ((end - start) / 2);
        if (arr[mid] == target) {
            System.out.println("2회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }
        if (arr[mid] < target) { //기대값 start 6, end 8    1, 2, 3, 4, 5, 6, 7, 8, 9
            start = mid + 1;
        }
        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("2회전 start: " + start);
        System.out.println("2회전 end: " + end);

        // 3회전
        mid = start + ((end - start) / 2);
        if (arr[mid] == target) {
            System.out.println("3회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }
        if (arr[mid] < target) { //기대값 start 7, end 8    1, 2, 3, 4, 5, 6, 7, 8, 9
            start = mid + 1;
        }
        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("3회전 start: " + start);
        System.out.println("3회전 end: " + end);

        System.out.println("시간복잡도 : " + Math.log(N) / Math.log(2));

    }
}