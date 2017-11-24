package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportAvailability = new HashMap<String, Boolean>();
        airportAvailability.put("CPH", true);
        airportAvailability.put("WAW", true);
        airportAvailability.put("SFO", false);
        airportAvailability.put("JFK", true);
        airportAvailability.put("DBH", false);
        airportAvailability.put("DBX", true);
        airportAvailability.put("FRA", true);

        if (!airportAvailability.containsKey(flight.getDepartureAirport())
                || !airportAvailability.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("At least one airport not found in the database!");
        }

        if (airportAvailability.get(flight.getDepartureAirport())
                && airportAvailability.get(flight.getArrivalAirport())) {
            System.out.println("Route found!");
        } else {
            System.out.println("At least one airport is temporarily unavailable!");
        }

    }

}
