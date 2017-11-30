package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan", "Kowalski","ul. Kowalska, 45-678 Janowiec");

        LocalDateTime orderDate = LocalDateTime.of(2017, 8, 1, 12, 0);

        String deliveryMethod = "Courier";

        return new OrderRequest(user, orderDate, deliveryMethod);

    }
}
