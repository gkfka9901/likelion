package day10;

abstract class Cup {
    abstract void 마시다();
}

public class ex2 {

    public static void main(String[] args) {
        Cup cup = new Cup() {
            @Override
            void 마시다() {
                System.out.println("물을 마시다");
            }
        };

        cup.마시다();
    }
}
