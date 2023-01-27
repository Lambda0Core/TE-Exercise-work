package com.techelevator.ducks;

public  class MainProgram {

    public static void main(String[] args) {

//        Duck firstDuck = new Duck();
//        firstDuck.setName("Donald");
//        firstDuck.setColoring("white");
//        firstDuck.setAge(-1);
//        firstDuck.name = "Donald";
//        firstDuck.coloring = "white";
//        double age = firstDuck.getAge();

        Duck firstDuck = new Duck("Donald", "white", 4, 4);
        printMyDuck(firstDuck);

//        Duck secondDuck = new Duck();
//        secondDuck.name = "Huey";
//        secondDuck.coloring = "gold";
        // use constructor only
//        secondDuck.setName("Huey");
//        secondDuck.setColoring("gold");
//        secondDuck.setAge(1.5);
        Duck secondDuck = new Duck("Huey", "gold", 1.5, 1.5);
        printMyDuck(secondDuck);

        Duck thirdDuck = new Duck();
        printMyDuck(thirdDuck);
       // System.out.println(Math.random());
//        System.out.println("My duck's name is " + firstDuck.name);
//        System.out.println("My duck's color is " + firstDuck.coloring);

        Duck fourthDuck = new Duck("Louie","blue", 2,2.5);
        printMyDuck(fourthDuck);


        secondDuck.setWeight(2.0);
        System.out.println(secondDuck.getWeight());


        feedAndWeightDuck(secondDuck);
        System.out.println(secondDuck.getName() + " now weighs " + secondDuck.getWeight());

        System.out.println(secondDuck.makeNoise());
        System.out.println(secondDuck.move(1) + " now weighs " + secondDuck.getWeight());

    }

    private static void feedAndWeightDuck(Duck anyDuck) {

        anyDuck.eat();
        System.out.println(anyDuck.getName() + " now weighs " + anyDuck.getWeight());
    }

    private static void printMyDuck(Duck someDuck){
        System.out.println("My duck's name is " + someDuck.getName() + " and I am colored " + someDuck.getColoring() + " I am " + someDuck.getAge() + " years old.");

    }
}
