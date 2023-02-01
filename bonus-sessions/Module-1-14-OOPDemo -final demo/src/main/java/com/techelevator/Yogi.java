package com.techelevator;

public final class Yogi extends CartoonBear {


    public Yogi() {
        super("Yogi", 2.5, "Brown","I'm smarter than the average bear!");

    }



    //methods
    public String speaks(){
        return  this.getCatchphrase();
    }
}
