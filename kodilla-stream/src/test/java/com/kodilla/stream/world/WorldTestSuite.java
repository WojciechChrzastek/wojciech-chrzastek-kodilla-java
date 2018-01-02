package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        Country poland = new Country("poland", new BigDecimal(5));
        Country germany = new Country("germany", new BigDecimal(10));
        Country kenya = new Country("kenya", new BigDecimal(15));
        Country egypt = new Country("egypt", new BigDecimal(10));

        Continent europe = new Continent("europe", Arrays.asList(poland, germany));
        Continent africa = new Continent("africa", Arrays.asList(kenya, egypt));

        World world = new World(Arrays.asList(europe, africa));

        //when
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //then
        Assert.assertEquals(new BigDecimal("40"), peopleQuantity);
    }
}
