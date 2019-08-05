package com.kodilla.good.patterns.flightService;

import java.util.Map;


public class FlightsFunctionalities {

    public void getFlightsFrom(Map<FlightNumber, Flight> flights, String departureAirport) {

        flights.entrySet().stream()
                .map(n -> n.getValue())
                .filter(n -> n.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void getFlightsTo(Map<FlightNumber, Flight> flights, String arrivalAirport) {
        flights.entrySet().stream()
                .map(n -> n.getValue())
                .filter(n -> n.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void getFligthsToDestinationBy(Map<FlightNumber, Flight> flights, String departureAirport,
                                          String arrivalAirport, String byAirport) {
        flights.entrySet().stream()
                .map(n -> n.getValue())
                .filter(n -> n.getDepartureAirport().equals(departureAirport) || n.getArrivalAirport().equals(arrivalAirport))
                .filter(n -> n.getDepartureAirport().equals(byAirport) || n.getArrivalAirport().equals(byAirport))
                .forEach(System.out::println);
    }
}
