package com.techelevator;

public class StringMatches {

    public static void main(String[] args) {
        String userInput = "";
        int validNumber = 0;
        boolean isValidEntry = false;

        while(!isValidEntry) {

            try {
                userInput = "9987A2";

                    isValidEntry = userInput.matches("[0-9]*A[0-9]");
//                    if (isValidEntry) {
//                        validNumber = Integer.parseInt(userInput);
//                    }

            } catch (NumberFormatException ex) {
                System.out.println("error " + ex.getMessage());
            }

        }

        System.out.println("completed");
    }
}
