package com.kodilla.stream.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        String printNumbers = IntStream.range(0, numbers.length)
                .mapToObj(i -> Integer.toString(numbers[i]))
                .collect(Collectors.joining(", ", "Numbers: ", ""));
        System.out.println(printNumbers);

        double average = IntStream.range(0, numbers.length)
                .mapToDouble(i -> numbers[i])
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);
        return average;
    }
}
