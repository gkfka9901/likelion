package day5;

import java.util.Scanner;

public class VMUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("메뉴를 입력하세요: ");
        int menuid = input.nextInt();

        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.button(menuid));
    }
}
