package com.techelevator.exceptions;

public class JavaBlueException extends Exception {
    private int testScore;
    public JavaBlueException(String message, int testScore){
        super(message);
        this.testScore = testScore;

    }
    public int getTestScore(){
        return this.testScore;
    }
}
