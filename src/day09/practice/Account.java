package day09.practice;

import day09.MyException;

import java.util.InvalidPropertiesFormatException;
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

    public void deposit(int amount) throws MyException {
        if (amount <= 0) {
            throw new MyException("입금 금액은 0보다 커야 합니다.");
        }
        balance += amount;
        System.out.println("입금되었습니다. 잔액: " + balance);
    }

    public void withdraw(int amount) throws MyException{
        if (amount <= 0) {
            throw new MyException("입금 금액은 0보다 커야 합니다.");
        }
        if (amount > balance){
            throw new MyException("잔액이 부족합니다.");
        }
        balance -= amount;
        System.out.println("출금되었습니다. 잔액: " + balance);


    }

    public int getBalance() {
        return balance;
    }


}
