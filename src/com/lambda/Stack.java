package com.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack {
    private String [] items;
    private int size;

    public Stack(int max) {
        items = new String[max];
        int size = 0;
    }

    public void print() {
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < items.length; i++) {
                System.out.print(" " + items[i]);
                if (items[i+1] == null) {
                    break;
                }
                System.out.print(",");
            }
            System.out.println(" ]");
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

    public void pop() {
        for (int i = 0; i < items.length - 1; i++) {
            if (items[i+1] == null) {
                System.out.println(items[i]);
                items[i] = null;
                size--;
                break;
            }
        }
    }

    public String numOfItems() {
        if (size == 0) {
            return "There are no items in your Stack.";
        } else {
            return Integer.toString(size);
        }
    }

}
