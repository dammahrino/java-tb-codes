package com.dammah;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transactionAmount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + i + "]");
                if (showTransactions) {
                    System.out.println("\tTransactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("\t\t[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }

            return true;
        }

        return false;
    }
}
