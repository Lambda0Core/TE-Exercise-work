package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable{

    private BigDecimal price;

    public Pig (){
        super("Pig", "oink!");
        this.price = new BigDecimal("3000.00");
    }

    public Pig(String name, String sound, BigDecimal price) {
        super(name, sound);
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {

        return this.price;
    }
}
