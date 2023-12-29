package coding;

class Piz{
    private String topping;
    //private int radius;
    static int count = 0;

    public Piz(String topping){
         this.topping = topping;
         count++;
    }

}

public class PizzaEx01 {
    public static void main(String[] args) {
        // 인스턴스 생성
        Piz p1 = new Piz("Super");
        Piz p2 = new Piz("Cheese");
        Piz p3 = new Piz("Pepper");

        int n = Piz.count;
        System.out.println("판매 된 피자 개수: " + n);

    }
}
