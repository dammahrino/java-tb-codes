package com.dammah;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.transverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        System.out.println("Start");

        list.transverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.transverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.transverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.transverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.transverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.transverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.transverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.transverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.transverse(list.getRoot());


    }
}
