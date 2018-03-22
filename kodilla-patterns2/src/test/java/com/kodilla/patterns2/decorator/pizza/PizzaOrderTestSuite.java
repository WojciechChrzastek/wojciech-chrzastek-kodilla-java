package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderWithHamExtraCheeseMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testPizzaOrderWithHamExtraCheeseMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza with tomato sauce and cheese + ham + extra cheese + mushrooms", description);
    }
}
