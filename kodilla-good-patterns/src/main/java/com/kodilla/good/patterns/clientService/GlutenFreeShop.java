package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;

public class GlutenFreeShop implements Provider {

    private String name = "Gluten-Free Shop";
    private String addresse = "Kasseler Strasse 34";
    private int customerAccount;

    @Override
    public boolean process(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product) {
        System.out.println("Gluten Free Shop is preparing your order");
        customerAccount = +5;
        System.out.println("5 extra points to your Customer Account. Get another 5 points by next order");
        System.out.println("Find us: " + name + " " + addresse);
        return true;
    }
}
