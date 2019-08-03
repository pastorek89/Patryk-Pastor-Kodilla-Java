package com.kodilla.good.patterns.clientService;

public class OrderData {

    public Customer customer;
    public Provider provider;
    public boolean isAvailable;

    public OrderData(final Customer customer, final Provider provider, final boolean isAvailable) {
        this.customer = customer;
        this.provider = provider;
        this.isAvailable = isAvailable;
    }

    public Customer getCustomer() {
        return customer;
    }

}
