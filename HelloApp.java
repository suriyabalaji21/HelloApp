package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        // UC3: Using ternary operator for default value
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}