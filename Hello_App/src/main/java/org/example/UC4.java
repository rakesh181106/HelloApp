package org.example;

public class UC4 {
    public static void main(String[] args) {

        String greetingNames;

        if (args.length > 0) {
            greetingNames = String.join(", ", args);
        } else {
            greetingNames = "World";
        }

        System.out.println("Hello, " + greetingNames + "!");
    }
}
