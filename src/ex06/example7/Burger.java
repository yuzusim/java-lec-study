package ex06.example7;

public class Burger {
    private String name; // 네임 String 문자열로 가져 온다.
    private int price;

    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "이 만들어 졌어요");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
