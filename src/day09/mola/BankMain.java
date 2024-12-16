package day09.mola;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {
            System.out.println("1. 고객 등록 \n2. 계좌 생성 \n3. 입금 \n4. 출금 \n5. 잔액 조회 \n6. 종료 ");
            System.out.println("메뉴를 선택하세요: ");
            int menu = input.nextInt();
            if (menu == 1) {
                bank.resiter();
            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else if (menu == 5) {

            } else if (menu == 6) {
                break;
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
            }
        }

    }
}
