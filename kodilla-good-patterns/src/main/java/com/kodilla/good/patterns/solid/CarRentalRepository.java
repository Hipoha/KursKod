package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("Car rental for " + user.getName() + " " + user.getSurname() + " created.");
        System.out.println("Rental start date: " + from);
        System.out.println("Rental end date: " + from);
    }

}
