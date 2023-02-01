package com.techelevator.farm;

public class Cat extends FarmAnimal {

    public Cat(String name, String sound) {
         super(name, sound);
    }

  public Cat(){
        super("Default Cat","Hollers");
  }

//    @Override
//    public String getSound(){
//        return "Roar";
//    }

    @Override
    public String eat(){
        return "Eating cat food";
    }
}
