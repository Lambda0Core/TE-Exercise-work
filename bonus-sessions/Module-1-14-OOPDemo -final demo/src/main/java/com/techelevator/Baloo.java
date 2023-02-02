package com.techelevator;

public class Baloo  extends CartoonBear{


    public Baloo() {
        super("Baloo", 3, "Brown", "Hi!");
    }

    public Baloo(String name, double height, String furColor, String catchphrase) {
        super(name, height, furColor, catchphrase);
    }

    //methods
    @Override
     public String speaks(){
        return "recite lines";
     }
     public String sings(){
        return "La la la la";
     }
     public String dances(){
        return "dance dance dance";
     }
}
