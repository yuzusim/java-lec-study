package ex03;

class Box {
    int width;
    int lenght;
    int height;

    double getVoume() {
        return (double) width * height * lenght;
    }

}

public class BoxTestEx01 {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20;
        b.height = 20;
        b.lenght = 30;

        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.lenght + ", " + b.height + "입니다.");
        System.out.println("상자의 부피는 " + b.getVoume() + "입니다.");


    }
}
