package com.dammah;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void transverse(ListItem root) {
        // Recursive method
        if (root != null) {
            transverse(root.previous());
            System.out.println(root.getValue());
            transverse(root.next());
        }
    }
}
