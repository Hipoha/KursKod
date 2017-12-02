package com.kodilla.good.patterns.food;

public class Application {

    public static void main(String[] args) {

        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        DeliveryRequestProcessor deliveryRequestProcessor = new DeliveryRequestProcessor();
        deliveryRequestProcessor.process(deliveryRequest);

    }

}
