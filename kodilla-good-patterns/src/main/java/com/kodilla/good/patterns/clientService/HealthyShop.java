package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Provider {

    private String name = "Healthy Shop";
    private String addresse = "Sunset Blv 13";
    private List<String> invitedForParty = new ArrayList<>();

    @Override
    public boolean process(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product) {
        System.out.println("Healthy Shop is preparing your order");
        invitedForParty.add(customer.getSurname() + " " + customer.getName() + " " + customer.getClientAddresse());
        System.out.println("You are invited for a Big Healthy Party. Check out your mailbox in few days to get an invintation.");
        System.out.println("Find us: " + name + " " + addresse);
        return true;
    }
}
