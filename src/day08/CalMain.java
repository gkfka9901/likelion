package day08;

public class CalMain {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println(basicCalculator.add(1, 3));

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.multiply(3, 5));
        System.out.println(advancedCalculator.add(3, 5));

    }
}
