package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myArray[5] = 50;

        double[] myDoubleArray = new double[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;
        }

        printArray(myArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }
}
