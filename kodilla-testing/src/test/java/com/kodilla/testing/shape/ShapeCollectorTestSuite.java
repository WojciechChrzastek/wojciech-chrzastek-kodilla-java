package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    @Test //czy klasa zachowuje się poprawnie gdy dodawana jest figura do kolekcji
    public void testAddFigure() {
        //Given
        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape shape1 = new Circle(5);
        //When
        shapeCollector.addFigure(shape1);
        //Then
        assertEquals(shape1, shapeCollector.getFigure(0));
    }

    @Test //czy klasa zachowuje się poprawnie gdy usuwana jest figura z kolekcji
    public void testRemoveFigure() {
        //Given
        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape shape = new Circle(5);
        shapeCollector.addFigure(shape);
        int initialSize = shapeCollector.figures.size();
        //When
        shapeCollector.removeFigure(shape);
        int result = shapeCollector.figures.size();
        //Then
        assertTrue(result < initialSize);
    }

    @Test //czy klasa zachowuje się poprawnie gdy pobierana jest figura z pozycji n listy
    public void testGetFigure() {
        //Given
        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape shape = new Circle(5);
        shapeCollector.addFigure(shape);
        //When
        Shape nFigure = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, nFigure);
    }

    @Test //czy klasa zachowuje się poprawnie gdy pobierana jest wyswietlane sa figury z kolekcji
    public void testShowFigures() {
        //Given
        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape shape1 = new Circle(5);
        final Shape shape2 = new Triangle(5, 5);
        final Shape shape3 = new Square(5);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //When
        System.out.println(shapeCollector.showFigures());
        //Then
        System.out.println("Is there a visual difference between above and below?");
        System.out.println("[" + shape1 + ", " + shape2 + ", " + shape3 + "]");
    }
}
