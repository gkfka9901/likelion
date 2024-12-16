package day4;

public class Cal {
    // 속성
    int result = 0;

    public int add(int ... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public void subtract(int num1, int num2) {
        result = num1 - num2;
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
    }

    public void nanu(int num1, int num2) {
        result = num1 / num2;
    }

}
