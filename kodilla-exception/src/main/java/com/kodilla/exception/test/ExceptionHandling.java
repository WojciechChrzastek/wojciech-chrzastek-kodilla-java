package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.2, 1.5);
        } catch (Exception e) {
            System.out.println("Exception found: " +e);
        } finally {
            System.out.println("Forbidden variables values: x >= 2 || x < 1 || y == 1.5");
        }

    }
}
