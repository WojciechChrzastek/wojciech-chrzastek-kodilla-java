package com.kodilla.exception.test;

public class FlightFinderMain {
    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Bangkok"));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " +e);
        }
    }
}
