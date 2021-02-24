package com.dammah;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers will be inserted? ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Minimum value: " + findMin(array));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        System.out.println("Insert " + count + " values:\r");

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }
        }
        return min;
    }
}
