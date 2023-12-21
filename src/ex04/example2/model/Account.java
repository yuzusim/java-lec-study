package ex04.example2;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }
}
