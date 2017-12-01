package com.kodilla.good.patterns.food;

public class DeliveryRequest {

    private String foodSupplier;
    private String product;
    private double quantity;
    private String unit;

    public DeliveryRequest(String foodSupplier, String product, double quantity, String unit) {
        this.foodSupplier = foodSupplier;
        this.product = product;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "------------- Delivery request -------------\n" +
                "Food Supplier: " + foodSupplier + "\n" +
                "Product: " + product + ", " + quantity + " " + unit + "\n" +
                "--------------------------------------------";
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }
}
