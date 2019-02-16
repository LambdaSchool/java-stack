package com.lambda;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        System.out.println(stack.numOfItems());
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println(stack.numOfItems());
    }
}
