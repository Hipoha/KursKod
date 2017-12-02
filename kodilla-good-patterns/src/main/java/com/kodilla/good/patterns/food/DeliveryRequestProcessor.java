package com.kodilla.good.patterns.food;

public class DeliveryRequestProcessor {

    public void process(DeliveryRequest deliveryRequest) {

        try {
            FoodSupplier foodSupplier = FindSupplier.find(deliveryRequest.getFoodSupplier());
            boolean isAccepted = foodSupplier.process(deliveryRequest);
            if (isAccepted) {
                System.out.println("Delivery order accepted!");
            } else {
                System.out.println("Delivery order rejected!");
            }
        } catch (NoSupplierException e) {
            System.out.println(deliveryRequest.getFoodSupplier() + ": " + e);
        }

    }

}
