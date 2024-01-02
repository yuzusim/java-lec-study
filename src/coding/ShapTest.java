package coding;

class Shap{
    protected int x, y;
    public void draw(){
        System.out.println("Shap draw");
    }
}

class Retangle extends Shap{
    private int width, height;
    public void draw(){
        System.out.println("Retangle draw");
    }

}

class Triangle extends Shap{
    private int base, height;
    public void draw(){
        System.out.println("Triangle draw");
    }

}

class Circle extends Shap{
    private int raidus;
    public void draw(){
        System.out.println("Circle draw");
    }
}

public class ShapTest {
    public static void main(String[] args) {
        Shap s = new Retangle();
        s.draw();

//        Shap s1, s2;
//        s1 = new Shap();
//        s2 = new Retangle();
//
//        s1.draw();
//        s2.draw();

    }
}
















