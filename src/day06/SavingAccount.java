package day06;

public class SavingAccount extends BankAccount{
    int interestRate;

    public void showBalance() {
        System.out.println(("잔액: " + balance + "이자율: " + interestRate));
    }
}
