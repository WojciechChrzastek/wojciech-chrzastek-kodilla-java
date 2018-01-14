package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {

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
        final OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        final List<Integer> emptyList = generateRandomListOfNumbers(0);
        //When
        List<Integer> evenList = oddNumbersExterminator.exterminate(emptyList);
        int evenListSize = evenList.size();
        System.out.println("Testing empty list... List size = " + evenListSize + ", so the list is empty.");
        //Then
        assertTrue(evenListSize == 0);
    }

    @Test //czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given
        final OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> randomList = generateRandomListOfNumbers(10);
        List<Integer> evenList = oddNumbersExterminator.exterminate(randomList);
        int randomListSize = randomList.size();
        int evenListSize = evenList.size();
        int oddListSize = randomListSize - evenListSize;

        System.out.println("Random list: " + randomList + " size: " + randomListSize);
        System.out.println("Even list: " + evenList + " size: " + evenListSize);
        System.out.println("Testing odd and even... Odd and even list size - even list size = odd list size = " + oddListSize);
        System.out.println(oddListSize + " > 0, so the list has odd and even numbers.");
        //Then
        assertTrue(oddListSize > 0);
    }

    private ArrayList<Integer> generateRandomListOfNumbers(int numbersQuantity) {
        Random randomNumber = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersQuantity; i++) {
            Integer number = randomNumber.nextInt(10);
            numbers.add(number);
        }
        return numbers;
    }
}