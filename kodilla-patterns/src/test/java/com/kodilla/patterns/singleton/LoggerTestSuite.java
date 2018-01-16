package com.kodilla.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Singleton");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        assertEquals("Singleton", lastLog);
    }
}