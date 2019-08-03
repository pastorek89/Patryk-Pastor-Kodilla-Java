package com.kodilla.good.patterns.clientService;

public class OrderService {

    private Provider provider;
    private InformationService informationService;

    public OrderService(final Provider provider, final InformationService informationService) {
        this.provider = provider;
        this.informationService = informationService;
    }

    public OrderData order(final OrderRequest orderRequest) {
        boolean isAvailable = provider.process(orderRequest.getCustomer(), orderRequest.getProvider(),
                orderRequest.getDateOfOrder(), orderRequest.getProduct());

        if (isAvailable) {
            informationService.inform(orderRequest.getCustomer());
            System.out.println("Ordered prepared");
            return new OrderData(orderRequest.getCustomer(), orderRequest.getProvider(), true);
        } else {
            System.out.println("Product is not available");
            return new OrderData(orderRequest.getCustomer(), orderRequest.getProvider(), false);
        }
    }
}
