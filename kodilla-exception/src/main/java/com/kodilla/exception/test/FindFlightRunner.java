package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw","Cracow");
        SearchingFlight searchingFlight = new SearchingFlight();
        try {
            searchingFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("One of these or both airports dont exist = " + flight.getDepartureAirport() + ", " + flight.getArrivedAirport());
        } finally {
            System.out.println("Searching ended");
        }
    }
}
