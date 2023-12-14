package ex03;

public class GogodanEx02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int x = 2; x <= 9; x++) {
                System.out.println(x + "*" + i + "=" + x * i + "\t");
            }
            System.out.println();
        }
        /*
        for (int x = 2; x <= 4; x++) {
            System.out.println(x + "*1=" + x * 1 + "\t");
        }
        System.out.println();

        for (int x = 2; x <= 4; x++) {
            System.out.println(x + "*2=" + x * 2 + "\t");
        }
        System.out.println();
        */
    }
}

