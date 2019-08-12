package com.kodilla.good.patterns.flightService;

public class FlightNumber {

    public int flightNumber;

    public FlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightNumber)) return false;

        FlightNumber that = (FlightNumber) o;

        return getFlightNumber() == that.getFlightNumber();

    }

    @Override
    public int hashCode() {
        return getFlightNumber();
    }

    @Override
    public String toString() {
        return "Flight number " + flightNumber;
    }
}

