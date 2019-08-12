package com.kodilla.good.patterns.flightService;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDataRetriever {

    public Map<FlightNumber,Flight> flightsRetrieve() {
        Map<FlightNumber,Flight> flights = new HashMap<>();
        flights.put(new FlightNumber(1),new Flight("WARSZAWA", "SZCZECIN"));
        flights.put(new FlightNumber(2),new Flight("POZNAŃ", "KRAKÓW"));
        flights.put(new FlightNumber(3),new Flight("KRAKÓW", "WROCŁAW"));
        flights.put(new FlightNumber(4),new Flight("SZCZECIN", "ŁÓDŹ"));

        return flights;
    }

    public List<Flight> flightsFrom() {
        List<Flight> flightsFrom = new ArrayList<>();
        flightsFrom.add(0,new Flight("SZCZECIN","ŁÓDŹ"));
        return flightsFrom;
    }

    public List<Flight> flightsTo() {
        List<Flight> flightsTo = new ArrayList<>();
        flightsTo.add(0,new Flight("POZNAŃ","KRAKÓW"));
        return flightsTo;
    }

    public List<Pair<FlightNumber,FlightNumber>> flightsBy() {
        List<Pair<FlightNumber,FlightNumber>> flightsBy = new ArrayList<>();
        flightsBy.add(new Pair(new FlightNumber(2),new FlightNumber(3)));
        return flightsBy;
    }

}
