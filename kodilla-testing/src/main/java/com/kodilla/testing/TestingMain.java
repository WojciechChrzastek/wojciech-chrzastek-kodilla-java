package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Zadanie: Pierwszy test jednostkowy - wynik działania kalkulatora
        Calculator calculator = new Calculator(3,2);

        int addResult = calculator.add(calculator);
        int substractResult = calculator.substract(calculator);

        //Zadanie: Pierwszy test jednostkowy - właściwy test
        if (addResult == 5) {
            System.out.println("test2 OK");
        } else {
            System.out.println("Error2!");
        }

        if (substractResult == 1) {
            System.out.println("test3 OK");
        } else {
            System.out.println("Error3!");
        }
    }
}