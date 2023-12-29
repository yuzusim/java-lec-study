package ex06.example7;

public class BurgerSet { //has Burger, Coke --> 상속 아니다. 헤즈 관계이기 때문에
    private Burger burger;
    private Coke coke;
    // has 관계는 컴포지션으로 받는다. // 필요한 객체를 상태에 적는다.
    // is의 관계는 상속으로 받는다.

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어 졌어요");
    }

    public int getTotalPrice(){
        //return 2000; --> 값을 바로 리턴 받지 않고
        return burger.getPrice()+coke.getPrice();
        // 총 가격 메서드로 실행 하고 리턴 값으로 받을 꺼임
        // 클래스.getPrice() + 클래스.getPrice();

    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
