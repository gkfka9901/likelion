package day1;

import java.util.Arrays;

public class ex5 {

    public static void main(String[] args) {
        int[] iarr = {10, 2};
        int[] jarr = Arrays.copyOf(iarr, 2);
        iarr[0] = 4;

        for (int i : jarr) {
            System.out.println(i);

        }
        for (int i : iarr) {
            System.out.println(i);

        }
    }
}
