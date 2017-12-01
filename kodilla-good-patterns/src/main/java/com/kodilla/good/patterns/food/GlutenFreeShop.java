package com.kodilla.good.patterns.food;

public class GlutenFreeShop implements FoodSupplier {

    public boolean process(DeliveryRequest deliveryRequest){

        System.out.println("Gluten Free Shop received the following delivery request: \n");
        System.out.println(deliveryRequest);

        return true;
    }

}
