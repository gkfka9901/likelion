package day09.practice;

import day09.MyException;

import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);

    // 속성- 이름, id ,통장목록
    String name;
    String id;
    Account[] accounts = new Account[5];
    int accountCount = 0;


    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // 메서드 - 계좌생성
    public void createAccount(int accountNumber) throws MyException {
        if (accountCount >= accounts.length) {
            throw new MyException("최대 계좌 개수를 초과헀습니다.");
        }

        accounts[accountCount++] = new Account(accountNumber);
        System.out.println("계좌 생성 완료. 현재 계좌 수: " + accountCount);

    }

    public Account findAccountByNumber(int accuntNumber) throws MyException {
        for (Account account : accounts) {
            if (account == null && account.accountNumber == accuntNumber) {
                return account;
            }
        }
        throw new MyException("해당 계좌를 찾을 수 없습니다.");

    }
}
