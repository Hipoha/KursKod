package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsDatabase {

    private static final String WARSZAWA = "Warszawa";
    private static final String KRAKOW = "Kraków";
    private static final String LODZ = "Łódź";
    private static final String WROCLAW = "Wrocław";
    private static final String KATOWICE = "Katowice";
    private static final String KIELCE = "Kielce";
    private static final String POZNAN = "Poznań";
    private static final String SZCZECIN = "Szczecin";
    private static final String BYDGOSZCZ = "Bydgoszcz";
    private static final String GDANSK = "Gdańsk";
    private static final String GDYNIA = "Gdynia";
    private static final String OLSZTYN = "Olsztyn";
    private static final String BIALYSTOK = "Białystok";
    private static final String LUBLIN = "Lublin";
    private static final String RZESZOW = "Rzeszów";
    private static final String PRZEMYSL = "Przemyśl";


    private final Set<Flight> flights = new HashSet<>();

    public FlightsDatabase() {
        flights.add(new Flight(WARSZAWA,KRAKOW));
        flights.add(new Flight(WARSZAWA,LODZ));
        flights.add(new Flight(WARSZAWA,WROCLAW));
        flights.add(new Flight(WARSZAWA,KATOWICE));
        flights.add(new Flight(WARSZAWA,KIELCE));
        flights.add(new Flight(WARSZAWA,POZNAN));
        flights.add(new Flight(WARSZAWA,SZCZECIN));
        flights.add(new Flight(WARSZAWA,BYDGOSZCZ));
        flights.add(new Flight(WARSZAWA,GDANSK));
        flights.add(new Flight(WARSZAWA,GDYNIA));
        flights.add(new Flight(WARSZAWA,OLSZTYN));
        flights.add(new Flight(WARSZAWA,BIALYSTOK));
        flights.add(new Flight(WARSZAWA,LUBLIN));
        flights.add(new Flight(WARSZAWA,RZESZOW));
        flights.add(new Flight(KRAKOW,WARSZAWA));
        flights.add(new Flight(LODZ,WARSZAWA));
        flights.add(new Flight(WROCLAW,WARSZAWA));
        flights.add(new Flight(KATOWICE,WARSZAWA));
        flights.add(new Flight(KIELCE,WARSZAWA));
        flights.add(new Flight(POZNAN,WARSZAWA));
        flights.add(new Flight(SZCZECIN,WARSZAWA));
        flights.add(new Flight(BYDGOSZCZ,WARSZAWA));
        flights.add(new Flight(GDANSK,WARSZAWA));
        flights.add(new Flight(GDYNIA,WARSZAWA));
        flights.add(new Flight(OLSZTYN,WARSZAWA));
        flights.add(new Flight(BIALYSTOK,WARSZAWA));
        flights.add(new Flight(LUBLIN,WARSZAWA));
        flights.add(new Flight(RZESZOW,WARSZAWA));
        flights.add(new Flight(LODZ,KRAKOW));
        flights.add(new Flight(LODZ,WROCLAW));
        flights.add(new Flight(LODZ,POZNAN));
        flights.add(new Flight(LODZ,GDANSK));
        flights.add(new Flight(KRAKOW,LODZ));
        flights.add(new Flight(KRAKOW,WROCLAW));
        flights.add(new Flight(KRAKOW,POZNAN));
        flights.add(new Flight(KRAKOW,GDANSK));
        flights.add(new Flight(WROCLAW,KRAKOW));
        flights.add(new Flight(WROCLAW,LODZ));
        flights.add(new Flight(WROCLAW,POZNAN));
        flights.add(new Flight(WROCLAW,GDANSK));
        flights.add(new Flight(POZNAN,KRAKOW));
        flights.add(new Flight(POZNAN,WROCLAW));
        flights.add(new Flight(POZNAN,LODZ));
        flights.add(new Flight(POZNAN,GDANSK));
        flights.add(new Flight(GDANSK,KRAKOW));
        flights.add(new Flight(GDANSK,WROCLAW));
        flights.add(new Flight(GDANSK,LODZ));
        flights.add(new Flight(GDANSK,POZNAN));
        flights.add(new Flight(KRAKOW,SZCZECIN));
        flights.add(new Flight(SZCZECIN,KRAKOW));
        flights.add(new Flight(WROCLAW,BIALYSTOK));
        flights.add(new Flight(BIALYSTOK,WROCLAW));
        flights.add(new Flight(WROCLAW,LUBLIN));
        flights.add(new Flight(LUBLIN,WROCLAW));
        flights.add(new Flight(GDANSK,LUBLIN));
        flights.add(new Flight(LUBLIN,GDANSK));
        flights.add(new Flight(RZESZOW,PRZEMYSL));
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
