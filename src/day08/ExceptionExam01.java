package day08;

public class ExceptionExam01 {

    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");

        // 예외처리
        try {
            System.out.println(args[0]);
        } catch (Exception e) {
            System.out.println("적절한 예외 처리");
        }
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
