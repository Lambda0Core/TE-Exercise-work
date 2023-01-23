package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String intCalc = scanner.nextLine();
        int discountCalc = Integer.parseInt(intCalc);
        double discount = (100.0 - discountCalc) / 100.00;

        System.out.println("Discount Percentage: " + discount);
        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String lineInput = scanner.nextLine();
        //Splits our inputs into an array
        String[] inputArray = lineInput.split(" ");

        for (int i = 0; i < inputArray.length; i++) {

            double itemPrice = Double.parseDouble(inputArray[i]);

            double newPrice = itemPrice * discount;

            System.out.println("Original Price: " + itemPrice);
            System.out.println("  Discounted Price: " + newPrice);

        }

      scanner.close();


    }

}
