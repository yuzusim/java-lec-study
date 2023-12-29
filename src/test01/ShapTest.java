package test01;

class  Shape{
    public void draw(){
        System.out.println("Shap 중의 하나를그릴 예정입니다.");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}

public class ShapTest {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.draw();
    }

}
