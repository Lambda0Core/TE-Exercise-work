package com.techelevator.review;

public class LoopApp {
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d"};
//        forILoop(stringArray);
        WhileLoop(stringArray);
        DoWhileLoop(stringArray);
        forEachLoop(stringArray);
    }
    public static void forILoop(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] += stringArray[i];
            System.out.println(stringArray[i]);

        }
    }
    public static void WhileLoop(String[] stringArray){
       String test = "Ahahahahahah!";
        int i = 0;
        while(stringArray.length < 100){

            System.out.println("I am forever! " + stringArray[0]);
            i++;

            if (i >= 11){
                test = "Aw...";
                break;
            } else if (i>=0){
                System.out.println("Bomb goes off when counter reaches 10!   " + i);
                continue;
            }
            System.out.println("Did not execute");
        }
        System.out.println("Boom! You are dead! Not big surprise. ");
    }
    public static void DoWhileLoop(String[] stringArray){
        String test = "Ahahahahahah!";
        int i = 0;
        do {

            System.out.println("I am forever! " + stringArray[0]);
            i++;

            if (i >= 11){
                test = "Aw...";
                break;
            } else if (i>=0){
                System.out.println("Bomb goes off when counter reaches 10!   " + i);
                continue;
            }
            System.out.println("Did not execute");
        } while(stringArray.length < 1);
        System.out.println("Bo- ...Wait, was it a dud?");
    }
    public static void forEachLoop(String[] stringArray){
        //String as an reference object
        //for instance if you're using a class object, use that name
        //e.g. Car item : wheel
        for(String item : stringArray){
            System.out.println(item);
        }

    }
}
