package ex08;

class Account extends Object{
    // 모든 클래스의 부모타입 다 모아서 다형성 쓰려고 오브젝트를 쓰는 거임
    // 오브젝트가 있는 toString() 상태값 확인용으로 많이 씀

    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

    // 컨트롤 + 스페이스 + toString()으로 받을 수도 있지만 위에 껄로
    //@Override
    //public String toString() {
    //    return "안녕"; // 객체 상태값 적음
    //}
}
public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account2);

//        System.out.println(account.toString());
//        System.out.println(account.getClass());
//        System.out.println(account.hashCode());

        // 여기서 == 은 메모리를 비교 하는 것이다.
        // 메모리 값 비교, (주소 비교)
        // 상황에 따라 다름
        // 여기서는 래퍼런스 자료형이기 때문에 == 하면 주소를 비교
        // 여기서 new 2번해서 주소 값 다름
        if(account == account2){
            System.out.println("같아요?");
        }

        // account -> equals() (오브젝트) (주소비교)
        // 안에 있는 상태값 비교하고 싶을때 --> equals를 써서 절대 해결이 안됨 반드시 스트링값 비교
        // 문자열 String이 들고 있는 equals는 오브젝트를 재정의 함
        // 객체를 스트링으로 상태비교를 할 수 있다.
        // account.toString -> equals() (주소비교 and 값비교)
        // account.toString().equals 을 쓴다.
        if(account.toString().equals(account2.toString())){
            System.out.println("같아요?");
        }

//        if(account.equals(account2)){
//            System.out.println("같아요?");
//        }



    }
}
// account -> equals() (오브젝트) (주소비교)
// 안에 있는 상태값 비교하고 싶을때 --> 반드시 스트링값 비교
// equals를 하면 상태 값을 비교해준다. -> 반드시 String 의 equals여야 한다.
// 객체를 스트링으로 파일을 바꿔서 상태 비교를 할 수 있다.
// account.toString -> equals() (주소비교 and 값비교)
// account.toString().equals 을 쓴다.
// 값을 비교할때 스트링을 쓴다.