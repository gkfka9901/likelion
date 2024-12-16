package day09;

public class ExceptionExam05 {
    // 1. 예외가 발생 했고, 이 예외를 잘 처리했을 때

    public static void main(String[] args) {
        int[] iarr = {1, 2, 3};
        try {
            System.out.println("try start");
            int i = iarr[2]/0;
            System.out.println(iarr[3]);


            System.out.println("try end!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("다음할일");
        System.out.println("끝");
    }
}
