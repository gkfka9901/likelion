package day1;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 5};

        int[] array2 = Arrays.copyOf(array1, 2);
        for (int i : array2) {
            System.out.println(array2[i]);

        }

        }
    }

