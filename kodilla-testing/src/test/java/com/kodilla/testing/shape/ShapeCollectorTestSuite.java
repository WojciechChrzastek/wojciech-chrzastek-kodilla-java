package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
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

    @Test //czy klasa zachowuje się poprawnie gdy dodawana jest figura do kolekcji
    public void testAddFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<Shape>();
        int initialSize  = figures.size();
        //When
        figures.add(new Shape());
        int result = figures.size();
        //Then
        Assert.assertTrue(result > initialSize);
    }

    @Test //czy klasa zachowuje się poprawnie gdy usuwana jest figura z kolekcji
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<Shape>();
        int initialSize  = figures.size();
        //When
        figures.remove(new Shape());
        int result = figures.size();
        //Then
        Assert.assertTrue(result < initialSize);
    }

    @Test //czy klasa zachowuje się poprawnie gdy pobierana jest figura z pozycji n listy
    public void testGetFigure() {
        //Given

        //When

        //Then

      }

    @Test //czy klasa zachowuje się poprawnie gdy pobierana jest wyswietlane sa figury z kolekcji
    public void testShowFigures() {
        //Given

        //When

        //Then

    }
}
