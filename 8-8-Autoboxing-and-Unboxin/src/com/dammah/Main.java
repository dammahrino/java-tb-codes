package com.dammah;


import java.util.ArrayList;

// A way of converting a primitive type into a class.
class IntClass {
    private int anInt;

    public IntClass(int anInt) {
        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strings = new String[10];
        int[] ints = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();

        // ArrayList type only applies to classes, not primitive types.
        // ArrayList<int> ints1 = new ArrayList<int>();

        ArrayList<IntClass> intClasses = new ArrayList<IntClass>();
        intClasses.add(new IntClass(14));


        // The way Java sorted this out, is with Autoboxing and Unboxing of primitive types
        Integer integer = new Integer(10);
        Double aDouble = new Double(22.22);

        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // We have to use a method to convert a value to int
            integers.add(Integer.valueOf(i * 10 + 2));
//            integers.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + integers.get(i).intValue());
        }

        Integer myIntValue = 56; // Compile time -> Integer.valueOf(56);
        int myInt = myIntValue; // Compile time -> myIntValue.intValue();

        System.out.println("Doubles ArrayList.");

        ArrayList<Double> doubles = new ArrayList<Double>();
        for (double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            doubles.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < doubles.size(); i++) {
            System.out.println(i + " -> " + doubles.get(i).doubleValue());
        }

    }
}
