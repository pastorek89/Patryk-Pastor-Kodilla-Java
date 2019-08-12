package com.kodilla.good.patterns.flightService;

import javafx.util.Pair;


import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;


public class FlightsFunctionalities {

    private List<Flight> flightsTo = new ArrayList<>();
    private List<Flight> flightsFrom = new ArrayList<>();
    private List<Pair<FlightNumber, FlightNumber>> flightsToDestinationBy = new ArrayList<>();

    public List<Flight> getFlightsTo() {
        return flightsTo;
    }

    public List<Flight> getFlightsFrom() {
        return flightsFrom;
    }

    public List<Pair<FlightNumber, FlightNumber>> getFlightsToDestinationBy() {
        return flightsToDestinationBy;
    }

    public List<Flight> getFlightsFrom(Map<FlightNumber, Flight> flights, String departureAirport) {

        return flights.entrySet().stream()
                .map(n -> n.getValue())
                .filter(n -> n.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(Map<FlightNumber, Flight> flights, String arrivalAirport) {

        flightsTo = flights.entrySet().stream()
                .map(n -> n.getValue())
                .filter(n -> n.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<Pair<FlightNumber, FlightNumber>> getFligthsToDestinationBy(Map<FlightNumber, Flight> flights, String departureAirport,
                                                                            String arrivalAirport, String byAirport) {
        List<FlightNumber> flightNumbersToByAirport = flights.entrySet().stream()
                .filter((entry) -> entry.getValue().getArrivalAirport().equals(byAirport) && entry.getValue().getDepartureAirport().equals(departureAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<FlightNumber> flightNumbersFromByAirport = flights.entrySet().stream()
                .filter((x) -> x.getValue().getArrivalAirport().equals(arrivalAirport) && x.getValue().getDepartureAirport().equals(byAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<Pair<FlightNumber,FlightNumber>> listOfPairs = new ArrayList<>();

        for(FlightNumber flight1 : flightNumbersToByAirport) {
            for(FlightNumber flight2 : flightNumbersFromByAirport) {
              listOfPairs.add(new Pair<>(flight1,flight2));
            }
        }
        return listOfPairs;
        /*return flightsToDestinationBy = flightNumbersToByAirport.stream()
                .flatMap(flightNumber -> flightNumbersFromByAirport.stream().map(secondFlightNumber -> new Pair<>(flightNumber, secondFlightNumber)))
                .collect(Collectors.toList());*/
    }
}


