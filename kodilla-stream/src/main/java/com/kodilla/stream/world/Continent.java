package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final Country country;
    private final String nameOfContinent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final Country country, final String nameOfContinent) {
        this.country = country;
        this.nameOfContinent = nameOfContinent;
    }

    public Country getCountry() {
        return country;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
