package com.dammah;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 5, 5, 2, 4, 20, "long silky");

        dog.eat();
        System.out.println("###########");
        dog.walk();
        System.out.println("###########");
        dog.run();
    }
}
