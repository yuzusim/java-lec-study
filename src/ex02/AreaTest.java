package ex02;

public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double radius, area;

        radius = 5.0;
        area = PI * radius * radius;
        System.out.println("반지름이 5인 원의 면적은 " + area);
    }

    public static class castEx01 {
        public static void main(String[] args) {
            int n1 = 1;
            double d1 = 1.5;

            n1 = 2;

            d1 = n1; //묵시적 형변환 --> 업 캐스팅(작은걸 큰거에 넣는다.)
            System.out.println(d1);

            n1 = (int) d1; // 다운 캐스팅 (큰걸 작은거에 넣는다.)
            System.out.println(n1);
        }
    }
}
