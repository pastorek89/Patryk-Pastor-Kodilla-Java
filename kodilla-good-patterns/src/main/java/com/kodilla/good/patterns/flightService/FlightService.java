package com.kodilla.good.patterns.flightService;

import java.util.Map;

public class FlightService {

    public static void main(String[] args) {
        FlightsDataRetriever flightsDataRetriever = new FlightsDataRetriever();
        Map<FlightNumber, Flight> flights = flightsDataRetriever.retrieve();

        FlightsFunctionalities flightsFunctionalities = new FlightsFunctionalities();
        flightsFunctionalities.getFlightsFrom(flights, "GDANSK");
        Printer.print(flightsFunctionalities.getFlightsFrom());

        flightsFunctionalities.getFlightsTo(flights, "SZCZECIN");
        Printer.print(flightsFunctionalities.getFlightsTo());

        flightsFunctionalities.getFligthsToDestinationBy(flights, "GDANSK", "WARSZAWA", "POZNAN");
        Printer.printPair(flightsFunctionalities.getFlightsToDestinationBy(),flights);

        }


}




