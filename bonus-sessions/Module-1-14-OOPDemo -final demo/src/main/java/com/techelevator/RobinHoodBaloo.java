package com.techelevator;

public class RobinHoodBaloo extends Baloo {
    public RobinHoodBaloo() {
        super("RobinHood Baloo", 3, "Tawny", "Tally Ho");
    }

    @Override
    public String speaks(){
        return "Look out!";
    }
    @Override
    public String sings(){
        return "yeah yeah yeah";
    }
    @Override
    public String dances(){
        return "jumps ";
    }
}
