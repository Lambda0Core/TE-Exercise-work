package com.techelevator.farm;

public class InClassApp {

    public static void main(String[] args) {

        FarmAnimal[] animals = {new Chicken(), new Cow(), new Pig(), new Cat("Kitty", "Meow"), new Cat()};

        int i = 0;
        for(FarmAnimal animal : animals){
            animal.sleep(i % 2 == 1);
            System.out.println( animal.getName() + " : " + animal.getSound());
            System.out.println(animal.eat());
            i++;
        }
    }
}
