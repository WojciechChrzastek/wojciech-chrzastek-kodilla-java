package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    private Map<String, List<String>> flightMap = new HashMap<>();

    public FlightFinder() {
        flightMap.put("Warsaw", Arrays.asList("Paris", "London"));
        flightMap.put("Berlin", Arrays.asList("Paris", "Madrid"));
        flightMap.put("Paris", Arrays.asList("Berlin", "London"));
        flightMap.put("London", Arrays.asList("Paris", "Berlin"));
        flightMap.put("Madrid", Arrays.asList("Warsaw", "London"));
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String flightDepartureAirport = flight.getDepartureAirport();
        if (!flightMap.containsKey(flightDepartureAirport)) {
            System.out.println("The flight has not been found. (" + flight.getDepartureAirport() + " -> " + flight.getArrivalAirport() + ")");
            throw new RouteNotFoundException();
        } else {
            List<String> flightPossibilities = flightMap.get(flightDepartureAirport);
            String flightArrivalAirport = flight.getArrivalAirport();
            if (!flightPossibilities.contains(flightArrivalAirport)) {
                System.out.println("The flight has not been found. (" + flight.getDepartureAirport() + " -> " + flight.getArrivalAirport() + ")");
                throw new RouteNotFoundException();
            }
        }
        System.out.println("The flight has been found. (" + flight.getDepartureAirport() + " -> " + flight.getArrivalAirport() + ")");
    }
}