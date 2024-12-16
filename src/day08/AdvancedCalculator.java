package day08;

public class AdvancedCalculator extends BasicCalculator implements Multipliable {
    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

}
