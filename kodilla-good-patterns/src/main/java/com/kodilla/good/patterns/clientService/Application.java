package com.kodilla.good.patterns.clientService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderService = new OrderService(new HealthyShop(),new MailService());
        orderService.order(orderRequest);
        System.out.println();
        OrderService orderService2 = new OrderService(new NewProvider()git ,new MailService());
        orderService2.order(orderRequest);
        System.out.println();
        OrderService orderService3 = new OrderService(new GlutenFreeShop(),new MailService());
        orderService3.order(orderRequest);
        System.out.println();
        OrderService orderService4 = new OrderService(new ExtraFoodShop(),new MailService());
        orderService4.order(orderRequest);
    }
}
