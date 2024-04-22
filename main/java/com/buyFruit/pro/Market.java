package com.buyFruit.pro;

import java.math.BigDecimal;

public class Market {
    Fruit apple;
    Fruit strawberry;
    Fruit mango;

    public Market() {
        this.apple = new Fruit("Apple", 8.0);
        this.strawberry = new Fruit("Strawberry", 13.0);
        this.mango = new Fruit("Mango", 20.0);
    }
}
