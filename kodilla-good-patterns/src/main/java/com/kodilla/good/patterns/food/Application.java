package com.kodilla.good.patterns.food;

public class Application {

    public static void main(String[] args) {

        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        InformationService mailService = new MailService();

        try {
            FoodSupplier foodSupplier = FindSupplier.find(deliveryRequest.getFoodSupplier());
            boolean isAccepted = foodSupplier.process(deliveryRequest);
            if (isAccepted) {
                mailService.informDeliveryOrderAccepted();
            } else {
                mailService.informDeliveryOrderRejected();
            }
        } catch (NoSupplierException e) {
            System.out.println(e);
        }

    }

}
