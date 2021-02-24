package com.dammah;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        long start1 = System.nanoTime();
        int[] array = new int[]{1, 2, 3, 4, 5};
        reverse(array);
        long end1 = System.nanoTime();
        long t1 = start1 - end1;
        System.out.println("Time elapsed : " + t1);


        start1 = System.nanoTime();
        int[] array2 = {1, 2, 3, 4, 5};
        reverse2(array2);
        end1 = System.nanoTime();
        long t2 = start1 - end1;
        System.out.println("Time elapsed : " + t2);

        System.out.println(t1/t2);
    }

    private static void reverse(int[] array) {
        System.out.println("Initial array = " + Arrays.toString(array));

        int[] reversed = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[array.length - i - 1];
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse2(int[] array) {
        System.out.println("Initial array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Final array = " + Arrays.toString(array));
    }
}
