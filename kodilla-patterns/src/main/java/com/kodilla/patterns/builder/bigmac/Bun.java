package com.kodilla.patterns.builder.bigmac;

public final class Bun {

    final String bunType;

    public Bun(String bunType) {
        if (bunType.equals("with_sezame") || bunType.equals("plain")) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("We are not using this type of bun");
        }
    }

    public String getBunType() {
        return bunType;
    }

    @Override
    public String toString() {
        return " " + bunType;

    }
}
