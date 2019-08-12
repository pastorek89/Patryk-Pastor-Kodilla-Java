package com.kodilla.good.patterns.flightService;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

public class Printer {

    FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
    List<Pair<FlightNumber, FlightNumber>> pair = flightsFunctionalities.getFlightsToDestinationBy();

    public static void print(List<Flight> flight) {
        for (Flight flights : flight) {
            System.out.println(flights);
        }
        System.out.println();
    }

    public static void printPair(List<Pair<FlightNumber, FlightNumber>> flightsNumbers, Map<FlightNumber,Flight> flights) {
        for (Pair<FlightNumber, FlightNumber> number : flightsNumbers) {
            System.out.println(number.getKey() + " " + flights.get(number.getKey()) + " " + number.getValue() + " " + flights.get(number.getValue()));
        }
    }
}
