package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.PLAIN)
                .sauce(SauceType.STANDARD)
                .ingredients(Toppings.CHAMPIGNONS,Toppings.CHILLI,Toppings.BACON,Toppings.LETTUCE)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4,howManyIngredients);
    }
}
