package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Patryk", "Pastor", "North End Avenue 66 PO28EB Portsmouth");
        LocalDateTime dateOfOrder = LocalDateTime.of(2019, 9, 23, 14, 00);
        Product product = new Product("Ball");

        return new OrderRequest(user, dateOfOrder, product);
    }
}
