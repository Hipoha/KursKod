package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        if (user.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
