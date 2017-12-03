package com.kodilla.good.patterns.food;

public class FindSupplier {

    public static FoodSupplier find(String foodSupplier) throws NoSupplierException {

        switch (foodSupplier.toLowerCase()) {
            case "extra food shop":
                return new ExtraFoodShop();
            case "healthy shop":
                return new HealthyShop();
            case "gluten free shop":
                return new GlutenFreeShop();
        }
        throw new NoSupplierException("Supplier not found!");
    }

}
