package com.techelevator.farm;

import javax.swing.*;
import java.math.BigDecimal;

public class Egg  implements Sellable{

    private String name;
    private BigDecimal price;

    public Egg(){
        this.name = "Egg";
        this.price = new BigDecimal("0.75");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
