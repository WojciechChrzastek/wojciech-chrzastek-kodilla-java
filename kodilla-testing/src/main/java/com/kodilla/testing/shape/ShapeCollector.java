package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
    }

    public String showFigures() {
        String showFigures = figures.toString();
        return showFigures;
    }
}
