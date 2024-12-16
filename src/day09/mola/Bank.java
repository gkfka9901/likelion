package day09.mola;

import java.util.Scanner;

public class Bank {
    Customer customer;
    Scanner input = new Scanner(System.in);

    // 고객 배열
    Customer[] customers = new Customer[10];

    // 메서드 - 고객 등록, 고객 정보 조회

    // 고객 등록
    public void resiter() {
        for (int i = 0; i < customers.length; ) {

            if (customers[i] == null) {
                System.out.print("이름을 입력하세요: ");
                String name = input.nextLine();

                System.out.print("ID를 입력하세요: ");
                String id = input.nextLine();

                Customer customer = new Customer(name, id); //name, id는 입력 받은 값
                customers[i] = customer; // null값인 customers배열에 새로 customer참조값 추가

                System.out.println("이름: " + name + ", id: " + id);
                System.out.println("등록되었습니다." + (i + 1) + "/" + customers.length);
                break;
            } else {
                i++;
                System.out.println(i);
            }

        }

    }

    // bank배열에서 이름으로 인덱스 반환
    public int checkCustomerInfo() {
        System.out.println("이름을 입력하세요");
        String name = input.nextLine();

        for (int i = 0; i < customers.length; i++) {
            if (name.equals(customers[i].name)) {
                return i;
            }
        }

        return -1;
    }
}
