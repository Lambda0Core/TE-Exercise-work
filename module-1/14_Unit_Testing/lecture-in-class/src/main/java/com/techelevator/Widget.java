package com.techelevator;

public class Widget {

    public Widget() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public String concatenate(String one, String two){
        return one + two;
    }

    public String concatenate(String[] input){

        String output = "";
        for(String item: input){
            output += item;
        }

        return output;
    }
}
