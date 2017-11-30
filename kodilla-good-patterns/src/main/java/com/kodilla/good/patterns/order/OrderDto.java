package com.kodilla.good.patterns.order;

public class OrderDto {

    private User user;
    private boolean isSuccessful;

    public OrderDto(User user, boolean isSuccessful) {
        this.user = user;
        this.isSuccessful = isSuccessful;
    }

    public User getUser() {
        return user;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
}
