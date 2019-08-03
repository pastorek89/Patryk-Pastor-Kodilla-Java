package com.kodilla.good.patterns.clientService;



import java.time.LocalDateTime;

public class OrderRequest {

    private Customer customer;
    private Provider provider;
    private LocalDateTime dateOfOrder;
    private Product product;

    public OrderRequest(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product) {
        this.customer = customer;
        this.provider = provider;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Provider getProvider() {
        return provider;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Product getProduct() {
        return product;
    }
}



