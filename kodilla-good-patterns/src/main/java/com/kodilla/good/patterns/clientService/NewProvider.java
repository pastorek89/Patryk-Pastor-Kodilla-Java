package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;

public class NewProvider implements Provider {

    private String name = "New Provider";
    private String addresse = "Veckerhager Strasse 66";

    @Override
    public boolean process(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product) {
        System.out.println("new Provider");
        System.out.println("Find us: " + name + " " + addresse);
        return true;
    }
}


