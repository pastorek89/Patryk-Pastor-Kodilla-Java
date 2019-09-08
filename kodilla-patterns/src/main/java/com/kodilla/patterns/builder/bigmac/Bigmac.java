package com.kodilla.patterns.builder.bigmac;

public final class Bigmac {

    private final Bun bun;
    private final Sauce sauce;
    private final Ingredients ingredients;

    public static class BigmacBuilder {
        private Bun bun;
        private Sauce sauce;
        private Ingredients ingredients;

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredients ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, ingredients);
        }
    }

    private Bigmac(Bun bun, Sauce sauce, Ingredients ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun =" + bun +
                ", sauce =" + sauce +
                ", ingredients =" + ingredients +
                '}';
    }
}
