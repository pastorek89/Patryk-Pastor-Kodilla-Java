package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    final String sauceType;

    public Sauce(String sauceType) {
        if (sauceType.equals("1000_island") || sauceType.equals("standard") || sauceType.equals("barbecue")) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("We are not using this type of sauce");
        }
    }

    public String getSauceType() {
        return sauceType;
    }

    @Override
    public String toString() {
        return " " + sauceType;

    }
}
