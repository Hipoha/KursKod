package com.kodilla.good.patterns.food;

public class HealthyShop implements FoodSupplier {

    public boolean process(DeliveryRequest deliveryRequest){

        System.out.println("Healthy Shop received the following delivery request: \n");
        System.out.println(deliveryRequest);

        return true;
    }

}
