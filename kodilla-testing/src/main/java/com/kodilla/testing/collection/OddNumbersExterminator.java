package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

class Application {
    public static void main(String args[]) throws java.lang.Exception {

        RandomArrayOfNumbersGenerator array = new RandomArrayOfNumbersGenerator();
        ArrayList<Integer> numbers = array.generateRandomArrayOfNumbers();
        System.out.println("Lista " + RandomArrayOfNumbersGenerator.arraySize + " liczb typu Integer: " + numbers + "\n");

        OddNumbersExterminator array2 = new OddNumbersExterminator();
        ArrayList<Integer> evenNumbersArrayList = array2.exterminate(numbers);
        System.out.println("Lista liczb parzystych typu Integer: " + evenNumbersArrayList);
    }
}

public class OddNumbersExterminator {
    static ArrayList<Integer> evenNumbersArrayList = new ArrayList<>();

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for(Integer element : numbers) {
            if (element % 2 == 0) {
                evenNumbersArrayList.add(element);
            }
        }
        return evenNumbersArrayList;
    }
}

class RandomArrayOfNumbersGenerator {
    static ArrayList<Integer> numbers;
    public static int arraySize = 10;
    public static ArrayList<Integer> generateRandomArrayOfNumbers() {

        Random randomNumber = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < arraySize; i++) {
            Integer number = randomNumber.nextInt(10);
            numbers.add(number);
        }
        return numbers;
    }
}