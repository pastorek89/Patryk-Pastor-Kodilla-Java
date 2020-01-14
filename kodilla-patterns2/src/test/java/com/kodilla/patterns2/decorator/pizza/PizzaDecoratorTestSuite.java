package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaDecoratorTestSuite {

    @Test
    public void testPizzaOrderWithHamOnionAndExtraCheese() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Pizza price: " + theCost);
        System.out.println(description);
        //Then
        assertEquals(new BigDecimal(26), theCost);
        assertEquals("Pizza: tomato sauce + cheese + ham + onion + extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithAllAddons() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);
        theOrder = new SweetCornDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Pizza price: " + theCost);
        System.out.println(description);
        //Then
        assertEquals(new BigDecimal(42), theCost);
        assertEquals("Pizza: tomato sauce + cheese + ham + onion + extra cheese + " +
                "champignons + shrimps + sweet corn", description);
    }

    @Test
    public void testPizzaOrderWithDoubleHamAndSweetCorn() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new SweetCornDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Pizza price: " + theCost);
        System.out.println(description);
        //Then
        assertEquals(new BigDecimal(28), theCost);
        assertEquals("Pizza: tomato sauce + cheese + ham + ham + sweet corn", description);
    }
}
