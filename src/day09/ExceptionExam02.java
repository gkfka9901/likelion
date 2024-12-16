package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam02 {
    public static void methodA() {
        try {
            FileInputStream fis = new FileInputStream("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void methodB() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc");
    }

    public static void main(String[] args) {
        methodA();
        try {
            methodB();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
