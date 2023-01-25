package com.techelevator;


import java.util.Scanner;

public class NameReader {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = userInput.nextLine();

        System.out.print("Please enter your height in cm: ");
        String heightInput = userInput.nextLine();
        int height = Integer.parseInt(heightInput);
        height++;

        System.out.println("Enter Y/N:");
        String someBizarreExample = userInput.nextLine();

        boolean isY = someBizarreExample.equals("Y");

        System.out.println("Your name is " + name);
        System.out.println("Your height is " + height + " in cm.");
        System.out.println("Our bizarre Example is " + isY);

    }
}
