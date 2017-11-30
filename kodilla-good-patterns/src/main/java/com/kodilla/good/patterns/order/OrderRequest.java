package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private String deliveryMethod;

    public OrderRequest(User user, LocalDateTime orderDate, String deliveryMethod) {
        this.user = user;
        this.orderDate = orderDate;
        this.deliveryMethod = deliveryMethod;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
