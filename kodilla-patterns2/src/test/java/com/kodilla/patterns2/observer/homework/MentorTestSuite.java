package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Givern
        TaskQueue student1 = new Student1TaskQueue();
        TaskQueue student2 = new Student2TaskQueue();
        TaskQueue student3 = new Student3TaskQueue();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        student1.registerObserver(johnSmith);
        student2.registerObserver(johnSmith);
        student3.registerObserver(ivoneEscobar);
        //When
        student1.addTask("Task 1");
        student1.addTask("Task 2");
        student1.addTask("Task 3");
        student2.addTask("Task 1");
        student1.addTask("Task 2");
        student3.addTask("Task 1");

        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(1, ivoneEscobar.getUpdateCount());
    }
}
