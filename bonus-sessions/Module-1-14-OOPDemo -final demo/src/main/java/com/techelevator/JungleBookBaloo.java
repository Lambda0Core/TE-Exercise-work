package com.techelevator;

public class JungleBookBaloo extends Baloo {
    public JungleBookBaloo() {
        super("JungleBook Baloo", 3, "Light brown", "Bare Necessities");
    }

    @Override
    public String speaks(){
        return "Stay away from the snake!";
    }
    @Override
    public String sings(){
        return "La di-da di-da";
    }
    @Override
    public String dances(){
        return "shake shake shakes";
    }

}
