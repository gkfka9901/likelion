package day08;

import java.util.Calendar;

public class Pizza implements Oderable {
    private String type;

    public Pizza(String type) {
        this.type = type;
    }
    @Override
    public void order() {
        System.out.println(type + "피자를 주문 받았습니다.");
    }

    @Override
    public void prepare() {

    }

    @Override
    public void deliver() {
        Oderable.super.deliver();

    }


}
