package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Customer customer = new Customer("Karolina", "Pastor", "Pokątna 14/3 22-444 Nibylandia");
        Provider provider = new HealthyShop();
        Product product = new Product("Kohlrabi", 5);
        LocalDateTime dateOfOrder = LocalDateTime.of(2019, 8, 03, 12, 25);

        return new OrderRequest(customer, provider, dateOfOrder, product);
    }
}
