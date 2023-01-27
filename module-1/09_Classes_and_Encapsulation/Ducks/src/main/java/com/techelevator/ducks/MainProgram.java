package com.techelevator.ducks;

public class MainProgram {

    public static void main(String[] args) {

        Duck firstDuck = new Duck("Donald", "White", true, 3.5, 2.5);
        printMyDuck(firstDuck);

        Duck secondDuck = new Duck("Huey", "Red", true, 1.3, 2.5);
        printMyDuck(secondDuck);

        Duck firstDucksWife = new Duck("Daisy", "Purple", false, 3.5, 2.5);
        printMyDuck(firstDucksWife);

        Duck fourthDuck = new Duck("Louie", "Blue", true, 2.3, 2.0);
        printMyDuck(fourthDuck);

        Duck defaultDuck = new Duck();
        printMyDuck(defaultDuck);

        escapeDuckEscape(firstDuck);
        quack(firstDuck);

    }

    private static void printMyDuck(Duck someDuck){
        System.out.println("My duck's name is " + someDuck.getName() + ", I am colored " + someDuck.getColor() + ", I am " + someDuck.getAge() + " years old. " + "Am I alive? " + someDuck.getLife());

    }
    private static void feedAndWeighDuck(Duck anyDuck){
        anyDuck.eat();
        System.out.println("Feeding Duck....");
        System.out.println("Done! " + anyDuck.getName() + " has been fed. " + anyDuck.getName() + " now weighs" + anyDuck.getWeight());
    }
    private static void escapeDuckEscape(Duck someDuck){
        if (someDuck.getWeight() <= 2) {
            someDuck.move(2);
            System.out.println(someDuck.getName() + " soared through the air and escaped...!");
        }else if (someDuck.getWeight() >= 3 && someDuck.getWeight() <= 4){
            someDuck.move(1);
            System.out.println(someDuck.getName() + " has narrowly escaped into the pond...!");
        }else if (someDuck.getWeight() >= 5 && someDuck.getWeight() <= 6){
            someDuck.move(0);
        }
    }
    private static void quack(Duck anyDuck){
        System.out.println(anyDuck.makeNoise());
    }
}
