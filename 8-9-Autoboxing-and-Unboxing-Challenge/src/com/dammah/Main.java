package com.dammah;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Dammah's Bank");
	    bank.addBranch("Branch 1");
	    bank.addCustomer("Branch 1", "Daniel", 100.10);
	    bank.addCustomer("Branch 1", "Alberto", 299.1);
	    bank.addCustomer("Branch 1", "Karen", 2919.1);

        bank.addBranch("Branch 2");
        bank.addCustomer("Branch 2", "Itzel", 500.10);

        bank.addCustomerTransaction("Branch 1", "Daniel", 2032.11);
        bank.addCustomerTransaction("Branch 1", "Daniel", 233.44);

        bank.listCustomers("Branch 1", true);
        bank.listCustomers("Branch 2", true);

        if(!bank.addCustomer("Branch 3", "Ross", 123.44)) {
            System.out.println("Error. Branch 3 does not exist.");
        }
    }
}
