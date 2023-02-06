package com.techelevator.exceptions;

public class TryCatch {
    public static void main(String[] args) throws Exception {
//        int input = 12;
//        try {
//            int output = modulus3(input);
//            System.out.println("Success! " + input + " is divisible by 3 and equals " + output);
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("The code did not break");
//        }
//        System.out.println();
//      int output =  divideByZero(2,0);
//        System.out.println(output);
//
//        try {

//            ParseBadly("GREG");
//        } catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        } catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        int[] newArray = {5,4,3,2,1};
//        try {
//            int[] returnValue = parseArrayBadly(newArray);
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

        System.out.println("Program has successfully completed.");
    }



    public static int modulus3(int inputValue) throws Exception{
        if (inputValue % 3 > 0){
            throw new Exception("ERROR: inputvalue " + inputValue + " is not divisible by 3");
        }
        return inputValue / 3;
    }
    public static int divideByZero(int input1, int input2){
        try {
            return input1 / input2;
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            return input1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return input1;
    }

//    public static String ParseBadly(String name) throws Exception {
//        if (name == null){
//            throw new NullPointerException("name cannot be a null");
//        } else if (name.length() > 3) {
//            throw new Exception("I hate this name..." );
//        }else if (name.length() > 1)
//            throw new ArrayIndexOutOfBoundsException();
//        return name;
//    }
//    public static int[] parseArrayBadly(int[] newArray) {
//        for (int i = 0; i < newArray.length; i++) {
//
//        }
//    }
}
