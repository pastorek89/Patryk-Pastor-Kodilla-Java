package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;

public class ExtraFoodShop implements Provider {

    private String name = "Extra Food Shop";
    private String addresse = "Łazienkowska 12";

    @Override
    public boolean process(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product) {
        System.out.println("Extra Food Shop is preparing your order");
        System.out.println("Find us: " + name + " " + addresse);
        return true;
    }
}
