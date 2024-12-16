package day08;

public class ABCImpl implements InterABC{

    @Override
    public void methodA() {
        System.out.println("methodA 구현");
    }

    @Override
    public void methodB() {
        System.out.println("methodB 구현");
    }

    @Override
    public void methodC() {
        System.out.println("methodC 구현");
    }

    public static void main(String[] args) {
        ABCImpl abc = new ABCImpl();
        System.out.println(abc instanceof ABCImpl);
        System.out.println(abc instanceof InterABC);
        System.out.println(abc instanceof InterA);
    }
}
