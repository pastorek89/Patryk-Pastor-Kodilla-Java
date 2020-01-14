package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ShrimpsDecorator extends AbstractPizzaOrderDecorator {

    public ShrimpsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + shrimps";
    }
}
