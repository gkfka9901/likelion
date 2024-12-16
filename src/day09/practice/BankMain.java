package day09.practice;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {
            System.out.println("1. 고객 등록 \n2. 계좌 생성 \n3. 입금 \n4. 출금 \n5. 잔액 조회 \n6. 종료 ");
            System.out.print("메뉴를 선택하세요: ");
            int menu = input.nextInt();

            try {
                if (menu == 1) {
                    bank.register();
                } else if (menu == 2) {
                    System.out.print("ID를 입력하세요: ");
                    input.nextLine();
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("존재하지 않는 고객입니다.");
                    } else {
                        System.out.print("계좌 번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        customer.createAccount(accountNumber);
                    }
                } else if (menu == 3) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("존재하지 않는 고객입니다.");
                    } else {
                        System.out.println("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        Account account = bank.findAccountByID(id, accountNumber);
                        if (account == null) {
                            System.out.println("존재하지 않는 계좌입니다.");
                        } else {
                            System.out.println("입금할 금액을 입력하세요: ");
                            int depositAmount = input.nextInt();
                            account.deposit(depositAmount);
                        }
                    }

                } else if (menu == 4) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("존재하지 않는 고객입니다.");
                    } else {
                        System.out.println("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        Account account = bank.findAccountByID(id, accountNumber);
                        if (account == null) {
                            System.out.println("존재하지 않는 계좌입니다.");
                        } else {
                            System.out.println("출금할 금액을 입력하세요: ");
                            int depositAmount = input.nextInt();
                            account.withdraw(depositAmount);
                        }
                    }
                } else if (menu == 5) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("존재하지 않는 고객입니다.");
                    } else {
                        System.out.print("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        Account account = customer.findAccountByNumber(accountNumber);
                        if (account == null) {
                            System.out.println("존재하지 않는 계좌입니다.");
                        } else {
                            account.getBalance();
                        }
                    }
                } else if (menu == 6) {
                    break;
                } else {
                    System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");

                }
            } catch (Exception e) {
                System.out.println("오류 :" + e.getMessage());
            }
        }
    }
}

