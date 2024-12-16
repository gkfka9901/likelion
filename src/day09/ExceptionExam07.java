package day09;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExam07 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}
