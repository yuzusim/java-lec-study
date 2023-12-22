package ex05;

public class PizzaTestEx02 {
    public static void main(String[] args) {
        PizzaEx02 p1 = new PizzaEx02("Super Supreme");
        PizzaEx02 p2 = new PizzaEx02("Chese");
        PizzaEx02 p3 = new PizzaEx02("Pepperoni");
        int n = PizzaEx02.count;
        System.out.println("지금까지 판매된 피자 개수= " + n);
    }
}
