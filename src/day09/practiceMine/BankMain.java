package day09.practiceMine;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {
            System.out.println("1. 고객 등록");
            System.out.println("2. 계좌 생성");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 잔액 조회");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = input.nextInt();

            try {
                if (menu == 1) {
                    input.nextLine();
                    System.out.print("이름: ");
                    String name = input.nextLine();
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    bank.register(name, id);
                } else if (menu == 2) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);

                    System.out.print("생성할 계좌번호를 입력하세요: ");
                    int accountNumber = input.nextInt();
                    customer.createAccount(accountNumber);
                } else if (menu == 3) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);

                    System.out.print("계좌번호를 입력하세요: ");
                    int accountNumber = input.nextInt();
                    Account account = customer.findAccountByAccountNumber(accountNumber);

                    System.out.print("입금할 금액을 입력하세요: ");
                    int depositAmount = input.nextInt();
                    account.deposit(depositAmount);
                } else if (menu == 4) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);

                    System.out.print("계좌번호를 입력하세요: ");
                    int accountNumber = input.nextInt();
                    Account account = customer.findAccountByAccountNumber(accountNumber);

                    System.out.print("출금할 금액을 입력하세요: ");
                    int withdrawAmount = input.nextInt();
                    account.deposit(withdrawAmount);
                } else if (menu == 5) {
                    input.nextLine();
                    System.out.print("ID를 입력하세요: ");
                    String id = input.nextLine();
                    Customer customer = bank.findCustomerById(id);

                    System.out.print("계좌번호를 입력하세요: ");
                    int accountNumber = input.nextInt();
                    Account account = customer.findAccountByAccountNumber(accountNumber);

                    System.out.println(account.getBalance());

                } else if (menu == 6) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
