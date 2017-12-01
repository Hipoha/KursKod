package com.kodilla.good.patterns.food;

public class Application {

    public static void main(String[] args) {

        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        try {
            FoodSupplier foodSupplier = FindSupplier.find(deliveryRequest.getFoodSupplier());
            foodSupplier.process(deliveryRequest);
        } catch (NoSupplierException e) {
            System.out.println(e);
        }

    }

}
