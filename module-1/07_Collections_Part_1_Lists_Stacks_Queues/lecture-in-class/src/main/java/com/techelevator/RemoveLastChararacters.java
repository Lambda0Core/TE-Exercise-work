package com.techelevator;

public class RemoveLastChararacters {

    public static void main(String[] args) {

        String testString = "Our test string";

        //find string length
        int stringLength = testString.length();
        // return the from the beginning of the string to the end -> length  - 1
        // return "Our test strin"
        System.out.println(testString.substring(0, stringLength - 1));
        System.out.println(testString.substring(0, testString.length() - 1));

    }
}
