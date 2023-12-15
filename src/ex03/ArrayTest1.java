package ex03;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] s = new int[10];

        s[0] = 0;
        s[1] = 1;
        s[2] = 2;
        s[3] = 3;
        s[4] = 4;
        s[5] = 5;
        s[6] = 6;
        s[7] = 7;
        s[8] = 8;
        s[9] = 9;


        for (int i = 0; i < 10; i++) {
            s[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(s[i] + " ");
        }


    }
}
