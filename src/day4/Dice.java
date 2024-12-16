package day4;

import java.util.Random;

public class Dice {
    // 속성 - 면 개수, 눈
    int face;
    int eye;

    // 행위 - 주사위를 굴림
    public void roll() {
        //주사위를 굴렸을 때 나오는 면을 랜덤하게 출력
        eye = (int)(Math.random()*face)+1;
    }

}
