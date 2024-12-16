package day09.practice;

import day08.Pizza;
import day09.MyException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);
    int customerCount = 0;

    // 고객 배열
    Customer[] customers = new Customer[10];

    // 메서드 - 고객 등록, 고객 정보 조회

    // 고객 등록
    public void register() throws MyException {
        if (customerCount >= customers.length) {
            throw new MyException("고객 등록 한도를 초과했습니다.");
        }

        System.out.print("이름을 입력하세요: ");
        String name = input.nextLine();

        System.out.print("id를 입력하세요: ");
        String id = input.nextLine();

        if (findCustomerById(id) != null) {
            System.out.println("이미 존재하는 ID입니다. 다른 ID를 입력하세요.");
            return;
        }

        customers[customerCount++] = new Customer(name, id);
        System.out.println("고객 등록 완료. 현재 고객 수: " + customerCount);

    }
    // id를 받아 null이 아니고 customer의 id와 일치하면 해당 customer의 참조값을 반환
    public Customer findCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer != null && customer.id.equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public Account findAccountByID(String id, int accountNumber) throws MyException{
        Customer customer = findCustomerById(id);
        if (customer == null) {
            throw new MyException("해당 ID를 가진 고객이 존재하지 않습니다.");
        }

        return customer.findAccountByNumber(accountNumber);
    }
}
