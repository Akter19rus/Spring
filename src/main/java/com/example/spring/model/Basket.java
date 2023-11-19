package com.example.spring.model;

import java.util.Objects;

public class Basket {
    private final int productId;

    public Basket(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return productId == basket.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
