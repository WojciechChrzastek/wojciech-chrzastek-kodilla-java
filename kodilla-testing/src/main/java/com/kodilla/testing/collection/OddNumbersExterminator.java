package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {
    public ArrayList<Integer> evenNumbersArrayList = new ArrayList<>();
    public int arraySize = 10;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer element : numbers) {
            if (element % 2 == 0) {
                evenNumbersArrayList.add(element);
            }
        }
        return evenNumbersArrayList;
    }

    public ArrayList<Integer> generateRandomArrayOfNumbers() {
        Random randomNumber = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            Integer number = randomNumber.nextInt(10);
            numbers.add(number);
        }
        return numbers;
    }
}

