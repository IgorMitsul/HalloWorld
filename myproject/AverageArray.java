package com.mycompany.myproject;

public class AverageArray {
    static int[][] arr = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    static int sum = 0;
    static int a = 0;
    static int b = 0;

    static void sizeArr() {
        for (int[] i : arr) {
            a++;
        }
        for (int[] i : arr) {
            b++;
        }
        if (a==b) {
            System.out.println("Your array is squarer " + a + " * " + b);
        }
        else {
            System.out.println("Your array is don't squarer");
        }

    }

    static void setArr() {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum += ints[j];
            }
        }
        double averSum = sum / (3.0 * 3.0);
        System.out.println("averSum your array  = " + averSum);

    }

    public static void main(String[] args) {
        sizeArr();
        setArr();


    }


}
