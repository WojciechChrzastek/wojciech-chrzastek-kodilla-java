package com.kodilla.exception.test;

public class FlightFinderMain {
    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw","Dubai");

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("The flight has not been found. (" + flight.getDepartureAirport() + " -> " + flight.getArrivalAirport() + ")");
            System.out.println("Error: " +e);
        }
    }
}
