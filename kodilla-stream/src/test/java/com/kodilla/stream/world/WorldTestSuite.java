package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Continent> world = new ArrayList<>();
        world.add(new Continent((new Country("Poland",new BigDecimal(38000700))),"Europe" ));
        world.add(new Continent((new Country("Germany",new BigDecimal(50000011))),"Europe" ));
        world.add(new Continent((new Country("Netherlands",new BigDecimal(15000000))),"Europe" ));
        world.add(new Continent((new Country("China",new BigDecimal(1500000020))),"Asia" ));
        world.add(new Continent((new Country("India",new BigDecimal(1200000000))),"Asia" ));
        world.add(new Continent((new Country("North Korea",new BigDecimal(25000000))),"Asia" ));
        world.add(new Continent((new Country("Brasil",new BigDecimal(60000000))),"South America" ));
        world.add(new Continent((new Country("Argentina",new BigDecimal(50000000))),"South America" ));
        world.add(new Continent((new Country("Peru",new BigDecimal(7000000))),"South America" ));

        //When
        BigDecimal totalQuantityOfPeople = BigDecimal.ZERO;
        for(Continent continent : world) {
        totalQuantityOfPeople = totalQuantityOfPeople.add(continent.getCountry().getPeopleQuantity());
        }

        //Then
        BigDecimal expectedQuantityOfPeople = new BigDecimal("2945000731");
        Assert.assertEquals(expectedQuantityOfPeople,totalQuantityOfPeople);
    }
}
