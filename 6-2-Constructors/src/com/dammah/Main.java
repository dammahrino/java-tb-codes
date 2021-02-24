package com.dammah;

public class Main {

    public static void main(String[] args) {

        Account dammahsAccount = new Account();
        Account kahzeltsAccount = new Account("123333", 999.99, "Itzel Alcacio", "itz@lcacio.com", "(55) 5611244433");

        dammahsAccount.setNumber("15111014");
        dammahsAccount.setBalance(0.00);
        dammahsAccount.setCustomerName("Daniel Cadena");
        dammahsAccount.setCustomerEmailAddress("dacadena@email.com");
        dammahsAccount.setCustomerPhoneNumber("(55) 55-7110-9608");


        dammahsAccount.withdrawal(100.00);

        dammahsAccount.deposit(50.00);
        dammahsAccount.withdrawal(100.00);

        dammahsAccount.deposit(51.00);
        dammahsAccount.withdrawal(100.00);

        // New implementation

        VIPCustomer vip1 = new VIPCustomer();
        System.out.println(vip1.getCustomerName());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmailAddress());

        VIPCustomer vip2 = new VIPCustomer("Daniel Cadena", "daniel@cadena.com");
        System.out.println(vip2.getCustomerName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip2.getEmailAddress());

        VIPCustomer vip3 = new VIPCustomer("Itzel Alcacio", 9999.99, "itzel@alcacio.com");
        System.out.println(vip3.getCustomerName());
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmailAddress());
    }
}
