package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();




        System.out.println(flightsDatabase);

        System.out.println("\n*******************\n");

        flightsDatabase.findFlightsFrom("Lublin");

        System.out.println("\n*******************\n");

        flightsDatabase.findFlightsTo("Lublin");

        System.out.println("\n*******************\n");

        flightsDatabase.findDirectFlight("Lublin", "Białystok");

        System.out.println("\n*******************\n");

        flightsDatabase.findFlightOneChange("Lublin", "Białystok");

    }

}
