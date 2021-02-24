package com.dammah;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Daniel", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        System.out.println("1st arr");

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        integerArrayList.add(1, 3);

        System.out.println("2nd arr");

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }
    }
}
