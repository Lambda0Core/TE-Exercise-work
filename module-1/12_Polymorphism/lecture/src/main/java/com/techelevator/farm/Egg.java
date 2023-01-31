package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements MarketInterface{
    //properties
    private String name;
    private BigDecimal price;

    //constructor
    public Egg(){
        this.name = "Egg";
        this.price = new BigDecimal("0.75");
    }

    //methods
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
