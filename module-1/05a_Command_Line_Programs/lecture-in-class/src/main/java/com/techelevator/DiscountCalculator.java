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
        String discountLineInput = scanner.nextLine();
        int discountInput = Integer.parseInt(discountLineInput);
        double discount = (100.0 - discountInput) / 100.0;

        System.out.println("discount percentage amount: " + discount);


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String lineInput = scanner.nextLine();

        //split the input into an array
        String[] inputArray = lineInput.split(" ");

        //loop through the array and calculate prices
        for (int i = 0; i < inputArray.length; i++) {

            double itemPrice = Double.parseDouble(inputArray[i]);

            double newPrice = itemPrice * discount;

            System.out.print("Original Price : " + itemPrice);
            System.out.println("    Discounted Price: " + newPrice);
        }

        scanner.close();
    }

}
