package ex04.example2.model;

// 트렌직션 관리
public class BankService {

    public static void 이체(Account SenderAccount, Account receiverAccount, long amount) {
        SenderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
