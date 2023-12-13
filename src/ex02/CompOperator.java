package ex02;

public class CompOperator {
    public static void main(String[] args) {
        System.out.println(3 == 4); // 같은가
        System.out.println(3 != 4); // 다른가
        System.out.println(3 > 4); // x가 y 보다 큰가
        System.out.println(4 > 3); // x가 y 보다 큰가

        System.out.println((3 == 3 && 4 == 7) + " "); //하나만 거짓이면 전체가 거짓
        System.out.println((3 == 3 || 4 == 7) + "");  // 하나가 참이면 전체가 참
    }
}
