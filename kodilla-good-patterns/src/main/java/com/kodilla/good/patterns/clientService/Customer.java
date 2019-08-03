package com.kodilla.good.patterns.clientService;

public class Customer {

    private String name;
    private String surname;
    private String clientAddresse;

    public Customer(String name, String surname, String clientAddresse) {
        this.name = name;
        this.surname = surname;
        this.clientAddresse = clientAddresse;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getClientAddresse() {
        return clientAddresse;
    }
}
