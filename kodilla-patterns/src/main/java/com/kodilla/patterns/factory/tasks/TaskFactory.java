package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving Task", "Warsaw", "Car");
            case PAINTING:
                return new PaintingTask("Painting Task", "Blue", "Wall");
            case SHOPPING:
                return new ShoppingTask("Shopping Task", "Bread", 2);
            default:
                return null;
        }
    }
}