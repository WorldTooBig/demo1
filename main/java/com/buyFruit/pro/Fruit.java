package com.buyFruit.pro;

import java.math.BigDecimal;

public class Fruit {
    private String name;
    private double pricePerKg;


    public Fruit(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
}
