package ex04;

// 설계도
public class Circle {
    private int radius;

    // 생성자 (생성할때 무조건 실행 되는 메서드)
    public Circle(int r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
