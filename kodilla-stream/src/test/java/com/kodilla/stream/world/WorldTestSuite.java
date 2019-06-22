package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countriesOfEurope = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("1000"));
        Country germany = new Country("Germany", new BigDecimal("500"));
        Country netherlands = new Country("Netherlands", new BigDecimal("1500"));
        Country france = new Country("France", new BigDecimal("1000"));

        countriesOfEurope.add(poland);
        countriesOfEurope.add(germany);
        countriesOfEurope.add(netherlands);
        countriesOfEurope.add(france);

        Continent europe = new Continent("Europe");
        europe.setCountries(countriesOfEurope);
        ////
        List<Country> countriesOfAsia = new ArrayList<>();
        Country southKorea = new Country("South Korea", new BigDecimal("3000"));
        Country china = new Country("China", new BigDecimal("4000"));
        Country india = new Country("India", new BigDecimal("1500"));
        Country northKorea = new Country("North Korea", new BigDecimal("4800"));

        countriesOfAsia.add(southKorea);
        countriesOfAsia.add(china);
        countriesOfAsia.add(india);
        countriesOfAsia.add(northKorea);

        Continent asia = new Continent("Asia");
        asia.setCountries(countriesOfAsia);
        ////
        List<Country> countriesOfSouthAmerica = new ArrayList<>();
        Country brazil = new Country("Brazil", new BigDecimal(100));
        Country argentina = new Country("Argentina", new BigDecimal(100));
        Country peru = new Country("Peru", new BigDecimal(100));
        Country bolivia = new Country("Bolivia", new BigDecimal(100));

        countriesOfSouthAmerica.add(brazil);
        countriesOfSouthAmerica.add(argentina);
        countriesOfSouthAmerica.add(peru);
        countriesOfSouthAmerica.add(bolivia);

        Continent southAmerica = new Continent("South America");
        southAmerica.setCountries(countriesOfSouthAmerica);
        ////
        World world = new World();
        world.setContinents(Arrays.asList(europe, asia, southAmerica));

        //When
        BigDecimal totalOfPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal(17300), totalOfPeopleQuantity);
    }


    @Test
    public void testGetPeopleQuantityWithReduce() {
        //Given
        List<Country> countriesOfEurope = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("1000"));
        Country germany = new Country("Germany", new BigDecimal("500"));
        Country netherlands = new Country("Netherlands", new BigDecimal("1500"));
        Country france = new Country("France", new BigDecimal("1000"));

        countriesOfEurope.add(poland);
        countriesOfEurope.add(germany);
        countriesOfEurope.add(netherlands);
        countriesOfEurope.add(france);

        Continent europe = new Continent("Europe");
        europe.setCountries(countriesOfEurope);
        ////
        List<Country> countriesOfAsia = new ArrayList<>();
        Country southKorea = new Country("South Korea", new BigDecimal("3000"));
        Country china = new Country("China", new BigDecimal("4000"));
        Country india = new Country("India", new BigDecimal("1500"));
        Country northKorea = new Country("North Korea", new BigDecimal("4500"));

        countriesOfAsia.add(southKorea);
        countriesOfAsia.add(china);
        countriesOfAsia.add(india);
        countriesOfAsia.add(northKorea);

        Continent asia = new Continent("Asia");
        asia.setCountries(countriesOfAsia);
        ////
        List<Country> countriesOfSouthAmerica = new ArrayList<>();
        Country brazil = new Country("Brazil", new BigDecimal("1000"));
        Country argentina = new Country("Argentina", new BigDecimal("1500"));
        Country peru = new Country("Peru", new BigDecimal("1000"));
        Country bolivia = new Country("Bolivia", new BigDecimal("1500"));

        countriesOfSouthAmerica.add(brazil);
        countriesOfSouthAmerica.add(argentina);
        countriesOfSouthAmerica.add(peru);
        countriesOfSouthAmerica.add(bolivia);

        Continent southAmerica = new Continent("South America");
        southAmerica.setCountries(countriesOfSouthAmerica);
        ////
        World world = new World();
        world.setContinents(Arrays.asList(europe, asia, southAmerica));

        //When
        BigDecimal totalQuantityOfPeople = world.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedQuantityOfPeople = new BigDecimal("22000");
        Assert.assertEquals(expectedQuantityOfPeople, totalQuantityOfPeople);
    }
}
