package com.mycompany.myproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test

    public void test (){

        int[][] arr = new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int sum = 0;

            for (int[] ints : arr) {
                for (int j = 0; j < arr.length; j++) {
                    sum += ints[j];
                }
            }
            double averSum = sum / (3.0 * 3.0);

        Assertions.assertEquals ( 1.0, averSum);

    }
}
