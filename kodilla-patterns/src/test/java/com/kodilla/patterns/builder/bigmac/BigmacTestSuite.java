package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .rollType("with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("cucumber")
                .ingredient("onion")
                .ingredient("lettuce")
                .ingredient("bacon")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}