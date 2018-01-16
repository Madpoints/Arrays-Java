package com.Madpoints;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts = getInts(5);

        for (int i = 0; i < myInts.length; i++) {
            System.out.println("Element " + i + " == " + myInts[i]);
        }

        System.out.println("The average of the array is " + averageArray(myInts));
    }

    public static int[] getInts(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double averageArray(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total / array.length;
    }
}
