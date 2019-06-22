package com.kodilla.stream.invoice.simple;

public final class SimpleProduct {
    public final String productName;
    public final double productPrice;

    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;

        SimpleProduct that = (SimpleProduct) o;

        return getProductName().equals(that.getProductName());

    }

    @Override
    public int hashCode() {
        return getProductName().hashCode();
    }
}
