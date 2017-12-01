package com.kodilla.good.patterns.food;

public class DeliveryRequestRetriever {

    public DeliveryRequest retrieve() {

        String foodSupplier = "Extra Food Shop";
        String product = "Lentils";
        double quantity = 30;
        String unit = "kg";

        return new DeliveryRequest(foodSupplier, product, quantity, unit);

    }

}
