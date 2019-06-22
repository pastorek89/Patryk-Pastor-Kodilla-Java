package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();
    private final Continent continent;

    public World(final Continent continent) {
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(world -> world.getCountries().stream())
                .map(world -> world.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
