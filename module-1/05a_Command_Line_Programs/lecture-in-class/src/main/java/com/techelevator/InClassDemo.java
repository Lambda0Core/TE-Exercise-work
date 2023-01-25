package com.techelevator;

public class InClassDemo {

    public static void main(String[] args) {
        int result = addTwoNumbers(3,4);

        System.out.println(result);

        String fullName = concatFullName("greg", "westendorf");
        System.out.println(fullName + " " + result);

        result  = addTwoNumbers(result, 12);
        System.out.println(result);

    }


    public static String concatFullName(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public static int addTwoNumbers(int thing1, int thing2){

        return  thing1 + thing2;
    }


}
