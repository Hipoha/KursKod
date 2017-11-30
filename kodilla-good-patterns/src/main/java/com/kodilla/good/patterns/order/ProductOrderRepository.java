package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, LocalDateTime orderDate, String deliveryMethod) {
        System.out.println("Order for " + user.getName() + " " + user.getSurname() + " created.");
        System.out.println("User's address: " + user.getAddress());
        System.out.println("Order date: " + orderDate);
        System.out.println("Delivery method: " + deliveryMethod);
    }

}