package day06;

public class Exam07 {

    public static void test(Parent p) {
        System.out.println(p.i);
        System.out.println(p.getI());

        ((Child)p).print();
    }
    public static void main(String[] args) {
        Child c = new Child();
        test(c); // 5 10 10

        Parent pc = new Child();
        test(pc); // 5 10 10

        Parent p = new Parent();
        test(p); //  5 5 error->인

    }
}
