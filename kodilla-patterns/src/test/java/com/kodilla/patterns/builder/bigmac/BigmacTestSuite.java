package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun("plain"))
                .sauce(new Sauce("barbecue"))
                .ingredients(new Ingredients("bacon","onion","cucumber","cheese"))
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().ingredients.size();

        //Then
        Assert.assertEquals(4,howManyIngredients);
    }
}
