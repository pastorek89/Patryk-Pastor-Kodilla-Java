package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivedAirport;

    public Flight(String departureAirport, String arrivedAirport) {
        if(!departureAirport.equals(arrivedAirport)) {
            this.departureAirport = departureAirport;
            this.arrivedAirport = arrivedAirport;
        } else {
            System.out.println("Constructor: Better take a bus!");
        }
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivedAirport() {
        return arrivedAirport;
    }
}
