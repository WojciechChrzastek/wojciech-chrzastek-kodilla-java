package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        int[] numbers = {9, 3, 3};

        //When
        double average = getAverage(numbers);

        //Then
        Assert.assertEquals(5, average, 0);
    }
}
