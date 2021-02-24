package com.dammah;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player dammah = new Player("Dammah", 100, 15);
        System.out.println(dammah.toString());
        saveObject(dammah);

        dammah.setHitPoints(8);
        System.out.println(dammah);
        dammah.setWeapon("Storm bringer");
        saveObject(dammah);
//        loadObject(dammah);
        System.out.println(dammah);

        ISaveable werewolf = new Monster("Werewolf", 100, 20);
        System.out.println(werewolf);
        saveObject(werewolf);

        // Using casting to utilize a method after the declaration from a Interface
        System.out.println("Monster strength = " + ((Monster) werewolf).getStrength());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose: ");
        System.out.println("\t1 - To enter a string");
        System.out.println("\t2 - To quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
