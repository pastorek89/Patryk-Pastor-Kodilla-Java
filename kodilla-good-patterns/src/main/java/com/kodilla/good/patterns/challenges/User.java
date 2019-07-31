package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private String addresse;

    public User(String name, String surname, String addresse) {
        this.name = name;
        this.surname = surname;
        this.addresse = addresse;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddresse() {
        return addresse;
    }
}