package com.kodilla.good.patterns.flightService;

import java.util.Map;

public class FlightService {

    public static void main(String[] args) {
        FlightsDataRetriever flightsDataRetriever = new FlightsDataRetriever();
        Map<FlightNumber, Flight> flights = flightsDataRetriever.retrieve();

        FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
        flightsFunctionalities.getFlightsFrom(flights, "GDAŃSK");
        System.out.println();
        flightsFunctionalities.getFlightsTo(flights, "SZCZECIN");
        System.out.println();
        flightsFunctionalities.getFligthsToDestinationBy(flights, "GDAŃSK", "WARSZAWA", "POZNAŃ");
    }


}
