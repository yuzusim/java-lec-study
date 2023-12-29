package ex06.example7;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거", 1000); // [Burger]
        ShrimpBurger b2 = new ShrimpBurger("새우버거", 2000, "새우");  // [Burger, ShrimpBurger]
        Coke c1 = new Coke("콜라", 1000);
        System.out.println();

        BurgerSet set1 = new BurgerSet(new Burger("기본버거", 1000), new Coke("콜라", 1000));
        // 버거 세트에서는 -->  버거와 콜라의 객체를 새로 생성한다.
        // 객체를 새롭게 생성하면 값도 다르게 넣어 줄 수 있다. --> 다형성 동적 바인딩

        // 총 가격을 확인 할수 있는 메서드 --> BurgerSet에서 토탈 값 ( getTotalPrice() )을 받아온다.
        //
        System.out.println("총 가격은: " +set1.getTotalPrice());
        //

        // getBurger로 가져오면 엄창 번거로움
//        System.out.println(set1.getBurger(). getPrice());
//        System.out.println(set1.getCoke(). getPrice());

        // System.out.println("총 가격은: " +set1.getTotalPrice());

    }
}
