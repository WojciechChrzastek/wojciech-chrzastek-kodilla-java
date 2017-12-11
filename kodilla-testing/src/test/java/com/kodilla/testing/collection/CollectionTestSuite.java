package com.kodilla.testing.collection;

import com.kodilla.testing.collection.Application;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.collection.RandomArrayOfNumbersGenerator;
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
        OddNumbersExterminator array = new OddNumbersExterminator();
        //When
        int result = RandomArrayOfNumbersGenerator.generateRandomArrayOfNumbers().size();
        System.out.println("Testing empty list... List size: " + result);
        System.out.println(result + " > 0, so the list is not empty.");
        //Then
        Assert.assertTrue(result > 0);
    }

    @Test //czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator array = new OddNumbersExterminator();
        //When
        int result = (RandomArrayOfNumbersGenerator.generateRandomArrayOfNumbers().size()) - ((OddNumbersExterminator.exterminate(RandomArrayOfNumbersGenerator.generateRandomArrayOfNumbers())).size());
        System.out.println("Testing odd and even... Odd and even list size - even list size = " + result);
        System.out.println(result + " > 0, so the list has odd and even numbers.");
        //Then
        Assert.assertTrue(result > 0);
    }
}
