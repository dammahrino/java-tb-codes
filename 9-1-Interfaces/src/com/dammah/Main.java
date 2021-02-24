package com.dammah;

public class Main {

    public static void main(String[] args) {
        ITelephone danielsPhone;
        danielsPhone = new DeskPhone(12345);
        danielsPhone.powerOn();
        danielsPhone.callPhone(12345);
        danielsPhone.answer();

        danielsPhone = new MobilePhone(23456);
        danielsPhone.powerOn();
        danielsPhone.callPhone(23456);
        danielsPhone.answer();

    }
}
