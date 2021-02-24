package com.dammah;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Marce");
	    dog.eat();
	    dog.breathe();

		Parrot parrot = new Parrot("Tico");
		parrot.eat();
		parrot.breathe();
	    parrot.fly();

	    Penguin penguin = new Penguin("Emperor");
	    penguin.fly();
    }
}
