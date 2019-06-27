package com.kodilla.exception.test;


import java.util.Map;

public class SearchingFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        //Initiating Airports
       AirportsData airportsData = new AirportsData();
       Map<String,Boolean> airports = airportsData.addAirports();

       //Searching Route
        if(airports.containsKey(flight.getArrivedAirport()) && airports.containsKey(flight.getDepartureAirport())) {
            boolean result = airports.get(flight.getArrivedAirport());
                if(result) {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivedAirport() + " is available");
                } else {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivedAirport() + " is not available");
                }
        } else {
            throw new RouteNotFoundException();
        }
   }
}
