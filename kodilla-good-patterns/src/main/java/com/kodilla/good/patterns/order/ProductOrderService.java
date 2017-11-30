package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, LocalDateTime orderDate, String deliveryMethod) {
        return true;
    }

}
