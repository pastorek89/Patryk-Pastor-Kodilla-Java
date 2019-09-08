package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

    final List<String> ingredients = new ArrayList<>();

    public Ingredients(Toppings... toppings) {
        for (Toppings ingredient : toppings) {
            ingredients.add(ingredient.toString());
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return " " + ingredients;

    }
}
