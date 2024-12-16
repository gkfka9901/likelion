package day09;

public class ExceptionExam03 {
    public static void methodA() throws RuntimeException {

    }

    public static void methodB() throws Exception{

    }

    public static void main(String[] args) {
        methodA();

        try {
            methodB();
        } catch (Exception e ) {
            System.out.println(e);
        }
    }


}
