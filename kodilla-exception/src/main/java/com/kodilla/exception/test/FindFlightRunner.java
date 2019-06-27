package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw","Amsterdam");
        SearchingFlight searchingFlight = new SearchingFlight();
        try {
            searchingFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Unknown airport = " + flight.getArrivedAirport());
        } finally {
            System.out.println("Searching ended");
        }
    }
}
