package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Product implements OrderService {

    private String product;

    public Product(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public boolean order(User user, LocalDateTime localDateTime, Product product) {
        System.out.println("Product ordered");
        return true;
    }
}
