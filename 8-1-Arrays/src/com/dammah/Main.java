package com.dammah;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Array standard definition
        int[] myVariable;

        // Array with 10 positions
        myVariable = new int[10];

        // Condensed, starts from 0 to n - 1
        int[] myIntArray2 = new int[10];

        // Accessing arrays
        myVariable[5] = 50;

        double[] myDoubleArray = new double[2];

        System.out.println(myVariable[5]);

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[4]);
        System.out.println(myIntArray[6]);

        int[] myIntForArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myIntForArray[i] = i * 10;
        }

        printArray(myIntForArray);

        ////////////////////////////////////////////////////
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + (i + 1) + "]: " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
}
