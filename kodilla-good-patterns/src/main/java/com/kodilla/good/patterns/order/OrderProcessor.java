package com.kodilla.good.patterns.order;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getOrderDate(), orderRequest.getDeliveryMethod());
        if (isOrdered) {
            informationService.informOrderSuccess(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getOrderDate(), orderRequest.getDeliveryMethod());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            informationService.informOrderFailure(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(),false);
        }
    }

}
