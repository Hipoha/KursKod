package com.kodilla.good.patterns.food;

public class MailService implements InformationService {

    public void informDeliveryOrderAccepted() {
        System.out.println("Delivery order accepted!");
    }

    public void informDeliveryOrderRejected() {
        System.out.println("Delivery order rejected!");
    }

}
