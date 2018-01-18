package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);
        //Then
        assertTrue(driving.isTaskExecuted());
        assertEquals("Driving Task", driving.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);
        //Then
        assertTrue(painting.isTaskExecuted());
        assertEquals("Painting Task", painting.getTaskName());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);
        //Then
        assertFalse(shopping.isTaskExecuted());
        assertEquals("Shopping Task", shopping.getTaskName());
    }
}