package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        final ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5, 5);
        double subResult = calculator.sub(5, 5);
        double mulResult = calculator.mul(5, 5);
        double divResult = calculator.div(5, 5);
        //Then
        assertEquals(10, addResult, 0);
        assertEquals(0, subResult, 0);
        assertEquals(25, mulResult, 0);
        assertEquals(1, divResult, 0);
    }
}