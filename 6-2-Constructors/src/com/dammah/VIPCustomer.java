package com.dammah;

public class VIPCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default name", 1000.00, "email@adress.com");
    }

    public VIPCustomer(String customerName, String emailAddress) {
        this(customerName, 1000.00, emailAddress);
    }

    public VIPCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
