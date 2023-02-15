package com.techelevator.exceptions;

public class TryCatchDemo {

    public static void main(String[] args) {
        int input = 13;
        try{
            int out = modulus3(input);
            System.out.println(input + " is divisble by 3 and is " + out);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        } finally {
            System.out.println("The code did not break!!!");
        }

        System.out.println();

       int output = divideBadly(2,0);
        System.out.println(output);

        try {
            parseBadly("greg");
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        int[] newArray = {5,4,3,2,1};

        try {
            int[] returnValue = parseArrayBadly(newArray);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("The program has successfully completed.");

    }

    public static  int modulus3(int inputValue) throws Exception {
        if (inputValue % 3 > 0){
            throw new Exception("ERROR: inputvalue " + inputValue + " is NOT divisible by 3");
        }
        return inputValue / 3;
    }

    public static int divideBadly(int input1, int input2){
        try {
            return input1 / input2;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            return input1;
        } catch( Exception ex){
            System.out.println(ex.getMessage());
        }
        return input1;
    }

    public static String parseBadly(String name) throws Exception, NullPointerException, ArrayIndexOutOfBoundsException {

        if (name == null){
            throw new NullPointerException("name cannot be null");
        } else if (name.length() > 3){
            throw new Exception("I hate this name.");
        } else if (name.length() >= 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return name;

    }

    public static int[] parseArrayBadly(int[] array){
        for (int i = 0; i < 10; i++) {
            array[i] = 1;
        }

        return array;
    }
}
