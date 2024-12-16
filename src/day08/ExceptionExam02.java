package day08;

public class ExceptionExam02 {
    public static void main(String[] args) {
        int[] iarr = new int[]{0, 1, 2, 3};

        try {
            System.out.println(iarr[3]/iarr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("다음문장");
        System.out.println("그 다음문장");
    }
}
