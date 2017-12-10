package com.kodilla.testing.collection;

import com.kodilla.testing.collection.Application;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.collection.RandomArrayOfNumbersGenerator;
import org.junit.*;


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

//czy klasa zachowuje się poprawnie gdy lista jest pusta
    public void testOddNumbersExterminatorEmptyList() {
        //Given

        //When

        //Then

    }

//czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given

        //When

        //Then

    }
}
