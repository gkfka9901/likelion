package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam06 {
    //사용자 정의 예외 - 100점 초과는 예외로
    public static void inputScore(int score) throws MyException{
        if (score < 0 || score > 100) {
//            System.out.println("점수는 0~100까지만 유효합니다.");
//            return;
            // 이 상황이 예외라고 정의하고 예외 발생
            throw new MyException("점수는 0~100까지만 유효합니다.");
        }
        System.out.println("학생의 점수 ::: " + score);
    }

    public static void main(String[] args) throws Exception{

        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");

        try {
            inputScore(keyboard.nextInt());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }


}
