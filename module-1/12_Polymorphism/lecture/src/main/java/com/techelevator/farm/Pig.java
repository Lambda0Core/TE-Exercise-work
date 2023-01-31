package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements MarketInterface {
    //properties
    private BigDecimal price;
    //constructor
    public Pig() {
        super("Pig", "Oink!");
        price = BigDecimal.valueOf(500.00);
    }
    //method
    public void rollInMud() {
        System.out.println("Pig covered in mud!");
    }
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
