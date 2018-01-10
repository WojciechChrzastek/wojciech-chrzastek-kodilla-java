package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int randomArraySize = oddNumbersExterminator.generateRandomArrayOfNumbers().size();
        System.out.println("Testing empty list... List size: " + randomArraySize + " > 0, so the list is not empty.");
        //Then
        Assert.assertTrue(randomArraySize > 0);
    }

    @Test //czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> randomArray = oddNumbersExterminator.generateRandomArrayOfNumbers();
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