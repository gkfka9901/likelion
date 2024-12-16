package day09.mola;

import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);

    // 속성- 이름, id ,통장목록
    String name;
    String id;
    Account account;

    Customer[] customers = new Customer[10];


    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // 메서드 - 계좌생성
    public void createAccount() {
        System.out.println("이름을 입력하세요: ");
        String n = input.nextLine();

        for (int i=0; i< customers.length; i++) {
            if (customers[i].name.equals(n)) {
                System.out.print("생성할 계좌번호를 입력하세요: ");
                int accountNumbber = input.nextInt();

                customers[i].account = new Account(accountNumbber);
                break;
            }
            ;

        }

    }
}

