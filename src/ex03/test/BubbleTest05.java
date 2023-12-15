package ex03.test;

public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int n = arr.length;

        int temp;
        for(int i=0;i<5;i++){
            if(arr[3]>arr[4]){
                temp=arr[3];
                arr[3]=arr[4];
                arr[4]=temp;
            }
        }
    }
}
