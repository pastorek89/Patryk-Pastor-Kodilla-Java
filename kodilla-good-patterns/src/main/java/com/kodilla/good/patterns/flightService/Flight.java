package com.kodilla.good.patterns.flightService;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return departureAirport + " -> " + arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getDepartureAirport().equals(flight.getDepartureAirport())) return false;
        return getArrivalAirport().equals(flight.getArrivalAirport());

    }

    @Override
    public int hashCode() {
        int result = getDepartureAirport().hashCode();
        result = 31 * result + getArrivalAirport().hashCode();
        return result;
    }
}

