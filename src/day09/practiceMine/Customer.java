package day09.practiceMine;

import day09.AccountException;

public class Customer {
    String name;
    String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    int accountCount = 0;

    Account[] accounts = new Account[5];

    // 계좌 생성
    public void createAccount(int accountNumber) throws AccountException {
        if (accountCount > accounts.length) {
            throw new AccountException("계좌 개수 한도에 도달했습니다.");
        }
        Account account = new Account(accountNumber, id);
        account.accountNumber = accountNumber;
        accounts[accountCount++] = account;
        System.out.println("계좌 생성이 완료되었습니다.");
    }

    // 계좌 검색(리턴타입: Account)
    public Account findAccountByAccountNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }

}
