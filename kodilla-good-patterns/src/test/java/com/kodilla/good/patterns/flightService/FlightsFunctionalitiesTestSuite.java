package com.kodilla.good.patterns.flightService;

import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class FlightsFunctionalitiesTestSuite {

    @Test
    public void testGetFlightsFrom() {

        //Given
        TestDataRetriever testDataRetriever = new TestDataRetriever();
        Map<FlightNumber,Flight> flights = testDataRetriever.flightsRetrieve();
        FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
        //When
        List<Flight> result = flightsFunctionalities.getFlightsFrom(flights,"SZCZECIN");
        //Then
        Assert.assertEquals(testDataRetriever.flightsFrom(),result);
    }

    @Test
    public void testGetFlightsTo() {
        //Given
        TestDataRetriever testDataRetriever = new TestDataRetriever();
        Map<FlightNumber,Flight> flights = testDataRetriever.flightsRetrieve();
        FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
        //When
        List<Flight> result = flightsFunctionalities.getFlightsTo(flights,"KRAKÓW");
        //Then
        Assert.assertEquals(testDataRetriever.flightsTo(),result);
    }

    @Test
    public void testGetFligthsToDestinationBy() {
        //Given
        TestDataRetriever testDataRetriever = new TestDataRetriever();
        Map<FlightNumber,Flight> flights = testDataRetriever.flightsRetrieve();
        FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
        //When
        List<Pair<FlightNumber,FlightNumber>> result = flightsFunctionalities.getFligthsToDestinationBy
                                        (flights,"POZNAŃ","WROCŁAW","KRAKÓW");
        //Then
        Assert.assertEquals(testDataRetriever.flightsBy(),result);
    }

}
