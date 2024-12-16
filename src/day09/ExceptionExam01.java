package day09;

import day08.FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam01 {

    public static void main(String[] args) {
        int[] iarr = {1, 2, 3, 4};

        try {
            iarr[5] = 10;      //컴파일 시 체크하지 않음
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("냠");
    }
}
