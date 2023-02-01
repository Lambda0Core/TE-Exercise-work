package com.techelevator;

public final class PapaBear extends CartoonBear {
    public PapaBear() {
        super("PapaBear", 4, "Black", "I'm a dad.");
    }

    @Override
    public String speaks(){
        return "Howdy";
    }
}
