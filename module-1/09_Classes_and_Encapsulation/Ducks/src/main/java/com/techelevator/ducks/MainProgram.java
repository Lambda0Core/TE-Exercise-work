package com.techelevator.ducks;

<<<<<<< HEAD
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
=======
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

>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
    }
}
