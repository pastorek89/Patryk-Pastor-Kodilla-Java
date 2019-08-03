package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private Supplier orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final Supplier orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isPaid = orderService.order(orderRequest.getUser(), orderRequest.getDateOfOrder(), orderRequest.getProduct());

        if (isPaid) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDateOfOrder(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }

    }
}
