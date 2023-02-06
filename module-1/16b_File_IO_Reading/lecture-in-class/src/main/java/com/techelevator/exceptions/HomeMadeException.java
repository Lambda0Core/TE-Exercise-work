package com.techelevator.exceptions;

public class HomeMadeException {
    public static void main(String[] args) throws JavaBlueException {

        try {
            javaBlueError();
        } catch (JavaBlueException ex){
            System.out.println("Greg gets a " +  ex.getTestScore() + " on lecture code today.");
            System.out.println(ex.getMessage());
        }

    }

    public static void javaBlueError() throws JavaBlueException {
        throw new JavaBlueException("Bad lecture code day", 1);
    }
}
