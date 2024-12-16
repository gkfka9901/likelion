package day09.mola;

import java.util.Scanner;

public class Account {
    int accountNumber;
    int balance;
    Customer id;

    Scanner input = new Scanner(System.in);

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public void deposit() {
        System.out.println("계좌번호를 입력하세요: ");
        int num = input.nextInt();
        if (accountNumber == num) {

            System.out.println("입금할 금액을 입력하세요: ");
            int money = input.nextInt();

            balance += money;
            System.out.println("잔액: " + balance);
        } else {
            System.out.println("존재하지 않는 계좌번호입니다.");
        }
    }
    public void withdraw() {
        System.out.println("계좌번호를 입력하세요: ");
        int num = input.nextInt();
        if (accountNumber == num) {

            System.out.println("입금할 금액을 입력하세요: ");
            int money = input.nextInt();

            if (balance > money) {
                balance -= money;
                System.out.println("잔액: " + balance);
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("존재하지 않는 계좌번호입니다.");
        }

    }
}