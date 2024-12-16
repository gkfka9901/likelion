package day06;

public class BankMain {
    public static void main(String[] args) {
        SavingAccount save = new SavingAccount();
        CheckingAccount check = new CheckingAccount();

        save.showBalance();
        check.showbalance();
    }
}
