package com.example.automation;

public class App {
    // A simple method that adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // A method that multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // A method that checks if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Add Result: " + obj.add(5, 10)); // Expected: 15
        System.out.println("Multiply Result: " + obj.multiply(5, 10)); // Expected: 50
        System.out.println("Is 5 Even? " + obj.isEven(5)); // Expected: false
    }
}
