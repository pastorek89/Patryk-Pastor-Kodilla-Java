package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameOfContinent;
    private List<Country> countries = new ArrayList<>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }
    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return getNameOfContinent().equals(continent.getNameOfContinent());
    }

    @Override
    public int hashCode() {
        return getNameOfContinent().hashCode();
    }
}
