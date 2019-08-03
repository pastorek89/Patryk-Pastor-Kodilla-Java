package com.kodilla.good.patterns.clientService;

public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("Customer informed");
    }
}
