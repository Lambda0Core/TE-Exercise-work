package com.techelevator;

public class TailspinBaloo extends Baloo{
    public TailspinBaloo() {
        super("TailspinBaloo Baloo", 3.5, "black", "Up and Away");
    }

    @Override
    public String speaks(){
        return "To the air!";
    }
}
