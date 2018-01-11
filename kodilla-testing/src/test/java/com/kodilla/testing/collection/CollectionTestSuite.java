package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    private ArrayList<Integer> generateRandomArrayOfNumbers(int numbersQuantity) {
        Random randomNumber = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersQuantity; i++) {
            Integer number = randomNumber.nextInt(10);
            numbers.add(number);
        }
        return numbers;
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test //czy klasa zachowuje się poprawnie gdy lista jest pusta
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyArray = generateRandomArrayOfNumbers(0);
        //When
        ArrayList<Integer> evenArray = oddNumbersExterminator.exterminate(emptyArray);
        int evenArraySize = evenArray.size();
        System.out.println("Testing empty list... List size = " + evenArraySize + ", so the list is empty.");
        //Then
        Assert.assertTrue(evenArraySize == 0);
    }

    @Test //czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> randomArray = generateRandomArrayOfNumbers(10);
        ArrayList<Integer> evenArray = oddNumbersExterminator.exterminate(randomArray);
        int randomArraySize = randomArray.size();
        int evenArraySize = evenArray.size();
        int oddArraySize = randomArraySize - evenArraySize;

        System.out.println("Random list: " + randomArray + " size: " + randomArraySize);
        System.out.println("Even list: " + evenArray + " size: " + evenArraySize);
        System.out.println("Testing odd and even... Odd and even list size - even list size = odd list size = " + oddArraySize);
        System.out.println(oddArraySize + " > 0, so the list has odd and even numbers.");
        //Then
        Assert.assertTrue(oddArraySize > 0);
    }
}