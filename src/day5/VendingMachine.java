package day5;

import java.util.Scanner;

public class VendingMachine {

    // 메소드
    public String button(int menuid){
        String menu = switch (menuid) {
            case 1 -> "콜라";
            case 2 -> "사이다";
            case 3 -> "환타";
            default -> "다시 선택하세요";
        };
        return menu;
    }
}
