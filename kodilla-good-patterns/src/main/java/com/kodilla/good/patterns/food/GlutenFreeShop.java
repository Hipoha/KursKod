package com.kodilla.good.patterns.food;

public class GlutenFreeShop implements FoodSupplier {

    public boolean process(DeliveryRequest deliveryRequest){

        System.out.println("Gluten Free Shop received the following delivery request: \n");
        System.out.println(deliveryRequest);

        if (true) {
            System.out.println("\nRequest accepted.");
            return true;
        } else {
            System.out.println("\nRequest rejected.");
            return false;
        }
    }

}
