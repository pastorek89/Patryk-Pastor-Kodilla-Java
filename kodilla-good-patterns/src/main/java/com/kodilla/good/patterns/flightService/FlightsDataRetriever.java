package com.kodilla.good.patterns.flightService;

import java.util.HashMap;
import java.util.Map;

public class FlightsDataRetriever {

    public Map<FlightNumber, Flight> retrieve() {

        Map<FlightNumber, Flight> flightsMap = new HashMap<>();
        flightsMap.put(new FlightNumber(1), new Flight("GDANSK", "WARSZAWA"));
        flightsMap.put(new FlightNumber(2), new Flight("POZNAN", "WARSZAWA"));
        flightsMap.put(new FlightNumber(3), new Flight("GDANSK", "POZNAN"));
        flightsMap.put(new FlightNumber(4), new Flight("SZCZECIN", "WARSZAWA"));
        flightsMap.put(new FlightNumber(5), new Flight("WROCLAW", "POZNAN"));
        flightsMap.put(new FlightNumber(6), new Flight("WROCLAW", "WARSZAWA"));
        flightsMap.put(new FlightNumber(7), new Flight("WARSZAWA", "POZNAN"));
        flightsMap.put(new FlightNumber(8), new Flight("GDANSK", "WARSZAWA"));
        flightsMap.put(new FlightNumber(9), new Flight("WARSZAWA", "SZCZECIN"));
        flightsMap.put(new FlightNumber(10), new Flight("WROCLAW", "SZCZECIN"));

        return flightsMap;
    }
}
