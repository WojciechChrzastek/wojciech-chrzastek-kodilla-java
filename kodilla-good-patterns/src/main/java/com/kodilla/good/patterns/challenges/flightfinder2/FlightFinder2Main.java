package com.kodilla.good.patterns.challenges.flightfinder2;

public class FlightFinder2Main {
    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();

        Airport departureAirport = new Airport("Warsaw");
        Airport arrivalAirport = new Airport("Gdansk");

        flightFinder.flightsFrom(departureAirport);
        flightFinder.flightsTo(arrivalAirport);
        flightFinder.flightsVia(departureAirport, arrivalAirport);
    }
}
