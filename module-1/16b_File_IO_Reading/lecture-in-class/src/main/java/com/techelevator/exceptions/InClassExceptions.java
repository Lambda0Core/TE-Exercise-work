package com.techelevator.exceptions;

import java.util.Scanner;

public class InClassExceptions {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int inputValue = 12;
//        if (inputValue % 3 == 0){
//            throw new Exception("input value is divisible by 3.");
//        }

        System.out.println("The exception did not fire.");

        int outputValue = modulus3(inputValue);
        System.out.println(inputValue + " is divisible by 3 and is " + outputValue);

//        inputValue = 17;
//        outputValue = modulus3(inputValue);
//        System.out.println(inputValue + " is divisible by 3 and is " + outputValue);

        String badString = "";
        badString = null;
        System.out.println(badString.toLowerCase());

    }

    public static int modulus3(int inputValue) throws Exception {
        if (inputValue % 3 > 0){
            throw new Exception("input value " + inputValue + " is not divisible by 3.");
        }
        return inputValue / 3;

    }
}
