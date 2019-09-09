package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(BunType bun) {
            this.bun = bun.toString();
            return this;
        }

        public BigmacBuilder sauce(SauceType sauce) {
            this.sauce = sauce.toString();
            return this;
        }

        public BigmacBuilder ingredients(Toppings... toppings) {
            for (Toppings ingredient : toppings) {
                ingredients.add(ingredient.toString());
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, ingredients);
        }
    }

    private Bigmac(String bun, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun = " + bun +
                ", sauce = " + sauce +
                ", ingredients = " + ingredients +
                '}';
    }
}
