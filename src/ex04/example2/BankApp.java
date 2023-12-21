package ex04.example2.model;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User u1 = new User(1, "ssar", "ssar@nate.com");
        User u2 = new User(2, "cos", "cos@nate.com");

        // 2. 고객 계좌 2개 만들기
        Account a1 = new Account(1111, 1000L, 1);
        Account a2 = new Account(2222, 1000L, 2);

        // 3. 고객에게 정보를 받기(amount )
        long amount = 1000L;

        // 4.이체 (ssar --> cos 1000원)
        BankService.이체(a1, a2, amount);

    }

}
