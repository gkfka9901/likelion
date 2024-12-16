package day06;

public class CheckingAccount extends BankAccount{
    int overdraftLimit;
    public void showbalance() {
        System.out.println("잔액: " + balance + "초과인출한도: " + overdraftLimit);
    }
}
