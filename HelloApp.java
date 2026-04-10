package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        // UC4: Check if arguments were provided
        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();
            
            // Loop through the array to collect all names
            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                
                // Add a comma and space only between names
                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }
            System.out.println("Hello, " + sb.toString() + "!");
        } else {
            // Default value if no names are provided
            System.out.println("Hello, World!");
        }
    }
}