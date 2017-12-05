package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int substract(Calculator calculator) {

        System.out.println("a - b = " + (a - b));
        return a - b;
    }

    public int add(Calculator calculator) {

        System.out.println("a + b = " + (a + b));
        return a + b;
    }
}
