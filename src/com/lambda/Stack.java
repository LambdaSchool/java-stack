package com.lambda;

import java.lang.reflect.Array;

public class Stack {
    private String [] items;
    private int size;

    public Stack(int max) {
        items = new String[max];
        int size = 0;
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void push(String itemAdd) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = itemAdd;
                size++;
                break;
            }
        }
    }

    public String pop() {
        String popped = "";
        for (int i = 0; i < items.length - 1; i++) {
            if (items[i+1] == null) {
                popped = items[i];
                items[i] = null;
            }
        }
        return popped;
    }

    public String numOfItems() {
        if (size == 0) {
            return "There are no items in your Stack.";
        } else {
            return Integer.toString(size);
        }
    }

}
