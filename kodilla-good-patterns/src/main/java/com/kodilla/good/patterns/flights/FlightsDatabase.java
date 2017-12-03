package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsDatabase {

    private Set<Flight> flights = new HashSet<>();

    public FlightsDatabase() {
        flights.add(new Flight("Warszawa","Kraków"));
        flights.add(new Flight("Warszawa","Łódź"));
        flights.add(new Flight("Warszawa","Wrocław"));
        flights.add(new Flight("Warszawa","Katowice"));
        flights.add(new Flight("Warszawa","Kielce"));
        flights.add(new Flight("Warszawa","Poznań"));
        flights.add(new Flight("Warszawa","Szczecin"));
        flights.add(new Flight("Warszawa","Bydgoszcz"));
        flights.add(new Flight("Warszawa","Gdańsk"));
        flights.add(new Flight("Warszawa","Gdynia"));
        flights.add(new Flight("Warszawa","Olsztyn"));
        flights.add(new Flight("Warszawa","Białystok"));
        flights.add(new Flight("Warszawa","Lublin"));
        flights.add(new Flight("Warszawa","Rzeszów"));
        flights.add(new Flight("Kraków","Warszawa"));
        flights.add(new Flight("Łódź","Warszawa"));
        flights.add(new Flight("Wrocław","Warszawa"));
        flights.add(new Flight("Katowice","Warszawa"));
        flights.add(new Flight("Kielce","Warszawa"));
        flights.add(new Flight("Poznań","Warszawa"));
        flights.add(new Flight("Szczecin","Warszawa"));
        flights.add(new Flight("Bydgoszcz","Warszawa"));
        flights.add(new Flight("Gdańsk","Warszawa"));
        flights.add(new Flight("Gdynia","Warszawa"));
        flights.add(new Flight("Olsztyn","Warszawa"));
        flights.add(new Flight("Białystok","Warszawa"));
        flights.add(new Flight("Lublin","Warszawa"));
        flights.add(new Flight("Rzeszów","Warszawa"));
        flights.add(new Flight("Łódź","Kraków"));
        flights.add(new Flight("Łódź","Wrocław"));
        flights.add(new Flight("Łódź","Poznań"));
        flights.add(new Flight("Łódź","Gdańsk"));
        flights.add(new Flight("Kraków","Łódź"));
        flights.add(new Flight("Kraków","Wrocław"));
        flights.add(new Flight("Kraków","Poznań"));
        flights.add(new Flight("Kraków","Gdańsk"));
        flights.add(new Flight("Wrocław","Kraków"));
        flights.add(new Flight("Wrocław","Łódź"));
        flights.add(new Flight("Wrocław","Poznań"));
        flights.add(new Flight("Wrocław","Gdańsk"));
        flights.add(new Flight("Poznań","Kraków"));
        flights.add(new Flight("Poznań","Wrocław"));
        flights.add(new Flight("Poznań","Łódź"));
        flights.add(new Flight("Poznań","Gdańsk"));
        flights.add(new Flight("Gdańsk","Kraków"));
        flights.add(new Flight("Gdańsk","Wrocław"));
        flights.add(new Flight("Gdańsk","Łódź"));
        flights.add(new Flight("Gdańsk","Poznań"));
        flights.add(new Flight("Kraków","Szczecin"));
        flights.add(new Flight("Szczecin","Kraków"));
        flights.add(new Flight("Wrocław","Białystok"));
        flights.add(new Flight("Białystok","Wrocław"));
        flights.add(new Flight("Wrocław","Lublin"));
        flights.add(new Flight("Lublin","Wrocław"));
        flights.add(new Flight("Gdańsk","Lublin"));
        flights.add(new Flight("Lublin","Gdańsk"));
        flights.add(new Flight("Rzeszów","Przemyśl"));
    }

    @Override
    public String toString() {
        return flights.stream()
                .map(entry -> entry.toString())
                .collect(Collectors.joining("\n",
                        "------------------ FLIGHTS DATABASE ------------------\n",
                        "\n------------------------------------------------------"));
    }

    public void findFlightsFrom(String city) {
        String foundFlights = flights.stream()
                .filter(flight -> flight.getOrigin().equals(city))
                .map(entry -> entry.toString())
                .collect(Collectors.joining("\n",
                        "--- Found flights from " + city + " ---\n",
                        "\n------------------------------------------------------"));
        System.out.println(foundFlights);
    }

    public void findFlightsTo(String city) {
        String foundFlights = flights.stream()
                .filter(flight -> flight.getDestination().equals(city))
                .map(entry -> entry.toString())
                .collect(Collectors.joining("\n",
                        "--- Found flights to " + city + " ---\n",
                        "\n------------------------------------------------------"));
        System.out.println(foundFlights);
    }

    public boolean findDirectFlight(String origin, String destination, boolean verbose) {
        boolean isFound = flights.contains(new Flight(origin, destination));

        if (verbose) {
            if (isFound) {
                System.out.println("Direct flight from " + origin + " to " + destination + " found!");
            } else {
                System.out.println("Direct flight from " + origin + " to " + destination + " not found!");
            }
        }

        return isFound;
    }

    public boolean findDirectFlight(String origin, String destination) {
        return findDirectFlight(origin, destination, true);
    }

    public boolean findFlightOneChange(String origin, String destination) {

        List<String> connectingCities = flights.stream()
                .filter(flight -> flight.getOrigin().equals(origin))
                .map(flight -> flight.getDestination())
                .filter(city -> findDirectFlight(city, destination,false))
                .collect(Collectors.toList());

        if (!connectingCities.isEmpty()) {
            System.out.println("Found one-change connecting flights from " + origin + " to " + destination + ":");
            for (String city : connectingCities) {
                System.out.println(origin + " -> " + city + " -> " + destination);
            }
            return true;
        } else {
            System.out.println("One-change connecting flights from " + origin + " to " + destination + " not found!");
            return false;
        }

    }

}
