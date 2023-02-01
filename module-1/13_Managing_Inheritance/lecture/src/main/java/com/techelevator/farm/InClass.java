package com.techelevator.farm;

public class InClass {
    public static void main(String[] args) {

        FarmAnimal[] animals = {new Chicken(), new Cow(), new Pig(), new FarmAnimal("Rhino", "snort!", true), new Cat()};

        for(FarmAnimal animal : animals){
            System.out.println(animal.getName() + " " + animal.getSound());
        }
    }
}
