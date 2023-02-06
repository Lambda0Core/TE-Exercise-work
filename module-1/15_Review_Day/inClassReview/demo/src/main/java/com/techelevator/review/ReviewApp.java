package com.techelevator.review;

public class ReviewApp {
    public static void main(String[] args) {
        System.out.println(printHello());

        Car car = new Car("Ford", "Maverick", 1972);

        System.out.println(car.soundHorn());
        car.startCar();

//        Calculator calculator = new Calculator();
//        System.out.println(calculator.divideDoub(9, 2));
//        System.out.println(calculator.add(2, 2));

        System.out.println(Calculator.add(3,4));
        System.out.println(Discount.twentyPercentOff(20, 20));
    }
   public static String printHello(){

        return "Hello World";
   }
    public static String printHello(String msg){

        return "Hello World, " + msg;
    }
}
