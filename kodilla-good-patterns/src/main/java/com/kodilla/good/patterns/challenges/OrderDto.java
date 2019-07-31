package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean isPaid;

    public OrderDto(final User user, final boolean isPaid) {
        this.user = user;
        this.isPaid = isPaid;
    }

    public User getUser() {
        return user;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
