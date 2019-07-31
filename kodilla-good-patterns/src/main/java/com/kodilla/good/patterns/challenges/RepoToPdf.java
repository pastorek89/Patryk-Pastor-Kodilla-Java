package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RepoToPdf implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime localDateTime, Product product) {
        System.out.println("File pdf was created");
        return true;
    }
}
