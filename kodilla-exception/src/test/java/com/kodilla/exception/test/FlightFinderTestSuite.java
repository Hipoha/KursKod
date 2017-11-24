package com.kodilla.exception.test;

import org.junit.Assert;
import org.junit.Test;

public class FlightFinderTestSuite {

    @Test
    public void testFlightFound() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("CPH", "WAW");

        // When
        try {
            flightFinder.findFlight(flight1);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        // Then
        // No assert here
    }

    @Test
    public void testAirportUnavailable() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("WAW", "SFO");

        // When
        try {
            flightFinder.findFlight(flight1);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        // Then
        // No assert here
    }

    @Test
    public void testAirportNotFoundException() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("ABC", "WAW");
        Flight flight2 = new Flight("CPH", "ABC");
        Flight flight3 = new Flight("ABC", "DEF");
        Boolean exception1Thrown = false;
        Boolean exception2Thrown = false;
        Boolean exception3Thrown = false;

        // When
        try {
            flightFinder.findFlight(flight1);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
            exception1Thrown = true;
        }

        try {
            flightFinder.findFlight(flight2);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
            exception2Thrown = true;
        }

        try {
            flightFinder.findFlight(flight3);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
            exception3Thrown = true;
        }

        // Then
        Assert.assertTrue("Exception 1 not thrown!", exception1Thrown);
        Assert.assertTrue("Exception 2 not thrown!", exception2Thrown);
        Assert.assertTrue("Exception 3 not thrown!", exception3Thrown);

    }

}
