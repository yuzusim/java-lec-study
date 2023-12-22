package ex05;

public class MyStaticMethodEx01 {
    public static int abs(int x) {
        return x > 0 ? x : -x;

        // 절대값 --> absolute_value = x > 0 ? x : -x;
        // 최대값 --> max_value = (x > 0) ? x : y;
        // 최소값 --> min_value = (x > 0) ? x : y;

    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++)
            result *= base;
        return result;

    }
}
