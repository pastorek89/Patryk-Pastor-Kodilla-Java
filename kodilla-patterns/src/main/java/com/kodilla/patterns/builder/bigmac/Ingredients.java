package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

    final List<String> ingredients = new ArrayList<>();

    public Ingredients(String... toppings) {
        for (String ingredient : toppings) {
            if (ingredient.equals("lettuce") || ingredient.equals("onion") || ingredient.equals("bacon") || ingredient.equals("prawns") ||
                    ingredient.equals("cucumber") || ingredient.equals("chilli") || ingredient.equals("champignons") || ingredient.equals("cheese")) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("There is no available ingredient");
            }
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
