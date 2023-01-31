package com.techelevator.farm;

import java.math.BigDecimal;

public class Giraffe implements Sellable {
    private String name;
    private String sound;

    private BigDecimal price;

    public Giraffe(){
        this.name = "Jeffery Giraffe";
        this.price = BigDecimal.valueOf(5000.00);
    }

    public String getName(){
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
