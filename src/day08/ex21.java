package day08;

public class ex21 implements InterA, InterB{
    @Override
    public void methodA() {
        System.out.println("methodA 구현");
    }

    @Override
    public void methodB() {
    }

    public static void main(String[] args) {
        ex21 ex21 = new ex21();
    }

}
