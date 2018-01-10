package com.kodilla.good.patterns.challenges.flightfinder2;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public final class FlightFinder {

    private final Map<String, List<String>> flightMap = new HashMap<>();

    public FlightFinder() {
        flightMap.put("Warsaw", Arrays.asList("Cracow", "Wroclaw", "Gdansk", "Katowice", "Szczecin"));
        flightMap.put("Cracow", Arrays.asList("Warsaw", "Gdansk"));
        flightMap.put("Gdansk", Arrays.asList("Warsaw", "Wroclaw", "Cracow"));
        flightMap.put("Wroclaw", Arrays.asList("Warsaw", "Gdansk"));
        flightMap.put("Katowice", Arrays.asList("Warsaw", "Szczecin"));
        flightMap.put("Szczecin", Arrays.asList("Cracow", "Katowice"));
    }

    public void flightsFrom(Airport departureAirport) {
        String flightsFrom = flightMap.entrySet().stream()
                .filter(f -> f.getKey().equals(departureAirport.getAirport()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " you can fly to" + ": " + flightsFrom);
    }

    public void flightsTo(Airport arrivalAirport) {
        String flightsTo = flightMap.entrySet().stream()
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("To " + arrivalAirport.getAirport() + " you can fly from" + ": " + flightsTo);
    }

    public void flightsVia(Airport departureAirport, Airport arrivalAirport) {
        String flightsVia = flightMap.entrySet().stream()
                .filter(f -> f.getValue().contains(departureAirport.getAirport()))
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " to " + arrivalAirport.getAirport() + " you can fly via" + ": " + flightsVia);
    }
}