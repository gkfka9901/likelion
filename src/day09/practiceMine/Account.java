package day09.practiceMine;

public class Account {
    int accountNumber;
    int balance;
    String id;

    public Account(int accountNumber, String id) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.id = id;
    }

    // 입금
    public void deposit(int money) throws InvalidTransactionException{
        if (money <= 0) {
            throw new InvalidTransactionException("0원 이상 입금해야 합니다.");
        }
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 잔액은 " + balance + "원 입니다.");
    }

    // 출금
    public void withdraw(int money) throws InvalidTransactionException{
        if (money > balance) {
            throw new InvalidTransactionException("잔액이 부족합니다.");
        }
        balance -= money;
        System.out.println(money + "원을 출금하였습니다. 잔액은 " + balance + "원 입니다.");
    }

    // 잔액 조회
    public int getBalance() {
        return balance;
    }
}
