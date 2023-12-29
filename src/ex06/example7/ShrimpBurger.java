package ex06.example7;

public class ShrimpBurger extends Burger {

    private String material; // 재료 // 네임 String 문자열로 가져 온다.

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
        System.out.println("");
    }

    public String getMaterial() {
        return material;
    }


}
