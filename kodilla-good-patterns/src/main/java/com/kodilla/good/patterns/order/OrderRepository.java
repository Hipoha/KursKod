package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder(User user, LocalDateTime orderDate, String deliveryMethod);

}
