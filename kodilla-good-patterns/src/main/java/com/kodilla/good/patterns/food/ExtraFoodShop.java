package com.kodilla.good.patterns.food;

public class ExtraFoodShop implements FoodSupplier {

    public boolean process(DeliveryRequest deliveryRequest){

        System.out.println("Extra Food Shop received the following delivery request: \n");
        System.out.println(deliveryRequest);

        return true;
    }

}
